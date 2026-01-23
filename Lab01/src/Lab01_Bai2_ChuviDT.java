import java.util.Scanner;

public class Lab01_Bai2_ChuviDT {
    public static void main(String[] args){
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        //Nhập từ bàn phím 2 cạnh của hình chữ nhật
        System.out.print("Nhập cạnh thứ nhất: ");
        double a = sc.nextDouble();

        System.out.print("Nhập cạnh thứ hai: ");
        double b = sc.nextDouble();

        // Tính chu vi: C = 2 * (a + b)
        double ChuVi = 2 * (a + b);

        // Tính diện tích: S = a * b
        double DienTich = a * b;

        // Xác định cạnh nhỏ
        double CanhNho = (a < b) ? a : b;

        // Xuất kết quả
        System.out.println("\n===== Kết quả =====");
        System.out.println("Chu vi hình chữ nhật: " + ChuVi);
        System.out.println("Diện tích hình chữ nhật: " + DienTich);
        System.out.println("Cạnh nhỏ của hình chữ nhật: " + CanhNho);

        sc.close();

    }
}
