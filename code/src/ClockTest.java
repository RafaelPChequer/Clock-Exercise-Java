import static org.junit.Assert.*;
import org.junit.Test;

public class ClockTest {

    @Test
    public void testSetAndGetHours() {
        Clock clock = new Clock();
        clock.set(10, 30, 45);
        assertEquals(10, clock.getHours());
    }

    @Test
    public void testSetInvalidTime() {
        Clock clock = new Clock();
        clock.set(25, 30, 45); // Invalid hours
        assertEquals(0, clock.getHours()); // Hours should not change
    }

    @Test
    public void testSetAndGetMinutes() {
        Clock clock = new Clock();
        clock.set(10, 30, 45);
        assertEquals(30, clock.getMinutes());
    }

    @Test
    public void testSetInvalidMinutes() {
        Clock clock = new Clock();
        clock.set(10, 65, 45); // Invalid minutes
        assertEquals(0, clock.getMinutes()); // Minutes should not change
    }

    @Test
    public void testSetAndGetSeconds() {
        Clock clock = new Clock();
        clock.set(10, 30, 45);
        assertEquals(45, clock.getSeconds());
    }

    @Test
    public void testSetInvalidSeconds() {
        Clock clock = new Clock();
        clock.set(10, 30, 75); // Invalid seconds
        assertEquals(0, clock.getSeconds()); // Seconds should not change
    }

    @Test
    public void testReset() {
        Clock clock = new Clock();
        clock.set(10, 30, 45);
        clock.reset();
        assertEquals(0, clock.getHours());
        assertEquals(0, clock.getMinutes());
        assertEquals(0, clock.getSeconds());
    }

    @Test
    public void testPrint24HourFormat() {
        Clock clock = new Clock();
        clock.set(15, 20, 30);
        clock.print24HourFormat();
    }

    @Test
    public void testPrintAMPMFormat() {
        Clock clock = new Clock();
        clock.set(8, 45, 0);
        clock.printAMPMFormat();
    }

    @Test
    public void testStopWatch() {
        Clock clock = new Clock();
        clock.set(10, 0, 0);
        int elapsed = clock.stopWatch(10, 15, 30);
        assertEquals(930, elapsed);
    }

    @Test
    public void testStopWatchInvalidTime() {
        Clock clock = new Clock();
        int elapsed = clock.stopWatch(10, 65, 30); // Invalid time
        assertEquals(-1, elapsed); // Indicates an error
    }
}
