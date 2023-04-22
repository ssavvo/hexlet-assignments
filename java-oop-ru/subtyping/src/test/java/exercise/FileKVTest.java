package exercise;

import java.util.HashMap;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
// BEGIN

// END


class FileKVTest {

    private static Path filepath = Paths.get("src/test/resources/file").toAbsolutePath().normalize();

    @BeforeEach
    public void beforeEach() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String content = mapper.writeValueAsString(new HashMap<String, String>());
        Files.writeString(filepath, content, StandardOpenOption.CREATE);
    }

    // BEGIN
    @Test
    void fileKVTest() {
        HashMap<String, String> initial = new HashMap<>(Map.of("key", "value"));
        FileKV fileKV = new FileKV(filepath.toString(), initial);
        assertThat(fileKV.toMap()).isEqualTo(Map.of("key", "value"));
        initial.put("key2", "value2");
        assertThat(fileKV.toMap()).isEqualTo(Map.of("key", "value"));
        fileKV.set("key2", "value2");
        assertThat(fileKV.toMap()).isEqualTo(Map.of("key", "value", "key2", "value2"));
        fileKV.unset("key");
        assertThat(fileKV.toMap()).isEqualTo(Map.of("key2", "value2"));
        assertThat(fileKV.get("key", "")).isEqualTo("");
        assertThat(fileKV.get("key2", "")).isEqualTo("value2");
    }
    // END
}
