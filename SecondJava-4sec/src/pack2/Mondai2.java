package pack2;

public class Mondai2 {
	public static void main(String[] args) {
		int[] seiseki= {65,80,75,100,40};
		int maxTensu=seiseki[0];
		
		for(int tensu:seiseki) {
			if(maxTensu<tensu) {
				maxTensu=tensu;
			}
		}
		System.out.println(maxTensu);
	}
}
