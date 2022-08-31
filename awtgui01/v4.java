package awtgui01;

import java.awt.*;

public class v4 extends Frame{
	public v4() {
		super("라디오버튼형");
		Panel p = new Panel();	// Panel 객체 생성
		
		CheckboxGroup g = new CheckboxGroup();	// 체크박스를 그룹으로 묶음
		
		Checkbox ra1 = new Checkbox("A형", g, true);	// 선택된 체크박스 객체 생성
		Checkbox ra2 = new Checkbox("B형", g, false);
		Checkbox ra3 = new Checkbox("O형", g, false);
		Checkbox ra4 = new Checkbox("AB형", g, false);
		
		p.add(ra1);
		p.add(ra2);
		p.add(ra3);
		p.add(ra4);
		add(p);
		setSize(400, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new v4();	// 익명의 객체 생성
		// PanelExam p = new PanelExam();
	}

}
