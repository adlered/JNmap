package pers.adlered.jnmap.router.mode;

import pers.adlered.jnmap.router.mode.alive.MainAliveModeRouter;
import pers.adlered.jnmap.router.mode.information.MainInformationModeRouter;
import pers.adlered.jnmap.router.mode.port.MainPortModeRouter;
import pers.adlered.jnmap.router.sub.intface.Router;
import pers.adlered.jnmap.variable.Params;

/**
 * <h3>JNmap</h3>
 * <p></p>
 *
 * @author : https://github.com/AdlerED
 * @date : 2019-11-14 11:09
 **/
public class AfterModeRouter implements Router {
    @Override
    public void route() {
        int mode = Params.mode;
        if (mode == 1) {
            // Alive scan
            MainAliveModeRouter mainAliveModeRouter = new MainAliveModeRouter();
            mainAliveModeRouter.route();
        } else if (mode == 2) {
            // Information scan
            MainInformationModeRouter mainInformationModeRouter = new MainInformationModeRouter();
            mainInformationModeRouter.route();
        } else if (mode == 3) {
            // Port scan
            MainPortModeRouter mainPortModeRouter = new MainPortModeRouter();
            mainPortModeRouter.route();
        }
    }
}
