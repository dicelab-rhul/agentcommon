package uk.ac.rhul.cs.dice.agentcommon.interfaces;

import java.io.Serializable;

/**
 * 
 * This interface is for {@link Appearance}s of objects. It extends {@link Serializable}.
 * 
 * @author cloudstrife9999
 *
 */
public interface Appearance extends Serializable {
    
    /**
     * 
     * Method for serialization of {@link Appearance}s. It needs to be implemented by subclasses.
     * 
     * @return a default {@link String} saying that this method is unsupported by this class. The absence of a thrown {@link Exception} is intentional.
     * 
     */
    public default Object serialize() {
	return "UNSUPPORTED";
    }
}