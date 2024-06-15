package templateMethod.solution;

import templateMethod.VeiculoParaReparo;

public class RepararVeiculoComumServiceComTemplate extends ReparoVeiculoService{

  private VeiculoParaReparo veiculoParaReparo;

  public RepararVeiculoComumServiceComTemplate(VeiculoParaReparo veiculoParaReparo){
    this.veiculoParaReparo = veiculoParaReparo;
  }

  @Override
  protected boolean veiculoParaReparo() {
    return veiculoParaReparo.getPorcentagemDano() <= 70;
  }

  
}
