package chainOfResponsibility.solution;

import java.math.BigDecimal;
import chainOfResponsibility.*;

public class VendaCarroServiceComChainOfResponsibility {

  public BigDecimal calculaValorVenda(Carro carro){
    DescontoCarro desconto = 
    new DescontoCarroFIAT(
      new DescontoCarroFORD(
        new DescontoCarroMaiorCemMil(
          new SemDesconto(null)
          )));

          return desconto.aplicaDesconto(carro);
  }
}
