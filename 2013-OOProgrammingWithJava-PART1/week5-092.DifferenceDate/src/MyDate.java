public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate comparedDate) {
        int d1 = this.day - comparedDate.day;
        int m1 = this.month - comparedDate.month;
        int y1 = this.year - comparedDate.year;
        int val = (y1*365) + (m1*30) + d1;
//        int num =
//        System.out.println(val);
        return Math.abs(val / 365);
        
    }

}
