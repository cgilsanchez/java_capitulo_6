import java.util.Scanner;
/* Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado.*/
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int numero=0;
        do{
            numero=(int)(Math.random()*100)+1;
            if(numero%2 !=0){
                numero++;
                System.out.println(numero);
                cont++;
            }else{
            System.out.println(numero);
            cont++;}

        }while(numero !=24);
        System.out.println("Se han generado "+cont+" numeros.");
        sc.close();
    }
}
