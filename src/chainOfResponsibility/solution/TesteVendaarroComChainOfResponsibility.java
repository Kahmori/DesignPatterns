package chainOfResponsibility.solution;

import java.math.BigDecimal;

import chainOfResponsibility.Carro;
import chainOfResponsibility.Marca;

public class TesteVendaarroComChainOfResponsibility {

  public static void main(String[] args) {
    VendaCarroServiceComChainOfResponsibility vendaCarroService = new VendaCarroServiceComChainOfResponsibility();

    Carro carro1 = new Carro();
    carro1.setMarca(Marca.FORD);
    carro1.setModelo("Fusion");
    carro1.setPreco(new BigDecimal(90000.00));

    BigDecimal valorVenda1 = vendaCarroService.calculaValorVenda(carro1);
    System.out.println("Valor da venda Fusion: " + carro1.getPreco());
    System.out.println("Valor da venda Fusion com desconto: " + valorVenda1);

    Carro carro2 = new Carro();
    carro2.setMarca(Marca.FIAT);
    carro2.setModelo("UNO");
    carro2.setPreco(new BigDecimal(40000.00));

    BigDecimal valorVenda2 = vendaCarroService.calculaValorVenda(carro2);
    System.out.println("Valor da venda UNO: " + carro2.getPreco());
    System.out.println("Valor da venda UNO com desconto: " + valorVenda2);

    Carro carro3 = new Carro();
    carro3.setMarca(Marca.CHEVROLET);
    carro3.setModelo("Camaro");
    carro3.setPreco(new BigDecimal(200000.00));

    BigDecimal valorVenda3 = vendaCarroService.calculaValorVenda(carro3);
    System.out.println("Valor da venda Camaro: " + carro3.getPreco());
    System.out.println("Valor da venda Camaro com desconto: " + valorVenda3);
  }
}
