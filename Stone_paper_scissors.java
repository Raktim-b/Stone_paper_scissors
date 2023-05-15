import java.util.Scanner;
2 import java.util.Random;

public class GFG {
    public static void main (String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("enter 0 for stone 1 for paper 2 for scissor");
        int userinput=sc.nextInt();

        Random rn=new Random();

        int computerinput=rn.nextInt(3);
        if(userinput==computerinput) {

            System.out.println("draw");
        } else if(userinput==0 && computerinput==2 ||userinput==1 && computerinput==0||userinput==2 && computerinput==1) {
            System.out.println("user win");
        }
    else{
        System.out.println("Computer win");
    }
        if(computerinput==0) {
            System.out.println("Computer choice: stone");
        }
        if(computerinput==1) {
            System.out.println("Computer choice: paper");
        }
            if(computerinput==2) {
        System.out.println("Computer choise: scissor");
}

            
