import java.util.Scanner;
public class Chapter7HW {
    public static void canIDoubleConditionAForLoop()   {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value for n: ");
        int n = in.nextInt();
        int quinsSpecialNumber = 7;
        int i = 0;
        for(i = 1; i <= n || n <= quinsSpecialNumber; i++)
            System.out.println(i);

        if(i == quinsSpecialNumber)
            System.out.println("you can't count quin's special number");

    }

    // number 25 -- cents or dollars
    // or SENSE or DOLLARS
    public static void coinPermutations(int cents)  {
        int p = 0, n = 0, d = 0, q = 0;

    }

    public static void printTargetPopYear() {
        double startPop = 123.8;
        int year = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter target population in millions: ");
        double target = in.nextDouble();
        while (startPop < target) {
            startPop += (startPop * .005);
            year++;
        }
        System.out.println("Mexico's population will reach " + target + " million in " + (2014 + year));
    }

    public static int getKevinTo95Percent()	{
        final double LEARN_RATE = .1;
        int months = 0;
        double total = 0.0;
        while (total < 0.95)	{
            total += (1 - total) * LEARN_RATE;
            months++;
        }
        return months;
    }


    public static void printPermutations(int cents)    {

    }

    public static void printCheckerboard(int n) {
        for(int r = 0; r < n; r++)  {
            for(int c = 0; c < n; c++)  {
                System.out.print((r+c)%2 == 0 ? "#" : "o");
                /*if((r+c) % 2 == 0)
                    System.out.print("#");
                else
                    System.out.print("o");*/
            }
            System.out.println();
        }
    }







    public static void main(String[] args) {
        //Chapter7HW thing = new Chapter7HW();
        //canIDoubleConditionAForLoop();
        //printTargetPopYear();
        int months = getKevinTo95Percent(), years = months/12;
        months -= (years*12);
        System.out.println("It takes Kevin " + years + " years and " + months + " months to pass.");

        //printCheckerboard(7);
    }

}
