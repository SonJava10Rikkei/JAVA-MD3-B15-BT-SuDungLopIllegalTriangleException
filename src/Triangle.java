import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        int side1 = 0, side2 = 0, side3 = 0;
        try {
            System.out.println("Nhập cạnh 1 :");
            side1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập cạnh 2: ");
            side2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập cạnh 3: ");
            side3 = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException err) {
            err.printStackTrace();
            System.out.println("Lỗi :" + err.getMessage());
        }
        try {
            triangle.triangleSide(side1, side2, side3);
        } catch (IllegalTriangleException illegalTriangleException) {
            System.out.println("Loi : " + illegalTriangleException.getMessage());
        }
        System.out.println("Tiep tuc !");
    }

    public String triangleSide(int side1, int side2, int side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException(" Khong phai tam giac");
        } else if (side1 == side2 && side1 == side3) {
            System.out.println("Tam giac deu");
            return ("Tam giac deu");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Tam giac can");
            return ("Tam giac can");
        } else if ((side1 + side2 > side3) && ((side1 + side3) > side2) && ((side2 + side3) > side1)) {
            System.out.println("Tam giac thuong");
            return ("Tam gac thuong");
        } else {
            throw new IllegalTriangleException(" Khong phai tam giac");
        }
    }
}
