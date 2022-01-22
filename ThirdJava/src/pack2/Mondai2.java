package pack2;

public class Mondai2 {
	public static void main(String[] args) {
		Seiseki2 s2=new Seiseki2("Yamada",100,100,100);
		String str2=s2.getName();
		System.out.println(str2+"さんの成績：");
		
		int i2=s2.getGoukei();
		System.out.println("合計は、"+i2+"点です");
	}
}
