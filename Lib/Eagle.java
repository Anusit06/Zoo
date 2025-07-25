package Lib;

public class Eagle extends Bird implements Flyable{

    public Eagle(String name) {
        super(name);
    }

    @Override
    public String fly() {
       return "The eagle soars throgh the sky";
    }

    @Override
    public String makeSound() {
        return "Screech!.";
    }
    
}
