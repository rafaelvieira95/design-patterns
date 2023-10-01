package br.coder.course.gof.creational.prototype;

public class Toy<T> extends ToyAbstract<T>{

	public Toy() {
		super();
	}
	
	private String description;
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public ToyAbstract<T> clone() {
		// TODO Auto-generated method stub
		return new Toy<T>();
	}	
    
}
