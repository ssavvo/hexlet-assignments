package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map getWordCount(String text) {
        Map<String, Integer> result = new HashMap<>();
        if (text.length() < 1) {
            return result;
        }
        String[] textArr = text.split(" ");
        for (String word: textArr) {
            if (!result.containsKey(word)) {
                result.put(word, 1);
            } else {
                result.replace(word, result.get(word) + 1);
            }
        }
        return result;
    }

    public static String toString(Map<String, Integer> map) {
        if (map.isEmpty()) {
            return "{}";
        }
        StringBuilder result = new StringBuilder("{\n");
        for (Map.Entry<String, Integer> item: map.entrySet()) {
            result.append("  " + item.getKey() + ": " + item.getValue() + "\n");
        }
        result.append("}");
        return result.toString();
    }
}
//END
