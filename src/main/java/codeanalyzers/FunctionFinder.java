package codeanalyzers;

import java.util.List;
import java.util.Map;

public interface FunctionFinder {
    boolean isFunctionExist(String content);
    int getFunctionLineNumber(String functionName);
}
