//без тестування

public class TimeSpan {
    private int hours;
    private int minutes;

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public TimeSpan() {
    }

    public TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            return;
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    public TimeSpan(int minutes) {
        if (minutes < 0) {
            return;
        }
        this.hours = minutes / 60;
        this.minutes = minutes % 60;
    }

    public TimeSpan(TimeSpan span) {
        this.hours=span.getHours();
        this.minutes=span.getMinutes();
    }

    public int getTotalMinutes(){
        return (hours*60)+minutes;
    }

    public double getTotalHours(){
        return hours +(minutes/60.0);
    }

    public void add(int hours, int minutes){
        if (hours < 0 || minutes < 0 || minutes > 59) {
            return;
        }
        this.hours += hours;
        this.minutes += minutes;
        this.hours += this.minutes/60;
        this.minutes = this.minutes%60;
    }

    public void add(int minutes){
        if (minutes < 0) {
            return;
        }
        this.minutes += minutes;
        this.hours += this.minutes/60;
        this.minutes = this.minutes%60;
    }
    public void add(TimeSpan span){
        add(span.getHours(), span.getMinutes());
    }

    public void scale(int factor){
        if (factor <= 0) {
            return;
        }
        int total = getTotalMinutes()*factor;
        this.hours=total/60;
        this.minutes=total%60;
    }

    public void subtract(int minutes){
        if (minutes<0 || minutes>getTotalMinutes()) {
            return;
        }
            int substractionValue = (getTotalMinutes() - minutes);
            this.hours=substractionValue/60;
            this.minutes=substractionValue%60;
    }

    public void subtract(int hours, int minutes){
        if (hours < 0 || minutes < 0 || minutes > 59)
        {return;}
        subtract(hours * 60 + minutes);
    }

    public void subtract(TimeSpan span){
        subtract(span.getHours(), span.getMinutes());
    }
}
