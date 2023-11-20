package codeanalyzers;

import java.util.List;

public interface Analyzer {
    void isCodeCorrect(List<String> content);
}
