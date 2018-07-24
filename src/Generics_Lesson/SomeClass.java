package Generics_Lesson;

public class SomeClass <T extends Number>{
    private T obj;

    public SomeClass(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                " obj = " + obj +
                '}';
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
