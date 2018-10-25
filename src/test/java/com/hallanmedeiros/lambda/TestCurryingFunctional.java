package com.hallanmedeiros.lambda;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TestCurryingFunctional {
	
	@Test
	public void testa_soma_simples() {
		CurryingFunctionalExample example = new CurryingFunctionalExample();
		
		int result = example.simpleSum(12, 4);
		
		assertThat( result ).isEqualTo( 16 );
	}
	
	@Test
	public void testa_soma_curried() {
		CurryingFunctionalExample example = new CurryingFunctionalExample();
		
		int result = example.simpleSumCurried(12, 4);
		
		assertThat( result ).isEqualTo( 16 );
	}

}
