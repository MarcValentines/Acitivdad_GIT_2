package Actividad;
import java.util.Random;
import java.util.Scanner;
public class MatrizApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// Apartado de la Matriz-Inicial ( Carlos )
		
		Random numAL = new Random ();
		
		int [][] matriz_inicial = new int [5][5];
		
		System.out.println("Esta es la matriz inicial con los Numeros Aleatorios: ");
		
		System.out.println();
		
		for (int i = 0; i < matriz_inicial.length; i++) {
			for (int j = 0; j < matriz_inicial[i].length; j++) {
				
				matriz_inicial[i][j] = numAL.nextInt(100) +1;
				
				System.out.print(matriz_inicial[i][j] + "\t");
				
				
			}
			System.out.println();
		}
		
		//buscar un numero en la matriz (marc)
		Scanner entradaTec = new Scanner(System.in);
		
		boolean encontrado = false;
		
		System.out.println("Escribe un numero para encontrarlo dentro de la matriz = ");
		int numAencontrar = entradaTec.nextInt();
		
		int vecesEncontrado = 0;
		
		for (int i = 0; i < matriz_inicial.length; i++) {
			for (int j = 0; j < matriz_inicial.length; j++) {
				if (matriz_inicial[i][j] == numAencontrar) {
					if (vecesEncontrado == 0) {
						System.out.println("El número se encuentra en la matriz !!");
						System.out.println("fila = " + (i+1) + " Columna = " + (j+1));
						encontrado = true;
						vecesEncontrado++;
					}else {
						System.out.println("fila = " + (i+1) + " Columna = " + (j+1));
						vecesEncontrado++;
					}
				}
			}
		}
		
		if (!encontrado) {
			System.out.println("no se ha encontrado el número en la matriz");
		} else {
			System.out.println("Ha sido encontrado " + vecesEncontrado + " veces dento de la matriz");
		}
	}
}
