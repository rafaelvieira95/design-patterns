package br.coder.course.gof.creational.prototype;

public abstract class ToyAbstract<T> implements Cloneable {

	public abstract String getDescription();
	
	public abstract ToyAbstract<T> clone();
}
