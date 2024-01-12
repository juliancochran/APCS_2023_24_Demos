import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Chapter11ArrayLists {
    public static void number1()    {
        String name1 = "Quin";
        String name2 = "Ethan";
        String name3 = "Tyler";
        String name4 = "Atlas";
        ArrayList<String> names = new ArrayList<>();
        names.add(name1);
        names.add(names.get(0));
        names.add(names.get(1));
        System.out.println("names: " + names);
        ArrayList<String> names2 = names;
        System.out.println(names2);
        names.remove(name1);
        System.out.println("names2: " + names2);
        System.out.println(name1);
    }

    public static void number4()    {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(0);
        lst.add(1);
        lst.add(2);
        lst.add(0,0);
        lst.add(1,1);
        lst.add(2,2);
        System.out.println(lst);
    }

    public static void number5(ArrayList<Integer> nums) {
        // this is one way to solve the problem
        ArrayList<Integer> newList = new ArrayList<>();
        for(Integer temp : nums)    {
            newList.add(0, temp);
        }
        // this is another
        ArrayList<Integer> thing = new ArrayList<>(nums);
        Collections.reverse(thing);
        // either way, nums remains unchanged
    }

    public static void number8()    {
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(list);
        System.out.println(list);
        // works with no problems yep
    }

    public static void number6(ArrayList<Integer> nums) {

    }

    public static void number7(ArrayList<Object> list1, ArrayList<Object> list2)    {
        for(int i = 0; i < list2.size(); i++)   {
            for(int j = list1.size()-1; j >= 0; j--)    {
                if(list2.get(i) == list1.get(j))
                    list1.remove(j);
            }
        }
    }

    public static void main(String[] args) {
        //number8();
        String name1 = "Saydie";
        String name2 = "Thelma";
        String name3 = "Austyn-Jayne";
        String name4 = "Bubba";
        String name5 = "Cletus";
        String name6 = "Gator";
        ArrayList<Object> names1 = new ArrayList<>();
        ArrayList<Object> names2 = new ArrayList<>();

        names1.add(name5);
        names1.add(name4);
        names1.add(name1);
        names1.add(name2);
        names1.add(name1);
        names1.add(name6);

        names2.add(name3);
        names2.add(name4);
        names2.add(name3);
        names2.add(name2);
        names2.add(name4);
        names2.add(name4);

        System.out.println("Before removing any items from either list");
        System.out.println("names1: " + names1);
        System.out.println("names2: " + names2);
        number7(names1, names2);
        System.out.println("After removing items from names1");
        System.out.println("names1: " + names1);
        System.out.println("names2: " + names2);
    }
}
