package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static final List<String> FREE_DOMAINS = List.of("gmail.com", "yandex.ru", "hotmail.com");
    public static int getCountOfFreeEmails(List<String> emails) {
        return (int) emails.stream().filter( email -> FREE_DOMAINS.contains(email.split("@")[1])).count();
    }
}
// END
