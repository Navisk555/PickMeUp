package BooksType;

import java.util.Scanner;
import BooksType.BooksName;
import Games.GameRule;

public class Horror {

    byte select;
    Scanner sc = new Scanner(System.in);
    GameRule gm = new GameRule();
//    String bookHorror[] = {"The Shape of water", "Out of the dark", "Holy ภาคินัย", "ASYLUM", "Every day thing",
//        "Sherlock Holmes", "One of us is lying", "The case of jonnie Brice", "Lost 2 Land", "Resident evil",
//        "z for zacharich", "Osama Game"};

    public BooksName horror() {

        do {
            System.out.println("\nถ้ามีหนังสือ 3 เล่มอยู่บนชั้นหนังสือ คุณจะเลือกอ่านหนังสือเล่มไหน?");
            System.out.println("(1)ผี");
            System.out.println("(2)สืบสวน");
            System.out.println("(3)เอาตัวรอด");
            System.out.print("Enter : ");
            this.select = gm.selectChoice();
        } while (select > 3);
        switch (select) { //ผี สืบสวน เอาตัวรอด
            case 1: //ผี              
                do {
                    System.out.println("\nคุณอยากจะหนีจากสิ่งไหนมากที่สุด?");
                    System.out.println("(1)สัตว์ประหลาด");
                    System.out.println("(2)ผีสาง");
                    System.out.print("Enter : ");
                    this.select = gm.selectChoice();
                } while (select > 2);

                switch (select) {
                    case 1: //สัตว์ประหลาด
                        do {
                            System.out.println("\nคุณเชื่อในสิ่งไหนมากกว่ากัน?");
                            System.out.println("(1)วิทยาศาสตร์");
                            System.out.println("(2)เอเลี่ยน");
                            System.out.print("Enter : ");
                            this.select = gm.selectChoice();
                        } while (select > 2);

                        switch (select) {
                            case 1: //วิทยาศาสตร์
                                return BooksName.The_Shape_of_water;
                            case 2: //เอเลี่ยน
                                return BooksName.Out_of_the_dark;
                        }
                        break;

                    case 2: //ผีสาง
                        do {
                            System.out.println("\nคุณคิดว่าผีจากประเทศไหนน่ากลัวกว่ากัน?");
                            System.out.println("(1)ไทย");
                            System.out.println("(2)ต่างประเทศ");
                            System.out.print("Enter : ");
                            this.select = gm.selectChoice();
                        } while (select > 2);

                        switch (select) {
                            case 1: //ไทย
                                return BooksName.Holy_ภาคินัย;
                            case 2: //ต่างประเทศ
                                return BooksName.ASYLUM;
                        }
                        break;
                }
                break;

            case 2: //สืบสวน
                do {
                    System.out.println("\nคุณชอบวัฒนธรรม และแนวคิดของประเทศไหนมากกว่ากัน?");
                    System.out.println("(1)ENGLAND");
                    System.out.println("(2)AMERICA");
                    System.out.print("Enter : ");
                    this.select = gm.selectChoice();
                } while (select > 2);

                switch (select) {
                    case 1: //ENG
                        do {
                            System.out.println("\nคุณชอบอ่านหนังสือทีละหลายเล่มหรือไม่?");
                            System.out.println("(1)ไม่ ฉันชอบอ่านเพียงเล่มเดียว");
                            System.out.println("(2)ใช่");
                            System.out.print("Enter : ");
                            this.select = gm.selectChoice();
                        } while (select > 2);

                        switch (select) {
                            case 1: //จบภายใน1เล่ม
                                return BooksName.Every_day_thing;
                            case 2: //มีหลายเล่ม
                                return BooksName.Sherlock_Holmes;
                        }
                        break;
                    case 2: //AME
                        do {
                            System.out.println("\nคุณชอบแนวคิดแบบไหน?");
                            System.out.println("(1)สมัยใหม่");
                            System.out.println("(2)คลาสสิก");
                            System.out.print("Enter : ");
                            this.select = gm.selectChoice();
                        } while (select > 2);

                        switch (select) {
                            case 1: //สมัยใหม่
                                return BooksName.One_of_us_is_lying;
                            case 2: //คลาสสิก
                                return BooksName.The_case_of_jonnie_Brice;
                        }
                        break;
                }
                break;
            case 3: //เอาตัวรอด
                do {
                    System.out.println("\nคุณคิดว่าจะใช้ชีวิตรอดในสถานการณ์ไหนได้ดีกว่ากัน?");
                    System.out.println("(1)ซอมบี้");
                    System.out.println("(2)เอาชีวิตรอดในสถานการณ์ที่เลวร้าย");
                    System.out.print("Enter : ");
                    this.select = gm.selectChoice();
                } while (select > 2);
                switch (select) {
                    case 1: //ซอมบี้
                        do {
                            System.out.println("\nคุณอยากหนีซอมบี้ในประเทศไหน?");
                            System.out.println("(1)ไทย");
                            System.out.println("(2)ต่างประเทศ");
                            System.out.print("Enter : ");
                            select = gm.selectChoice();
                        } while (select > 2);
                        switch (select) {
                            case 1: //ไทย
                                return BooksName.Lost_2_Land;
                            case 2: //ต่างประเทศ
                                return BooksName.Resident_evil;
                        }
                        break;
                    case 2: //เอาชีวิตรอดในสถานการณ์ที่เลวร้าย
                        do {
                            System.out.println("\nถ้าคุณเลือกได้ คุณอยากอยู่ในสถานการณ์ไหนมากกว่ากัน?");
                            System.out.println("(1)ภัยพิบัติ");
                            System.out.println("(2)เกมเอาตัวรอด");
                            System.out.print("Enter : ");
                            select = gm.selectChoice();
                        } while (select > 2);

                        switch (select) {
                            case 1: //ภัยพิบัติ
                                return BooksName.z_for_zacharich;
                            case 2: //เกมเอาตัวรอด
                                return BooksName.Osama_Game;
                        }
                        break;
                }
                break;
        }
        return BooksName.ERROR;
    }
}
