package awtgui01;

import java.awt.*;

public class v4 extends Frame{
	public v4() {
		super("������ư��");
		Panel p = new Panel();	// Panel ��ü ����
		
		CheckboxGroup g = new CheckboxGroup();	// üũ�ڽ��� �׷����� ����
		
		Checkbox ra1 = new Checkbox("A��", g, true);	// ���õ� üũ�ڽ� ��ü ����
		Checkbox ra2 = new Checkbox("B��", g, false);
		Checkbox ra3 = new Checkbox("O��", g, false);
		Checkbox ra4 = new Checkbox("AB��", g, false);
		
		p.add(ra1);
		p.add(ra2);
		p.add(ra3);
		p.add(ra4);
		add(p);
		setSize(400, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new v4();	// �͸��� ��ü ����
		// PanelExam p = new PanelExam();
	}

}
