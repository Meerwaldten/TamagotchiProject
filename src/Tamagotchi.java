import java.util.Scanner;

public class Tamagotchi {

    public Scanner scanner = new Scanner(System.in);

    public String name;
    public int age = 0;
    public int mood = 10;
    public int energy = 10;

    public Tamagotchi (String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tamagotchi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mood=" + mood +
                ", energy=" + energy +
                '}';
    }

    public int petAnimal (){
        System.out.println("Type in how many tiems you'd like to pet your tamagotchi.");
        int howMuchPetting = scanner.nextInt();
        System.out.println("You petted "+name+" "+howMuchPetting+" times.");
        return mood = mood+howMuchPetting;
    }

    public int feed (){
        System.out.println("Type in how many times you'd like to feed your tamagotchi.");
        int food = scanner.nextInt();
        System.out.println("You've fed "+name+" "+food+" times.");
        return energy = energy+food;
    }



    public int sleep (){
        System.out.println("Type in how long your tamagotchi would like to sleep!");
        int howLongSleep = scanner.nextInt();
        System.out.println(name+" have slept for "+howLongSleep+" hours.");

        return energy = energy + howLongSleep;
    }

    public boolean isHappy(){
        if (mood > 4 && energy > 4){
            System.out.println(name+" is happy!");
            return true;
        }
        else if (mood > 4 && energy < 4){
            System.out.println(name+" is happy but tired!");
            return true;
        }
        else if (mood < 4 && energy > 4){
            System.out.println(name+" is not happy but restless!");
            return false;
        }
        else{
        System.out.println(name+" is not happy...");
        return false;
        }
    }

    public void specialOption(){

    }

    public boolean isDead(){
        if (energy < 0){
            System.out.println(name+" is dead.");
            return true;
        }else {
            return false;
        }
    }

}
