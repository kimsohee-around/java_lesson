package koreait.day02;

public class C08_Test {
	//�ۼ��� : �趯��
	
	public static void main(String[] args) {
		
		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
		
		int width = 23;			//����ڰ� �Է��� ��
		int height = 19;		//����ڰ� �Է��� ��
		
		int box_area = width*height;
		System.out.println("���� : " + width + "��");
		System.out.println("���� : " + height + "��");
		System.out.println("���̸� ���߽��ϴ� : " + box_area + "�� ");
		
		System.out.println("\n[[�� ������ ���̿� �ѷ� ���ϱ�]]");
		final double PI = 3.14;
		double half = 23.23;		//����ڰ� �Է��� ��
		double round = 2 * PI * half;	//�ѷ�
		double circle_area = PI * half * half;	//����
		
		System.out.printf("������ : %.3f �� \n", half);
		System.out.printf("�ѷ��� ���߽��ϴ� : %.3f �� \n", round);
		System.out.printf("���̸� ���߽��ϴ� : %.3f	�� \n",circle_area);

		//final �׽�Ʈ 
		//		�������� �տ� final(������) Ű���带 ���̸� ���� �������� ���մϴ�.
		
		final int test = 123;			//���� ���� ���ϴ� ����Դϴ�.
		System.out.println("test =" + test);
		
		//test = 456;		//���� : final�� �����.
		
		
	}
}
