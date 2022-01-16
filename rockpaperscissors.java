import java.util.Random;
import java.util.Scanner;

public class rockpaperscissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // print welcome message
        System.out.println("=============================================================================");
        System.out.println("Welcome to Rock Paper Scissors");
        System.out.println("enter number of rounds you want to play");
        int rounds = in.nextInt();
        int m=0, c=0, d=0;
        for(int i=1;i<=rounds;i++)
        {
            System.out.println("What is your move::::to make a move enter");
            System.out.println("0 for rock");
            System.out.println("1 for paper");
            System.out.println("2 for scissors");
            System.out.println("3 for exit");
            int mymove = in.nextInt();
            // checks if users want to exit the game
            if(mymove==3)
            {
                System.out.println("YOU EXITED FROM GAME");
                System.exit(0);
            }
            // check if user move is valid or not
            if(mymove!=0 && mymove!=1 && mymove!=2)
            {
                System.out.println("your move is invalid");
                System.out.println("DISQUALIFIED");
                break;
            }
            Random random = new Random();
            int computermove = random.nextInt(3);
            //computer move
            String systemmove = "";
            if(computermove==0)
            {systemmove="rock";}
            else
            if(computermove==1)
            {systemmove="paper";}
            else
            if(computermove==2)
            {systemmove="scissors";}
            System.out.println("SYSTEM MOVE : " +systemmove);
            //user move
            String usermove="";
            if(mymove==0)
            {usermove="rock";}
            else
            if(mymove==1)
            {usermove="paper";}
            else
            if(mymove==2)
            {usermove="scissors";}
            System.out.println("USER MOVE IS : " +usermove);
            if(mymove==computermove)
            {
                System.out.println("============================================================================");
                System.out.println("DRAW");
                System.out.println("============================================================================");
                d++;
                continue;

            }
            System.out.println("============================================================================");
            if((mymove==0 && computermove==2) || (mymove==1 && computermove==0) || (mymove==2 && computermove==1) )
            {
                System.out.println("YOU WON THE ROUND");
                m++;
            }
            else
            {
                System.out.println("COMPUTER WON THE ROUND");
                c++;
            }
            System.out.println("============================================================================");
        }
        // if(m==c)
        // {
        //     System.out.println("============================================================================");
        //     System.out.println("MATCH TIED");
        //     System.out.println("============================================================================");
        // }
        System.out.println("============================================================================");
        if(m>c)
        {
            System.out.println("YOU WIN!!!");
        }
        else
        {
            System.out.println("COMPUTER WIN!!!");
        }
        System.out.println("============================================================================");
        System.out.println("YOUR POINTS : " +m);
        System.out.println("COMPUTER POINTS : " +c);
        System.out.println("NUMBER OF DRAWS : " +d);
    }
}
