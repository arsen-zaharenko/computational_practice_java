package util;

import entity.VisualParameters;

public class Facets extends VisualParameters {
    private int facets;

    {
        facets = 4;
    }

    public Facets() {
        super("Количество граней");
    }

    public Facets(String facets) {
        super("Количество граней");
        int f = Integer.parseInt(facets);

        if (f > 3 && f < 16) {
            this.facets = f;
        }
    }

    @Override
    public String getValue() {
        return String.valueOf(facets);
    }
}
