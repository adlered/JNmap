package pers.adlered.consoleargs;

import java.util.*;

/**
 * <h3>ConsoleArgs</h3>
 * <p>Args analyze</p>
 *
 * @author : https://github.com/AdlerED
 * @date : 2019-11-13 15:42
 **/
public class ConsoleArgs {
    private Map<String, List<String>> storage = new HashMap<>();

    public ConsoleArgs(String[] args) {
        String tempVar = "";
        String tempVal = "";
        for (int i = 0; i < args.length; i++) {
            if (args[i].startsWith("--")) {
                List<String> values = new ArrayList<>();
                for (String j : tempVal.split("\n")) {
                    values.add(j);
                }
                storage.put(tempVar, values);
                tempVar = "";
                tempVal = "";
                if (args[i].contains("=")) {
                    String[] tempVal2 = args[i].replaceAll("^--", "").split("=");
                    tempVar = tempVal2[0];
                    for (int j = 1; j < tempVal2.length; j++) {
                        if (tempVal.length() != 0) {
                            tempVal += "\n" + tempVal2[j];
                        } else {
                            tempVal += tempVal2[j];
                        }
                    }
                    List<String> values2 = new ArrayList<>();
                    for (String j : tempVal.split("\n")) {
                        values2.add(j);
                    }
                    storage.put(tempVar, values2);
                    tempVar = "";
                    tempVal = "";
                }
            } else if (args[i].startsWith("-")) {
                if (!tempVar.isEmpty() || !tempVal.isEmpty()) {
                    List<String> values = new ArrayList<>();
                    for (String j : tempVal.split("\n")) {
                        values.add(j);
                    }
                    storage.put(tempVar, values);
                    tempVar = "";
                    tempVal = "";
                }
                tempVar = args[i].replaceAll("^-", "").substring(0, 1);
            } else {
                if (!args[i].startsWith("--") && !tempVar.isEmpty()) {
                    if (tempVal.length() != 0) {
                        tempVal += "\n" + args[i];
                    } else {
                        tempVal += args[i];
                    }
                }
            }
        }
        List<String> values = new ArrayList<>();
        for (String j : tempVal.split("\n")) {
            values.add(j);
        }
        storage.put(tempVar, values);
    }

    public Map<String, List<String>> getReturn() {
        return storage;
    }
}
