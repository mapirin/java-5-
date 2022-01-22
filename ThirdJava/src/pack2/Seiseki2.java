package pack2;

public class Seiseki2 {
	private String name;
	private int kokugo;
	private int sugaku;
	private int eigo;
	
	public Seiseki2(String tName,int tKokugo,int tSugaku,int tEigo) {
		name=tName;
		kokugo=tKokugo;
		sugaku=tSugaku;
		eigo=tEigo;
	}
	public String getName() {
		return name;
	}
	public int getGoukei() {
		return this.kokugo+this.sugaku+this.eigo;
	}
}
