package com.hallanmedeiros.lambda;

import java.util.List;
import java.util.stream.Collectors;

public class StreamingExample {

	public List<Integer> resolveAoQuadrado( List<Integer> lista ) {
		return lista.stream().map(t -> t * t).collect(Collectors.toList());
	}
	

}
