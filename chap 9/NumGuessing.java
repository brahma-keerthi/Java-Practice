import java.util.*;
class game{
    private int number;
    game(){
        Random random = new Random();
        number = random.nextInt(101);
    }
    Scanner sc = new Scanner(System.in);
    
    void play(){
        System.out.println("Number Guessing Game(0-100)>>");
        int guess;
        for(int i =0; ; i++){
            System.out.println("Guess the Number>> ");
            guess = sc.nextInt();
            
            if(guess < number){
                System.out.println("Guessed num " + guess + " is smaller");
                continue;
            }
                
            if(guess> number){
                System.out.println("Guessed num " + guess + " is larger");
                continue;
            }

            if(guess == number){
                System.out.println("You guessed number correctly in " + i + " attempts");
                break;
            }
        }
    }
}
public class NumGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int again = 1;
        while(again != 0){
            game NGG = new game();
            NGG.play();

            System.out.println("Do you want to play again? (0 -> exit) ");
            again = sc.nextInt();
        }
    }
}
