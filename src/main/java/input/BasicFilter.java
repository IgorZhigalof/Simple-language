package input;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class BasicFilter implements Filter {
    Reader reader;
    public BasicFilter(Reader reader) {
        this.reader = reader;
    }

    @Override
    public List<String> getContent() {
        return reader.read().stream()
                .map(x -> IntStream.range(0, x.length())
                        .boxed()
                        .reduce(" ",
                                (a, b) -> {
                                    if (a.endsWith(" ") && x.charAt(b) == ' ') {
                                        return a;
                                    }
                                    else {
                                        return (a + x.charAt(b));
                                    }
                                },
                                (a, b) -> (a + b)
                        )
                        .trim()
                )
                .collect(Collectors.toList());

    }
}
