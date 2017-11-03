package uk.ac.rhul.cs.dice.agentcommon.interfaces;

public interface Action<T extends Enum<?>> {
    public T getGenericType();
    public abstract Actor getActor();
    public abstract boolean isGenericTypeConsistent();
}