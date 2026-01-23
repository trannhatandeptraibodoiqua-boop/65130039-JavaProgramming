import java.util.Scanner;

public class Lab01_Bai4_Delta {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        // Nhập các hệ số a, b, c
        System.out.print("Nhập hệ số a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = sc.nextDouble();

        //Tính delta
        double delta=Math.pow(b,2)-4*a*c;

        // Xuất delta
        System.out.println("Delta = " + delta);

        //Xuất căn delta(nếu delta >=0)
        if (delta >= 0) {
            double canDelta = Math.sqrt(delta);
            System.out.println("Căn delta = " + canDelta);
        } else {
            System.out.println("Delta âm, không có căn delta thực.");
        }
        sc.close();
    }
}
