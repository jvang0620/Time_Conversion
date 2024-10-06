package src;

public class TimeConversion {

    /**
     * Constructor
     */
    TimeConversion() {

    }

    /**
     * TO DO: showDecaseconds method
     * Given a number of seconds calculates
     * and display decaseconds
     */
    // add your code here

    public void showDecaseconds(int second) {

        System.out.println("A decasecond is 10 secs.");
        System.out.println("For " + second + " seconds, there are " + second / 10.0 + " decaseconds.");
    }

    /**
     * TO DO: showJiffies method
     * Given a number of seconds calculates
     * and display jiffies
     */
    // add your code here

    public void showJiffies(int second) {

        System.out.println("A jiffy is a unit of time used in computer operation system. It is 10 millisenconds.");
        System.out.println("For " + second + " seconds, there are " + second * 100 + " milliseconds.");
    }

    /**
     * TO DO: showNewYorkMinutes method
     * Given a number of seconds calculates
     * and display New York minutes
     */
    // add your code here

    public void showNewYorkMinutes(int second) {

        System.out.println(
                "A new your minute is the period of time between the traffic lights turning green and the cab behind you honking. It is 1/20th of 1 second.");
        System.out.println("For " + second + " seconds, there are " + second * (1 / 20.0) + " new your minutes.");
    }

    /**
     * TO DO: showNanoCenturies method
     * Given a number of seconds calculates
     * and display Nanocenturies
     */
    // add your code here

    public void showNanoCenturies(int second) {

        System.out.println(
                "A nanocentury is a computing measurement coined from the expression - 'never to let the user wait more than a few nanocenturies for a response'. It is 3.156 seconds.");
        System.out.println("For " + second + " seconds, there are " + second / 3.156 + " nanocenturies.");
    }

    /**
     * TO DO: showScaramuccis method
     * Given a number of seconds calculates
     * and display Scaramuccis
     */
    // add your code here

    public void showScaramuccis(int second) {

        System.out.println(
                "A scaramucci is the tenure of former White House Communications Director Anthony Scaramucci. It is 11 days.");
        System.out.println("For " + second + " seconds, there are " + second / 864000.00 + " scaramuccis.");
    }

}// end class