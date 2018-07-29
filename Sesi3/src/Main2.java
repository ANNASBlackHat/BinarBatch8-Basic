import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = new Animal();
        new Main2().addAnimal(animal);
        new Main2().addBird(bird);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(bird);
    }

    void addBird(Bird bird){

    }

    void addAnimal(Animal animal){
        if(animal instanceof Bird){
            System.out.println("you passing Bird parameter");
        }else{
            System.out.println("Animal Class");
        }
    }
}
