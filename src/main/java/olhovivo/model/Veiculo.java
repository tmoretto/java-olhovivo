package olhovivo.model;

public class Veiculo {

	private int p; //Prefixo do veículo 
	private boolean a; //Indica se o veículo é (true) ou não (false) acessível para pessoas com deficiência 
	private String ta; //Indica o horário universal (UTC) em que a localização foi capturada. Essa informação está no padrão ISO 8601 
	private Double py; //Informação de latitude da localização do veículo 
    private Double px; //Informação de longitude da localização do veículo
	
    public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	public boolean isA() {
		return a;
	}
	public void setA(boolean a) {
		this.a = a;
	}
	public String getTa() {
		return ta;
	}
	public void setTa(String ta) {
		this.ta = ta;
	}
	public Double getPy() {
		return py;
	}
	public void setPy(double py) {
		this.py = py;
	}
	public Double getPx() {
		return px;
	}
	public void setPx(double px) {
		this.px = px;
	}
    
}
