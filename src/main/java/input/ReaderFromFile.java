package input;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReaderFromFile implements Reader {
    private String fileName;

    public ReaderFromFile(String fileName) {
        this.fileName = fileName;
    }

    public List<String> read() {
        BufferedReader reader;
        List<String> result = new LinkedList<>();
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
