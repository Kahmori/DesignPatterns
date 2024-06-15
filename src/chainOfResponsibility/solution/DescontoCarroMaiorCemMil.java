package chainOfResponsibility.solution;

import java.math.BigDecimal;

import chainOfResponsibility.Carro;

public class DescontoCarroMaiorCemMil extends DescontoCarro {

  public DescontoCarroMaiorCemMil(DescontoCarro proximoDesconto){
    super(proximoDesconto);
  }

  @Override
  public BigDecimal aplicaDesconto(Carro carro) {
    BigDecimal valorVenda = carro.getPreco();
    if (carro.getPreco().compareTo(new BigDecimal(100000.00)) > 0) {
      return valorVenda.subtract(new BigDecimal(10000));
    } 

    return proximoDesconto.aplicaDesconto(carro);
  }

}
