public class Ejercicio4 {
    public static void main(String args[]) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        
        for (int i = 0; i<20; i++) {
            numero[i] = (int)(Math.random()*101);
        }
        for (int i = 0; i<20; i++) {
            cuadrado[i] = numero[i]*numero[i];
        }
        for (int i = 0; i<20; i++) {
            cubo[i] = numero[i]*numero[i]*numero[i];
        }
        System.out.printf("%-10s%-10s%-10s\n","Numero","Cuadrado","Cubo");
        for (int i = 0; i<20; i++) {
            System.out.printf("%-10d%-10d%-10d\n",numero[i],cuadrado[i],cubo[i]);
        }
        
    }
    
}
