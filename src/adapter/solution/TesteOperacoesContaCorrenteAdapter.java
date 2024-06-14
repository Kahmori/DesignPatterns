package adapter.solution;

import java.math.BigDecimal;

import adapter.problem.ClientJarOperacoesContaCorrente;
import adapter.problem.JarOperacoesContaCorrente;
import adapter.solution.ClientJarOperacoesContaCorrenteAdapter;
import adapter.solution.JarOperacoesContaCorrenteAdapter;

public class TesteOperacoesContaCorrenteAdapter {

  public static void main(String[] args) {
    
    JarOperacoesContaCorrente jarOperacoesContaCorrente = new JarOperacoesContaCorrente();
    JarOperacoesContaCorrenteAdapter jarContaAdapter = new JarOperacoesContaCorrenteAdapter(jarOperacoesContaCorrente);
    ClientJarOperacoesContaCorrenteAdapter client = new ClientJarOperacoesContaCorrenteAdapter(jarContaAdapter);

    BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);

    
      client.saca(valorPretendidoParaSaque); // 1º chamada

    client.deposita(new BigDecimal(500)); // 2º chamada

  }
}
