package Classes;

public class Funcionario {
	private String nome;
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void cadastrar(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

}
