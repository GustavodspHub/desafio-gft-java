package com.gft.exercicio2;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MainExercicio2 {
	public static void main(String[] args) {
		
		Exercicio2 exercicio = new Exercicio2();
		
		String numeroInicial = JOptionPane.showInputDialog("Insira numeros separados por espaço");
		
		int[] numeroEmArray = exercicio.ConversaoDeStringParaArray(numeroInicial);
		
		int somaDosNumeros = exercicio.somaDeTodosOsNumeros(numeroEmArray);
		int maiorNumero = exercicio.buscarMaiorNumero(numeroEmArray);
		
		
		JOptionPane.showMessageDialog(null, "A soma dos numeros foi:  " + somaDosNumeros); 
		JOptionPane.showMessageDialog(null, "O maior numero que você enviou foi " + numeroEmArray);
		
		
	}
}
