package uk.ac.rhul.cs.dice.agentcommon.interfaces.network;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * This interface is for a {@link Runnable} which has only 1 pair of network communication channels (I/O). It extends {@link BasicNetworkRunnable} with {@link ObjectInputStream} and {@link ObjectOutputStream} as input and output channels.
 * 
 * @author cloudstrife9999
 *
 */
public interface SingleNetworkRunnable extends BasicNetworkRunnable<ObjectInputStream, ObjectOutputStream> {
    
    /**
     * 
     * Returns the {@link ObjectInputStream} of this object.
     * 
     * @return the {@link ObjectInputStream} of this object.
     * 
     */
    @Override
    public abstract ObjectInputStream getInputChannels();
    
    /**
     * 
     * Returns the {@link ObjectOutputStream} of this object.
     * 
     * @return the {@link ObjectOutputStream} of this object.
     * 
     */
    @Override
    public abstract ObjectOutputStream getOutputChannels();
    
    /**
     * 
     * Sets the {@link ObjectInputStream} for this object.
     * 
     * @param input the {@link ObjectInputStream} to set as the input channel.
     * 
     */
    @Override
    public abstract  void setInputChannels(ObjectInputStream input);
    
    /**
     * 
     * Sets the {@link ObjectOutputStream} for this object.
     * 
     * @param input the {@link ObjectOutputStream} to set as the output channel.
     * 
     */
    @Override
    public abstract void setOutputChannels(ObjectOutputStream output);
}