package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// BEGIN
class App {
    public static List<List<String>> enlargeArrayImage(List<List<String>> image) {
        List<List<String>> enlargedImage = new ArrayList<>(new ArrayList<>());
        for (List<String> row : image) {
            List<String> enlargedRow = new ArrayList<>();
            for (String s : row) {
                enlargedRow.add(s);
                enlargedRow.add(s);
            }
            enlargedImage.add(enlargedRow);
            enlargedImage.add(enlargedRow);
        }
        return enlargedImage;
    }
}
// END
