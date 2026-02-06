package baby;

public class Baby {

	private String nome;
	private double peso;
	private boolean isMale;
	private int nBiberon;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public int getnBiberon() {
		return nBiberon;
	}

	public void setnBiberon(int nBiberon) {
		this.nBiberon = nBiberon;
	}

	@Override
	public String toString() {
		return "Baby [nome=" + nome + ", peso=" + peso + ", isMale=" + isMale + ", nBiberon=" + nBiberon + "]";
	}

	public int babyMangia() {
		nBiberon = (int) Math.random() * 10 + 1;
		peso = peso + nBiberon;
		return nBiberon;
	}

}
