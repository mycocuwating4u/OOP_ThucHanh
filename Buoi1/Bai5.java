import java.util.Scanner;

        // Viết chương trình giải phương trình bậc 2 trong đó gồm 2 hàm static giải phương trình
        // bậc 1 (2 tham số) và giải phương trình bậc 2 (3 tham số).

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        double a, b, c ;

        System.out.println("Nhap phuong trinh : ") ; 
        System.out.print("a = ") ;
        a = sc.nextDouble() ;
        System.out.print("b = ") ;
        b = sc.nextDouble() ;
        System.out.print("c = ") ;
        c = sc.nextDouble() ;

        ptBac2(a, b, c) ;

        sc.close() ;
    }


    public static void ptBac1(double a, double b) {
            // ax + b = 0
        if (a==0&&b==0) 
            System.out.println("Vo So Nghiem") ;
        else if (a==0&&b!=0)
            System.out.println("Vo nghiem") ;
        else 
        {
            double nghiem = -b / a ;
            System.out.println("Co 1 nghiem duy nhat = " + nghiem ) ;
        }
    }


    public static void ptBac2(double a, double b, double c) {
            // ax2 + bx + c = 0 ;
            if (a==0)  
            {
                ptBac1(b, c) ;
                return ;
            }

            double delta = b*b - 4*a*c ;
            if (delta<0) System.out.println("Vo nghiem") ;
            else if (delta==0) 
            {
                double nghiem = -b / (2*a) ;
                System.out.println("Nghiem kep = " + nghiem ) ;
            }
            else 
            {
                double x1 = (-b + Math.sqrt(delta)) / (2*a) ;
                double x2 = (-b - Math.sqrt(delta)) / (2*a) ;
                System.out.println("2 nghiem phan biet") ;
                System.out.println("x1 = " + x1 ) ;
                System.out.println("x2 = " + x2 ) ;
            }
    }
    
}


        // done
