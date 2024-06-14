package strategy.solution;

import strategy.Funcionario;

public class ReajusteAnualSalarioComStrategy {

  void calculaReajusteAnual(Funcionario funcionario, CalculadorReajusteAnualSalario calculador){
    calculador.calcularReajusteAnual(funcionario);
  }
}
