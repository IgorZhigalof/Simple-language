package commands;

import executor.Handler;
import executor.RawCommands;

public interface Command {
    String getName();

    void Execute(String args, Handler.HandlerGoto handler);

    boolean isCorrectParams(RawCommands cmd);
}
