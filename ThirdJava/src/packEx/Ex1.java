package packEx;

public class Ex1 {
	public int getSum() {
		int sum=1+2+3;
		return sum;
	}
	public void dateResist() {
		System.out.println("RESIST");
	}
	
	public static void main(String[] args) {
		Ex1 e=new Ex1();
		System.out.println(e.getSum());
	}
}
