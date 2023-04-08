package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map;

import org.junit.jupiter.api.Test;

class AppTest {

    public static final List<Integer> NUMS = List.of(2, 54, 1, 65, 3, 7, 143, 97);

    @Test
    void testTake() {
        // BEGIN
        List<Integer> expected = List.of(2, 54, 1);
        List<Integer> actual = App.take(NUMS, 3);
        assertThat(actual).isEqualTo(expected);
        // END
    }
}
