/*
 * Course: IST 311
 * Instructor: Phil O'Connell(px04)
 * Student: JiaJia Liu
 * Email: jpl5840@psu.edu
 * Assignment: LB13
 */

package threaddemopart1;

// TODO 01 - Make Counter implement Runnable
public class Counter implements Runnable {

    public void oneToTen() {
        // TODO 05 - Add line to store the thread name
        String threadName = Thread.currentThread().getName();

        for (int i = 1; i <= 10; i++) {
            // TODO 06 - Print thread name with i
            System.out.println(threadName + ": " + i);
        }
    }

    @Override
    public void run() {
        this.oneToTen();
    }
}
