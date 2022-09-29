public class Producer extends Thread {

    private Holder holder;

    public Producer(Holder holder) {
        this.holder = holder;
    }

    @Override
    public void run() {
        int i = 0;
        while(true) {
            holder.setData(i++);
        }
    }
}
