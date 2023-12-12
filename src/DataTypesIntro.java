import java.util.ArrayList;

public class DataTypesIntro {
    private static String mrCochransFavorite = "Tyler Slomianyj";

    public static void thisIsSilly()   {
        String s = "hugs for all!";
        String mrCochransFavorite = "Jake Chambliss";
        System.out.println(mrCochransFavorite);
    }

    public static int swapOnesTens(int n)  {
        int everythingelse = n - n % 100;
        int ones = n % 10;
        int tens = n / 10 % 10;
        int newVal = everythingelse + ones * 10 + tens;
        // OR
        // return n - n % 100 + (n % 10) * 10 + (n / 10) % 10;
        return newVal;
    }

    public static void main(String[] args) {
        System.out.println(swapOnesTens(3));
        System.out.println(swapOnesTens(30));
        System.out.println(swapOnesTens(123));
        /*ArrayList<Integer> myNumbies = new ArrayList<>();
        String s = "Ethan Li loves hugs", x = "your mom";
        System.out.println(21 % 6.5);
        thisIsSilly();
        System.out.println(mrCochransFavorite);*/

        // [0,1)
        //int num = 1+(int)(Math.random()*1000);
        //num = random.randint(1,1000);

        /*int i = 0;

        while(true) {
            i++;
            if(i % 1000 == 0)
                System.out.println(i);
        }

        /*Integer i = 12;
        int j = 12, k = 45, z = 123, a = -12;
        double d = 12.45;
        Double e = 12.45;

        // ternary operator
        System.out.println((i == j) ? "i equals j" : "i not equal to j");*/
    }
}
