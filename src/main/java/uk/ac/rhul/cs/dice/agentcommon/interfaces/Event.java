package uk.ac.rhul.cs.dice.agentcommon.interfaces;

@FunctionalInterface
public interface Event {
    public abstract long getTimestamp();
}