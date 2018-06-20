import hrssc.matching.model.*;
import hrssc.matching.ranking.RankingScore;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
       RankingScore rk = new RankingScore(5.0);
       List<Project> projectList = rk.randomProject(1);
       List<Resource> resourceList = rk.randomResource(10);
       Project project = projectList.get(0);


       printResult(projectList.get(0),resourceList);
    }

    private static void printResult(Project project,List<Resource> resourceList){
        System.out.println("PROJECT_INFO: ====================================================================================================================");
        System.out.println("    1. ID: "+project.getId());
        System.out.println("    2. Skill Requirements:");
        for(Skill skill: project.getSkills()){
            System.out.println("        "+(project.getSkills().indexOf(skill) +1)+ ". "+ skill.getTitle() + ": "+skill.getExperience());
        }
        System.out.println("    3. Position Requirements:");
        for(Position position: project.getPositions()){
            System.out.println("        "+(project.getPositions().indexOf(position)+ 1) + ". "+ position.getTitle() + ": "+position.getLevel());
        }
        System.out.println("    4. Domain: "+project.getDomains());
        System.out.println("    5. Location: "+project.getLocation());
        System.out.println("    6. projectType: "+project.getProjectType());
        System.out.println("==================================================================================================================================");
        System.out.println("");
        System.out.println("RESOURCE_INFO:");
        RankingScore rk = new RankingScore(5.0);
        for(Resource resource: resourceList){
            double scoring = rk.rankingResourceByProject(project,resource);
            if(scoring > 0) {
                System.out.println("RANKING SCORE "+scoring+" =================================================================================================");
                System.out.println("    1. ID:" + resource.getId());
                System.out.println("    2. Resource Skills:");
                for(Skill skill: resource.getSkills()){
                    System.out.println("        "+(resource.getSkills().indexOf(skill) +1)+ ". "+ skill.getTitle() + ": "+skill.getExperience());
                }
                System.out.println("---------------------------------------------------------------------------------------------------------------");

            }
        }
    }
}



