public class Watch {
    // watch has hours and minutes
    private int hours;
    private int minutes;
    private boolean hasOwner;

    // watch has constructor with parameters
    public Watch(int hours, int minutes, boolean hasOwner) {
        this.hours = hours;
        this.minutes = minutes;
        this.hasOwner = hasOwner;
    }

    public Watch(int hours, int minutes) {
        this(hours, minutes, false);
    }

    // watch has a copy constructor
    public Watch(Watch w) {
        this.hours = w.hours;
        this.minutes = w.minutes;
    }

    // watch has a increment method
    public void increment() {
        minutes++;
        if (minutes == 60) {
            minutes = 0;
            hours++;
            if (hours == 24) {
                hours = 0;
            }
        }
    }

    public boolean getHasOwner() {
        return hasOwner;
    }

    public void setHasOwner() {
        this.hasOwner = true;
    }

    // watch has a decrement method
    public void decrement() {
        minutes--;
        if (minutes == -1) {
            minutes = 59;
            hours--;
            if (hours == -1) {
                hours = 23;
            }
        }
    }

    public void showTime() {
        System.out.println(hours + ":" + minutes);
    }

    public String toString() {
        return hours + ":" + minutes;
    }

    // main method
    public static void main(String[] args) {
        Watch w = new Watch(13, 45);
        w.showTime();
        Watch w2 = new Watch(w);

    }

}
