/*
 * Course: IST 311
 * Instructor: Phil O'Connell(px04)
 * Student: JiaJia Liu
 * Email: jpl5840@psu.edu
 * Assignment: LB13
 */

package threaddemopart1;

public class ThreadDemoPart1 {

  public static void main(String[] args) {
    Counter counter = new Counter();

    System.out.println("START");

    // TODO 02 - Create a thread (t1) to run counter

    // TODO 03 - Create a thread (t2) to run counter

    // TODO 04 - delete these two lines, and start the threads
    counter.oneToTen();
    counter.oneToTen();

    // TODO 07 - use join so that the 2nd thread starts *after* the first

    // TODO 08 - use join so that we don't end until 2nd thread is finished

    System.out.println("END");
  }

}
