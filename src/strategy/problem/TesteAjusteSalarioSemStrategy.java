package strategy.problem;

import java.math.BigDecimal;

import strategy.Funcionario;
import strategy.TipoContratacaoEnum;

public class TesteAjusteSalarioSemStrategy {

  public static void main(String[] args) {
    ReajusteAnualSalario reajusteAnualSalario = new ReajusteAnualSalario();
    Funcionario funcionarioCLT = new Funcionario();
    funcionarioCLT.setNome("Victor");
    funcionarioCLT.setTipoContratacao(TipoContratacaoEnum.CLT);
    funcionarioCLT.setSalario(new BigDecimal(5000));

    Funcionario funcionarioPJ = new Funcionario();
    funcionarioPJ.setNome("Augusto");
    funcionarioPJ.setTipoContratacao(TipoContratacaoEnum.PJ);
    funcionarioPJ.setSalario(new BigDecimal(10000));

    Funcionario funcionarioESTAGIO = new Funcionario();
    funcionarioESTAGIO.setNome("Osvaldo");
    funcionarioESTAGIO.setTipoContratacao(TipoContratacaoEnum.ESTAGIO);
    funcionarioESTAGIO.setSalario(new BigDecimal(2000));

    reajusteAnualSalario.calculaReajusteAnual(funcionarioCLT);
    reajusteAnualSalario.calculaReajusteAnual(funcionarioPJ);
    reajusteAnualSalario.calculaReajusteAnual(funcionarioESTAGIO);

    System.out.println(funcionarioCLT.getSalario());
    System.out.println(funcionarioPJ.getSalario());
    System.out.println(funcionarioESTAGIO.getSalario());
  }
}
