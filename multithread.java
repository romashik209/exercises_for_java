public class multithread {
    public static void main(String[] args) {
        multithreading myThing = new multithreading(1);
        multithreading myThing2 = new multithreading(2);

        myThing.start();
        myThing2.start();
    }
}
