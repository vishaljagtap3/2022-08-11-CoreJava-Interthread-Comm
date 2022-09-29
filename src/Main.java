public class Main {
    public static void main(String[] args) {
        Holder holder = new Holder();

        new Producer(holder).start();
        new Consumer(holder).start();
    }
}
