import java.util.Scanner;
/* Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir.*/
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 5;
        for(int i = 1;i<=5;i++){
        int n = (int)(Math.random()*101);
        System.out.println(n);
        System.out.println("El numero introducido es mayor o menor: ");
        String intento = sc.next();
        System.out.println("Te quedan " + cont + " oportunidades");
        cont--;
        }

        
        sc.close();
    }
}
