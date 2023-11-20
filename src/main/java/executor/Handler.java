package executor;

import input.BasicInput;
import input.Input;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Handler {
    private List<String> code;
    private Map<String, Integer> functions;
    private int currentLine = 0;

    public Handler(Input input) {
    }

    public record LineHandler(String commandName, String content) { }

    public LineHandler getNextAction() {
        String line = code.get(currentLine++);
        String lineSplit = line.split(" ")[0];
        return new LineHandler(lineSplit,
                Stream.of(lineSplit)
                        .skip(1)
                        .collect(Collectors.joining())
        );
    }

    public class HandlerGoto {
        public void gotoLine(int line) {
            currentLine = line;
        }

        public void gotoFunction(String functionName) {
            currentLine = functions.get(functionName);
        }
    }
}
