package package03;

import java.util.StringTokenizer;

public class datavalueExam {

	public static void main(String[] args) {

		String Line;
		String tmpStr="hong ��걸 10.5 20.5";
		StringTokenizer parse = new StringTokenizer(tmpStr);
		// �⺻������ ��ū(������)�� �������� �����Ǿ� �ִ�.
		// StringTokenizer parse = new StringTokenizer(tmpStr);
		// StringTokenizer parse = new StringTokenizer(tmpStr, ",");
		// ��ū(������)�� ,�� �����ȴ�. �����͸� �и��Ҷ� ,�� ����
		String name;
		String address;
		double math;
		double english;
		double total;
		double avg;
		
		name = parse.nextToken();
		// parse�� "hong ��걸 10.5 20.5" ���ڿ����� hong�� ����Ų��.
		// "hong"���ڿ��� name�� ������ �Ŀ� parse�� "��걸" ���ڿ��� ����Ų��.
		address = parse.nextToken();
		// address�� "��걸"���ڿ��� ������ �Ŀ� parse�� 10.5�� ����Ų��.
		math = Double.valueOf(parse.nextToken()).doubleValue();
		// 1. parse.nextToken()�� "10.5"�� �̾Ƴ���, parse�� 20.5�� ����Ų��.
		// 2. Double.valueOf(parse.nextToken())�� "10.5"�� Wrapper�� �Ǽ������� ��ȯ
		// 3. .doubleValue();�� �⺻ �Ǽ���(double)���� ��ȯ
		// math = 10.5�� ����
		english = Double.valueOf(parse.nextToken()).doubleValue();
		// 1. parse.nextToken()�� "20.5"�� �̾Ƴ���, parse�� ��ū�� ���� ��ġ�� ����Ų��.
		// 2. Double.valueOf(parse.nextToken())�� "20.5"�� Wrapper�� �Ǽ������� ��ȯ
		// 3. .doubleValue();�� �⺻ �Ǽ���(double)���� ��ȯ
		// english = 20.5�� ����
		total = math + english;
		avg = total/2.0;
		
		System.out.println(name + "\t" + address + "\t" + math + "\t" + english + "\t" + total + "\t" + avg);
		
		
	}

}
