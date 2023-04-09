package exercise;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
class AppTest {
    @Test
    void testEnlargeEmptyList() {
        List<List<String>> image = List.of();
        List<List<String>> actual = App.enlargeArrayImage(image);
        List<List<String>> expected = List.of();
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void testEnlargeSquareList() {
        List<List<String>> image = List.of(List.of("*", "*", "*"), List.of("*", " ", "*"), List.of("*", "*", "*"));
        List<List<String>> actual = App.enlargeArrayImage(image);
        List<List<String>> expected = List.of(List.of("*", "*", "*", "*", "*", "*"), List.of("*", "*", "*", "*", "*", "*"), List.of("*", "*", " ", " ", "*", "*"), List.of("*", "*", " ", " ", "*", "*"), List.of("*", "*", "*", "*", "*", "*"), List.of("*", "*", "*", "*", "*", "*"));
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void testEnlargeRectList() {
        List<List<String>> image = List.of(List.of("*", "*", "*"), List.of("*", "*", "*"));
        List<List<String>> actual = App.enlargeArrayImage(image);
        List<List<String>> expected = List.of(List.of("*", "*", "*", "*", "*", "*"), List.of("*", "*", "*", "*", "*", "*"), List.of("*", "*", "*", "*", "*", "*"), List.of("*", "*", "*", "*", "*", "*"));
        assertThat(actual).isEqualTo(expected);
    }
}
// END
