package pers.adlered.jnmap.asker;

import com.sun.javafx.tools.packager.Param;
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
        return Ask.ask("Select your language:\n1) English (US)\n2) 中文 (简体)");
    }

    public static String mode() {
        return Ask.ask(Params.getLang("selectMode"));
    }

    public static class AliveMode {
        public static String howTo() {
            return Ask.ask(Params.getLang("aliveScan"));
        }

        public static String single() { return Ask.ask(Params.getLang("singleAliveMode")); }
    }
}
