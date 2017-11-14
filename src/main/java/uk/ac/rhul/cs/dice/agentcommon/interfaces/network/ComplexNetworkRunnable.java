package uk.ac.rhul.cs.dice.agentcommon.interfaces.network;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

/**
 * 
 * This interface is for a {@link Runnable} which has multiple pairs of network communication channels (I/O). It extends {@link BasicNetworkRunnable} with {@link Map}s of {@link ObjectInputStream}s and {@link ObjectOutputStream}s (from {@link String}) as input and output channels.
 * 
 * @author cloudstrife9999
 *
 */
public interface ComplexNetworkRunnable extends BasicNetworkRunnable<Map<String, ObjectInputStream>, Map<String, ObjectOutputStream>> {
    
    /**
     * 
     * Returns the {@link ObjectInputStream}s of this object as a {@link Map} from {@link String} to {@link ObjectInputStream}.
     * 
     * @return the {@link ObjectInputStream}s of this object as a {@link Map} from {@link String} to {@link ObjectInputStream}.
     * 
     */
    @Override
    public abstract Map<String, ObjectInputStream> getInputChannels();
    
    /**
     * 
     * Returns the {@link ObjectOutputStream}s of this object as a {@link Map} from {@link String} to {@link ObjectOutputStream}.
     * 
     * @return the {@link ObjectOutputStream}s of this object as a {@link Map} from {@link String} to {@link ObjectOutputStream}.
     * 
     */
    @Override
    public abstract Map<String, ObjectOutputStream> getOutputChannels();
    
    /**
     * 
     * Sets the {@link ObjectInputStream}s for this object.
     * 
     * @param input the {@link Map} from {@link String} to {@link ObjectInputStream} to set as the input channels.
     * 
     */
    @Override
    public abstract void setInputChannels(Map<String, ObjectInputStream> input);
    
    /**
     * 
     * Sets the {@link ObjectOutputStream}s for this object.
     * 
     * @param input the {@link Map} from {@link String} to {@link ObjectOutputStream} to set as the output channels.
     * 
     */
    @Override
    public abstract void setOutputChannels(Map<String, ObjectOutputStream> output);
}