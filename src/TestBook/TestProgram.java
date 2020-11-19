package TestBook;

import RandomBooks.Books;
import java.util.Scanner;
import MemberId.Id ;

public class TestProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char answer;
        
        System.out.println("*************สร้างบัญชีผู้ใช้*************");
        System.out.print("firstName : ");
        String fristName = sc.nextLine();
        System.out.print("lastName : ");
        String lastName = sc.nextLine();
        Id id = new Id(fristName,lastName);
        
        do {
            System.out.println("YourName["+ id.toString() +"]");
            Books bs = new Books();
            System.out.println(bs.ranDomBook());
            System.out.println("\nคุณต้องการที่จะเลือกอีกรอบหรือไม่ y/n");
            System.out.print("Enter : ");
            answer = (sc.next()).toLowerCase().charAt(0);
        } while (answer == 'y');

    }
}
