package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .filter(man -> man.get("gender").equals("male"))
                .sorted(Comparator.comparing(man -> LocalDate.parse(man.get("birthday"))))
                .map(man -> man.get("name"))
                .collect(Collectors.toList());
    }
}
// END
