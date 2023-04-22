package exercise;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static List<String> buildApartmentsList(List<Home> apartsList, int topFirst) {
        return apartsList.stream().sorted(Home::compareTo).limit(topFirst).map(Object::toString).toList();
    }
}
// END
