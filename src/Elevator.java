import java.util.Scanner;

/**
 * Created by rohityarlagadda on 5/11/17.
 */
public class Elevator {
    public static void main(String[] args){
        int lift=0, w,t;  //w- where are you,t- which floor
        System.out.println("This is an 10 floor building which floor are you at: Lift is at '0' ");
        Scanner sc = new Scanner(System.in);
        w = sc.nextInt();
        System.out.println("Elevator is on its way");
        for (int i=lift;i<w;i++){
            System.out.println("Elevator is at" +i);
            lift++;
        }
        System.out.println("Elevator is at " +lift);
        System.out.println("Please enter");

        System.out.println("Press the floor number [1-10]");
        Scanner sc1 = new Scanner(System.in);
        t = sc.nextInt();
        if(lift>=t) {
            for (int i = lift; i > t; i--) {
                System.out.println("We are going down" + lift);
                lift--;
            }
            System.out.println("You reached "+t);
        }

            else{
                for (int i = lift; i < t; i++) {
                    System.out.println("We are going up" + lift);
                    lift++;
                }
                System.out.println("You reached "+t);
            }
        }

}
