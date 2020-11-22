package RandomBooks;

import BooksType.BooksName;
import java.util.Scanner;
import Member.MemberName;
import Games.GameRule;
import java.util.LinkedList;

public class RandomBooks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char answer;
        MemberName Name = new MemberName();
        GameRule gm = new GameRule();
        LinkedList<BooksName> books = new LinkedList<BooksName>();

        do {
            System.out.print("\nYourName[" + Name.toString() + "]\n");
            books.add(gm.randomBook());
            System.out.println(Name.toString() + " คุณเหมาะกับหนังสือ : " + books.getLast() + '.');
            System.out.println("\nคุณต้องการที่จะเลือกอีกรอบหรือไม่ y/n");
            System.out.print("Enter : ");
            answer = (sc.next()).toLowerCase().charAt(0);
        } while (answer == 'y');
        System.out.println("\nนี้คือหนังสือทั้งหมดของคุณ : ");
        for (BooksName i : books) {
            System.out.println("- " + i);
        }

    }
}
