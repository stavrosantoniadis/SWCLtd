package org.swcltd.models.qualityassurance;

import java.util.Optional;

public class PhysicoChemical {
    private double temperature;
    private String tempUnits = "Celcius";

    private double ph;

    private double conductance; //Αγωγιμότητα
    private String condUnits = "μS/cm";

    private boolean turbidity; //Θολότητα

    private boolean odor; //Οσμή

    private boolean color;

    public PhysicoChemical(double temperature, double ph, double conductance, boolean turbidity, boolean odor, boolean color) {
        this.temperature = temperature;
        this.ph = ph;
        this.conductance = conductance;
        this.turbidity = turbidity;
        this.odor = odor;
        this.color = color;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setTempUnits(String tempUnits) {
        this.tempUnits = tempUnits;
    }

    public void setPh(double ph) {
        this.ph = ph;
    }

    public void setConductance(double conductance) {
        this.conductance = conductance;
    }

    public void setCondUnits(String condUnits) {
        this.condUnits = condUnits;
    }

    public void setTurbidity(boolean turbidity) {
        this.turbidity = turbidity;
    }

    public void setOdor(boolean odor) {
        this.odor = odor;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getTempUnits() {
        return tempUnits;
    }

    public double getPh() {
        return ph;
    }

    public double getConductance() {
        return conductance;
    }

    public String getCondUnits() {
        return condUnits;
    }

    public boolean isTurbidity() {
        return turbidity;
    }

    public boolean isOdor() {
        return odor;
    }

    public boolean isColor() {
        return color;
    }

    @Override
    public String toString() {
        return "PhysicoChemical{" +
                "temperature=" + temperature +
                " " + tempUnits+
                ", ph=" + ph +
                ", conductance=" + conductance +
                " " + condUnits  +
                ", turbidity=" + turbidity +
                ", odor=" + odor +
                ", color=" + color +
                '}';
    }
}

