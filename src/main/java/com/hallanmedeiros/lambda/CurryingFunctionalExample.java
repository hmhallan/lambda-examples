package com.hallanmedeiros.lambda;

import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class CurryingFunctionalExample {

	public int simpleSum( int first, int second ) {

		//interface funcional que representa uma operação em 2 inteiros
		IntBinaryOperator simpleAdd = (a, b) -> a + b;
		
		return simpleAdd.applyAsInt(first, second);
	}
	
	public int simpleSumCurried( int first, int second ) {
		
		//interface funcional que representa uma operação em um inteiro, e retorna uma função que faz uma
		//operação no segundo inteiro, através de currying
		IntFunction<IntUnaryOperator> curriedAdd = a -> b -> a + b;
		
		return curriedAdd.apply(first).applyAsInt(second);
	}
}
