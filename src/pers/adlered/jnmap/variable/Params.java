package pers.adlered.jnmap.variable;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * <h3>JNmap</h3>
 * <p>Params storage</p>
 *
 * @author : https://github.com/AdlerED
 * @date : 2019-11-14 09:27
 **/
public class Params {
    public static Locale locale;
    public static ResourceBundle resourceBundle;

    public static String getLang(String key) {
        return resourceBundle.getString(key);
    }

    /**
     * Scan modes
     * 1 - Alive scan
     * 2 - Information scan
     * 3 - Port scan
     */
    public static int mode;
}
