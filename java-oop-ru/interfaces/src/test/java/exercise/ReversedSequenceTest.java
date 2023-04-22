package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ReversedSequenceTest {
    @Test
    void reversedSequenceTest1() {
        var reversed = new ReversedSequence("abcdef");
        assertThat(reversed.toString()).isEqualTo("fedcba");
        assertThat(reversed.charAt(1)).isEqualTo('e');
        assertThat(reversed.length()).isEqualTo(6);
        assertThat(reversed.subSequence(1, 4).toString()).isEqualTo("edc");
    }
}
