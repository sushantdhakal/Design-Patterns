package Main;

import com.demo.design.facade.ShapeFacade;

public class App {
	
	public static void main(String[]args){

		ShapeFacade sf = new ShapeFacade();
		sf.drawCircle();
	}

}
