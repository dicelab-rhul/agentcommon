package uk.ac.rhul.cs.dice.agentcommon.interfaces.network;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import org.apache.commons.io.serialization.ValidatingObjectInputStream;

/**
 * 
 * This interface is for a {@link Runnable} which has only 1 pair of network communication channels (I/O). It extends {@link BasicNetworkRunnable} with {@link ValidatingObjectInputStream} and {@link ObjectOutputStream} as input and output channels.
 * 
 * @author cloudstrife9999
 *
 */
public interface SingleNetworkRunnable extends BasicNetworkRunnable<ValidatingObjectInputStream, ObjectOutputStream> {
    
    /**
     * 
     * Returns the {@link ValidatingObjectInputStream} of this object.
     * 
     * @return the {@link ValidatingObjectInputStream} of this object.
     * 
     */
    @Override
    public abstract ValidatingObjectInputStream getInputChannels();
    
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
     * Sets the {@link ValidatingObjectInputStream} for this object.
     * 
     * @param input the {@link ValidatingObjectInputStream} to set as the input channel.
     * 
     */
    @Override
    public abstract  void setInputChannels(ValidatingObjectInputStream input);
    
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
     * Creates and sets the {@link Socket} for this object.
     * 
     * @param hostname the {@link String} hostname to connect to.
     * @param port the port to connect to.
     * 
     * @throws IOException if an I/O operation fails.
     *  
     */
    public abstract void openSocket(String hostname, int port) throws IOException;
}