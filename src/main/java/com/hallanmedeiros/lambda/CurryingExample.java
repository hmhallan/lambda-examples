package com.hallanmedeiros.lambda;

import java.util.function.Function;

public class CurryingExample {
	
	public int simpleSum( int first, int second ) {
		Soma simpleAdd = (a, b) -> a + b;
		return simpleAdd.soma(first, second);
	}
	
	public int simpleSumCurried( int first, int second ) {
		SomaCurried curriedAdd = a ->  b -> a + b;
		return curriedAdd.soma(first).apply(second);
	}

}

@FunctionalInterface
interface Soma {
	int soma(int v1, int v2);
}

@FunctionalInterface
interface SomaCurried {
	Function<Integer, Integer> soma(int v1);
}