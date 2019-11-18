package pers.adlered.jnmap.router.mode.alive;

import pers.adlered.jnmap.asker.Asks;
import pers.adlered.jnmap.router.mode.alive.way.MultipleAliveModeRouter;
import pers.adlered.jnmap.router.mode.alive.way.SingleAliveModeRouter;
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
        while (true) {
            String howTo = Asks.AliveMode.howTo();
            if (howTo.equals("1")) {
                SingleAliveModeRouter singleAliveModeRouter = new SingleAliveModeRouter();
                singleAliveModeRouter.route();
                break;
            } else if (howTo.equals("2")) {
                MultipleAliveModeRouter multipleAliveModeRouter = new MultipleAliveModeRouter();
                multipleAliveModeRouter.route();
                break;
            }
        }
    }
}
