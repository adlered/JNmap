package pers.adlered.jnmap.asker;

import pers.adlered.jnmap.variable.Params;

/**
 * <h3>JNmap</h3>
 * <p>Asks</p>
 *
 * @author : https://github.com/AdlerED
 * @date : 2019-11-14 09:57
 **/
public class Asks {
    public static String language() {
        return Ask.Ask("Choose a language:\n1) English (US)\n2) Chinese (Simplified)");
    }

    public static String mode() {
        return Ask.Ask(Params.resourceBundle.getString("selectMode"));
    }
}
