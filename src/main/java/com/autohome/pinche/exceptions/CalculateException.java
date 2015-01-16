package com.autohome.pinche.exceptions;

/**
 * Created by lianghongbin on 1/16/15.
 */
public class CalculateException extends BasicException {

    public CalculateException(Throwable e) {
        super(e);
    }

    public CalculateException(String msg) {
        super(msg);
    }

    public CalculateException(String msg, Throwable e) {
        super(msg, e);
    }
}
