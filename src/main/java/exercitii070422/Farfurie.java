package exercitii070422;

public class Farfurie<T extends Fruct> {
    private T contents;

    @Override
    public String toString() {
        return "Farfurie{" +
                "contents=" + contents +
                '}';
    }

    public Farfurie(T contents) {
        this.contents = contents;
    }

    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }
}
