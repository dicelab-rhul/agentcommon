package uk.ac.rhul.cs.dice.agentcommon.interfaces.network;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

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
    
    /**
     * 
     * Sets the {@link Socket} for this object.
     * 
     * @param hostname the {@link String} hostname to connect to.
     * @param port the port to connect to.
     * 
     * @throws IOException if an I/O operation fails.
     * 
     */
    public abstract void openSocket(String hostname, int port) throws IOException;
}