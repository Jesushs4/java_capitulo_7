import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] temp = new int[12];
    String[] month = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    for (int i = 0; i<12; i++) {
        System.out.print("Introduce la temperatura media de "+month[i]+": ");
        temp[i] = sc.nextInt();
    }
    System.out.println("--------------");
    for (int i = 0; i<12; i++) {
        System.out.println(month[i]+": "+temp[i]);
        System.out.println("--------------");
    }
    }
    
}
