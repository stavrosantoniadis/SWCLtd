package org.swcltd.models;

public class AssuranceResults {

    private WaterAbstractionPoint waterlab;
    private Laboratories lab;

    public AssuranceResults(WaterAbstractionPoint waterlab, Laboratories lab) {
        this.waterlab = waterlab;
        this.lab = lab;
    }

    @Override
    public String toString() {
        return "AssuranceResults{" +
                "waterlab=" + waterlab +
                ", lab=" + lab +
                '}';
    }
}
