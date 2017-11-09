package uk.ac.rhul.cs.dice.agentcommon.interfaces;

import java.io.Serializable;

public interface Appearance extends Serializable {
    
    public default Object serialize() {
	return "UNSUPPORTED";
    }
}