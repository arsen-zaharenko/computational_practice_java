package util;

import entity.VisualParameters;

public class Transparency extends VisualParameters {
    private int transparency;

    {
        transparency = 0;
    }

    public Transparency() {
        super("Прозрачность");
    }

    public Transparency(String transparency) {
        super("Прозрачность");
        this.transparency = Integer.parseInt(transparency);
    }

    @Override
    public String getValue() {
        return transparency + "%";
    }
}
