package hu.firtsapp.model.service;

import java.util.List;

public class SimpleMax implements SimpleStrategy<Integer> {

	private final List<Integer> list;

	public SimpleMax(List<Integer> list) {
		this.list = list;
	}

	@Override
	public Integer getResult(int denominator) {
		return list.stream().mapToInt(i -> i).max().getAsInt();
	}

}
