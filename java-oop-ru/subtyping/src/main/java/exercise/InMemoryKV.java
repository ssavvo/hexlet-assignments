package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
class InMemoryKV implements KeyValueStorage {
    private final HashMap<String, String> storage;

    public InMemoryKV(Map<String, String> init) {
        this.storage = new HashMap<>(init);
    }
    @Override
    public String get(String key, String defaultValue) {
        return this.storage.getOrDefault(key, defaultValue);
    }
    @Override
    public void set(String key, String value) {
        this.storage.put(key, value);
    }
    @Override
    public void unset(String key) {
        this.storage.remove(key);
    }
    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(this.storage);
    }
}
// END
