package absTask;

public interface Collapsible {

    // there is by default: public abstract interface --> but it's redundant!

    public abstract void lock();
    public abstract void unlock();
    public abstract void fold();
    public abstract void unfold();
}
