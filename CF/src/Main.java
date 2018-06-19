import hrssc.matching.model.Item;
import hrssc.matching.model.Project;
import hrssc.matching.model.Resource;
import hrssc.matching.model.Skill;
import hrssc.matching.ranking.RankingScore;

import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        RankingScore rk = new RankingScore(5.0);


       List<Project> projectList = rk.randomProject(1);
       List<Resource> resourceList = rk.randomResource(10);
       Project project = projectList.get(0);
        System.out.println(project.toString());
       for(Resource resource: resourceList){
           double scoring = rk.rankingResourceByProject(projectList.get(0),resource);
           if(scoring > 0) {
               System.out.println("id:" + resource.getId() + " - Ranking: " + scoring);
           }
       }
       RankingScore rk2 = new RankingScore(2);
    }
}



