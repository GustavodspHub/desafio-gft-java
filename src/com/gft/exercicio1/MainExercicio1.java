package com.gft.exercicio1;

import javax.swing.JOptionPane;

public class MainExercicio1 {
	public static void main(String[] args) {
		Exercicio1 inverteNumero = new Exercicio1();
		
				
		String numeroInicial = JOptionPane.showInputDialog("Insira o numero que você deseja inverter");
		
		System.out.println("O número invertido ficara assim: " + inverteNumero.NumeroInverso(numeroInicial));
	}
}
