package If_els;

import java.util.Scanner;

public class If_ele {
    public static void main(String[] args)  {
        Scanner num = new Scanner(System.in);
        int first, second = 50;
        boolean isTrue = true ;
        System.out.println("Enter first num: ");
        first = num.nextInt();

        isTrue = first == 51;
        if (first >= second && isTrue ) {         //     || isTrue
            System.out.print("Num is 10");
            System.out.print("\n");
        } else if  (first == 45){
            System.out.print("Num is equal 45");

        } else {
            System.out.print("Num is lower than " + second);
        }
        switch (first) {
            case 51:
                System.out.print("Num is equal 51");
                break;
            case 48:
                System.out.print("Num is equal 48");
                break;
            case 57:
                System.out.print("Num is equal 57");
                break;
                default:
                    System.out.print("Num is something");
        }
    }
}
