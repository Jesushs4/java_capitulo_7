import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int bignum = Integer.MAX_VALUE;
    int smallnum = Integer.MIN_VALUE;
    int[] array = new int[100];
    for (int i = 0; i<100; i++) {
        array[i] = (int)(Math.random()*501);
        System.out.print(array[i]+" ");
    } System.out.println("\n");
    System.out.print("¿Qué quiere destacar? (1 - mínimo, 2 - máximo): ");
    int option = sc.nextInt();
    System.out.println();
    switch (option) {
        case 1:
        for (int i = 0; i<100; i++) {
            bignum = Integer.min(array[i], bignum);
        }
        for (int i = 0; i<100; i++) {
            System.out.print((array[i]==bignum) ? "**"+array[i]+"** " : array[i]+" ");
        }
        break;
        case 2:
        for (int i = 0; i<100; i++) {
            smallnum = Integer.max(array[i], smallnum);
        }
        for (int i = 0; i<100; i++) {
            System.out.print((array[i]==smallnum) ? "**"+array[i]+"** " : array[i]+" ");
        }
        break;
        default:
        break;
    }
    }
    
}
