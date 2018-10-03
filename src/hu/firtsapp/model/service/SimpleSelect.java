package hu.firtsapp.model.service;

import java.util.List;

public class SimpleSelect implements SimpleStrategy<Integer> {

	private final List<Integer> list;

	public SimpleSelect(List<Integer> list) {
		this.list = list;
	}

	@Override
	public Integer getResult(int denominator) {
		return list.stream().filter(i -> i % denominator == 0).findAny().get();
	}

}
