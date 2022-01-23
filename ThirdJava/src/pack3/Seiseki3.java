package pack3;

public class Seiseki3 {
	static String name;
	public void setName(String tName) {
		this.name=tName;
	}
	public static String getName() {
		return name;
	}
	public static int getGoukei(int tKokugo,int tSugaku,int tEigo) {
		return tKokugo+tSugaku+tEigo;
	}
}
