package koreait.day08;

public class Member{

	private String name;
	private String email;
	private	int age;
	private int level;
	
	//Ŀ���� ������ : name, email �ʵ� �ʱ�ȭ
	public Member(String name,String email) {	//() �ȿ��� �����Ҷ� ���޹��� ����
		this.name=name;	
		this.email=email;	
	}
	
	/*
	public Member(String name) {   //������ �޼ҵ� : Ÿ�԰� ���ڰ����� ������ ������ �Ǿ�� �޼ҵ� �����ε�
		this.name=name;
	}
	 */
	
	public Member(String email) {	//���� ���� : ���� �����ڿ� 2�� ���ÿ� ���ǵ� �� �����ϴ�.
		this.email=email;
	}
	
	//�⺻(default) ������ : ��¹� �߰�
	public Member() {	
		System.out.println("name,email,age,level �ʵ�� �⺻���Դϴ�.");
		System.out.println("name = " + this.name);  //this �� �޼ҵ带 �����ϴ� ��ü
		System.out.println("age = " + this.age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	

		
}
