package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class FileKV implements KeyValueStorage {
    private String filepath;
    public FileKV(String path, Map<String, String> init) {
        this.filepath = path;
        Utils.writeFile(this.filepath, Utils.serialize(init));
    }
    @Override
    public String get(String key, String defaultValue) {
        return Utils.unserialize(Utils.readFile(this.filepath)).getOrDefault(key, defaultValue);
    }
    @Override
    public void set(String key, String value) {
        var curState = Utils.unserialize(Utils.readFile(this.filepath));
        curState.put(key, value);
        Utils.writeFile(this.filepath, Utils.serialize(curState));
    }
    @Override
    public void unset(String key) {
        var curState = Utils.unserialize(Utils.readFile(this.filepath));
        curState.remove(key);
        Utils.writeFile(this.filepath, Utils.serialize(curState));
    }
    @Override
    public Map<String, String> toMap() {
        return Utils.unserialize(Utils.readFile(this.filepath));
    }
}
// END
