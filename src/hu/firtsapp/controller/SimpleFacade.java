package hu.firtsapp.controller;

import java.util.List;

import hu.firtsapp.model.service.SequenceCalculator;
import hu.firtsapp.model.service.SimpleCondition;
import hu.firtsapp.model.service.SimpleCount;
import hu.firtsapp.model.service.SimpleFind;
import hu.firtsapp.model.service.SimpleMax;
import hu.firtsapp.model.service.SimpleSelect;
import hu.firtsapp.model.service.SimpleStrategy;

public class SimpleFacade {

	private final List<Integer> list;

	public SimpleFacade(List<Integer> list) {
		this.list = list;
	}

	public int getSequenceAdd() {
		SimpleStrategy<Integer> strategy = new SequenceCalculator(list);
		return strategy.getResult(0);
	}
	
	public boolean getCondition(int denominator) {
		SimpleStrategy<Boolean> strategy = new SimpleCondition(list);
		return strategy.getResult(denominator);
	}
	
	public int getSelected(int denominator) {
		SimpleStrategy<Integer> strategy = new SimpleSelect(list);
		return strategy.getResult(denominator);
	}
	
	public int getFound(int denominator) {
		SimpleStrategy<Integer> strategy = new SimpleFind(list);
		return strategy.getResult(denominator);
	}

	public int getCount(int denominator) {
		SimpleStrategy<Integer> strategy = new SimpleCount(list);
		return strategy.getResult(denominator);
	}

	public int getMax() {
		SimpleStrategy<Integer> strategy = new SimpleMax(list);
		return strategy.getResult(0);
	}

}
