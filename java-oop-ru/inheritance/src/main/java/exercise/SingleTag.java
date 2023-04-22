package exercise;

import java.util.Map;

// BEGIN
class SingleTag extends Tag {
    public SingleTag(String tagName, Map<String, String> attributes) {
        super(tagName, attributes);
    }

    @Override
    public String toString() {
        var str = new StringBuilder("<" + tagName);
        for (Map.Entry<String, String> attr: attributes.entrySet()) {
            str.append(" ").append(attr.getKey()).append("=\"").append(attr.getValue()).append("\"");
        }
        str.append(">");
        return str.toString();
    }
}
// END
