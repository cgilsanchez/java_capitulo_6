import java.util.Scanner;
/*Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secreto.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = (int)Math.random()*100;
        int numIntro = sc.nextInt();
        System.out.println(numIntro);
        for(int i = 1; i<=5;i++){
            if (n>numIntro){
                System.out.println("El numero introducido es menor que el numero secreto");
            }else {
                if (n<numIntro){
                    System.out.println("El numero introducido es mayor que el numero secreto");
                }
            }
        }
        sc.close();
    }
}

