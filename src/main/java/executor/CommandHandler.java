package executor;

import commands.Command;

import java.util.List;

public interface CommandHandler {
    Command getCommand(String name);
    boolean isCorrectCommand(RawCommands cmd);
}
