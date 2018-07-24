package Group_Serialization;

import java.io.Serializable;

public class Group implements Serializable {

    private static final long serialVersionUID = 1L;
        private String name;
        private int quantity;
        private char mark;

    public Group(String name, int quantity, char mark) {
        this.name = name;
        this.quantity = quantity;
        this.mark = mark;
    }

    public Group() {
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", mark=" + mark +
                '}';
    }
}
