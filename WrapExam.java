package package03;

public class WrapExaxm {

	public static void main(String[] args) {

		Integer wrapi = new Integer(100);
		Double wrapd = new Double(55.7);
		
		int i = 100;
		double d = 55.7;
		double di;
		di = d + i;
		System.out.println(di);
		System.out.println(Integer.toString(i) + Double.toString(d));
		// IntegerŬ������ �ִ� toString(i)�޼ҵ�� i���� ���ڿ��� �����ϴ� �޼ҵ��̴�.
		// DoubleŬ������ �ִ� toString(d)�޼ҵ�� d���� ���ڿ��� �����ϴ� �޼ҵ��̴�.
		// ���ڿ� + ���ڿ��� ���ڿ��̴�.
		
		System.out.println(wrapi.toString(i) + wrapd.toString(d));
		// wrapi�� Integer��ü�����̱� ������ toString(i)�� ����� �� �ְ� i���� ���ڿ��� ����
		// wrapd�� Integer��ü�����̱� ������ toString(d)�� ����� �� �ְ� d���� ���ڿ��� ����
		
	}

}
