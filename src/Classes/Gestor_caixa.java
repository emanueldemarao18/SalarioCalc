package Classes;

public class Gestor_caixa extends Funcionario implements Descontos {

	@Override
	public void desconto_salario(double salario) {
		super.setSalario(salario-0.10);
	}
}
