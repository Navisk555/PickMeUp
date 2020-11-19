package BooksType;

import java.util.Scanner;

public class Romantic {

    Scanner sc = new Scanner(System.in);
    String bookRomantic[] = {"โถงสีเทา", "Me Before You", "Spirit Fingers", "Fading Memories", "Sister Sister", "Comedy Playboy",
        "Love Villian"};

    public String romantic() {
        byte select ;
    do{
        System.out.println("\nคุณชอบอ่านนิยายโรแมนติกแนวไหน?");
        System.out.println("(1)ชายหญิง");
        System.out.println("(2)LGBT");
        System.out.print("Enter : ");
        select = sc.nextByte();
        if(select>2){System.out.println("กรุณาเลือกใหม่อีกครั้งครับ/ค่ะ");}
    }while(select>2) ;
        switch (select) { //ชายหญิง LGBT
            
            case 1: //ชายหญิง
            do{
                System.out.println("\nชีวิตคู่ที่คุณอยากได้?");
                System.out.println("(1)Drama");
                System.out.println("(2)Comedy");
                System.out.print("Enter : ");
                select = sc.nextByte();
                if(select>2){System.out.println("กรุณาเลือกใหม่อีกครั้งครับ/ค่ะ");}
            }while(select>2);
                switch (select) {
                    
                    case 1: //ดราม่า
                    do{
                        System.out.println("\nคุณให้ความสำคัญกับสิ่งไหนมากกว่ากัน?");
                        System.out.println("(1)ชีวิต");
                        System.out.println("(2)ความรัก");
                        System.out.print("Enter : ");
                        select = sc.nextByte();
                        if(select>2){System.out.println("กรุณาเลือกใหม่อีกครั้งครับ/ค่ะ");}
                    }while(select>2);
                        switch (select) {
                            case 1: //ชีวืต
                                return bookRomantic[0];
                            case 2: //ความรัก
                                return bookRomantic[1];
                        }
                        break;
                    case 2: //Comedy
                        return bookRomantic[2];
                }
                break;

            case 2: //LGBT
            do{
                System.out.println("\nคุณอยากให้ชีวิตคู่ของคุณเป็นแบบไหน?");
                System.out.println("(1)ดราม่า");
                System.out.println("(2)Comedy");
                System.out.print("Enter : ");
                select = sc.nextByte();
                if(select>2){System.out.println("กรุณาเลือกใหม่อีกครั้งครับ/ค่ะ");}
            }while(select>2);
                switch (select) {
                    
                    case 1: //ดราม่า
                    do{
                        System.out.println("\nสิ่งที่คุณชอบที่สุด?");
                        System.out.println("(1)วาย[ชายรักชาย]");
                        System.out.println("(2)ยูริ[หญิงรักหญิง]");
                        System.out.print("Enter : ");
                        select = sc.nextByte();
                        if(select>2){System.out.println("กรุณาเลือกใหม่อีกครั้งครับ/ค่ะ");}
                    }while(select>2);
                        switch (select) {
                            case 1: //วาย
                                return bookRomantic[3];
                            case 2: //ยูริ
                                return bookRomantic[4];
                        }
                        break;
                        
                    case 2: //Comedy
                    do{
                        System.out.println("\nสิ่งที่คุณชอบที่สุด?");
                        System.out.println("(1)วาย[ชายรักชาย]");
                        System.out.println("(2)ยูริ[หญิงรักหญิง]");
                        System.out.print("Enter : ");
                        select = sc.nextByte();
                        if(select>2){System.out.println("กรุณาเลือกใหม่อีกครั้งครับ/ค่ะ");}
                    }while(select>2);
                        switch (select) {
                            case 1: //วาย
                                return bookRomantic[5];
                            case 2: //ยูริ
                                return bookRomantic[6];
                        }
                        break;
                }
                break;
        }

        return "Error!";
    }
}
