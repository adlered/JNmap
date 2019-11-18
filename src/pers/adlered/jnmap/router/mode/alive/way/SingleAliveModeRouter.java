package pers.adlered.jnmap.router.mode.alive.way;

import pers.adlered.jnmap.asker.Asks;
import pers.adlered.jnmap.logger.Log;
import pers.adlered.jnmap.logger.enumerate.Level;
import pers.adlered.jnmap.network.scanner.Ping;
import pers.adlered.jnmap.router.sub.intface.Router;
import pers.adlered.jnmap.variable.Params;

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
        while (true) {
            String ip = Asks.AliveMode.single();
            if (ip.equals("q")) {
                break;
            }
            try {
                String delay = Ping.ping(ip);
                if (!delay.isEmpty()) {
                    Log.log(Level.INFO, "[" + Params.getLang("alive") + "] " + ip + " " + delay + " ms");
                } else {
                    Log.log(Level.ERROR, "[" + Params.getLang("dead") + "] " + ip);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
