package pack3;

public class Seiseki1 {
	private String name;
	private int kokugo;
	private int sugaku;
	private int eigo;
	
	Seiseki1(){
		name="Yamada";
		kokugo=100;
		sugaku=100;
		eigo=100;
	}
	public String getName() {
		return name;
	}
	public void printGoukei() {
		int goukei=this.kokugo+this.sugaku+this.eigo;
		System.out.println("合計は"+goukei+"点です");
	}
}
