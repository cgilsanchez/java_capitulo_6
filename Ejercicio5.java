import java.util.Scanner;
/*Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números. */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maximo = 0;
        int minimo = 199;
        for (int i = 1;i<=50;i++){
            int num = (int)(Math.random()*100+100);
            System.out.println(num);
            if(num>maximo){
                maximo = num;
                    System.out.println(maximo);
                }
                if(num<minimo){
                    minimo=num;
                    System.out.println(minimo);
                }
        }
        
sc.close();
    }
}
