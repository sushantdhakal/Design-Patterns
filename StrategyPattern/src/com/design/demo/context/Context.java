package com.design.demo.context;

import com.design.demo.shape.Shape;

public class Context {
	
	Shape shape;
	
	public Context(Shape shape){
		this.shape = shape;	
	}
	
	public void drawContextShape(){
		this.shape.drawShape();
	}

}
