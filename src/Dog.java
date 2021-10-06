public class Dog extends Tamagotchi{

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

    public String walkDog (int howLongWalk){
        mood = mood + howLongWalk;
        energy = energy - howLongWalk;
        return " You've walked "+name+"'s "+howLongWalk+" distance!\n "+name+" mood is now: "+mood+" and energy is now: "+energy;
    }

    @Override
    public boolean isHappy(){
        if(mood > 6 && energy > 6){
            return true;
        }else {
            return false;
        }
    }


    public boolean needsWalk(){
        if (energy > 8){
            return true;
        }
        return false;
    }








}
