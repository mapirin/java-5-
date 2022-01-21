package pack1;

public class Mondai1 {
	public static void main(String[] args) {
		int[] seiseki= {65,80,75,100,40};
		int goukei=0;
		int heikin=0;
		
		for(int i=0;i<seiseki.length;i++) {
			goukei+=seiseki[i];
		}
		heikin=goukei/seiseki.length;
		
		System.out.println("合計点は"+goukei+"です。");
		System.out.println("平均点は"+heikin+"です。");
	}
}
