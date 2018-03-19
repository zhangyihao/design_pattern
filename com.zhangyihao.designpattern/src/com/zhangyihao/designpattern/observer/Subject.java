package com.zhangyihao.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer observer) {
		if(observer != null) {
			this.observers.add(observer);
		}
	}
	
	public void deleteObserver(Observer observer) {
		if(observer != null) {
			this.observers.remove(observer);
		}
	}
	
	public void notifyObservers() {
		for(Observer o : this.observers)  {
			o.update();
		}
	}
	
}
