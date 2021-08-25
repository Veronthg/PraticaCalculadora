package com.teste.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		float a, b;

		System.out.println("Bem vindo a calculadora!");
		System.out.println("Informe o primeiro número: ");
		a = scan.nextInt();
		System.out.println("Informe o segundo número: ");
		b = scan.nextInt();
		
		//operações
		float soma = soma(a,b);
		float subtracao = subtracao(a,b);
		float multiplicacao = multiplicacao(a,b);
		float divisao = divisao(a,b);
		
		//saída
		System.out.println("soma:" + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("Divisão: " + divisao);
	}

	// Soma
	public static float soma(float a, float b) {
		return a + b;
	}

	// Subtração
	public static float subtracao(float a, float b) {
		return a - b;
	}

	// Multiplicação
	public static float multiplicacao(float a, float b) {
		return a * b;
	}

	// Divisão
	public static float divisao(float a, float b) {
		return a / b;
	}

}
