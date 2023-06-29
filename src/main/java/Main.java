import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        int guess= 5;
                Scanner in = new Scanner(System.in);
                System.out.println("Guess The Numner");

                        System.out.println("You Guess The Number");

        int n = 30;
                while           (guess<=n){

                    if (guess> n) {
                        System.out.println("too large");
                    else if (guess < n) {
                        System.out.println("too small");
                    else if (guess == n) {
                        System.out.println("Correct!");
                            }
                        }
                    }
                }
    }
}
