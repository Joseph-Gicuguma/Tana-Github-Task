
class MountainBike extends Bicycle {
    // additional fields and methods specific to MountainBike
    private int seatHeight;

    public MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSeat height is " + seatHeight;
    }
}