package hu.firtsapp.model.service;

import java.util.List;
import java.util.Optional;

public class SimpleFind implements SimpleStrategy<Integer> {

	private final List<Integer> list;
	
	public SimpleFind(List<Integer> list) {
		this.list = list;
	}

	@Override
	public Integer getResult(int denominator) {
		Optional<Integer> find = list.stream().filter(i -> i % denominator == 0).findAny();
		return find.isPresent() ? find.get() : -1;
	}

}
