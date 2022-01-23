package pack3;

public class Mondai1 {
	public static void main(String[] args) {
		Seiseki3 s3=new Seiseki3();
		s3.setName("hayashi");
		System.out.println(Seiseki3.getName()+"さんの成績：");
		System.out.println("合計点は、"+Seiseki3.getGoukei(100,100,50)+"です");
	}
}
