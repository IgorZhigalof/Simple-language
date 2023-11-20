package executor;

import codeanalyzers.BasicAnalyzer;
import input.BasicFilter;
import input.BasicInput;
import input.ReaderFromFile;

public class Main {
    public static void main(String[] args) {
        String filename = "";
        CommandHandler commandHandler = new BasicCommandHandler(

                /*Some commands*/
        );
        Executor executor = new BasicExecutor(
                new Handler(
                        new BasicInput(
                                new BasicFilter(
                                        new ReaderFromFile(filename)
                                ),
                                new BasicAnalyzer(commandHandler)
                        )
                ),
                commandHandler
        );
    }
}
