package me.mmcoulombe;

public class Robot implements Android {
    private boolean canTalk;

    @Override
    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }

    @Override
    public boolean getCanTalk() {
        return this.canTalk;
    }
}
