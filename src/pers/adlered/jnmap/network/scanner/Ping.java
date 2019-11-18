package pers.adlered.jnmap.network.scanner;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <h3>JNmap</h3>
 * <p></p>
 *
 * @author : https://github.com/AdlerED
 * @date : 2019-11-18 21:51
 **/
public class Ping {
    public static String ping(String ip) throws IOException {
        String delay = "";
        String command = "";
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("windows")) {
            // Windows
            command = "ping " + ip + " -n 1";
        } else {
            // Unix
            command = "ping " + ip + " -c 1";
        }
        Process process = Runtime.getRuntime().exec(command);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        StringBuilder result = new StringBuilder();
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            result.append(line);
        }
        delay = getDelay(result.toString());
        return delay;
    }

    private static String getDelay(String pingResult) {
        int location = pingResult.indexOf("时间");
        if (location == -1) {
            location = pingResult.indexOf("time");
        }
        if (location != -1) {
            String sub = pingResult.substring(location).toLowerCase();
            location = sub.indexOf("ms");
            sub = sub.substring(0, location);
            String regEx = "[\\u4e00-\\u9fa5a-zA-Z=]";
            Pattern pattern = Pattern.compile(regEx);
            Matcher matcher = pattern.matcher(sub);
            sub = matcher.replaceAll("").trim();
            return sub;
        } else {
            return "";
        }
    }
}
