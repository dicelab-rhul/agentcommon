package uk.ac.rhul.cs.dice.agentcommon.interfaces.network;

/**
 * 
 * This interface is for a {@link Runnable} with network capabilities.
 * 
 * @author cloudstrife9999
 *
 * @param <I> the type of the input channels.
 * @param <O> the type of the output channels.
 * 
 */
public interface BasicNetworkRunnable<I, O> extends Runnable {
    
    /**
     * 
     * Returns the input channel(s) of this object.
     * 
     * @return the input channel(s) of this object.
     * 
     */
    public I getInputChannels();
    
    /**
     * 
     * Returns the output channel(s) of this object.
     * 
     * @return the output channel(s) of this object.
     * 
     */
    public O getOutputChannels();
    
    /**
     * 
     * Sets the input channel(s) for this object.
     * 
     * @param input the input channel(s).
     * 
     */
    public void setInputChannels(I input);
    
    /**
     * 
     * Sets the output channel(s) for this object.
     * 
     * @param output the output channel(s).
     * 
     */
    public void setOutputChannels(O output);
}