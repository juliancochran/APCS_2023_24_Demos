import java.util.Scanner;

public class Chapter6Intro {
    public static void printSumAndAverage()  {
        Scanner in = new Scanner(System.in);
        int sum = 0, count = 0;
        String s = null;
        if(s == null)
            System.out.println("S not initialized");
        boolean run = true;//, do_run = true;
        //System.out.println(run < do_run);
        while(run) {
            try {
                System.out.print("Enter a num or type \'Q\' to quit: ");
                sum += in.nextInt();
                count++;
            } catch (Exception e) {
                run = false;
            }
        }
        System.out.println("Sum = " + sum + " Average = " + (double)sum/count);
    }

    public static void isYeah(double num)   {
        if(num != 0. && 1/num < .000000000001)
            System.out.println(num + " is big!");
    }

    public static void main(String[] args) {
        printSumAndAverage();
    }
}
