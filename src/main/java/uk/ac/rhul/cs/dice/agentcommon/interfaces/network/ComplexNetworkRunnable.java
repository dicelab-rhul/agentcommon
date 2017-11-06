package uk.ac.rhul.cs.dice.agentcommon.interfaces.network;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

public interface ComplexNetworkRunnable extends BasicNetworkRunnable<Map<String, ObjectInputStream>, Map<String, ObjectOutputStream>> {
    @Override
    public abstract Map<String, ObjectInputStream> getInputChannels();
    
    @Override
    public abstract Map<String, ObjectOutputStream> getOutputChannels();
    
    @Override
    public abstract void setInputChannels(Map<String, ObjectInputStream> input);
    
    @Override
    public abstract void setOutputChannels(Map<String, ObjectOutputStream> output);
}