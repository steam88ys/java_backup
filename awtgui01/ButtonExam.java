package awtgui01;

import java.awt.*;

public class ButtonExam extends Frame{
	public ButtonExam() {
		super("��ư");
		Panel p = new Panel();	// Panel ��ü ����
		
		Button b1 = new Button();	// ��ư b1 ��ü����
		Button b2 = new Button("��ư2");
		// ��ư b2 ��ü�����ϰ� �̸�(Label)�� "��ư2"
		b1.setLabel("��ư1");	// ��ư b1��ü�� �̸�(Label) ����
		
		p.add(b1);
		p.add(b2);
		add(p);
		setLocation(200, 200);
		setSize(250, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonExam();	// �͸��� ��ü ����
		// PanelExam p = new PanelExam();
	}

}
