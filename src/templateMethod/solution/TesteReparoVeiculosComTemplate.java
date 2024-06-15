package templateMethod.solution;

import templateMethod.VeiculoParaReparo;

public class TesteReparoVeiculosComTemplate {

  public static void main(String[] args) {
    System.out.println("----------------LUXO-----------------");
    VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
    veiculoDeLuxo.setPorcentagemDano(49);

    ReparoVeiculoService rpl = new RepararVeiculoDeLuxoServiceComTemplate(veiculoDeLuxo);

    rpl.reparaVeiculo();

    System.out.println("----------------COMUM-----------------");

    VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
    veiculoComum.setPorcentagemDano(71);

    ReparoVeiculoService rpc = new RepararVeiculoComumServiceComTemplate(veiculoComum);

    rpc.reparaVeiculo();
  }
}
