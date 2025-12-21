package rishi_demo;

public class Human2 {
    static int counter = 0;
    public Human2(){
        counter++;
    }
    void descibe()
    {
        System.out.println("This is Human Class");
    }

    void displaypopulation(){
        System.out.println("Population of Human:"+ counter);
    }
}
