package hu.firtsapp.model.service;

import java.util.List;

public class SimpleCondition implements SimpleStrategy<Boolean> {

	private final List<Integer> list;

	public SimpleCondition(List<Integer> list) {
		this.list = list;
	}

	@Override
	public Boolean getResult(int denominator) {
		return list.stream().anyMatch(i -> i % denominator == 0);
	}

}
