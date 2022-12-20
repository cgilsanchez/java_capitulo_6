import java.util.Scanner;
/* Modifica el programa anterior para que la probabilidad de que salga un 1 sea
de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.*/
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    int resultadoPartido;
    int columnas = 3;
    
    for (int fila = 1; fila <= 14; fila++) {
        System.out.printf("%2d. |", fila);

        for (int apuesta = 1; apuesta <= columnas; apuesta++) {
          resultadoPartido = (int)(Math.random() * 6) + 1;
        switch(resultadoPartido) {
            case 1:
            System.out.print("1  |");
            break;

            case 2:
            System.out.print("  2|");
            break;
            
            case 3:
            System.out.print(" X |");
            break;
            case 4:
            System.out.println("1  |");
            break;
            case 5:
            System.out.println("1  |");
            break;
            case 6:
            System.out.print(" X |");

            default:
        }
        }
        System.out.println();
    }sc.close();
    

    
    System.out.print("\nPLENO AL 15 - Local...");
      int goles = (int)(Math.random() * 4);
    System.out.print(goles < 3 ? goles : "M");
    
    System.out.print("   Visitante...");
      goles = (int)(Math.random() * 4);
    System.out.print(goles < 3 ? goles : "M");
    }
}

    
