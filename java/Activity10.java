import java.util.HashSet;
import java.util.Set;

public class Activity10 {
public static void main(String[] args) {
    Set<Integer>num = new HashSet<>();
    num.add(1);
    num.add(2);
    num.add(2);
    num.add(5);
    num.add(4);
    num.add(9);
    System.out.println("Original HashSet: " + num);

    System.out.println("Size of set: "+ num.size());
    System.out.println("Removing an element:" + num.remove(5));
    if (num.remove(num.remove(3)))
        System.out.println("3 is removed from set");
    else
        System.out.println("3 doesn't exist in a set:");
    System.out.println("Checking if 5 is present: " + num.contains(5));
    System.out.println("Updated HashSet: " + num);
}   

}
