public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

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
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time nextSecond() {
        if(hour == 23 && minute == 59 && second == 59) {
            hour = 0;
            minute = 0;
            second = 0;
            return this;
        }
        if(minute == 59 && second == 59) {
            hour++;
            minute = 0;
            second = 0;
            return this;
        }
        if(second == 59) {
            minute++;
            second = 0;
            return this;
        }
        second++;
        return this;
    }
    public Time previousSecond() {
        if(hour == 0 && minute == 0 && second == 0) {
            hour = 23;
            minute = 59;
            second = 59;
            return this;
        }
        if(minute == 0 && second == 0) {
            hour--;
            minute = 59;
            second = 59;
            return this;
        }
        if(second == 0) {
            minute--;
            second = 59;
            return this;
        }
        second--;
        return this;
    }
    public String toString() {
        String hourStr = (hour < 10) ? "0" + hour : String.valueOf(hour);
        String minuteStr = (minute < 10) ? "0" + minute : String.valueOf(minute);
        String secondStr = (second < 10) ? "0" + second : String.valueOf(second);
        return hourStr + ":" + minuteStr + ":" + secondStr;
    }
}
