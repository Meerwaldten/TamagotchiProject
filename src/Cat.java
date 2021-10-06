public class Cat extends Tamagotchi{

    public Cat(String name){
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void specialOption(){
        System.out.println("How long would you like to play with strings with your cat?");
        int howLongPlayWithString = scanner.nextInt();
        mood = mood + howLongPlayWithString;
        energy = energy - howLongPlayWithString;
        System.out.println("You've played with String with "+name+" for "+howLongPlayWithString+" minutes!");

    }

    @Override
    public int petAnimal (){
        System.out.println("Type in how many times you'd like to pet your tamagotchi.");
        int howMuchPetting = scanner.nextInt();
        String catReaction = "";
        if (energy > 5){
            catReaction = name+" has scratched you in the face!";
            System.out.println(catReaction);
            mood = mood + 1;
            return mood;
        }else {
            System.out.println("You petted "+name+" "+howMuchPetting+" times.");
            mood = mood + howMuchPetting;
            return mood;
        }

    }




}
