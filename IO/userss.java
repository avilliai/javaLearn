package learninging0910.IO;

import java.io.Serializable;
import java.util.StringJoiner;

public class userss implements Serializable {
    private int index;
    private String name;
    //private transient String name; 使用transient则不参与序列化
    private static final long serialVersionUID=-1145141980;//指定序列化版本号（数字随意）

    public userss(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", userss.class.getSimpleName() + "[", "]")
                .add("index=" + index)
                .add("name='" + name + "'")
                .toString();
    }
}
