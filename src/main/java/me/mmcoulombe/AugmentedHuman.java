package me.mmcoulombe;

public class AugmentedHuman implements Humanoid, Android {
    private boolean canTalk;

    @Override
    public void talk() {
        System.out.println("Hello there!");
    }

    @Override
    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }

    @Override
    public boolean getCanTalk() {
        return canTalk;
    }

    @Override
    public void useBestPickupLine() {
        System.out.println("I seem to have lost my phone number. Can I have yours?");
    }

    @Override
    public void findAnswerToLife() {
        System.out.println("I don't have enough brain power");
    }

    public AugmentedHuman()
    {
        canTalk = true;
    }
}
