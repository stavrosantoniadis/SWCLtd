package org.swcltd.models;

import org.swcltd.models.qualityassurance.BioChemical;
import org.swcltd.models.qualityassurance.MicroBiological;
import org.swcltd.models.qualityassurance.PhysicoChemical;

public class QualityAssurance {

    private PhysicoChemical physio;
    private BioChemical bio;
    private MicroBiological micro;

    public QualityAssurance() {
    }

    public QualityAssurance(PhysicoChemical physio) {
        this.physio = physio;
    }

    public QualityAssurance(BioChemical bio) {
        this.bio = bio;
    }

    public QualityAssurance(MicroBiological micro) {
        this.micro = micro;
    }
    public QualityAssurance(PhysicoChemical physio, BioChemical bio) {
        this.physio = physio;
        this.bio = bio;
    }
    public QualityAssurance(PhysicoChemical physio, MicroBiological micro) {
        this.physio = physio;
        this.micro = micro;
    }

    public QualityAssurance(BioChemical bio, MicroBiological micro) {
        this.bio = bio;
        this.micro = micro;
    }

    public QualityAssurance(PhysicoChemical physio, BioChemical bio, MicroBiological micro) {
        this.physio = physio;
        this.bio = bio;
        this.micro = micro;
    }

    public PhysicoChemical getPhysio() {
        return physio;
    }

    public void setPhysio(PhysicoChemical physio) {
        this.physio = physio;
    }

    public BioChemical getBio() {
        return bio;
    }

    public void setBio(BioChemical bio) {
        this.bio = bio;
    }

    public MicroBiological getMicro() {
        return micro;
    }

    public void setMicro(MicroBiological micro) {
        this.micro = micro;
    }

    @Override
    public String toString() {
        return "QualityAssurance{" +
                "physio=" + physio +
                ", bio=" + bio +
                ", micro=" + micro +
                '}';
    }
}
