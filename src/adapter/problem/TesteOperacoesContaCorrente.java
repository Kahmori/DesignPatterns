package adapter.problem;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrente {

  public static void main(String[] args) {
    
    JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
    ClientJarOperacoesContaCorrente client = new ClientJarOperacoesContaCorrente(jarConta);

    BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);

    if(client.validaSaldo(valorPretendidoParaSaque)){ // 1º chamada
      client.saca(valorPretendidoParaSaque); // 2º chamada
    } 

    client.deposita(new BigDecimal(500)); // 3º chamada
  }
}
