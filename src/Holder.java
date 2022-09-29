public class Holder {

    private int data;
    private boolean flag = false;

    public synchronized void getData() {

        if(flag == true) {
            System.out.println("Got: " + data);
            flag = false;
            notify();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void setData(int data) {
        if(flag == false) {
            this.data = data;
            System.out.println("Put: " + data);
            flag = true;
            notify();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
