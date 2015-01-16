package com.autohome.pinche;

import java.io.Serializable;

/**
 * Created by lianghongbin on 1/16/15.
 */
public class Endpoint implements Serializable {

    private static final long serialVersionUID = 7191896530337177030L;
    private final String name;
    private final double latitude;
    private final double longitude;

    public Endpoint(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
