import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
    int[] numlist = new int[8];
    for (int i = 0; i<8; i++) {
        System.out.print("Introduzca un numero: ");
        numlist[i] = sc.nextInt();
    }
    for (int i = 0; i<8; i++) {
        System.out.print((numlist[i]%2==0 ? "Par:"+numlist[i]+" " : "Impar:"+numlist[i]+" "));
    }
    }
    
}
