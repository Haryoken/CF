import machinelearning.cf.CollaborativeFiltering;
import machinelearning.model.Item;
import machinelearning.model.Skill;

import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args)
    {
        CollaborativeFiltering CF = new CollaborativeFiltering();

        Skill java = new Skill("Java",2);
        Skill java2 = new Skill("Java",3);

        Skill dotNet = new Skill(".NET", 3);
        Skill dotNet2 = new Skill(".NET",1);

        List<Skill> skillListA = new Vector<>();
        skillListA.add(java);
        skillListA.add(dotNet);
        skillListA.add(new Skill("Angular", 0));
        List<Skill> skillListB = new Vector<>();
        skillListB.add(java);
        skillListB.add(java);
        skillListB.add(new Skill("Angular", 0));
        Item itemA = new Item(1, skillListA,null,5,"Project","Hanoi");
        Item itemB = new Item(2, skillListB,null,4,"Project","Hanoi");
        System.out.println("Pearson Corellation:" + CF.pearsonCorrelation(itemA,itemB));
    }
}
