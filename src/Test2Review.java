public class Test2Review {
    public static boolean isLater(String date1, String date2)   {
        // "mm/dd/yyyy"
        int m1 = Integer.parseInt(date1.substring(0,2));
        int d1 = Integer.parseInt(date1.substring(3,5));
        int y1 = Integer.parseInt(date1.substring(6));

        int m2 = Integer.parseInt(date2.split("/")[0]);
        int d2 = Integer.parseInt(date2.split("/")[1]);
        int y2 = Integer.parseInt(date2.split("/")[2]);

        if(y1 > y2)
            return true;
        else if(y1 == y2 && m1 > m2)
            return true;
        else if(y1 == y2 && m1 == m2 && d1 > d2)
            return true;
        else
            return false;

        //return (y1 > y2) || (y1 == y2 && m1 > m2) || (y1 == y2 && m1 == m2 && d1 > d2);

        //return (y1 > y2) ? true : (m1 > m2) ? true : (d1 > d2) ? true : false;
    }

    public static void main(String[] args) {
        int num;
        int max = 10, min = 3;
        for(int i = 0; i < 20; i++) {
            num = (int)(Math.random() * (max - min + 1)) + min;
            System.out.println(num);
        }

        /*int n = 17;
        while(n != 3) {
            n -= 3;
            System.out.println(n);
        }
        System.out.println("n = " + n);*/
    }
}
