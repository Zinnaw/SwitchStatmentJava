import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your grade for this course?");
        String grade = scan.next();
        switch(grade){
            case "A":
                System.out.println("Your mark is between 83 and 100. Execellent");
                break;
            case "B":
                System.out.println("Your mark is between 70 and 82. Keep it Up");
                break;
            case "C":
                System.out.println("Your mark is between 60 and 70. Improve.");
                break;
            case "D":
                System.out.println("Your mark is between 50 and 60. Study hard");
                break;
            case "F":
                System.out.println("Bakih atina bedenb");
                break;
            default:
                System.out.println("Grades are only A to F. Try again.");
        }

        System.out.println("Good day!");
    }
}