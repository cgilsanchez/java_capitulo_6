public class Ejercicio19 {
    int numero;
    int minimoImpar = 200;
    int suma = 0;
    int maximoPar = 0;
    
    for (int i = 0; i < 50; i++) {
      numero = (int)(Math.random() * 301) - 100;
    
    System.out.print(numero + " ");
    
      if (numero % 2 == 0) { // el número es par
        if (numero > maximoPar) maximoPar = numero;
      } else { // el número es impar
        if (numero < minimoImpar) minimoImpar = numero;
    }
    
    suma += numero;
    }

    System.out.println("\nMáximo de los pares: " + maximoPar);
    System.out.println("Mínimo de los impares: " + minimoImpar);
    System.out.println("Media: " + suma / 50);
}
    