package Member;

import java.util.Scanner;

public class MemberName {
    
    Scanner sc = new Scanner(System.in);
    private String first_name;
    private String last_name;

    public MemberName() {
        System.out.println("*************สร้างบัญชีผู้ใช้*************");
        System.out.print("firstName : ");
        this.first_name = sc.nextLine();
        System.out.print("lastName : ");
        this.last_name = sc.nextLine();
    }
    
    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    @Override
    public String toString() {
        return (first_name==null)? "Anonymous":first_name + " " + last_name ;
    }

}
