package me.mmcoulombe;

public interface Android {
    void setCanTalk(boolean canTalk);
    boolean getCanTalk();

    default void talk()
    {
        System.out.println("001100110");
    }

    default void findAnswerToLife()
    {
        System.out.println("42");
    }
}
