import static org.junit.Assert.*;
import org.junit.Test;

public class ClockTest {

    @Test
    public void testSetAndGetHours() {
        Clock clock = new Clock();
        clock.set(10, 30, 45); // Define o horário do relógio
        assertEquals(10, clock.getHours()); // Verifica se o valor das horas está correto
    }

    @Test
    public void testSetInvalidTime() {
        Clock clock = new Clock();
        clock.set(25, 30, 45); // Tenta definir um horário inválido
        assertEquals(0, clock.getHours()); // Verifica se as horas não foram alteradas
    }

    @Test
    public void testSetAndGetMinutes() {
        Clock clock = new Clock();
        clock.set(10, 30, 45); // Define o horário do relógio
        assertEquals(30, clock.getMinutes()); // Verifica se o valor dos minutos está correto
    }

    @Test
    public void testSetInvalidMinutes() {
        Clock clock = new Clock();
        clock.set(10, 65, 45); // Tenta definir minutos inválidos
        assertEquals(0, clock.getMinutes()); // Verifica se os minutos não foram alterados
    }

    @Test
    public void testSetAndGetSeconds() {
        Clock clock = new Clock();
        clock.set(10, 30, 45); // Define o horário do relógio
        assertEquals(45, clock.getSeconds()); // Verifica se o valor dos segundos está correto
    }

    @Test
    public void testSetInvalidSeconds() {
        Clock clock = new Clock();
        clock.set(10, 30, 75); // Tenta definir segundos inválidos
        assertEquals(0, clock.getSeconds()); // Verifica se os segundos não foram alterados
    }

    @Test
    public void testReset() {
        Clock clock = new Clock();
        clock.set(10, 30, 45);
        clock.reset(); // Reseta o relógio
        assertEquals(0, clock.getHours());
        assertEquals(0, clock.getMinutes());
        assertEquals(0, clock.getSeconds());
    }

    @Test
    public void testPrint24HourFormat() {
        Clock clock = new Clock();
        clock.set(15, 20, 30);
        clock.print24HourFormat(); // Imprime o horário no formato de 24 horas
    }

    @Test
    public void testPrintAMPMFormat() {
        Clock clock = new Clock();
        clock.set(8, 45, 0);
        clock.printAMPMFormat(); // Imprime o horário no formato AM/PM
    }

    @Test
    public void testStopWatch() {
        Clock clock = new Clock();
        clock.set(10, 0, 0);
        int elapsed = clock.stopWatch(10, 15, 30); // Calcula o tempo decorrido
        assertEquals(930, elapsed); // Verifica se o tempo decorrido está correto
    }

    @Test
    public void testStopWatchInvalidTime() {
        Clock clock = new Clock();
        int elapsed = clock.stopWatch(10, 65, 30); // Tenta calcular tempo com horário inválido
        assertEquals(-1, elapsed); // Verifica se o resultado indica erro
    }
}
