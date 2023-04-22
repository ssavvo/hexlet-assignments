package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class PairedTag extends Tag {
    private String content;
    private List<Tag> children;
    public PairedTag(String tagName, Map<String, String> attributes, String content, List<Tag> children) {
        super(tagName, attributes);
        this.content = content;
        this.children = children;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder("<" + tagName);
        for (Map.Entry<String, String> attr: attributes.entrySet()) {
            sb.append(" ").append(attr.getKey()).append("=\"").append(attr.getValue()).append("\"");
        }
        sb.append(">").append(content);
        for (Tag tag: children) {
            sb.append(tag.toString());
        }
        sb.append("</").append(tagName).append(">");
        return sb.toString();
    }
}
// END
