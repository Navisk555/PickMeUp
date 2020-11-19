package BooksType;

import java.util.Scanner;

public class Horror {

    Scanner sc = new Scanner(System.in);
    String bookHorror[] = {"The Shape of water", "Out of the dark", "Holy ภาคินัย", "ASYLUM", "Every day thing",
        "Sherlock Holmes", "One of us is lying", "The case of jonnie Brice", "Lost 2 Land", "Resident evil",
        "z for zacharich", "Osama Game"};

    public String horror() {
        byte select ;
        do{
        System.out.println("\nถ้ามีหนังสือ 3 เล่มอยู่บนชั้นหนังสือ คุณจะเลือกอ่านหนังสือเล่มไหน?");
        System.out.println("(1)ผี");
        System.out.println("(2)สืบสวน");
        System.out.println("(3)เอาตัวรอด");
        System.out.print("Enter : ");
        select = sc.nextByte() ;
        if(select>3){System.out.println("กรุณาเลือกใหม่อีกครั้งครับ/ค่ะ");}
        }while(select>3) ;
        switch (select) { //ผี สืบสวน เอาตัวรอด
            case 1: //ผี
                
                do{
                System.out.println("\nคุณอยากจะหนีจากสิ่งไหนมากที่สุด?");
                System.out.println("(1)สัตว์ประหลาด");
                System.out.println("(2)ผีสาง");
                System.out.print("Enter : ");
                select = sc.nextByte() ;
                if(select>2){System.out.println("กรุณาเลือกใหม่อีกครั้งครับ/ค่ะ");}
                }while(select>2) ;
                
                switch (select) {
                    case 1: //สัตว์ประหลาด
                    do{
                        System.out.println("\nคุณเชื่อในสิ่งไหนมากกว่ากัน?");
                        System.out.println("(1)วิทยาศาสตร์");
                        System.out.println("(2)เอเลี่ยน");
                        System.out.print("Enter : ");
                        select = sc.nextByte() ;
                        if(select>2){System.out.println("กรุณาเลือกใหม่อีกครั้งครับ/ค่ะ");}
                    }while(select>2) ;
                    
                        switch (select) {
                            case 1: //วิทยาศาสตร์
                                return bookHorror[0];
                            case 2: //เอเลี่ยน
                                return bookHorror[1];
                        }
                        break;
                        
                    case 2: //ผีสาง
                    do{
                        System.out.println("\nคุณคิดว่าผีจากประเทศไหนน่ากลัวกว่ากัน?");
                        System.out.println("(1)ไทย");
                        System.out.println("(2)ต่างประเทศ");
                        System.out.print("Enter : ");
                        select = sc.nextByte() ;
                        if(select>2){System.out.println("กรุณาเลือกใหม่อีกครั้งครับ/ค่ะ");}
                    }while(select>2) ;
                    
                        switch (select) {
                            case 1: //ไทย
                                return bookHorror[2];
                            case 2: //ต่างประเทศ
                                return bookHorror[3];
                        }
                        break;
                }
                break;

            case 2: //สืบสวน
            do{
                System.out.println("\nคุณชอบวัฒนธรรม และแนวคิดของประเทศไหนมากกว่ากัน?");
                System.out.println("(1)ENGLAND");
                System.out.println("(2)AMERICA");
                System.out.print("Enter : ");
                select = sc.nextByte() ;
                if(select>2){System.out.println("กรุณาเลือกใหม่อีกครั้งครับ/ค่ะ");}
            }while(select>2);
            
                switch (select) {
                    case 1: //ENG
                    do{
                        System.out.println("\nคุณชอบอ่านหนังสือทีละหลายเล่มหรือไม่?");
                        System.out.println("(1)ไม่ ฉันชอบอ่านเพียงเล่มเดียว");
                        System.out.println("(2)ใช่");
                        System.out.print("Enter : ");
                        select = sc.nextByte() ;
                        if(select>2){System.out.println("กรุณาเลือกใหม่อีกครั้งครับ/ค่ะ");}
                    }while(select>2) ;
                    
                        switch (select) {
                            case 1: //จบภายใน1เล่ม
                                return bookHorror[4];
                            case 2: //มีหลายเล่ม
                                return bookHorror[5];
                        }
                        break;
                    case 2: //AME
                    do{
                        System.out.println("\nคุณชอบแนวคิดแบบไหน?");
                        System.out.println("(1)สมัยใหม่");
                        System.out.println("(2)คลาสสิก");
                        System.out.print("Enter : ");
                        select = sc.nextByte() ;
                        if(select>2){System.out.println("กรุณาเลือกใหม่อีกครั้งครับ/ค่ะ");}
                    }while(select>2) ;
                    
                        switch (select) {
                            case 1: //สมัยใหม่
                                return bookHorror[6];
                            case 2: //คลาสสิก
                                return bookHorror[7];
                        }
                        break;
                }
                break;
            case 3: //เอาตัวรอด
            do{
                System.out.println("\nคุณคิดว่าจะใช้ชีวิตรอดในสถานการณ์ไหนได้ดีกว่ากัน?");
                System.out.println("(1)ซอมบี้");
                System.out.println("(2)เอาชีวิตรอดในสถานการณ์ที่เลวร้าย");
                System.out.print("Enter : ");
                select = sc.nextByte() ;
                if(select>2){System.out.println("กรุณาเลือกใหม่อีกครั้งครับ/ค่ะ");}
            }while(select>2) ;
                switch (select) {
                    case 1: //ซอมบี้
                    do{
                        System.out.println("\nคุณอยากหนีซอมบี้ในประเทศไหน?");
                        System.out.println("(1)ไทย");
                        System.out.println("(2)ต่างประเทศ");
                        System.out.print("Enter : ");
                        select = sc.nextByte() ;
                        if(select>2){System.out.println("กรุณาเลือกใหม่อีกครั้งครับ/ค่ะ");}
                    }while(select>2) ;
                        switch (select) {
                            case 1: //ไทย
                                return bookHorror[8];
                            case 2: //ต่างประเทศ
                                return bookHorror[9];
                        }
                        break;
                    case 2: //เอาชีวิตรอดในสถานการณ์ที่เลวร้าย
                    do{
                        System.out.println("\nถ้าคุณเลือกได้ คุณอยากอยู่ในสถานการณ์ไหนมากกว่ากัน?");
                        System.out.println("(1)ภัยพิบัติ");
                        System.out.println("(2)เกมเอาตัวรอด");
                        System.out.print("Enter : ");
                        select = sc.nextByte() ;
                        if(select>2){System.out.println("กรุณาเลือกใหม่อีกครั้งครับ/ค่ะ");}
                    }while(select>2) ;
                    
                        switch (select) {
                            case 1: //ภัยพิบัติ
                                return bookHorror[10];
                            case 2: //เกมเอาตัวรอด
                                return bookHorror[11];
                        }
                        break;
                }
                break;
        }
        return "";
    }
}
