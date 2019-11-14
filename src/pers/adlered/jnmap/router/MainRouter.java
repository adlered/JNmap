package pers.adlered.jnmap.router;

import pers.adlered.jnmap.asker.Asks;
import pers.adlered.jnmap.logger.Log;
import pers.adlered.jnmap.logger.enumerate.Level;
import pers.adlered.jnmap.variable.DefaultConfig;
import pers.adlered.jnmap.variable.Params;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * <h3>JNmap</h3>
 * <p>主路由</p>
 *
 * @author : https://github.com/AdlerED
 * @date : 2019-11-13 15:26
 **/
public class MainRouter {
    public MainRouter() {
        Log.log(Level.INFO, "JNmap V" + DefaultConfig.version);
        // Ask Language
        String lang = Asks.language();
        // No more switch
        if (lang.equals("1")) {
            Params.locale = new Locale("en_US");
        } else if (lang.equals("2")) {
            Params.locale = new Locale("zh_CN");
        }
        Params.resourceBundle = ResourceBundle.getBundle("lang.LangBundle", Params.locale);
        System.out.println(Params.resourceBundle.getString("hello"));
    }
}
