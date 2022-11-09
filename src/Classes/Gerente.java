package Classes;

public class Gerente extends Funcionario implements Descontos {

	

	@Override
	public void desconto_salario(double salario) {
		super.setSalario(salario - 0.015);
	}
}
