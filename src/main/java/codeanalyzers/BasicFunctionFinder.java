package codeanalyzers;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BasicFunctionFinder implements FunctionFinder {
    Map<String, Integer> functions;

    @Override
    public boolean isFunctionExist(String content) {
        return functions.containsKey(content);
    }

    BasicFunctionFinder(List<String> content) {
        functions = findAllFunctions(content);
    }
    private Map<String, Integer> findAllFunctions(List<String> code) {
        return IntStream.of(0, code.size()-1)
                .boxed()
                .filter(x -> code.get(x).startsWith("sub"))
                .collect(Collectors.toMap(x -> code.get(x).split(" ")[1], x -> x));
    }

    @Override
    public int getFunctionLineNumber(String functionName) {
        return functions.get(functionName);
    }
}
