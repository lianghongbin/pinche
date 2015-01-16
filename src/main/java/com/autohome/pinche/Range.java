package com.autohome.pinche;

/**
 * Created by lianghongbin on 1/16/15.
 */
public class Range {

    private final double minLat;
    private final double maxLat;
    private final double minLng;
    private final double maxLng;

    public Range(double minLat, double maxLat, double minLng, double maxLng) {
        this.minLat = minLat;
        this.maxLat = maxLat;
        this.minLng = minLng;
        this.maxLng = maxLng;
    }

    public double getMinLat() {
        return minLat;
    }

    public double getMaxLat() {
        return maxLat;
    }

    public double getMinLng() {
        return minLng;
    }

    public double getMaxLng() {
        return maxLng;
    }
}
