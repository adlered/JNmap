package pers.adlered.jnmap.asker;

import pers.adlered.jnmap.logger.Log;
import pers.adlered.jnmap.logger.enumerate.Level;

import java.util.Scanner;

/**
 * <h3>JNmap</h3>
 * <p>Ask to user</p>
 *
 * @author : https://github.com/AdlerED
 * @date : 2019-11-14 09:57
 **/
public class Ask {
    public static String ask(String askWord) {
        Log.log(Level.ASK, askWord);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
