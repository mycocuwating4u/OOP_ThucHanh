import java.util.Scanner;
import java.util.Stack;

        // Viết chương trình nhập vào 1 số nguyên. Kiểm tra xem số đó có phải là số nguyên tố
        // không? Hiển thị số nguyên đó ra màn hình dưới dạng số nhị phân.

public class Bai6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Nhap so nguyen to can kiem tra = ") ;

        int n = sc.nextInt() ;
        if (primeCheck(n)) 
        {
            System.out.println(n + " la phai la so nguyen so ") ;
        }
        else 
        {
            System.out.println(n + " ko phai la so nguyen so ") ;
        }
        printInt2Binary(n) ;

        sc.close() ;
    }


    public static boolean primeCheck(int n) {
        if (n<=1) return false ;
        else 
        {
            double foo = Math.sqrt(n) ;
            for (int i=2; (double)i<=foo; i++)
            {
                if (n%i==0) return false ;
            }
        }
        return true ;
    }


    public static void printInt2Binary(int n) {
        if (n==0) 
        {
            System.out.println("In nhi phan cua " + n + " = 0" ) ;
            return ;
        }

        if (n<0) 
        {
            n = Math.abs(n) ;
        }

        Stack<Integer> S = new Stack<>() ;
        System.out.println("In nhi phan cua " + n + " = ") ;

        while (n!=0)
        {
            int foo = n%2 ;
            S.push(foo) ;
            n=n/2 ;
        }
        
        while (!S.empty())
        {
            System.out.print(S.peek() + " ") ;
            S.pop() ;
        }
    }
}






        // done