package Main;

import com.design.demo.context.Context;
import com.design.demo.shape.Circle;

public class App {

	public static void main(String[] args) {
		Context ct = new Context(new Circle());
		ct.drawContextShape();
	}
}
