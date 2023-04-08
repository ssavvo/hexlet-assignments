package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String letters, String word) {
        String[] lettersArr = letters.toLowerCase().split("");
        Arrays.sort(lettersArr);
        String[] wordArr = word.toLowerCase().split("");
        Arrays.sort(wordArr);
        var index = 0;
        for (String s : lettersArr) {
            if (s.equals(wordArr[index])) {
                index++;
            }
        }
        return index == wordArr.length;
    }
}
//END
