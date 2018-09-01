public class TestBoats {
    public static void main(String[] args){
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rawboat b3 = new Rawboat();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }
}
