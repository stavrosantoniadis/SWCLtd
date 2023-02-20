package org.swcltd.models.qualityassurance;

public class MicroBiological {

    private double ecoli;
    private String ecoliUnits = "ml";

    private double colibac;
    private String colibacUnits = "ml";

    public MicroBiological(double ecoli, double colibac) {
        this.ecoli = ecoli;
        this.colibac = colibac;
    }

    public double getEcoli() {
        return ecoli;
    }

    public void setEcoli(double ecoli) {
        this.ecoli = ecoli;
    }


    public double getColibac() {
        return colibac;
    }

    public void setColibac(double colibac) {
        this.colibac = colibac;
    }

    public String getEcoliUnits() {
        return ecoliUnits;
    }

    public void setEcoliUnits(String ecoliUnits) {
        this.ecoliUnits = ecoliUnits;
    }

    public String getColibacUnits() {
        return colibacUnits;
    }

    public void setColibacUnits(String colibacUnits) {
        this.colibacUnits = colibacUnits;
    }

    @Override
    public String toString() {
        return "MicroBiological{" +
                "ecoli=" + ecoli +
                " " + ecoliUnits +
                ", colibac=" + colibac +
                " " + colibacUnits  +
                '}';
    }
}
