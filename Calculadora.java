package com.teste.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		float a, b;

		System.out.println("Bem vindo a calculadora!");
		System.out.println("Informe o primeiro n�mero: ");
		a = scan.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		b = scan.nextInt();
		
		//opera��es
		float soma = soma(a,b);
		float subtracao = subtracao(a,b);
		float multiplicacao = multiplicacao(a,b);
		float divisao = divisao(a,b);
		
		//sa�da
		System.out.println("soma:" + soma);
		System.out.println("Subtra��o: " + subtracao);
		System.out.println("Multiplica��o: " + multiplicacao);
		System.out.println("Divis�o: " + divisao);
	}

	// Soma
	public static float soma(float a, float b) {
		return a + b;
	}

	// Subtra��o
	public static float subtracao(float a, float b) {
		return a - b;
	}

	// Multiplica��o
	public static float multiplicacao(float a, float b) {
		return a * b;
	}

	// Divis�o
	public static float divisao(float a, float b) {
		return a / b;
	}

}
