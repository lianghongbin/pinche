package com.autohome.pinche;

import util.TimeToMinutes;

import java.util.Calendar;

/**
 * Created by lianghongbin on 1/16/15.
 * Description：只根据上下班及当时时间，确定推送方向
 */
public class TimeOrienting extends Orienting {

    public TimeOrienting(Line line) {
        super(line);

        Calendar now = Calendar.getInstance();
        int minutes = now.get(Calendar.HOUR_OF_DAY) * 60 + now.get(Calendar.MINUTE);
        int homeSchedule = TimeToMinutes.toMinutes(line.getHomeTime());
        int companySchedule = TimeToMinutes.toMinutes(line.getCompanyTime());

        int result = Math.abs((homeSchedule - minutes));
        int firstTime = result > 12 ? 24 - result : result;

        result = Math.abs(companySchedule - minutes);
        int secondTime = result > 12 ? 24 - result : result;

        isHome = firstTime < secondTime;
    }

    @Override
    public Endpoint getStart() {
        return isHome ? line.getHome() : line.getCompany();
    }

    @Override
    public Endpoint getEnd() {
        return isHome ? line.getCompany() : line.getHome();
    }
}
