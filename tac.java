/**
 * Created by SANDEEP on 6/30/2015.
 */import java.util.*;
public class tac {
   public static char x1='1';
    public static char x2='2';
    public static char x3='3';
    public static char x4='4';
    public static char x5='5';
    public static char x6='6';
    public static char x7='7';
    public static char x8='8';
    public static char x9='9';
    static int i=0;
    public static void main(String [] args)
    { System.out.println("player 1 = X");
        System.out.println("player 2 = O");

        drawBoard();

    }

   public static void drawBoard() {
       System.out.println(" " + x1 + " | " + x2 + " | " + x3 + "  ");
       System.out.println("-----------");
       System.out.println(" " + x4 + " | " + x5 + " | " + x6 + "  ");
       System.out.println("-----------");
       System.out.println(" " + x7 + " | " + x8 + " | " + x9 + "  ");
       i++;
       disp();
   }

    static void disp() {

while(i<=9){
        if (i%2==0)
        {
        System.out.println("Player 1 turn");
        Scanner abc=new Scanner(System.in);

        x(abc.nextInt());
        }
        else
        {
            System.out.println("Player 2 turn");
            Scanner abc=new Scanner(System.in);

            o(abc.nextInt());
        }
    }
        System.out.println("DRAW");}

    static  void x(int choice) {
        switch (choice)
        {
            case 1:
                x1 = 'X';
                System.out.println("Next player turn");
                break;
            case 2:
                x2 = 'X';
                System.out.println("Next player turn");
                break;
            case 3:
                x3 = 'X';
                System.out.println("Next player turn");
                break;
            case 4:
                x4 = 'X';
                System.out.println("Next player turn");
                break;
            case 5:
                x5 = 'X';
                System.out.println("Next player turn");
                break;
            case 6:
                x6 = 'X';
                System.out.println("Next player turn");
                break;
            case 7:
                x7 = 'X';
                System.out.println("Next player turn");
                break;
            case 8:
                x8 = 'X';
                System.out.println("Next player turn");
                break;
            case 9:
                x9 = 'X';
                System.out.println("Next player turn");
                break;
        }compare();
        drawBoard();
    }
  static  void o(int choice)
    {
     switch (choice)
    {
        case 1: x1='O';System.out.println("Next player turn");break;
        case 2: x2='O';System.out.println("Next player turn");break;
        case 3: x3='O';System.out.println("Next player turn");break;
        case 4: x4='O';System.out.println("Next player turn");break;
        case 5: x5='O';System.out.println("Next player turn");break;
        case 6: x6='O';System.out.println("Next player turn");break;
        case 7: x7='O';System.out.println("Next player turn");break;
        case 8: x8='O';System.out.println("Next player turn");break;
        case 9: x9='O';System.out.println("Next player turn");break;
    } compare2();
        drawBoard();
    }

   static void compare() {
       if (x1 == x2 & x2 == x3) {
           System.out.println("player 1 wins");
           System.exit(1);
       } else if (x1 == x5 & x5 == x9) {
           System.out.println("player 1 wins");
           System.exit(1);
       } else if (x1 == x4 & x4 == x7) {
           System.out.println("player 1 wins");
           System.exit(1);
       } else if (x7 == x8 & x8 == x9) {
           System.out.println("player 1 wins");
           System.exit(1);
       } else if (x3 == x6 & x6 == x9) {
           System.out.println("player 1 wins");
           System.exit(1);
       } else if (x3 == x5 & x5 == x7) {
           System.out.println("player 1 wins");
           System.exit(1);
       }
   }

    static void compare2() {
        if (x1 == x2 & x2 == x3) {
            System.out.println("player 2 wins");
            System.exit(1);
        } else if (x1 == x5 & x5 == x9) {
            System.out.println("player 2 wins");
            System.exit(1);
        } else if (x1 == x4 & x4 == x7) {
            System.out.println("player 2 wins");
            System.exit(1);
        } else if (x7 == x8 & x8 == x9) {
            System.out.println("player 2 wins");
            System.exit(1);
        } else if (x3 == x6 & x6 == x9) {
            System.out.println("player 2 wins");
            System.exit(1);
        } else if (x3 == x5 & x5 == x7) {
            System.out.println("player 2 wins");
            System.exit(1);
        }
}}

