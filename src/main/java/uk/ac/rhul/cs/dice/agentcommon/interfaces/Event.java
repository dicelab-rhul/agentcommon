package uk.ac.rhul.cs.dice.agentcommon.interfaces;

/**
 * 
 * This is an interface for events. It allows to retrieve the timestamp of a particular {@link Event}.
 * 
 * @author cloudstrife9999
 *
 */
@FunctionalInterface
public interface Event {
    
    /**
     * 
     * Returns the timestamp of this {@link Event}.
     * 
     * @return a {@link Long} representing the timestamp of this {@link Event}.
     * 
     */
    public abstract long getTimestamp();
}