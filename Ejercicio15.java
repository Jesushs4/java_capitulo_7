import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int clients;
        int[] tables = {3,2,0,2,4,1,0,2,1,1};
        int arraysize = tables.length;
        
        do {
            System.out.print("---------------------------------------------------------------\n| Mesa nº   ");
            for (int i = 0; i<10; i++) {
                System.out.printf("|%3d ",i+1);
            } System.out.printf("|\n---------------------------------------------------------------\n| Ocupación ");
            for (int i = 0; i<10; i++) {
                System.out.printf("|%3d ",tables[i]);
            } System.out.printf("|\n---------------------------------------------------------------\n");
            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            clients = sc.nextInt();
            int i = 0;
            boolean foundtable = false;
            if (clients!=-1) {
            if (clients>4) {
                System.out.printf("Lo siento, no admitimos grupos de %d, haga grupos de 4 personas como máximo e intente de nuevo\n",clients);
            } else {
            do {
                if (tables[i]==0) {
                    System.out.printf("Por favor, sientese en la mesa %d\n",i+1);
                    tables[i]+=clients;
                    foundtable = true;
                }
                else if (tables[i]+clients<=4) {
                    tables[i]+=clients;
                    System.out.printf("Tendrán que compartir mesa, sientese en la mesa %d\n",i+1);
                    foundtable = true;
                }
            i++;
            } while (arraysize>i && foundtable==false);
            if (foundtable == false) {
                System.out.printf("Lo siento, en estos momentos no quedas sitio\n");
            }
        }
    }
        } while (clients!=-1); 
            
    }
    
}
