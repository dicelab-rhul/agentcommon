package uk.ac.rhul.cs.dice.agentcommon.utils;

import java.util.logging.ConsoleHandler;

public class CleanConsoleHandler extends ConsoleHandler {

    public CleanConsoleHandler() {
	super();
	
	setOutputStream(System.out);
    }
}