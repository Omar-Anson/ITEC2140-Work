import java.util.Scanner;
public class MySchoolCodeDemo {
    public static void main (String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = s.nextLine();

        System.out.println("Hello " + name + ", how are you?");

    }
}
