
/* Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
entre 1 y 40 caracteres.*/
public class Ejercicio10 {
    public static void main(String[] args) {
        
        for(int i = 0;i<=10;i++){
        int longitud = (int)(Math.random()*41)+1;
        int caracter = (int)(Math.random()*7)+1;
        for(int n=i;n<=longitud;n++){
            switch(caracter){
                case 1:
                    System.out.print("*");
                        
                    break;

                case 2:
                    System.out.print("-");
                        
                    break;
                case 3:
                    System.out.print("=");
                        
                    break;
                case 4:
                    System.out.print(".");
                        
                    break;
                case 5:
                    System.out.print("|");
                        
                    break;
                case 6:
                    System.out.print("@");
        
                }
            }
            System.out.println();
        }
    }
}
