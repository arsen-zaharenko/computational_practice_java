package entity;

import util.Preciousness;

import java.util.HashSet;
import java.util.Set;

public class Gem {
    private String id;
    private String name;
    private Preciousness preciousness;
    private String origin;
    private Set<VisualParameters> parameters;
    private double value;

    {
        id = null;
        name = null;
        preciousness = null;
        origin = null;
        parameters = new HashSet<>();
        value = 0;
    }

    public Gem() {}

    public Gem(String id, String name, String preciousness, String origin, Set<VisualParameters> parameters, double value) {
        this.id = id;
        this.name = name;
        this.preciousness = Preciousness.valueOf(preciousness);
        this.origin = origin;
        this.parameters = parameters;
        this.value = value;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreciousness(String preciousness) {
        this.preciousness = Preciousness.valueOf(preciousness);
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setParameters(Set<VisualParameters> parameters) {
        this.parameters = parameters;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Preciousness getPreciousness() {
        return preciousness;
    }

    public String getOrigin() {
        return origin;
    }

    public Set<VisualParameters> getParameters() {
        return parameters;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Gem {" +
                "\n\tid: " + id +
                ",\n\tname: " + name +
                ",\n\tpreciousness: " + preciousness +
                ",\n\torigin: " + origin +
                ",\n\tparameters: " + parameters +
                ",\n\tvalue: " + value +
                "\n}";
    }
}
