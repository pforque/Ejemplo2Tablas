package es.studium.Ejemplo2Tablas;

import java.util.Scanner;

public class Ejemplo2Tablas
{
	public static void main(String[] args)
	{
		final int TAM = 5;
		Scanner teclado = new Scanner(System.in);
		int tabla[] = new int[TAM];
		int i;
		for(i=0; i<TAM; i++)
		{
			System.out.println("Dame el valor de tabla["+i+"]");
			tabla[i] = teclado.nextInt();
		}
		teclado.close();
		for(i=0; i<TAM; i++)
		{
			System.out.println(tabla[i]);
		}
	}
}