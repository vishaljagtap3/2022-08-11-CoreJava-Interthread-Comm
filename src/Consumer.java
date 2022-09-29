public class Consumer extends Thread {

    private Holder holder;

    public Consumer(Holder holder) {
        this.holder = holder;
    }

    @Override
    public void run() {
        while(true) {
            holder.getData();
        }
    }
}
