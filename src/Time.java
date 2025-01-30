public class Time {
    //attributes
    private int hour;
    private int minute;
    private int second;


    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //getters & setters
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }


    //methods to next second
    public Time nextSecond() {
        second++; // Increase seconds
        if (second == 60) {  // If seconds overflow
            second = 0;
            minute++;  // Increase minutes
            if (minute == 60) {  // If minutes overflow
                minute = 0;
                hour++;  // Increase hours
                if (hour == 24) {  // If hours overflow
                    hour = 0;  // Reset to 0 (24-hour format)
                }
            }
        }
        return this;  // Return the current instance for method chaining
    }

    // Method to go back by 1 second
    public Time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23; // Wrap around to the previous day
                }
            }
        }
        return this;
    }


    //toString

    public String toString() {
        return String.format("Formatted Time: " + "%02d:%02d:%d", hour, minute, second);
    }
}
