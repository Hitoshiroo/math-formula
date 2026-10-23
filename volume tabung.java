import java.util.Scanner;
public class VolumeTabung {
    public static void main(String [] args) {
        float phi, v, r, t;
        phi = 22/7;
        Scanner t1 = new Scanner(System.in);
        System.out.print("jari-jari: "); r = t1.nextFloat();
        Scanner t2 = new Scanner(System.in);
        System.out.print("tinggi: "); t = t2.nextFloat();
        v = phi * (r * r) * t;
        
        System.out.println("Volume Tabung adalah: " + v + "cm³");
    }
}
