package pack2;

public class Mondai1 {
	public static void main(String[] args) {
		int[] seiseki= {65,80,75,100,40};
		int maxTensu;
		
		maxTensu=seiseki[0];
		
		for (int i=0;i<seiseki.length;i++) {
			if(maxTensu<seiseki[i]) {
				maxTensu=seiseki[i];
			}
		}
		System.out.println(maxTensu);
	}
}
