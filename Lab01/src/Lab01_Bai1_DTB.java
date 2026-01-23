import java.util.Scanner;

public class Lab01_Bai1_DTB {
    public static void main(String[] args){
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        // Nhập họ và tên sinh viên
        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = sc.nextLine();

        // Nhập điểm trung bình
        System.out.print("Nhập điểm trung bình: ");
        double diemTB = sc.nextDouble();

        // Xuất thông tin ra màn hình
        System.out.println("\n===== Thông tin sinh viên =====");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Điểm trung bình: " + diemTB);

        // Đóng Scanner
        sc.close();

    }
}

