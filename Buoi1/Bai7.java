import java.util.Scanner;

public class Bai7 {
    
        // Viết chương trình nhập vào 1 chuỗi họ tên. Hiển thị ra tên của họ tên đó. Nên thiết kế
        // chương trình gồm 1 hàm dùng để tách tên và hàm main.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhap full ten : ") ;
        String str = sc.nextLine() ;
        
        str = onlyName(str) ;
        System.out.println("-> " + str) ; 

        sc.close();
    }

    public static String onlyName(String str)
    {
        str = str.trim() ;
        str = str.substring(str.lastIndexOf(" ")+1) ;

        return str ;
    }
}

        //done 




        // length(): Lấy độ dài của chuỗi
        // charAt(int index): Lấy ký tự tại vị trí chỉ định
        // substring(int beginIndex, int endIndex): Cắt một phần chuỗi con
        // contains(CharSequence s): Kiểm tra chuỗi có chứa đoạn ký tự khác không
        // split(String regex): Chia chuỗi thành mảng dựa trên ký tự phân tách
        // toUpperCase() / toLowerCase(): Chuyển toàn bộ thành chữ hoa hoặc chữ thường
        // trim(): Xóa khoảng trắng thừa ở đầu và cuối chuỗi