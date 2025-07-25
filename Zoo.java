import java.util.ArrayList;
import java.util.List;

import Lib.Animal;
import Lib.Dolphin;
import Lib.Eagle;
import Lib.Flyable;
import Lib.Lion;
import Lib.Penguin;
import Lib.Swimable;

public class Zoo {
    public static void main(String[] args) {
        List<Animal> a = new ArrayList<>();
        a.add(new Lion("Lion One"));
        a.add(new Eagle("Bird Two."));
        a.add(new Dolphin("Dolphin Three"));
        a.add(new Penguin("Penguin Four"));

        for(Animal animal : a ){
           System.out.print(animal.getName());
           System.out.println(animal.makeSound());
        }
        System.out.println("---------------------");
        for(Animal animal : a){
            if (animal instanceof Flyable) {
                System.out.println(((Flyable)animal).fly());
            }else if (animal instanceof Swimable) {
                System.out.println(((Swimable)animal).swim());
            }else{
                System.out.println(animal.getName()+" Waliking in the zoo");
            }
        }
    }
}
