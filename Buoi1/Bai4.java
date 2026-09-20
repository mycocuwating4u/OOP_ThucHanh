import java.util.Scanner;

        // Viết chương trình nhập vào 2 số nguyên a và b. Tính tổng và hiển thị ra màn hình. Nếu
        // số nhập vào không đúng định dạng thì hiển thị thông báo lỗi, yêu cầu nhập lại.

public class Bai4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        int a = inputInt(sc, "a") ;
        int b = inputInt(sc, "b") ;

        System.out.println("a + b = " + (a+b)) ;

        sc.close() ;
    }


    public static int inputInt(Scanner sc, String text) {
        
        while (true)
        {
            System.out.print("Hay nhap so " + text + " = ") ;
            String str = sc.nextLine() ;
            str = str.trim() ;

            try {
                return Integer.parseInt(str) ;
            }
            catch(NumberFormatException e1) {
                System.out.println("Vui long nhap lai !") ;
            }
        }
    }
}


        // done