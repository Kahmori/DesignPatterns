package templateMethod.solution;

import templateMethod.VeiculoParaReparo;

public class RepararVeiculoDeLuxoServiceComTemplate extends ReparoVeiculoService {

  private VeiculoParaReparo veiculoParaReparo;

  public RepararVeiculoDeLuxoServiceComTemplate(VeiculoParaReparo veiculoParaReparo){
    this.veiculoParaReparo = veiculoParaReparo;
  }

  @Override
  protected boolean veiculoParaReparo() {
    return veiculoParaReparo.getPorcentagemDano() <= 50;
  }

  
}
