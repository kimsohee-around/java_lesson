package koreait.test0;
//�ۼ��� ������
public class Bike extends Product{
	//e	
	private int speed;
	
	//f
	public Bike() {
	}
	public Bike(int price,String prdName ,int speed) {
		this.price=price;
		this.prdName=prdName;
		this.speed=speed;
	}
	
	//d
	@Override
	public String sell(Object obj) {
		return String.format("�߰� ���� ��� - %d %% ����", obj);
	}
	
	//e
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//g
	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" +price + ", prdName=" + prdName + "]";
	}
	//�ν��Ͻ� �޼ҵ�
	public String ride () {
		return "����� �̰��� �ü� " + this.speed + "km �� Ż���ֽ��ϴ� ";
	}
}










