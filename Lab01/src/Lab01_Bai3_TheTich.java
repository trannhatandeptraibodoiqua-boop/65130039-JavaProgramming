import java.util.Scanner;

public class Lab01_Bai3_TheTich {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        //Nhập cạnh của khối lập phương
        System.out.print("Nhập cạnh của khối lập phương");
        double canh=sc.nextDouble();

        //Tính thể tích của khối lập phương
        double TheTich=Math.pow(canh,3);

        // Xuất kết quả
        System.out.println("Thể tích khối lập phương là: " + TheTich);
        sc.close();
    }
}
