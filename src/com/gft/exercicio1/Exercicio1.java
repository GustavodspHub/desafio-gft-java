package com.gft.exercicio1;

import java.util.Arrays;
import java.util.Optional;

import javax.swing.JOptionPane;

import com.gft.interfaces.interfaceExercicio1;

public class Exercicio1 implements interfaceExercicio1 {
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public int NumeroInverso(String numero) {
		
		 Optional<String> numeroInvertidoString = Arrays.stream(String.valueOf(numero).split("")).reduce((acumulator, curr) 
				-> curr+acumulator);

		 int numeroInvertido = Integer.parseInt(numeroInvertidoString.get());
		 
		return numeroInvertido;
	}
	
	
	
}
