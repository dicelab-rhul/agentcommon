package uk.ac.rhul.cs.dice.agentcommon.interfaces.network;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public interface SingleNetworkRunnable extends BasicNetworkRunnable<ObjectInputStream, ObjectOutputStream> {
    @Override
    public abstract ObjectInputStream getInputChannels();
    
    @Override
    public abstract ObjectOutputStream getOutputChannels();
    
    @Override
    public abstract  void setInputChannels(ObjectInputStream input);
    
    @Override
    public abstract void setOutputChannels(ObjectOutputStream output);
}