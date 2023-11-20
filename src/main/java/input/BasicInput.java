package input;

import codeanalyzers.Analyzer;

import java.util.List;

public class BasicInput implements Input {
    Filter filter;
    Analyzer analyzer;

    public BasicInput(Filter filter, Analyzer analyzer) {
        this.filter = filter;
        this.analyzer = analyzer;
    }

    @Override
    public List<String> getContent(String filename) {
        List<String> content = filter.getContent();
        analyzer.isCodeCorrect(content);
        return filter.getContent();
    }
}
