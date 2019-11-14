package pers.adlered.jnmap.router;

import pers.adlered.jnmap.asker.Asks;
import pers.adlered.jnmap.router.sub.intface.Router;
import pers.adlered.jnmap.variable.Params;

/**
 * <h3>JNmap</h3>
 * <p></p>
 *
 * @author : https://github.com/AdlerED
 * @date : 2019-11-14 10:47
 **/
public class ModeRouter implements Router {
    @Override
    public void route() {
        int mode = -1;
        while (true) {
            try {
                mode = Integer.parseInt(Asks.mode());
                // If need add a mode, also put the number here
                if (mode == 1 || mode == 2 || mode == 3) {
                    Params.mode = mode;
                    break;
                }
            } catch (Exception e) {}
        }
    }
}
