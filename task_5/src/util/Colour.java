package util;

import entity.VisualParameters;

public class Colour extends VisualParameters {
    private String colour;

    {
        colour = null;
    }

    public Colour() {
        super("Цвет");
    }

    public Colour(String colour) {
        super("Цвет");
        this.colour = colour;
    }

    @Override
    public String getValue() {
        return colour;
    }
}
