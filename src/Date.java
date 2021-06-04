import java.io.Serializable;

public class Date implements Serializable {
    private int Year;
    private int Day;
    private int Month;

    public Date(int day, int month, int year) {
        super();
        this.Day = day;
        this.Month = month;
        this.Year = year;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Newyear) {
        Year = Newyear;
    }

    public int getDate() {
        return Day;
    }

    public void setDate(int Newdate) {
        Day = Newdate;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Newmonth) {
        Month = Newmonth;
    }

    @Override
    public String toString() {
        return "'"+Day + '\'' +
                "'-'" + Month + '\'' +"-'" + Year + '\'';
    }
}
