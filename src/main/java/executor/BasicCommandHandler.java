package executor;

import commands.Command;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicCommandHandler implements CommandHandler {
    Map<String, Command> map = new HashMap<>();

    public BasicCommandHandler(Command... commands) {
        for (Command command : commands) {
            map.put(command.getName(), command);
        }
    }

    @Override
    public Command getCommand(String name) {
        return map.get(name);
    }

    @Override
    public boolean isCorrectCommand(RawCommands cmd) {
        return map.get(cmd.name()).isCorrectParams(cmd);
    }
}
