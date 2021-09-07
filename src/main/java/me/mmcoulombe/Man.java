package me.mmcoulombe;

public class Man implements Humanoid {
    boolean canTalk;

    public Man()
    {
        this.canTalk = true;
    }

    @Override
    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }

    @Override
    public boolean getCanTalk() {
        return this.canTalk;
    }

    @Override
    public void talk() {
        System.out.println("hi");
    }

    @Override
    public void useBestPickupLine() {
        System.out.println("Well, here I am. What were your other wishes");
    }
}
