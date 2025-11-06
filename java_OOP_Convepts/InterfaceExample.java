
class InheritanceExample {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(3, 100, 25);
        System.out.println( "Gear is: " + mountainBike.gear);
        System.out.println( "Speed is: " + mountainBike.speed);
        System.out.println( mountainBike.toString() );

        mountainBike.applyBrake(5);
        System.out.println( "Speed after applying brake: " + mountainBike.speed);
    }
}