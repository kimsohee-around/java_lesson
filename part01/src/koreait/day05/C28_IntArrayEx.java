package koreait.day05;

import java.util.Scanner;

//�ۼ��� : �趯��
public class C28_IntArrayEx {

	/*	1. int �迭ũ�� 5�� �����ϼ���. �̸��� nums
	 *  2. �迭 ����� ���� ����� �Է����� �����մϴ�.
	 *  ��
	 *  3. �Էµ� ���� �հ�, ����� ���մϴ�. -> �հ�� 2������ �Է¹޴� for�� �ȿ��� ���� �ۼ��ϼ���.
	 *  ��
	 *  4. �Էµ� ���� �ִ밪, �ּҰ��� ���ϴ� �޼ҵ带 ����ϴ�.
	 *  		�� maxOfArray , minOfArray : ���ڴ� int �迭 , ��ȯ������ int
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int[] nums = new int[5];
		
		
		int max = maxOfArray(nums);
		System.out.println("�迭 nums �ִ밪 max = " + max);
	}
	
	
	
	//1.max,min ������ ���� �迭�� 0�� ��Ұ����� �ʱ�ȭ �մϴ�.
	//2. �迭��� 1������ ��������ұ��� max,min�� ������� ���ؼ�  -> for��
	//3. max�� �װ����������� (min�� �װ����� ũ��) max(min) ���� �迭��Ұ����� �����մϴ�.
	//4. -> �񱳰� ������ ���� max,min ������ �˴ϴ�.
	
	public static int maxOfArray(int[] array) {
		int max=array[0];	//1.	
		for(int i=1;i<array.length;i++) {   //2.
			if(max < array[i])   //�񱳰��� max���� ũ�ٸ�
				max = array[i];
		}
		
		//����: ����� main ���� �����ų�� ���ϴ� �������� �ϴٷ� �մϴ�.
		return max;		//4.
	}
	
	
	

}
