package uk.ac.rhul.cs.dice.agentcommon.interfaces;

import java.io.Serializable;

public interface Action<T extends Enum<?>> extends Serializable {
    public T getGenericType();
    public abstract String getActorID();
    public abstract boolean isGenericTypeConsistent();
}