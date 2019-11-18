package pers.adlered.jnmap.network.scanner;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * <h3>JNmap</h3>
 * <p></p>
 *
 * @author : https://github.com/AdlerED
 * @date : 2019-11-18 21:51
 **/
public class Ping {
    public static String ping(String ip) throws UnknownHostException, IOException {
        boolean status = InetAddress.getByName(ip).isReachable(3000);
        System.out.println(status);
        return "";
    }
}
