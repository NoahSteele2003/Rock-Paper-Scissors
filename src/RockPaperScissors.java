import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args){
         Scanner keyboard;
         keyboard = new Scanner(System.in);

         String response;
         int number, userPoints, computerPoints, match;
         int userTotal, comTotal;
         userTotal = 0;
         comTotal = 0;
         match = 0;
         number = 0;
         userPoints = 0;
         computerPoints=0;
         String answer;
         response = "no";

         String[] choice = new String[3];

         choice[0] = "Rock!";
         choice[1] = "Scissors!";
         choice[2] = "Paper!";




         do{for(int games=0;games<3;games++){
             number = (int)(Math.random()*3);
             //System.out.println(choice[number]);
             System.out.println("Rock! Paper! Scissors!");
             answer = keyboard.nextLine().toLowerCase();
             if(match==1){answer = keyboard.nextLine(); match=0;}
             System.out.println(choice[number]);


             if(answer.equals("rock")&&number==1) {
                 System.out.println("\nYou win! Rock beats scissors!\n");
                 userPoints+=1;
             }
             else if(answer.equals("rock")&&number==2){
                 System.out.println("\nYou lose! Paper beats rock!\n");
                 computerPoints+=1;
             }
             else if(answer.equals("paper")&&number==0){
                 System.out.println("\nYou win! Paper beats rock!\n");
                 userPoints+=1;
             }
             else if(answer.equals("paper")&&number==1){
                 System.out.println("\nYou lose! Scissors beats paper!\n");
                 computerPoints+=1;
             }
             else if(answer.equals("scissors")&&number==2){
                 System.out.println("\nYou win! Scissors beats paper!\n");
                 userPoints+=1;
             }
             else if(answer.equals("scissors")&&number==0){
                 System.out.println("\nYou lose! Rock beats scissors!\n");
                 computerPoints+=1;
             }
             else if(answer.equals("rock")&&number==0){
                 System.out.println("\nTie, nobody wins.\n");
                 games--;
             }
             else if(answer.equals("paper")&&number==2){
                 System.out.println("\nTie, nobody won.\n");
                 games--;
             }
             else if(answer.equals("scissors")&&number==1){
                 System.out.println("\nTie, nobody wins.\n");
                 games--;
             }
             else{
                 System.out.println("\nMake sure you typed the correct thing.\n");
                 games--;
             }

         }

         //System.out.println("user "+userPoints+" com "+computerPoints);

         if(userPoints>computerPoints){
             System.out.print("You won the game!\n");
             userTotal++;
         }
         else if(userPoints<computerPoints){
             System.out.print("You lost the game.\n");
             comTotal++;
         }

         if (response.equals("yes")){
             System.out.println("The score is You "+userTotal+" Opponent "+comTotal);
         }

         userPoints=0;
         computerPoints=0;

         System.out.println("\nWould you like to play again?");
         response = keyboard.next().toLowerCase();
         match = 1;}
         while(response.equals("yes"));

         if (response.equals("no")){
             if(userTotal>comTotal){
                 System.out.println("You won "+(userTotal-comTotal)+" more games than the opponent.");
                 System.out.println("You are a pro");
             }
             else if(userTotal<comTotal){
                 System.out.println("The opponent won "+(comTotal-userTotal)+" more games than you.");
                 System.out.println("Looks like you need some more practice.");
             }
         }




    }
}
