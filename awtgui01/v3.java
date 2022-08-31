package awtgui01;

import java.awt.*;

public class v3 extends Frame{
	public v3() {
		super("체크박스형");
		Panel p = new Panel();	// Panel 객체 생성
		
		Checkbox ra1 = new Checkbox("봄");	// 선택된 체크박스 객체 생성
		Checkbox ra2 = new Checkbox("여름");
		Checkbox ra3 = new Checkbox("가을");
		Checkbox ra4 = new Checkbox("겨울", true);
		
		p.add(ra1);
		p.add(ra2);
		p.add(ra3);
		p.add(ra4);
		add(p);
		setSize(400, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new v3();	// 익명의 객체 생성
		// PanelExam p = new PanelExam();
	}

}
