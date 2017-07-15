package olhovivo.model;

public class LinhaLocalizada {

	private String c; //Letreiro completo 
	private int cl; //Código identificador da linha 
	private int sl; //Sentido de operação onde 1 significa de Terminal Principal para Terminal Secundário e 2 de Terminal Secundário para Terminal Principal 
	private String lt0; //Letreiro de destino da linha 
	private String lt1; //Letreiro de origem da linha 
	private int qv; //Quantidade de veículos localizados 
	private Veiculo[] vs; //Veículos localizados
	
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public int getCl() {
		return cl;
	}
	public void setCl(int cl) {
		this.cl = cl;
	}
	public int getSl() {
		return sl;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}
	public String getLt0() {
		return lt0;
	}
	public void setLt0(String lt0) {
		this.lt0 = lt0;
	}
	public String getLt1() {
		return lt1;
	}
	public void setLt1(String lt1) {
		this.lt1 = lt1;
	}
	public int getQv() {
		return qv;
	}
	public void setQv(int qv) {
		this.qv = qv;
	}
	public Veiculo[] getVs() {
		return vs;
	}
	public void setVs(Veiculo[] vs) {
		this.vs = vs;
	}

}
