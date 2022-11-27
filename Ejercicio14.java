import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] colors = {"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"};
        String[] user = new String[8];
        String[] order = new String[8];
        int count = 0;
        boolean comp = false;
        for (int i = 0; i<8; i++) {
            System.out.print("Introduzca una palabra: ");
            user[i] = sc.nextLine();
        }
        for (int i = 0; i<8; i++) {
            System.out.print(user[i]+" ");
        }
        System.out.println();
        for (int i = 0; i<8; i++) {
            for (int j = 0; j<9; j++) {
                if (user[i].equals(colors[j])) {
                    order[count] = user[i];
                        count++;
                }
            }
            
        }
        for (int i = 0; i<8; i++) {
            for (int j = 0; j<9; j++) {
                if (user[i].equals(colors[j])) {
                    comp = true;
                } 
        }
        if (comp == false ) {
            order[count] = user[i];
            count++; }
            comp = false;
    }
    for (int i = 0; i<8; i++) {
        System.out.print(order[i]+" ");
    }
    }
}
