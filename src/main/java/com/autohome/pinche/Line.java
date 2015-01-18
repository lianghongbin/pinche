package com.autohome.pinche;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by lianghongbin on 1/16/15.
 * Description：拼车线路类
 */
public class Line implements Serializable {

    private static final long serialVersionUID = -1475120943921072414L;
    private Endpoint home;
    private String homeTime;
    private String companyTime;
    private Endpoint company;
    private int jam;    //拥堵指数

    public void setHome(Endpoint home, String homeTime) {
        this.home = home;
        this.homeTime = homeTime;
    }

    public void setCompany(Endpoint company, String companyTime) {
        this.company = company;
        this.companyTime = companyTime;
    }

    public Endpoint getHome() {
        return home;
    }

    public Endpoint getCompany() {
        return company;
    }

    public int getJam() {
        return jam;
    }

    public String getHomeTime() {
        return homeTime;
    }

    public String getCompanyTime() {
        return companyTime;
    }
}
