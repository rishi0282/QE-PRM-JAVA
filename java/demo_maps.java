import java.util.Map;
import java.util.HashMap;

class demo_maps{
    public static void main(String[] args) {
    Map<Integer,String> numbers = new HashMap<>();
    numbers.put(1,"ONE");
    numbers.put(2,"TWO");
    System.out.println("MAP"+numbers);    
    System.out.println("Keys: " + numbers.keySet());
    System.out.println("Values: " + numbers.values());
    System.out.println("Entries: " + numbers.entrySet());
    String value = numbers.remove(2);
        System.out.println("Removed Value: " + value);
}
    
}
