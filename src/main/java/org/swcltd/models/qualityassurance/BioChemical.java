package org.swcltd.models.qualityassurance;

public class BioChemical {

    private double DO;
    private String DOUnits = "mg/l";

    private double TOC;
    private String TOCUnits = "mg/l";

    private double BOD;
    private String BODUnits = "mg/l";

    private double COD;
    private String CODUnits = "mg/l";

    public BioChemical(double DO, double TOC, double BOD, double COD) {
        this.DO = DO;
        this.TOC = TOC;
        this.BOD = BOD;
        this.COD = COD;
    }


    public void setDO(double DO) {
        this.DO = DO;
    }

    public double getDO() {
        return DO;
    }

    public double getTOC() {
        return TOC;
    }

    public void setTOC(double TOC) {
        this.TOC = TOC;
    }

    public double getBOD() {
        return BOD;
    }

    public void setBOD(double BOD) {
        this.BOD = BOD;
    }

    public double getCOD() {
        return COD;
    }

    public void setCOD(double COD) {
        this.COD = COD;
    }


    @Override
    public String toString() {
        return "MicroBiological{" +
                "DO=" + DO +
                " " + DOUnits  +
                ", TOC=" + TOC +
                " " + TOCUnits +
                ", BOD=" + BOD +
                " " + BODUnits +
                ", COD=" + COD +
                " " + CODUnits +
                '}';
    }

}
