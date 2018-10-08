import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args){
         Scanner keyboard;
         keyboard = new Scanner(System.in);

         String response;
         int number, userPoints, computerPoints, match;
         match = 0;
         number = 0;
         userPoints = 0;
         computerPoints=0;
         String answer;

         String[] choice = new String[3];

         choice[0] = "Rock!";
         choice[1] = "Scissors!";
         choice[2] = "Paper!";




         do{for(int games=0;games<5;games++){
             number = (int)(Math.random()*3);
             //System.out.println(choice[number]);
             System.out.println("\nRock! Paper! Scissors!");
             answer = keyboard.nextLine().toLowerCase();
             if(match==1){answer = keyboard.nextLine(); match=0;}
             System.out.println(choice[number]);


             if(answer.equals("rock")&&number==1) {
                 System.out.println("\nYou win! Rock beats scissors!");
                 userPoints+=1;
             }
             else if(answer.equals("rock")&&number==2){
                 System.out.println("\nYou lose! Paper beats rock!");
                 computerPoints+=1;
             }
             else if(answer.equals("paper")&&number==0){
                 System.out.println("\nYou win! Paper beats rock!");
                 userPoints+=1;
             }
             else if(answer.equals("paper")&&number==1){
                 System.out.println("\nYou lose! Scissors beats paper!");
                 computerPoints+=1;
             }
             else if(answer.equals("scissors")&&number==2){
                 System.out.println("\nYou win! Scissors beats paper!");
                 userPoints+=1;
             }
             else if(answer.equals("scissors")&&number==0){
                 System.out.println("\nYou lose! Rock beats scissors!");
                 computerPoints+=1;
             }
             else if(answer.equals("rock")&&number==0){
                 System.out.println("\nTie, nobody wins.");
                 games--;
             }
             else if(answer.equals("paper")&&number==2){
                 System.out.println("\nTie, nobody won.");
                 games--;
             }
             else if(answer.equals("scissors")&&number==1){
                 System.out.println("\nTie, nobody wins.");
                 games--;
             }
             else{
                 System.out.println("\nMake sure you typed the correct thing.");
                 games--;
             }

         }

         //System.out.println("user "+userPoints+" com "+computerPoints);

         if(userPoints>computerPoints){
             System.out.println("\nYou won the game!\n");
         }
         else if(userPoints<computerPoints){
             System.out.println("\nYou lost the game.\n");
         }

         userPoints=0;
         computerPoints=0;

         System.out.println("Would you like to play again?");
         response = keyboard.next().toLowerCase();
         match = 1;}
         while(response.equals("yes"));




    }
}
