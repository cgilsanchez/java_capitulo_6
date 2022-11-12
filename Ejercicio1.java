
import java.util.Scanner;
/*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados). */



public class Ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("La tirada de los tres dados son: ");
        int suma = 0;
        for (int i= 1;i<=3;i++){
            int numeros = (int)(Math.random()*3)+1;
            System.out.println(numeros);
            suma+=numeros;
        }
        sc.close();
        System.out.println("La suma total de los numeros es: ");
        System.out.println(suma);
    }
}