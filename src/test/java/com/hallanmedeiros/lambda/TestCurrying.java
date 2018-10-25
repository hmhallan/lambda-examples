package com.hallanmedeiros.lambda;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TestCurrying {

	@Test
	public void testa_soma_simples() {
		CurryingExample example = new CurryingExample();
		
		int result = example.simpleSum(12, 4);
		
		assertThat( result ).isEqualTo( 16 );
	}
	
	@Test
	public void testa_soma_curried() {
		CurryingExample example = new CurryingExample();
		
		int result = example.simpleSumCurried(12, 4);
		
		assertThat( result ).isEqualTo( 16 );
	}
	
}
