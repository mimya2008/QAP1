public class Date {
    //attributes
    private int day;
    private int month;
    private int year;
    //constructors
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //getters & setters

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //toString
    public String toString() {
        return String.format("Formatted Date: " + "%02d/%02d/%d", day, month, year);
    }
}
