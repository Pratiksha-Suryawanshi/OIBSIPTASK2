import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    static int guess;
    static int number;
    static int point=0;
    public static void numberGuessingGame(){
        Scanner s=new Scanner(System.in);
        number=1+(int)(100*Math.random());
        int k=5;
        int i;
        System.out.println("NUMBER GUESSING GAME RULES:\n 1-THE NUMBER IS CHOOSEN BETWEEN 1 TO 100\n 2-TOTAL NUMBER OF ATTEMPTS IS FIVE/5");
        System.out.println("***********************************************************************");
        for(i=0;i<k;i++){
            System.out.println("ENTER THE GUESS NUMBER:");
            System.out.println("*************************************************************************");
            guess=s.nextInt();
            if(number ==guess){
                System.out.println("CONGRATULATIONS!"+"You Guessed the number.");
                System.out.println("**********************************************************************");
                rounds();
                break;
            }
            else if(number>guess&&i!=k-1){
                System.out.println("THE NUMBER IS"+"GREATER THAN"+guess);
                System.out.println("********************************************************************");
            }
            else if(number<guess&&i!=k-1){
                System.out.println("THE NUMBER IS "+"LESS THAN"+guess);
                System.out.println("********************************************************************");

            }
        }
        if(i==k){
            System.out.println("**************************************************************************");
            System.out.println("YOU HAVE EXHAUSTED YOUR LIMIT:");
            System.out.println("****************************************************************************");
            System.out.println("THE NUMBER WAS"+number);
            System.out.println("****************************************************************************");
            rounds();
        }
    }
    public static void rounds(){
        System.out.println("DO YOU HAVE PLAY ONE MORE ROUND \n ENTER 1-YES\n ENTER 2-NO");
        System.out.println("********************************************************************************");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a==1){
            numberGuessingGame();

        }
        else{
            System.out.println("PLAY NEXT TIME THANKS FOR PLAYING!");
            System.out.println("***************************************************************************");
            if(number==guess){
                point++;
                System.out.println("TOTAL ATTEMPT NUMBER"+point+"+ POINT IS:"+point);
                System.out.println("***********************************************************************");

            }
            else{
                System.out.println("YOUR POINT IS:"+point);
                System.out.println("***********************************************************************");
            }
            System.out.println("TOTAL SCORE IS:"+point*2);
            System.out.println("****************************************************************************");
        }
    }
        public static void main(String args[]){
            System.out.println("***************************************************************************");
            System.out.println("NAME:NUMBER GUESSING GAME");
            System.out.println("***************************************************************************");
            numberGuessingGame();
    
}

}
    

