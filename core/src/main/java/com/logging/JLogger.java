package com.logging;

import org.jboss.logging.Logger;

public  class JLogger {

    private static final StackWalker stackWalker= StackWalker.getInstance(
            StackWalker.Option.RETAIN_CLASS_REFERENCE
    );
    public void info(String message){
        Logger.getLogger(stackWalker.getCallerClass().getName()).info(message);
    }
    public void warn(String message){
        Logger.getLogger(stackWalker.getCallerClass().getName()).warn(message);
    }
    public void debug(String message){
        Logger.getLogger(stackWalker.getCallerClass().getName()).debug(message);
    }
    public void error(String message){
        Logger.getLogger(stackWalker.getCallerClass().getName()).error(message);
    }
    public void error(String message, Throwable t){
        Logger.getLogger(stackWalker.getCallerClass().getName()).error(message, t);
    }

}