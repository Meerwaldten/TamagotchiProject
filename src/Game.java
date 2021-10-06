import javax.management.relation.RoleUnresolved;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        chooseGamemode();

    }

    public static void chooseGamemode (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the tamagotchi game!\n Press 1 to make a Cat or press 2 to make a Dog.");
        String gameMode = "0";
        while (gameMode != "1" || gameMode != "2"){ //While loop til hvis der kommer forkert input. Kunne nok være lavet med en try / catch også.
            gameMode = scanner.nextLine();
            if (gameMode.equals("1")){
                System.out.println("You've chosen Cat!\nType in the name of your cat!");
                String newCatName = scanner.nextLine();
                Tamagotchi newCat = new Cat (newCatName); //Laver en ny cat
                theGame(newCat); // Starter "spillet" med den nye cat
                break;
            }
            if (gameMode.equals("2")){
                System.out.println("You've chosen Dog!\nType in the name of your dog!");
                String newDogName = scanner.nextLine();
                Tamagotchi newDog = new Dog (newDogName); // Laver en ny hund
                theGame(newDog); // Starter spillet med den nye hund
                break;
            }
            else {
                System.out.println("Type 1 or 2, pretty please man...");
            }
        }
    }

    public static void theGame(Tamagotchi tamagotchi) {
        int roundsOfGame = 10; //Variabel der kan ændres efter hvor mange runder man vil spille. Kan også laves til en scanner så vi helt selv kan bestemme.
        System.out.println("Time to have fun with your Tamagotchi!");
        for (int i = 0; i < roundsOfGame; i++) { //Fori loop der kører igennem x antal runder af spillet og sætter mulighederne op.
            System.out.println("Type 1 to Feed, 2 to Pet, 3 to Sleep, 4 for special option or 5 for Quit!");
            int option = scanner.nextInt();
            if (option == 1){
                tamagotchi.feed();
            }
            else if (option == 2){
                tamagotchi.petAnimal();
            }
            else if (option == 3){
                tamagotchi.sleep();
            }
            else if (option == 4){
                tamagotchi.specialOption();
            }
            else if (option == 5){
                break;
            }
            else {
                    i --; // Forsøg på at forkerte inputs ikke gør sådan at vi "spilder" en tur af spillet på ingenting.
                    System.out.println("Please type in a valid option!");
            }
            if (i % 3 == 0){ //Opsætter en "checker" efter hver 3. runde, hvor vi ser om tamagotchi'en er død og gør den et år ældre.
                tamagotchi.age = tamagotchi.age +1;
                tamagotchi.isHappy();
                System.out.println(tamagotchi);
                if (tamagotchi.isDead()){
                    break;
                }
            }


        }


    }
}

