import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a: ");
        double soA = scanner.nextInt();
        System.out.println("nhap so b: ");
        double soB = scanner.nextInt();
        System.out.println("nhap so c: ");
        double soC = scanner.nextInt();
        ptb2 tinhToan = new ptb2(soA, soB, soC);
        if(tinhToan.getDelta() >0){
            System.out.println("phuong trinh co 2 nghiem la: " + tinhToan.getR1() + " va " + tinhToan.getR2());
        }
        if(tinhToan.getDelta() == 0){
            System.out.println("phuong trinh co nghiem kep la: " +tinhToan.getR1());
        }
        if(tinhToan.getDelta()<0){
            System.out.println("phuong trinh vo nghiem");
        }

    }
}
