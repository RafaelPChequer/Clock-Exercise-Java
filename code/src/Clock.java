public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public void set(int newHours, int newMinutes, int newSeconds) {
        if (isValidTime(newHours, newMinutes, newSeconds)) {
            hours = newHours;
            minutes = newMinutes;
            seconds = newSeconds;
        } else {
            System.out.println("Horário Inválido!");
        }
    }

    private boolean isValidTime(int hours, int minutes, int seconds) {
        return hours >= 0 && hours < 24 &&
                minutes >= 0 && minutes < 60 &&
                seconds >= 0 && seconds < 60;
    }


    public void reset() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public int stopWatch(int newHours, int newMinutes, int newSeconds) {
        if (!isValidTime(newHours, newMinutes, newSeconds)) {
            System.out.println("Horário Inválido!");
            return -1;
        }

        int time = hours * 3600 + minutes * 60 + seconds - (newHours * 3600 + newMinutes * 60 + newSeconds);
        if (time < 0) {
            time *= -1;
        }
        return time;
    }

    public void print24HourFormat() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

    public void printAMPMFormat() {
        String ampm = (hours < 12) ? "AM" : "PM";
        int hours12 = (hours == 0 || hours == 12) ? 12 : hours % 12;

        System.out.printf("%02d:%02d:%02d %s\n", hours12, minutes, seconds, ampm);
    }

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
