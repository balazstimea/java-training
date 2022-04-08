package exercitii070422;

public class GenericBox <T> {
    private T contents;



    public GenericBox(T contents) {
        this.contents = contents;
    }

    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }
}
