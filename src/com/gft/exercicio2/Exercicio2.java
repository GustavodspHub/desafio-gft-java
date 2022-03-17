package com.gft.exercicio2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;

import com.gft.interfaces.interfaceExercicio2;

public class Exercicio2 implements interfaceExercicio2{

	@Override
	public int[] ConversaoDeStringParaArray(String numerosInserido) {
        
        String[] separandoNumeros = numerosInserido.replaceAll(" ", ",").split(",");
        
        int[] intArray = new int[separandoNumeros.length];
        
        for (int i = 0; i < separandoNumeros.length; i++) {
            
        	intArray[i] = Integer.parseInt(separandoNumeros[i]);
            
        }
        
        
		 return intArray;
	}

	@Override
	public int somaDeTodosOsNumeros(int[] ConversaoDeStringParaArray) {
		
		/*Optional<int> sum = Arrays.stream(numbers).reduce((acumulator, current) -> acumulator+current);
	
		int sum = optSum.getAsInt();*/
		

        int soma = Arrays.stream(ConversaoDeStringParaArray).reduce(0,(a,b)->  a + b);

		return soma;
	}

	@Override
	public int buscarMaiorNumero(int[] arrayDeNumeros) {
		
		int maior = 0;
		
		for(int i = 1; i < arrayDeNumeros.length; i++) {
			if(arrayDeNumeros[i] > arrayDeNumeros[maior]) {
				maior = i;
			}
		}
		
		return maior;
	}

}
