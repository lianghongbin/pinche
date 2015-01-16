package com.autohome.pinche.exceptions;

/**
 * Created by lianghongbin on 1/16/15.
 */
public class BasicException extends Throwable {

    public BasicException(Throwable e) {
        super(e);
    }

    public BasicException(String msg) {
        super(msg);
    }

    public BasicException(String msg, Throwable e) {
        super(msg, e);
    }
}
