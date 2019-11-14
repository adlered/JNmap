package pers.adlered.jnmap;

import pers.adlered.consoleargs.ConsoleArgs;
import pers.adlered.jnmap.router.MainRouter;

import java.util.*;

/**
 * <h3>JNmap</h3>
 * <p>A map like Nmap :)</p>
 *
 * @author : https://github.com/AdlerED
 * @date : 2019-11-13 15:23
 **/
public class Main {
    public static void main(String[] args) {
        MainRouter mainRouter = new MainRouter();
        ConsoleArgs consoleArgs = new ConsoleArgs(args);
        Map<String, List<String>> storage = consoleArgs.getReturn();


        /* Iterator<String> iterator = storage.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            List<String> value = storage.get(key);
            System.out.println("Key: " + key);
            System.out.println("Value: ");
            for (String i : value) {
                System.out.println(i);
            }
            System.out.println("-----");
        } */
    }
}
