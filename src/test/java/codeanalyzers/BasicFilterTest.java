package codeanalyzers;

import input.BasicFilter;
import input.Reader;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class BasicFilterTest {
    @Test
    void whenClear() {
        Reader reader = new Reader() {
            @Override
            public List<String> read() {
                return Arrays.asList("          a       a    ", "          a       a     ");
            }
        };
        BasicFilter test = new BasicFilter(reader);
        List<String> rls = test.getContent();
        List<String> exp = Arrays.asList("a a", "a a");
        assertThat(rls).isEqualTo(exp);
    }

}