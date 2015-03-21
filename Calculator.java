/**
 * Created by chen_jin on 2015/3/21.
 */

public class Calculator implements Runnable {
    private int n_num;

    public Calculator(int num) {
        n_num = num;
    }
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%s:%d*%d=%d\n", Thread.currentThread().getName(), i,n_num, i*n_num);
        }
    }
}