package P5;

public abstract class Repository {
    private String name;
    public String getName() {
        return name;
    }

    public Repository(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept (Visitor f);
}