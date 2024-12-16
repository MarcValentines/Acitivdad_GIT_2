package Actividad;
import java.util.Random;
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
			
	}
}
