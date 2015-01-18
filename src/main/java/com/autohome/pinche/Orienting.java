package com.autohome.pinche;

/**
 * Created by lianghongbin on 1/16/15.
 */
public abstract class Orienting {

    protected final Line line;
    protected boolean isHome;

    protected Orienting(Line line) {
        this.line = line;
    }

    public abstract Endpoint getStart();

    public abstract Endpoint getEnd();
}
