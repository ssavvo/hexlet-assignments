package exercise;

import java.util.*;

// BEGIN
class App {
    public static <T> LinkedHashMap<String, String> genDiff(Map<String, T> map1, Map<String, T> map2) {
        TreeSet<String> allKeys = new TreeSet<>();
        allKeys.addAll(map1.keySet());
        allKeys.addAll(map2.keySet());
        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        for (String key: allKeys) {
            if (map1.containsKey(key) && map2.containsKey(key)) {
                String diff = map1.get(key).equals(map2.get(key)) ? "unchanged" : "changed";
                result.put(key, diff);
            }else if (map1.containsKey(key)) {
                String diff = "deleted";
                result.put(key, diff);
            }else if (map2.containsKey(key)) {
                String diff = "added";
                result.put(key, diff);
            }
        }
        return result;
    }
}
//END
