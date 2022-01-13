package mvc.score.view;

import java.util.ArrayList;
// MVC Modeling �߿��� View(������)�� �ش��ϴ� Ŭ����: ���
import mvc.score.model.Student;

public class ScoreView {

	private ArrayList<Student> studentArrList;
	
	public ScoreView(ArrayList<Student> studentArrList) {
		this.studentArrList = studentArrList;
	}
	
	public void print() {
		System.out.println("============= MVC �𵨸��� ������� �� ���� ���α׷� =============");
		
		for(int i= 0; i<studentArrList.size(); i++) {
			Student s = studentArrList.get(i);
			int sum = calcSum(s);
			double avg = calcAvg(sum);
			System.out.printf("* ����: %s  �й�: %d  ����: %d  ����: %d  ����:  %d ����:  %d ����:  %d �հ�:  %d ���:  %.2f \n", 
								s.getName(), s.getStuId(), s.getKor(), s.getEng(), s.getMath(), s.getScience(), s.getHistory(), 
								sum, avg);
		}
	}
	
	public int calcSum (Student s) {	// �հ� �޼���
		int sum = s.getKor() + s.getEng() + s.getMath() + s.getScience() + s.getHistory();
		return sum;
	}
	
	public double calcAvg (int sum) {
		double avg = sum / 5.0;
		return avg;
	}
	
}
