package olhovivo.model;

public class Parada {

	private int cp; //Código identificador da parada
	private String np; //Nome da parada
	private String ed; //Endereço de localização da parada
	private Double py; //Informação de latitude da localização da parada
	private Double px; //Informação de longitude da localização da parada
	
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getNp() {
		return np;
	}
	public void setNp(String np) {
		this.np = np;
	}
	public String getEd() {
		return ed;
	}
	public void setEd(String ed) {
		this.ed = ed;
	}
	public Double getPy() {
		return py;
	}
	public void setPy(Double py) {
		this.py = py;
	}
	public Double getPx() {
		return px;
	}
	public void setPx(Double px) {
		this.px = px;
	}
	
}
