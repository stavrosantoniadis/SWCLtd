package org.swcltd;

import org.swcltd.models.AssuranceResults;
import org.swcltd.models.Laboratories;
import org.swcltd.models.QualityAssurance;
import org.swcltd.models.WaterAbstractionPoint;
import org.swcltd.models.qualityassurance.BioChemical;
import org.swcltd.models.qualityassurance.MicroBiological;
import org.swcltd.models.qualityassurance.PhysicoChemical;

public class Main {

    public static void main(String[] args) {

        boolean flag1, flag2, flag3;
        String result;

        // Set Water Abstarction Point
        WaterAbstractionPoint point = new WaterAbstractionPoint("Russia", "61.5240° N", "05.3188° E");

        // Set Quality Assurance
        PhysicoChemical physio = new PhysicoChemical(1.0, 2.0, 1.5, false, false, false);
        if (((physio.getTemperature() < 12 && physio.getTemperature() > 5)) && (physio.getPh() > 6.5 && physio.getPh() < 9.5) && physio.getConductance() < 2500 &&
                (physio.isTurbidity() == false) && physio.isColor() == false && physio.isOdor() == false){
            System.out.println("Physicochemical Quality acceptable");
            flag1 = true;
        }else {
            System.out.println("Physicochemical Quality not acceptable");
            flag1 = false;
        }

        BioChemical bio = new BioChemical(1, 2, 1.5, 4);
        if ((bio.getDO() < 2) && (bio.getTOC() >= 2 && bio.getTOC() <= 4)  && (bio.getBOD() >= 1 && bio.getBOD() <= 2) && bio.getCOD() < 10) {
            System.out.println("Biochemical Quality acceptable");
            flag2 = true;
        }else {
            System.out.println("Biochemical Quality not acceptable");
            flag2 = false;
        }

        MicroBiological micro = new MicroBiological(12, 12);
        if ((micro.getEcoli() > 0 && micro.getEcoli() < 100) && (micro.getColibac() > 0 && micro.getColibac() < 100)){
            System.out.println("Microbiological Quality acceptable");
            flag3 = true;
        }else {
            System.out.println("Microbiological Quality not acceptable");
            flag3 = false;
        }

       QualityAssurance quality = new QualityAssurance(physio, bio, micro);


        // Set Laboratory
        Laboratories lab = new Laboratories("WaterLab", "waterlab.gmail.com", "Prague", quality);

        // Results
        AssuranceResults results = new AssuranceResults(point, lab);
        if (flag1 == true && flag2 == true && flag3 == true){
            result = "Acceptable";
        }else{
            result = "Not Acceptable";
        }
        System.out.println(results.toString() + " " + result);

    }
}
