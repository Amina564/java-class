package amina;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String section;
        System.out.print("Enter section name: ");
        section = input.nextLine();
        Info info = new Info();
        Hobby hobby = new Hobby();
        System.out.println("SECTION: "+section);
        System.out.println("NAME: "+info.name);
        System.out.println("ID: "+info.id);
        System.out.println("HOBBY NAME: "+hobby.hobbyName);


         /* name: Amina Begum
         id: 2012020137
         section:C
         email:cse_2012020137@lus.ac.bd
        */

}
}