package BooksType;

import Games.GameRule;
import java.util.Scanner;

public class FanTasy {

    byte select;
    Scanner sc = new Scanner(System.in);
    GameRule gm = new GameRule();
    
//    String bookFantasy[] = {"After the Light", "The Meph's Tales", "Harry Potter", "Witchoar", "Vampire Twilight",
//        "Akatsuki no kimon", "ตุ๊ดทะลุมิติ", "My Memories of a Future Life", "The Stand", "Abyss Rider", "คู่ป่วนสะท้านภพ",
//        "Honzuki no Gekokujou"};

    public BooksName fanTasy() {
        
    do{
        System.out.println("\nวันหนึ่งคุณได้ไปอยู่ในโลกแฟนตาซีสิ่งแรกที่คุณจะทำคือ?");
        System.out.println("(1)เรียนรู้เวทย์มนต์");
        System.out.println("(2)ศึกษาประวัติศาสตร์");
        System.out.println("(3)เอาชีวิตรอด");
        System.out.print("Enter : ");
        this.select = gm.selectChoice();
    }while(select>3) ;
        switch (select) { //เวทย์มนต์ ประวัติศาสตร์ เอาชีวิตรอด
            
            case 1: //เวทย์มนต์   
            do{
                System.out.println("\nศาสตาตร์เวทย์ที่คุณอยากจะเรียนรู้มากที่สุด?");
                System.out.println("(1)ศาสตร์ดำ");
                System.out.println("(2)ด้านสว่าง");
                System.out.print("Enter : ");
                System.out.print("\n");
                this.select = gm.selectChoice();
            }while(select>2) ;
                switch (select) {
                    
                    case 1: //ศาสตร์ดำ
                    do{
                        System.out.println("สิ่งดำมืดที่คุณคิดว่าอยู่ในจิตใจของคุณ?");
                        System.out.println("(1)อสูรกาย");
                        System.out.println("(2)กิเลส");
                        System.out.print("Enter : ");
                        this.select = gm.selectChoice();
                    }while(select>2) ;
                        switch (select) {
                            case 1: //อสูรกาย
                                return BooksName.After_the_Light;
                            case 2: //กิเลส
                                return BooksName.The_Meph_is_Tales;
                        }
                        break;
                        
                    case 2: //ด้านสว่าง
                    do{
                        System.out.println("\nวันนี้เป็นวันธรรมดาวันหนึ่ง ถ้าเลือกได้ คุณอยากจะไปอยู่ที่ไหน?");
                        System.out.println("(1)โรงเรียน");
                        System.out.println("(2)ร้านน้ำชา");
                        System.out.print("Enter : ");
                        this.select = gm.selectChoice();
                    }while(select>2) ;
                        switch (select) {
                            case 1: //โรงเรียน
                                return BooksName.Harry_Potter;
                            case 2: //ร้านน้ำชา
                                return BooksName.Witchoar;
                        }
                        break;
                }
                break;

            case 2: //ประวัติศาสตร์
            do{
                System.out.println("\nคุณอยากจะศึกษาประวัติศาสตร์อะไร?");
                System.out.println("(1)ตำนาน");
                System.out.println("(2)กาลเวลา");
                System.out.print("Enter : ");
                this.select = gm.selectChoice();
            }while(select>2) ;
                switch (select) {
                    
                    case 1: //ตำนาน
                    do{
                        System.out.println("\nถ้าคุณต้องกลายร่างเป็นอย่างหนึ่งโดยที่ไม่ได้ตั้งใจ คุณเลือกที่จะเป็น?");
                        System.out.println("(1)แวมไพร์");
                        System.out.println("(2)ภูติ");
                        System.out.print("Enter : ");
                        this.select = gm.selectChoice();
                    }while(select>2);
                        switch (select) {
                            case 1: //แวมไพร์
                                return BooksName.Vampire_Twilight;
                            case 2: //ภูติ
                                return BooksName.Akatsuki_no_kimon;
                        }
                        break;
                        
                    case 2: //ไทม์แมชชีน
                    do{
                        System.out.println("\nสิ่งที่คุณอยากจะทำมากที่สุด?");
                        System.out.println("(1)แก้ไขอดีต");
                        System.out.println("(2)เปลี่ยนแปลงอนาคต");
                        System.out.print("Enter : ");
                        this.select = gm.selectChoice();
                    }while(select>2);
                        switch (select) {
                            case 1: //เปลี่ยนแปลงอดีต
                                return BooksName.ตุ๊ดทะลุมิติ;
                            case 2: //แก้ไขอนาคต
                                return BooksName.My_Memories_of_a_Future_Life;
                        }
                        break;
                }
                break;
                
            case 3: //เอาชีวิตรอด
            do{
                System.out.println("\nถ้าเลือกอะไรระหว่างอยู่ในโลกเดิมที่กำลังจะล่มสลายเพราะภัยพิบัติ กับย้ายไปอยู่ต่างโลกที่คุณไม่รู้จัก?");
                System.out.println("(1)ภัยพิบัติ");
                System.out.println("(2)ต่างโลก");
                System.out.print("Enter : ");
                this.select = gm.selectChoice();
            }while(select>2);
                switch (select) {
                    
                    case 1: //ภัยพิบัติ
                    do{
                        System.out.println("\nคุณกลัวอะไรที่สุด?");
                        System.out.println("(1)ไวรัสที่น่ากลัว และแพร่กระจายอย่างรวดเร็ว");
                        System.out.println("(2)โลกแตก");
                        System.out.print("Enter : ");
                        this.select = gm.selectChoice();
                    }while(select>2);
                        switch (select) {
                            case 1: //ไวรัส
                                return BooksName.The_Stand;
                            case 2: //โลกแตก
                                return BooksName.Abyss_Rider;
                        }
                        break;
                        
                    case 2: //ต่างโลก
                    do{
                        System.out.println("\nถ้าคุณได้ไปต่างโลก ภาษาแรกที่คุณคิดว่าจะได้ยินคือ?");
                        System.out.println("(1)ไทย");
                        System.out.println("(2)ญี่ปุ่น");
                        System.out.print("Enter : ");
                        this.select = gm.selectChoice();
                    }while(select>2);
                        switch (select) {
                            case 1: //ไทย
                                return BooksName.คู่ป่วนสะท้านภพ;
                            case 2: //ญี่ปุ่น
                                return BooksName.Honzuki_no_Gekokujou;
                        }
                        break;
                }
                break;
        }

        return BooksName.ERROR;
    }
}
