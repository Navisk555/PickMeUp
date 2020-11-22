package RandomBooks;

import java.util.Scanner;
import Member.MemberName ;
import Games.GameRule;

public class RandomBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char answer;
        MemberName Name = new MemberName();
        
        do {
            System.out.print("\nYourName["+ Name.toString() +"]\n");
            GameRule gm = new GameRule();
            System.out.println(Name.toString() + " คุณเหมาะกับหนังสือ : " + gm.ranDomBook() + '.');
            System.out.println("\nคุณต้องการที่จะเลือกอีกรอบหรือไม่ y/n");
            System.out.print("Enter : ");
            answer = (sc.next()).toLowerCase().charAt(0);
        } while (answer == 'y');

    }
}
