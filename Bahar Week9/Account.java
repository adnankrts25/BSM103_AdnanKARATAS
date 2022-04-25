
public class Account {

	String isim;
	int para;
	
	public Account(String isim, int para) {
		this.isim=isim;
		this.para=para;
		
	}
	public String toString() {
		return isim+ ":$" +para;
		
	}
}
