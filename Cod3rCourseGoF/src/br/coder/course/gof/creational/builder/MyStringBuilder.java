package br.coder.course.gof.creational.builder;

import java.util.Arrays;

public class MyStringBuilder {

	private String [] string;
	private int index;
	
	public MyStringBuilder() {
		index= 0;
		this.string = new String[1024];
	}
	
	private void resize() {
	 this.string = Arrays.copyOf(this.string, this.string.length * 5);
	}
	
	public MyStringBuilder append(char [] a) {
		this.string[index] = a.toString();
		this.index++;
		if(this.index == this.string.length) {
			resize();
		}
		return this;
	}
	
	public MyStringBuilder append(String a) {
		this.string[index] = a.toString();
		this.index++;
		if(this.index == this.string.length) {
			resize();
		}
		return this;
	}
	
	public MyStringBuilder append(int a) {
		this.string[index] = Integer.toString(a);
		this.index++;
		if(this.index == this.string.length) {
			resize();
		}
		return this;
	}
	
	public String build() {
		new String(this.string.toString());
		return this.string.toString();
	}

	@Override
	public String toString() {
		
		return "MyStringBuilder [string=" + Arrays.toString(this.string) + "]";
	}
	
}
