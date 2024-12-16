package Actividad;
import java.util.Random;
import java.util.Scanner;
public class MatrizApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
						System.out.println("fila = " + i + " Columna = " + j);
						encontrado = true;
					}else {
						System.out.println("fila = " + i + " Columna = " + j);
					}
				}
			}
		}
		
		if (!encontrado) {
			System.out.println("no se ha encontrado el número en la matriz");
		}
	}

}
