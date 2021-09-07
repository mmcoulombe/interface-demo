package me.mmcoulombe;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("-------- Man1 -------");
        Man man1 = new Man();
        flirt(man1);
        System.out.println("-------------------------");

        System.out.println("-------- Man2 -------");
        Man man2 = new Man();
        man2.setCanTalk(false);
        flirt(man2);
        System.out.println("-------------------------");

        System.out.println("-------- Robot1 -------");
        Robot robot1 = new Robot();
        robot1.setCanTalk(true);
        processQuestion(robot1);
        System.out.println("-------------------------");

        System.out.println("-------- Robot2 -------");
        Robot robot2 = new Robot();
        robot2.setCanTalk(false);
        processQuestion(robot2);
        System.out.println("-------------------------");

        System.out.println("---- Augmented Human ----");
        AugmentedHuman jl = new AugmentedHuman();
        flirt(jl);
        processQuestion(jl);
        System.out.println("-------------------------");
    }

    public static void flirt(Humanoid human)
    {
        if (human.getCanTalk()) {
            human.talk();
            human.useBestPickupLine();
        }
        else
        {
            System.out.println("This person is too shy to talk");
        }
    }

    public static void processQuestion(Android android)
    {
        if (android.getCanTalk()) {
            android.talk();
            android.findAnswerToLife();
        }
        else
        {
            System.out.println("No interface to interact with it");
        }
    }
}
