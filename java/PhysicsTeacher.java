public class PhysicsTeacher extends Teacher{
    //Child class member
    String mainSubject = "Physics";
    
    public static void main(String args[]) {
        //Instantiation
        PhysicsTeacher obj = new PhysicsTeacher();
        
        //Usage of parent and child properties
        System.out.println(obj.collegeName);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
        
        obj.does();
    }
}