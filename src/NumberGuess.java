import java.util.Random;
import java.util.Scanner;
class Game {
    int randNum;
    int userNum;
    int countGuess = 1;
    Scanner sc = new Scanner(System.in);
    public Game() {
        Random rnum = new Random();
        randNum = rnum.nextInt(100);
    }
    public void takeInput() {
        userNum = sc.nextInt();
        iscorrectNum();
    }
    public void iscorrectNum() {
        if (userNum == randNum)
            System.out.println("correct number");
        else if (userNum < randNum) {
            System.out.println("number is less then system number");
            countGuess++;
            takeInput();
        } else if (userNum > randNum) {
            System.out.println("number is greater then system number");
            countGuess++;
            takeInput();
        }
    }
    public int getGuess()
    {
        return countGuess;
    }
}
public class NumberGuess {
    public static void main(String[] args) {
        Game obj =new Game();
        System.out.println("Enter the no of your choice");
        obj.takeInput();
        System.out.println("Number of gusses made by you  is : "+obj.getGuess());
    }
}
