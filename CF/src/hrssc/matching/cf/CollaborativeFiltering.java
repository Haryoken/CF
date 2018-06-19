package hrssc.matching.cf;

import javafx.scene.transform.MatrixType;
import hrssc.matching.model.Item;
import hrssc.matching.model.Skill;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollaborativeFiltering implements Similar{

    @Override
    public MatrixType pearsonCorrelation(List<Item> itemList, String itemA, String itemB) {
        return null;
    }

    @Override
    public MatrixType pearsonCorrelation(List<Item> itemList, Item itemA, Item itemB) {
        return null;
    }

    @Override
    public double pearsonCorrelation(Item itemA, Item itemB) {
        //Find similar skills
        Map<Skill,Skill> similarSkills= new HashMap<>();
        for(Skill skillA: itemA.getSkills()){
            for(Skill skillB: itemB.getSkills()){
                if(skillA.getTitle().equals(skillB.getTitle())){
                        similarSkills.put(skillA, skillB);
                }
            }
        }
        if(similarSkills.size() == 0){
            return 0; //
        }
        int n = similarSkills.size(); //number of similar skills

        //Pearson Correlation
        double sum1 = 0;
        double sum2 = 0;
        double sqSum1 = 0;
        double sqSum2 = 0;
        double pSum = 0;
        double num = 0;
        double den = 0;
        for(Map.Entry similar: similarSkills.entrySet()){
            Skill skillA = (Skill)similar.getKey();
            Skill skillB = (Skill)similar.getValue();
            sum1 += skillA.getExperience();
            sum2 += skillB.getExperience();
            sqSum1 += Math.pow(skillA.getExperience(),2);
            sqSum2 += Math.pow(skillB.getExperience(),2);
            pSum += skillA.getExperience()*skillB.getExperience();
        }
        num = pSum - (sum1*sum2)/n;
        den = Math.sqrt((sqSum1 - Math.pow(sum1,2)/n) * (sqSum2 - Math.pow(sum2,2)/n));
        return num/den;
    }
}
