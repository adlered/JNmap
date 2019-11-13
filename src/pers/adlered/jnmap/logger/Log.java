package pers.adlered.jnmap.logger;

import pers.adlered.jnmap.logger.enumerate.Level;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <h3>JNmap</h3>
 * <p>日志小模块</p>
 *
 * @author : https://github.com/AdlerED
 * @date : 2019-11-13 15:27
 **/
public class Log {
    public static void log(Level level, Object log) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss:SS").format(new Date()) + "] [" + level + "] " + log.toString());
    }
}
