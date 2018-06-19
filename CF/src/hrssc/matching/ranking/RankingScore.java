package hrssc.matching.ranking;

import hrssc.matching.model.*;

import java.util.*;

public class RankingScore {
    private double basicSimilarity;

    public RankingScore(double basicSimilarity) {
        this.basicSimilarity = basicSimilarity;
    }




    public double getBasicSimilarity() {
        return basicSimilarity;
    }

    public void setBasicSimilarity(double basicSimilarity) {
        this.basicSimilarity = basicSimilarity;
    }



    public double rankingResourceByProject(Project project, Resource resource){
        double multipler = 1;
        //Find similar skills
        Map<Skill, Skill> similarSkills = new HashMap<>();
        for (Skill skillA : project.getSkills()) {
            for (Skill skillB : resource.getSkills()) {
                if (skillA.getTitle().equals(skillB.getTitle())) {
                    similarSkills.put(skillA, skillB);
                }
            }
        }
        if (similarSkills.size() == 0) {
            return 0;
        }

        for (Map.Entry similarEntry : similarSkills.entrySet()) {
            Skill requirementSkill = (Skill) similarEntry.getKey();
            Skill resourceSkill = (Skill) similarEntry.getValue();
            double temp = resourceSkill.getExperience() / requirementSkill.getExperience();
            multipler *= temp;
        }


        return this.getBasicSimilarity() * multipler + resource.getRating();
    }

    public double rankingProjectByResource(Resource resource, List<Project> projectList){
        return 0.0;
    }
    public List<Resource> randomResource(int amount) {

        String[] programmingLanguages = {"Java", ".NET", "C/C++", "Swift", "Scala", "Python", "PHP"};
        double[] skillExperience = {1, 1.5, 2, 2.5, 3, 3.5, 4, 4.5, 5, 5.5, 6};

        String[] positions = {"Developer", "Tester", "Project Manager"};
        String[] positionLevel = {"Junior", "Senior", "Master"};

        String[] location = {"Ho Chi Minh", "Ha Noi","Da Nang"};

        double[] rating = {1, 2, 3, 4, 5};

        String[] domains = {"Financial","Human Resource","Job Finding", "Management System"};

        String[] projectType = {"Web Application","Mobile Application","Desktop Application","Middleware"};
        List<Resource> resourceList = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            Resource resource = new Resource();

            resource.setId(i + 1);

            //Set Skills
            List<Skill> skillList = new ArrayList<>();
            List<String> skillTitleList = new ArrayList<>();
            for(String title: programmingLanguages){
                skillTitleList.add(title);
            }
            for (int j = 0; j < new Random().nextInt(new Random().nextInt(programmingLanguages.length +1)+1); j++) {
                if(skillTitleList.size() == 0){
                    break;
                }
                Skill skill = new Skill();
                String title = skillTitleList.get(new Random().nextInt(skillTitleList.size()));
                skill.setTitle(title);
                skillTitleList.remove(title);
                skill.setExperience(skillExperience[new Random().nextInt(skillExperience.length)]);
                skillList.add(skill);
            }
            resource.setSkills(skillList);

            //Set Position
            resource.setPosition(positions[new Random().nextInt(positions.length)]);

            //Set domains
            List<String> domainList = new ArrayList<>();
            List<String> tempDomains = new ArrayList<>();
            for(String domain: domains){
                tempDomains.add(domain);
            }
            for(int k = 0;k < new Random().nextInt(domains.length+1); k++){
                if(tempDomains.size() == 0){
                    break;
                }
                String domain = tempDomains.get(new Random().nextInt(tempDomains.size()));
                domainList.add(domain);
                tempDomains.remove(domain);
            }
            resource.setDomains(domainList);

            //Set projectType
            List<String> projectTypeList = new ArrayList<>();
            List<String> tempTypeList = new ArrayList<>();
            for(String type: projectType){
                tempTypeList.add(type);
            }
            for(int h =0;h< new Random().nextInt(projectType.length+1);h++){
                if(tempTypeList.size() == 0){
                    break;
                }
                String type = tempTypeList.get(new Random().nextInt(tempTypeList.size()));
                projectTypeList.add(type);
                tempTypeList.remove(type);
            }
            resource.setProjectType(projectTypeList);

            //Set Location
            resource.setLocation(location[new Random().nextInt(location.length)]);

            //Set Rating
            resource.setRating(rating[new Random().nextInt(rating.length)]);

            //Add resource
            resourceList.add(resource);
        }
        return resourceList;
    }

    public List<Project> randomProject(int amount){
        String[] programmingLanguages = {"Java", ".NET", "C/C++", "Swift", "Scala", "Python", "PHP"};
        double[] skillExperience = {1, 1.5, 2, 2.5, 3, 3.5, 4, 4.5, 5, 5.5, 6};

        String[] positions = {"Developer", "Tester", "Project Manager"};
        String[] positionLevel = {"Junior", "Senior", "Master"};

        String[] location = {"Ho Chi Minh", "Ha Noi", "Da Nang"};

        double[] rating = {0, 1, 2, 3, 4, 5};

        String[] domains = {"Financial","Human Resource","Job Finding", "Management System"};

        String[] projectType = {"Web Application","Mobile Application","Desktop Application","Middleware"};

        List<Project> projectList = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            Project project = new Project();

            project.setId(i + 1);

            //Set Skills
            List<Skill> skillList = new ArrayList<>();
            List<String> skillTitleList = new ArrayList<>();
            for(String title: programmingLanguages){
                skillTitleList.add(title);
            }
            for (int j = 0; j <= new Random().nextInt(new Random().nextInt(programmingLanguages.length) +1); j++) {
                Skill skill = new Skill();
                String title = skillTitleList.get(new Random().nextInt(skillTitleList.size()));
                skill.setTitle(title);
                skillTitleList.remove(title);
                skill.setExperience(skillExperience[new Random().nextInt(skillExperience.length)]);
                skillList.add(skill);
            }
            project.setSkills(skillList);

            //Set Positions
            List<Position> positionList = new ArrayList<>();
            List<String> tempTitles = new ArrayList<>();
            for(String title : positions){
                tempTitles.add(title);
            }
            for(int k = 0; k <= new Random().nextInt(positions.length+1);k++){
                if(tempTitles.size() == 0){
                    break;
                }
                Position position = new Position();
                String title = tempTitles.get(new Random().nextInt(tempTitles.size()));
                position.setTitle(title);
                tempTitles.remove(title);

                position.setLevel(positionLevel[new Random().nextInt(positionLevel.length)]);
                positionList.add(position);
            }
            project.setPositions(positionList);

            //Set domains
            project.setDomains(domains[new Random().nextInt(domains.length)]);

            //Set location
            project.setLocation(location[new Random().nextInt(location.length)]);

            //Set projectType
            project.setProjectType(projectType[new Random().nextInt(projectType.length)]);

            //Add project
            projectList.add(project);
        }
        return projectList;
    }


}
