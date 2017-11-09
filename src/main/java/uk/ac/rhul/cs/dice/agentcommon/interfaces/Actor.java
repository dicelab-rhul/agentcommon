package uk.ac.rhul.cs.dice.agentcommon.interfaces;

import java.io.Serializable;

public interface Actor extends Serializable {
    public abstract void turnLeft();
    public abstract void turnRight();
    public abstract String getID();
    public abstract Object serialize();
}