package org.example;

import java.util.logging.Logger;

public class LoggerUtil {
    private static final Logger logger = Logger.getLogger(LoggerUtil.class);

    public static void log(String message) {
        logger.info(message);
    }
}
