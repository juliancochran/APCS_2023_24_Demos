public class Chapter8Strings {

    public static void number16(String s1, String s2)   {
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        System.out.println(s1.compareTo(s2) + " compared to " + (n1-n2));
    }

    public static void main(String[] args) {
        System.out.println("12 and 17, both positive, one even, one odd");
        number16("12", "17");
        System.out.println("8 and 10, both positive, both even");
        number16("8", "10");
        System.out.println("5 and 9, both positive, both odd");
        number16("5", "9");
        System.out.println("-2 and 5, one negative, one positive, one even, one odd");
        number16("-2", "5");
        System.out.println("-9 and -7, both negative, both odd");
        number16("-9", "-7");
        System.out.println("-8 and -4, both negative, both even");
        number16("-8", "-4");


        /*String s1 = "aaaaaaaaaaaa";
        String s2 = "aaaaaaaaaaaz";
        String s3 = "a";

        System.out.println(allSameChars(s3));




        /*String s1 = "hell";
        String s2 = "hello";
        String s3 = "she sells seashells by the seashore";
        s3 = s3.replace("s", "c").replace("c", "z").replace("e", "q");
        System.out.println(s3);
        System.out.println(s1 + "\t" + s2);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(s1)));
        System.out.println(s2.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(s2)));
        /*s1 = "mom";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(s1)));
        System.out.println(s2.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(s2)));

        s1 += " " + s2;
        System.out.println(s1);
        System.out.println(s1.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(s1)));
        */
    }
}
