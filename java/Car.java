public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;


    public Car(){
tyres = 4;
doors = 4;
}


void displayCharacteristics(){
    System.out.println("Color: "+color);
    System.out.println("transmission: "+ transmission);
    System.out.println("make:"+make);
    System.out.println("tyres:"+ tyres);
    System.out.println("Doors:" + doors);
}

void accelerate(){
    System.out.println("Car is moving Forward");
}

void brake(){
    System.out.println("Car has stopped");
}
}


