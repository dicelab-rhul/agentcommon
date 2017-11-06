package uk.ac.rhul.cs.dice.agentcommon.interfaces.network;

public interface BasicNetworkRunnable<I, O> extends Runnable {
    public I getInputChannels();
    public O getOutputChannels();
    public void setInputChannels(I input);
    public void setOutputChannels(O output);
}