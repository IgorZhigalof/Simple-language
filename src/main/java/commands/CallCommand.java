package commands;

import codeanalyzers.FunctionFinder;
import executor.Handler;
import executor.RawCommands;

import java.util.Objects;

public class CallCommand implements Command {
    @Override
    public boolean isCorrectParams(RawCommands cmd) {
        return false;
    }

    @Override
    public String getName() {
        return "call";
    }

    @Override
    public void Execute(String args, Handler.HandlerGoto handler) {

    }
}
