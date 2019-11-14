package pers.adlered.jnmap.router.mode.alive;

import pers.adlered.jnmap.asker.Asks;
import pers.adlered.jnmap.router.sub.intface.Router;

/**
 * <h3>JNmap</h3>
 * <p></p>
 *
 * @author : https://github.com/AdlerED
 * @date : 2019-11-14 11:13
 **/
public class MainAliveModeRouter implements Router {
    @Override
    public void route() {
        String howTo = Asks.AliveMode.howTo();
        System.out.println(howTo);
    }
}
