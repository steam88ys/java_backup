package awtgui01;

import java.awt.*;

public class v3 extends Frame{
	public v3() {
		super("üũ�ڽ���");
		Panel p = new Panel();	// Panel ��ü ����
		
		Checkbox ra1 = new Checkbox("��");	// ���õ� üũ�ڽ� ��ü ����
		Checkbox ra2 = new Checkbox("����");
		Checkbox ra3 = new Checkbox("����");
		Checkbox ra4 = new Checkbox("�ܿ�", true);
		
		p.add(ra1);
		p.add(ra2);
		p.add(ra3);
		p.add(ra4);
		add(p);
		setSize(400, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new v3();	// �͸��� ��ü ����
		// PanelExam p = new PanelExam();
	}

}
