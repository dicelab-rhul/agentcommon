package uk.ac.rhul.cs.dice.agentcommon.interfaces;

import java.io.Serializable;

/**
 * 
 * This interface is for generic actions. It extends {@link Serializable}.
 * 
 * @author cloudstrife9999
 *
 * @param <T> the generic enumeration type of the action.
 * 
 */
public interface Action<T extends Enum<?>> extends Serializable {
    
    /**
     * 
     * Returns the generic enumeration type of this {@link Action}.
     * 
     * @return the generic enumeration type of this {@link Action}.
     * 
     */
    public T getGenericType();
    
    /**
     * 
     * Returns the {@link String} ID of the {@link Actor} which executes this action.
     * 
     * @return the {@link String} ID of the {@link Actor} which executes this action.
     * 
     */
    public abstract String getActorID();
    
    /**
     * 
     * Checks whether the generic type of this {@link Action} is consistent.
     * 
     * @return whether or not the generic type of this {@link Action} is consistent.
     * 
     */
    public abstract boolean isGenericTypeConsistent();
}