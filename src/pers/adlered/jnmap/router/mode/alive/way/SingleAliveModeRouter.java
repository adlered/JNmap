package pers.adlered.jnmap.router.mode.alive.way;

import pers.adlered.jnmap.asker.Asks;
import pers.adlered.jnmap.network.scanner.Ping;
import pers.adlered.jnmap.router.sub.intface.Router;

/**
 * <h3>JNmap</h3>
 * <p></p>
 *
 * @author : https://github.com/AdlerED
 * @date : 2019-11-18 21:36
 **/
public class SingleAliveModeRouter implements Router {
    @Override
    public void route() {
        String ip = Asks.AliveMode.single();
        try {
            Ping.ping(ip);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
