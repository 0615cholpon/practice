package absTask;

import absTask.Chair;
import absTask.Collapsible;
import absTask.Rollable;

public class HumanScale extends Chair implements Rollable, Collapsible {
    @Override
    public void sit() {
        System.out.println("sitting on HumanScale chair");
    }

    @Override
    public void stepOnIt() {
        System.out.println("stepping on HumanScale chair");
    }

    @Override
    public void lock() {
        System.out.println("HumanScale chair is locked!");
    }

    @Override
    public void unlock() {
        System.out.println("HumanScale chair is unlocked!");

    }

    @Override
    public void fold() {
        System.out.println("HumanScale chair is folded!");

    }

    @Override
    public void unfold() {
        System.out.println("HumanScale chair is unfolded!");

    }

    @Override
    public void rollBack() {
        System.out.println("HumanScale chair is rolling back");

    }

    @Override
    public void rollForward() {
        System.out.println("HumanScale chair is rolling forward!");

    }
}
