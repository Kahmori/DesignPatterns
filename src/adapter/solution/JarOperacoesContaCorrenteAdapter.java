package adapter.solution;

import java.math.BigDecimal;

import adapter.problem.JarOperacoesContaCorrente;

public class JarOperacoesContaCorrenteAdapter {

  private JarOperacoesContaCorrente jarConta;

  public JarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrente jarConta){
    this.jarConta = jarConta;
  }

  public void saca(BigDecimal valorPretendido){
    if(jarConta.validaSaldo(valorPretendido)){
      jarConta.saca(valorPretendido);
    } else{
      throw new IllegalArgumentException("Valor para saque não permitido");
    }
  }

  public void deposita(BigDecimal valor){
    jarConta.deposita(valor);
  }
}
