package hu.firtsapp.model.service;

import java.util.List;

public class SimpleCount implements SimpleStrategy<Integer> {

	private final List<Integer> list;
	
	public SimpleCount(List<Integer> list) {
		this.list = list;
	}


	@Override
	public Integer getResult(int denominator) {
		return (int) list.stream().filter(i -> i % denominator == 0).count();
	}

}
