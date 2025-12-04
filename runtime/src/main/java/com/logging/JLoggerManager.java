package com.logging;

import com.logging.JLogger;
import jakarta.enterprise.inject.spi.CDI;

public class JLoggerManager{
    public static JLogger getLogger(){
        return CDI.current().select(JLogger.class).get();
    }
}