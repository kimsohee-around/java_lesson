package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		int max,min;
		
		//n1,n2,n3�� Ű���� �Է�(������Է�)
		System.out.print("n1 >>> ");
		n1 = sc.nextInt();
		System.out.print("n2 >>> ");
		n2 = sc.nextInt();
		System.out.print("n3 >>> ");
		n3 = sc.nextInt();
		System.out.printf("n1=%d\t n2=%d\t n3=%d\n",n1,n2,n3);
		
		//n1,n2,n3 �߿� �ִ밪 ���ϱ�
		if(n1>n2) {
			max = n1;		//max�� �ӽð�
			min = n2;
		}
		else {
			max = n2;      //max�� �ӽð�
			min = n1;
		}
		
		if(max<n3) max=n3;   //�ӽ� max ������ ���� 1�� n3 �� �� Ŭ����.
		if(min>n3) min=n3;		//�ӽ� min ������ ���� 1�� n3 �� �� ������.
		System.out.println("max =" + max + ",min=" + min);
	}
}
