import java.util.Scanner;

/*Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios. */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1;i<=20;i++){
            int num = (int)(Math.random()*11);
            System.out.print(num + " " );
        }
        sc.close();
    }
}
