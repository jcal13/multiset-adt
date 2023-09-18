import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public abstract class MultiSet {
    public abstract boolean add(Object item);
    public abstract void remove(Object item);

    public abstract boolean contains (Object item);

    public abstract boolean isEmpty(Object item);
    public abstract int count(Object item);

    public abstract int size(Object item);
}
