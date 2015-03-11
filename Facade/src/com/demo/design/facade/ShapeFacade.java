package com.demo.design.facade;

import com.demo.design.complexApp.Circle;
import com.demo.design.complexApp.Shape;
import com.demo.design.complexApp.Square;

public class ShapeFacade {
	
	public Shape sq;
	public Shape circ;
	
	public ShapeFacade(){
		sq = new Square();
		circ = new Circle();
	}
	
	public void drawCircle(){
		circ.drawShape();
	}
	
	public void drawSquare(){
		sq.drawShape();
	}

}
