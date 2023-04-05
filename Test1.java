import org.junit.Test;

public class Test1 {
    @Test
    public void testFoo() {
        String[] paths = System.getProperty("java.library.path").split(":");
        
        System.loadLibrary("bad");
    }
}