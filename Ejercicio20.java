import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número total de nombres de reyes: ");
        int length = sc.nextInt();
        System.out.print("Vaya introduciendo los nombres de los reyes y pulsando INTRO.\n");
        String[] array = new String[length];
        for (int i=0; i<length; i++) {
            array[i] = sc.next();
        }
        System.out.print("\nLos reyes introducidos son:\n");
        for (int i=0; i<length; i++) {
            int count = 1;
            for (int j=0; j<i; j++) {
                if (array[j].equals(array[i])) {
                    count++;
                }
            }
            System.out.println(array[i]+" "+count+"º");
        }
    }
}
