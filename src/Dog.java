import java.util.Scanner;

public class Dog extends Tamagotchi{
    public Scanner scanner = new Scanner(System.in);

    public Dog(String name){
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void specialOption(){
        System.out.println("How long would you like to walk your dog?");
        int howLongWalk = scanner.nextInt();
        mood = mood + howLongWalk;
        energy = energy - howLongWalk;
        System.out.println(" You've walked "+name+"'s "+howLongWalk+" distance!\n "+name+" mood is now: "+mood+" and energy is now: "+energy);
    }


    @Override
    public boolean isHappy(){
        if(mood > 6 && energy > 6){
            System.out.println(name+" is happy!");
            return true;
        }
        else if (mood > 6 && energy < 6){
            System.out.println(name+" is happy but tired!");
            return true;
        }
        else if (mood < 6 && energy > 6){
            System.out.println(name+" is not happy but restless!");
            return false;
        }
        else {
            System.out.println(name+" is not happy...");
            return false;
        }
    }










}
