package awtgui01;

import java.awt.*;

public class v2 extends Frame{
	public v2() {
		super("滚瓢");
		Panel p = new Panel();	// Panel 按眉 积己
		
		Button b1 = new Button("犬牢");
		Button b2 = new Button("秒家");
		Button b3 = new Button("昏力");
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		add(p);
		setSize(400, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new v2();	// 劳疙狼 按眉 积己
		// PanelExam p = new PanelExam();
	}

}
