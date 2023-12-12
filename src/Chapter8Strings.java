public class Chapter8Strings {
    public static boolean allSameChars(String s)    {
        // LINEAR O(N)
        /*for(int i = 1; i < s.length(); i++) {
            if(s.charAt(0) != s.charAt(i))
                return false;
        }
        return true;*/
        // ori's method
        return s.length() <= 1 || s.replace(s.substring(0,1), "").length() == 0;
        // cochran's method
        //return s.length() <= 1 || s.substring(0, s.length()-1).equals(s.substring(1));
    }

    public static void main(String[] args) {
        String s1 = "aaaaaaaaaaaa";
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
