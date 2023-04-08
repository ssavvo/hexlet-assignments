package exercise;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> bookList, Map<String, String> filter) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book: bookList) {
            boolean flag = true;
            for (Entry<String, String> test : filter.entrySet()) {
                var testKey = test.getKey();
                var testValue = test.getValue();
                if (!(book.containsKey(testKey) && (book.get(testKey).equals(testValue)))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
