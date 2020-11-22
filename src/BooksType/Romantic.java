package BooksType;

import Games.GameRule;
import java.util.Scanner;

public class Romantic {

    byte select;
    Scanner sc = new Scanner(System.in);
    GameRule gm = new GameRule();
    
//    String bookRomantic[] = {"โถงสีเทา", "Me Before You", "Spirit Fingers", "Fading Memories", "Sister Sister", "Comedy Playboy",
//        "Love Villian"};

    public BooksName romantic() {

    do{
        System.out.println("\nคุณชอบอ่านนิยายโรแมนติกแนวไหน?");
        System.out.println("(1)ชายหญิง");
        System.out.println("(2)LGBT");
        System.out.print("Enter : ");
        this.select = gm.selectChoice();
    }while(select>2) ;
        switch (select) { //ชายหญิง LGBT
            
            case 1: //ชายหญิง
            do{
                System.out.println("\nชีวิตคู่ที่คุณอยากได้?");
                System.out.println("(1)Drama");
                System.out.println("(2)Comedy");
                System.out.print("Enter : ");
                this.select = gm.selectChoice();
            }while(select>2);
                switch (select) {
                    
                    case 1: //ดราม่า
                    do{
                        System.out.println("\nคุณให้ความสำคัญกับสิ่งไหนมากกว่ากัน?");
                        System.out.println("(1)ชีวิต");
                        System.out.println("(2)ความรัก");
                        System.out.print("Enter : ");
                        this.select = gm.selectChoice();
                    }while(select>2);
                        switch (select) {
                            case 1: //ชีวืต
                                return BooksName.โถงสีเทา;
                            case 2: //ความรัก
                                return BooksName.Me_Before_You;
                        }
                        break;
                    case 2: //Comedy
                        return BooksName.Spirit_Fingers;
                }
                break;

            case 2: //LGBT
            do{
                System.out.println("\nคุณอยากให้ชีวิตคู่ของคุณเป็นแบบไหน?");
                System.out.println("(1)ดราม่า");
                System.out.println("(2)Comedy");
                System.out.print("Enter : ");
                this.select = gm.selectChoice();
            }while(select>2);
                switch (select) {
                    
                    case 1: //ดราม่า
                    do{
                        System.out.println("\nสิ่งที่คุณชอบที่สุด?");
                        System.out.println("(1)วาย[ชายรักชาย]");
                        System.out.println("(2)ยูริ[หญิงรักหญิง]");
                        System.out.print("Enter : ");
                        this.select = gm.selectChoice();
                    }while(select>2);
                        switch (select) {
                            case 1: //วาย
                                return BooksName.Fading_Memories;
                            case 2: //ยูริ
                                return BooksName.Sister_Sister;
                        }
                        break;
                        
                    case 2: //Comedy
                    do{
                        System.out.println("\nสิ่งที่คุณชอบที่สุด?");
                        System.out.println("(1)วาย[ชายรักชาย]");
                        System.out.println("(2)ยูริ[หญิงรักหญิง]");
                        System.out.print("Enter : ");
                        this.select = gm.selectChoice();
                    }while(select>2);
                        switch (select) {
                            case 1: //วาย
                                return BooksName.Comedy_Playboy;
                            case 2: //ยูริ
                                return BooksName.Love_Villian;
                        }
                        break;
                }
                break;
        }

        return BooksName.ERROR;
    }
}
