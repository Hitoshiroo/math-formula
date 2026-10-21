import java.util.Scanner;
public class LuasLingkaran {
  public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);
     float phi, l, r;
     phi = 3.14f;
     System.out.print("jari-jari: ");
     r = scanner.nextFloat();
     l = phi * (r * r);
     System.out.println("Luas Lingkarannya adalah: " + l);
  }
}
