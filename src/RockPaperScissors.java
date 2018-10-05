import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args){
         Scanner keyboard;
         keyboard = new Scanner(System.in);

         int number;
         number = 0;
         String answer;

         String[] choice = new String[3];

         choice[0] = "Rock!";
         choice[1] = "Scissors!";
         choice[2] = "Paper!";

         for(int games=0;games<10;games++){
             number = (int)(Math.random()*3);
             System.out.println("Rock! Paper! Scissors!");
             answer = keyboard.nextLine().toLowerCase();
             System.out.println(choice[number]);

             if(answer.equals("rock")&&number==1) {
                 System.out.println("You win! Rock beats scissors!");
             }
             else if(answer.equals("rock")&&number==2){
                 System.out.println("You lose! Paper beats rock!");
             }
             else if(answer.equals("paper")&&number==0){
                 System.out.println("You win! Paper beats rock!");
             }
             else if(answer.equals("paper")&&number==1){
                 System.out.println("You lose! Scissors beats paper!");
             }
             else if(answer.equals("scissors")&&number==2){
                 System.out.println("You win! Scissors beats paper!");
             }
             else if(answer.equals("scissors")&&number==0){
                 System.out.println("You lose! Rock beats scissors!");
             }

         }




    }
}
