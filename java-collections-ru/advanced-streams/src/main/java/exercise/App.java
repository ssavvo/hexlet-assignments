package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
class App {
    public static final String PREFIX = "X_FORWARDED_";
    public static String getForwardedVariables(String conf) {
        return Arrays.stream(conf.split("\n"))
                .filter(s -> s.startsWith("environment"))
                .map(env -> env.split("=\"")[1].substring(0, env.split("=\"")[1].length() - 1))
                .map(vars -> vars.split(","))
                .flatMap(Stream::of)
                .filter(s -> s.startsWith(PREFIX))
                .map(s -> s.substring(PREFIX.length()))
                .collect(Collectors.joining(","));
    }
}
//END
