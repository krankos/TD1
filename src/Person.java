public class Person {
    private String name;
    private Watch watch;
    private boolean isWearingWatch;

    public Person(String name, Watch watch) {
        this.name = name;
        this.watch = watch;
        this.isWearingWatch = true;
    }

    public Person() {
        this.name = "";
        // this.watch = new Watch();
        this.isWearingWatch = false;
    }

    // Person has wear watch method
    public void wearWatch(Watch w) {
        if (isWearingWatch) {
            System.out.println(name + " is already wearing a watch.");
        } else if (w.getHasOwner()) {
            System.out.println("This watch is already owned by someone else.");
        } else {
            watch = w;
            watch.setHasOwner();
            isWearingWatch = true;
            System.out.println(name + " is now wearing a watch.");
        }

    }

    public void unwearWatch(Watch w) {
        if (isWearingWatch) {
            isWearingWatch = false;
            System.out.println(name + " is no longer wearing a watch.");
        } else {
            System.out.println(name + " is not wearing a watch.");
        }
    }

    public String askTime(Person P) {
        return P.isWearingWatch ? P.watch.toString() : "";
    }

}
