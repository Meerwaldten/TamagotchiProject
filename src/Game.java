import javax.management.relation.RoleUnresolved;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        chooseGamemode();


        //Dog fido = new Dog("Fido");
        //System.out.println(fido.walkDog(5));
        //fido.isDead();

        /*
        Ting at sætte op og kode;
        Lav metoder der sætter spillet igang.
        Jeg vil gerne have 3 baseline metoder/options og 1-2 metoder/options som kun gælder det pågældende dyr der er valgt.
        Hvis man kunne sætte ind efter hver 3./4./5. move at den tjekker om tamagotchi'en er død eller glad og evt lige fortæller dens stats (energi, osv).
        Fokuser på main game og leg mere med klasserne senere.
        Modulus for at tjekke op hver 3. move; %3 = 0, så kører bussen.
        Lav en option for exit
         */

        /* // opsætning af hvor mange moves man kan lave før tamagotchi'en ikke gider mere. Skal nok laves til en metode.
        int amountOfMoves = 10;
        for (int i = 0; i < amountOfMoves; i++) {
        }
         */


    }






    public static void chooseGamemode (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the tamagotchi game!\n Press 1 to make a Cat or press 2 to make a Dog.");
        String gameMode = "0";
        while (gameMode != "1" || gameMode != "2"){
            gameMode = scanner.nextLine();
            if (gameMode.equals("1")){
                System.out.println("You've chosen Cat!\n Type in the name of your cat!");
                String newCatName = scanner.nextLine();
                Tamagotchi newCat = new Cat (newCatName);
                theGame(newCat);
                break;
            }
            if (gameMode.equals("2")){
                System.out.println("You've chosen Dog!\n Type in the name of your dog!");
                String newDogName = scanner.nextLine();
                Tamagotchi newDog = new Dog (newDogName);
                theGame(newDog);
                break;
            }
            else {
                System.out.println("Type 1 or 2, pretty please man...");
            }
        }
    }

    public static void theGame(Tamagotchi tamagotchi) {
        int roundsOfGame = 10;
        System.out.println("Time to have fun with your Tamagotchi!");
        for (int i = 0; i < roundsOfGame; i++) {
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
                    System.out.println("Please type in a valid option!");
            }
            if (i % 3 == 0){
                tamagotchi.age = tamagotchi.age +1;
                System.out.println(tamagotchi);
                if (tamagotchi.isDead()){
                    break;
                }
            }


        }


    }
}

