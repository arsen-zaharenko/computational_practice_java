package entity;

public abstract class VisualParameters {
    private String name;

    public VisualParameters(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getValue();

    @Override
    public String toString() {
        return getValue();
    }
}
