public class Clock {
    private int hours;      // Armazena as horas do relógio
    private int minutes;    // Armazena os minutos do relógio
    private int seconds;    // Armazena os segundos do relógio

    // Define o horário do relógio
    public void set(int newHours, int newMinutes, int newSeconds) {
        if (isValidTime(newHours, newMinutes, newSeconds)) {  // Verifica se o horário é válido
            hours = newHours;
            minutes = newMinutes;
            seconds = newSeconds;
        } else {
            System.out.println("Horário Inválido!");
        }
    }

    // Verifica se um horário é válido (dentro dos limites de horas, minutos e segundos)
    private boolean isValidTime(int hours, int minutes, int seconds) {
        return hours >= 0 && hours < 24 &&
                minutes >= 0 && minutes < 60 &&
                seconds >= 0 && seconds < 60;
    }

    // Define o horário do relógio como 00:00:00
    public void reset() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    // Calcula o tempo decorrido entre dois horários no formato de um cronômetro
    public int stopWatch(int newHours, int newMinutes, int newSeconds) {
        if (!isValidTime(newHours, newMinutes, newSeconds)) {
            System.out.println("Horário Inválido!");
            return -1;
        }

        // Calcula a diferença de tempo em segundos
        int time = hours * 3600 + minutes * 60 + seconds - (newHours * 3600 + newMinutes * 60 + newSeconds);
        if (time < 0) {
            time *= -1;
        }
        return time;
    }

    // Imprime o horário no formato de 24 horas (HH:MM:SS)
    public void print24HourFormat() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

    // Imprime o horário no formato AM/PM (hh:mm:ss AM/PM)
    public void printAMPMFormat() {
        String ampm = (hours < 12) ? "AM" : "PM";   // Define se é AM ou PM
        int hours12 = (hours == 0 || hours == 12) ? 12 : hours % 12;  // Converte para formato 12 horas

        System.out.printf("%02d:%02d:%02d %s\n", hours12, minutes, seconds, ampm);
    }

    // Métodos para obter as horas, minutos e segundos atuais
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
