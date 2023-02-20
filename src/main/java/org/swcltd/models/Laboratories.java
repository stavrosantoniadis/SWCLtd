package org.swcltd.models;

import org.swcltd.models.qualityassurance.BioChemical;
import org.swcltd.models.qualityassurance.MicroBiological;
import org.swcltd.models.qualityassurance.PhysicoChemical;

public class Laboratories {

    private String name;
    private String email;
    private String location;
    private QualityAssurance quality;

    public Laboratories() {
    }

    public Laboratories(String name, String email, String location, QualityAssurance quality) {
        this.email = email;
        this.name = name;
        this.location = location;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Laboratories{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", location='" + location + '\'' +
                ", quality=" + quality +
                '}';
    }
}
