package awtgui01;

import java.awt.*;

public class RadioCheckboxExam extends Frame{
	public RadioCheckboxExam() {
		super("������ư��");
		Panel p = new Panel();	// Panel ��ü ����
		
		CheckboxGroup g = new CheckboxGroup();	// üũ�ڽ��� �׷����� ����
		
		Checkbox ra1 = new Checkbox("����", g, true);	// ���õ� üũ�ڽ� ��ü ����
		Checkbox ra2 = new Checkbox("����", g, false);
		
		p.add(ra1);
		p.add(ra2);
		add(p);
		setSize(400, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RadioCheckboxExam();	// �͸��� ��ü ����
		// PanelExam p = new PanelExam();
	}

}
