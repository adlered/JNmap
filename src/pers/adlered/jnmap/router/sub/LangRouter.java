package pers.adlered.jnmap.router.sub;

import pers.adlered.jnmap.asker.Asks;
import pers.adlered.jnmap.router.sub.intface.Router;
import pers.adlered.jnmap.variable.Params;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * <h3>JNmap</h3>
 * <p></p>
 *
 * @author : https://github.com/AdlerED
 * @date : 2019-11-14 10:36
 **/
public class LangRouter implements Router {
    @Override
    public void route() {
        // Ask Language
        String lang = Asks.language();
        // No more switch
        if (lang.equals("1")) {
            Params.locale = new Locale("en_US");
        } else if (lang.equals("2")) {
            Params.locale = new Locale("zh_CN");
        }
    }
}
