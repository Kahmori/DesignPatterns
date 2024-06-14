package strategy.solution;

import java.math.BigDecimal;

import strategy.Funcionario;

public class CalculadorReajusteAnualSalarioPJ implements CalculadorReajusteAnualSalario {

  @Override
  public void calcularReajusteAnual(Funcionario funcionario) {
    BigDecimal salario = funcionario.getSalario();
    funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));
  }

}
