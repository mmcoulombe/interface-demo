package me.mmcoulombe;

public interface Humanoid {
    void setCanTalk(boolean canTalk);
    boolean getCanTalk();

    void talk();

    void useBestPickupLine();
}
