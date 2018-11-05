import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args){
         Scanner keyboard;
         keyboard = new Scanner(System.in);

         String response;
         int number, userPoints, computerPoints, match;
         int userTotal, comTotal, rounds;
         rounds = 0;
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

        System.out.println("How many rounds do you want to be in this game?");
        rounds = keyboard.nextInt();


         do{for(int games=0;games<rounds;games++){
             //System.out.println(match);
             number = (int)(Math.random()*3);
             //System.out.println(choice[number]);
             System.out.println("Rock! Paper! Scissors!");
             answer = keyboard.nextLine().toLowerCase();
             if(match<=1){answer = keyboard.nextLine().toLowerCase();match +=2;}
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
             match-=2;
         }
         else if(userPoints<computerPoints){
             System.out.print("You lost the game.\n");
             comTotal++;
             match-=2;
         }
         else if(userPoints==computerPoints){
             System.out.println("There was a tie. You both won!");
             userTotal++;
             comTotal++;
             match-=2;
         }

         if (response.equals("yes")){
             System.out.println("The score is You "+userTotal+" Opponent "+comTotal);
         }

         userPoints=0;
         computerPoints=0;

         System.out.println("\nWould you like to play again?");
         response = keyboard.next().toLowerCase();
         if(response.equals("yes")){
             System.out.println("How many rounds do you want to be in this game?");
             rounds = keyboard.nextInt();
            }
         }
         while(response.equals("yes"));

         if (response.equals("no")){
             if(userTotal>comTotal){
                 System.out.println("\nYou won "+(userTotal-comTotal)+" more games than the opponent.");
                 System.out.println("You are a pro.");
             }
             else if(userTotal<comTotal){
                 System.out.println("\nThe opponent won "+(comTotal-userTotal)+" more games than you.");
                 System.out.println("Looks like you need some more practice.");
             }
             else if(userTotal==comTotal){
                 System.out.println("\nYou both won "+userTotal+" games.");
                 System.out.println("Looks like you have found a worthy opponent.");

             }
         }




    }
}
