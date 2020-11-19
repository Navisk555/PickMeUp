package RandomBooks;

import java.util.Scanner;
import BooksType.Horror ;
import BooksType.FanTasy ;
import BooksType.Romantic ;
import MemberId.Id ;

public class Books {

    Scanner sc = new Scanner(System.in);
    Horror hr = new Horror() ;
    FanTasy fs = new FanTasy() ;
    Romantic rt = new Romantic() ;
    Id id = new Id();

    public String ranDomBook() {
        System.out.println("แนวนิยายที่คุณต้องการอ่าน");
        System.out.println("(1)ระทึกขวัญ");
        System.out.println("(2)แฟนตาซี");
        System.out.println("(3)โรแมนติก");
        System.out.print("Enter : ");
        switch (sc.nextByte()/*<1?1:sc.nextByte()>3?3:sc.nextByte()*/) {
            case 1:
                return "\n" + id.toString() + ": คุณเหมาะกับหนังสือ : " + hr.horror() + '.' ;
            case 2:
                return "\n" + id.toString() + ": คุณเหมาะกับหนังสือ : " + fs.fanTasy() + '.' ;
            case 3:
                return "\n" + id.toString() + ": คุณเหมาะกับหนังสือ : " + rt.romantic() + '.' ;
        }
        System.out.println("กรุณาเลือกใหม่อีกครั้งครับ/ค่ะ\n");
        return ranDomBook() ;
    }

    

    

    
}
