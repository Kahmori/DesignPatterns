package chainOfResponsibility.solution;

import java.math.BigDecimal;

import chainOfResponsibility.Carro;

public class SemDesconto extends DescontoCarro{

  public SemDesconto(DescontoCarro proximoDesconto){
    super(proximoDesconto);
  }

  @Override
  public BigDecimal aplicaDesconto(Carro carro) {
    return BigDecimal.ZERO;
  }


}
