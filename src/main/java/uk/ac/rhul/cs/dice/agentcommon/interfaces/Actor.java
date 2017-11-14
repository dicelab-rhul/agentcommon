package uk.ac.rhul.cs.dice.agentcommon.interfaces;

import java.io.Serializable;

/**
 * 
 * This interface is for actors which execute {@link Action}s. It extends {@link Serializable}.
 * 
 * @author cloudstrife9999
 *
 */
public interface Actor extends Serializable {
    
    /**
     * 
     * Turns this {@link Actor} towards its left.
     * 
     */
    public abstract void turnLeft();
    
    /**
     * 
     * Turns this {@link Actor} towards its right.
     * 
     */
    public abstract void turnRight();
    
    /**
     * 
     * Returns the {@link String} ID of this {@link Actor}.
     * 
     * @return the {@link String} ID of this {@link Actor}.
     * 
     */
    public abstract String getID();
    
    /**
     * 
     * Returns a serialized representation of this {@link Actor}.
     * 
     * @return a serialized representation of this {@link Actor}.
     * 
     */
    public abstract Object serialize();
}