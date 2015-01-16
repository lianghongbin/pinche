package com.autohome.pinche;

/**
 * Created by lianghongbin on 1/16/15.
 * Description：只根据上下班及当时时间，确定推送方向
 */
public class TimeOrienting extends Orienting {

    public TimeOrienting(Line line) {
        super(line);

        long homeTime = line.getHomeTime();
        long companyTime = line.getCompanyTime();




        System.currentTimeMillis();
    }

    @Override
    public Endpoint getStart() {
        return null;
    }

    @Override
    public Endpoint getEnd() {
        return null;
    }
}
