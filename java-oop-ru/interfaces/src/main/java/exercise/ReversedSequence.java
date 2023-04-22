package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// BEGIN
class ReversedSequence implements CharSequence {
    private final StringBuilder str;
    public ReversedSequence(String str) {
        this.str = new StringBuilder(str).reverse();
    }
    @Override
    public String toString() {
        return this.str.toString();
    }
    @Override
    public char charAt(int i) {
        return str.charAt(i);
    }

    @Override
    public int length() {
        return str.length();
    }
    @Override
    public String subSequence(int from, int to) {
        return str.substring(from, to);
    }
}
// END
