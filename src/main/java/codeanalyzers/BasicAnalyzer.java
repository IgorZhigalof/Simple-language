package codeanalyzers;

import executor.CommandHandler;

import java.util.List;

public class BasicAnalyzer implements Analyzer {
    CommandHandler commandHandler;

    public BasicAnalyzer(CommandHandler commandHandler) {
        this.commandHandler = commandHandler;
    }

    @Override
    public void isCodeCorrect(List<String> content) {

    }
}
