
        // Viết chương trình nhận vào đối số dòng lệnh là 1 danh sách các số thực. Hiển thị số lớn
        // nhất và tổng của các số thực có trong danh sách đó. Chú ý loại trừ các số thực nhập vào không
        // đúng định dạng.

public class Bai3 {

    public static void main(String[] args) {
        if (args.length==0) 
        {
            System.out.println("Error !") ;
            return ;
        }

        double sum = 0 ;
        double max = -Double.MAX_VALUE ;
        boolean flag = false ;

        System.out.println("Cac so hop le : ") ;
        for (String s : args) 
        {
            try {
                double num = Double.parseDouble(s) ;
                System.out.print(num + " ") ;
                sum += num ; 
                if (max<num) max = num ;
                flag = true ;
            }
            catch (NumberFormatException e0) {

            }
        }
        if (flag) System.out.print("\nMax Number = " + max + "\nSum = " + sum) ;
        else System.out.println("Ko co so nao hop le") ;
    }
}

        // java Bai3.java 3.5 7.2 abc 10.0 xyz -2.1
        // Done