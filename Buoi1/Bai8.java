import java.util.Scanner;

public class Bai8 {
    
        // Viết chương trình thực hiện các công việc sau:
        //      Nhập vào 1 danh sách các số nguyên.
        //      Nhập vào 1 số nguyên x bất kỳ. Đếm xem trong danh sách có bao nhiêu số x.
        //      Sắp xếp danh sách theo thứ tự tăng dần.
        //      Hiển thị danh sách ra màn hình.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("- Nhap so phan tu trong danh sach : ") ;
        int n = sc.nextInt() ;
        int[] arr = new int[n] ;
        NhapDS(arr, sc) ;

        System.out.print("- Nhap so can dem : ") ;
        int x = sc.nextInt() ;
        int dem = demPhantu(x, arr) ;
        System.out.print("co " + dem + " so " + x ) ; 
    
        System.out.println("\n- Da sap xep mang") ;
        sapxepDS(arr) ;

        System.out.print("- In mang : ") ;
        inDS(arr) ;
        
        sc.close();
    }


    public static void NhapDS(int[] arr, Scanner sc) {
        System.out.println("Nhap mang : ") ;
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt() ;
        }
    }


    public static int demPhantu(int x, int[] arr) {
        int dem = 0 ;
        for (int i : arr)
        {
            if (i==x) dem++ ;
        }
        return dem ;
    }


    public static void sapxepDS(int[] arr) {
        for (int i=0; i<arr.length-1; i++)
        {
            for (int j=i+1; j<arr.length; j++)
            {
                if (arr[i]>arr[j])
                {
                    int foo = arr[i] ;
                    arr[i] = arr[j] ;
                    arr[j] = foo ;
                }
            }
        }
    }


    public static void inDS(int[] arr) {
        for (int i : arr)
        {
            System.out.print(i + " ") ;
        }
    }
}

