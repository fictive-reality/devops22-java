package examples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PathSplitterTests {

    @Test
    public void shouldSplitNormalPath() {
        String p = "/files/myfile.txt";
        String[] exp = new String[] {"/files", "myfile", "txt"};
        String[] out = PathSplitter.splitPath(p);
        assertArrayEquals(exp, out);
    }
}
