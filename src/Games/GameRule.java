package Games;

import java.util.Scanner;
import BooksType.Horror;
import BooksType.FanTasy;
import BooksType.Romantic;

public class GameRule {
    Scanner sc = new Scanner(System.in);
    
    public BooksType.BooksName randomBook() {
        System.out.println("แนวนิยายที่คุณต้องการอ่าน");
        System.out.println("(1)ระทึกขวัญ");
        System.out.println("(2)แฟนตาซี");
        System.out.println("(3)โรแมนติก");
        System.out.print("Enter : ");
        switch (sc.nextByte()/*<1?1:sc.nextByte()>3?3:sc.nextByte()*/) {
            case 1:
                return new Horror().horror();
            case 2:
                return new FanTasy().fanTasy();
            case 3:
                return new Romantic().romantic();
        }
        System.out.println("กรุณาเลือกใหม่อีกครั้งครับ/ค่ะ\n");
        return randomBook();
    }
    
    public byte selectChoice(){
        byte select = sc.nextByte();
        if(select>2){System.out.println("กรุณาเลือกใหม่อีกครั้งครับ/ค่ะ");}
        return select ;
    }
    
    public byte selectMain(){
        byte select = sc.nextByte();
        if(select>3){System.out.println("กรุณาเลือกใหม่อีกครั้งครับ/ค่ะ");}
        return select ;
    }
    
    
}
