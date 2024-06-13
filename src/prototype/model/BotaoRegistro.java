package prototype.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import prototype.Botao;
import prototype.TipoBordaEnum;

public class BotaoRegistro {

  private static BotaoRegistro botaoRegistro;

  private static Map<String, Botao> REGISTRY = new HashMap<>();

  static{
    Botao botaoAmarelo = new Botao();
    botaoAmarelo.setCor("Amarelo");
    botaoAmarelo.setAltura(40);
    botaoAmarelo.setLargura(100);
    botaoAmarelo.setTipoBorda(TipoBordaEnum.TRACEJADA);
    REGISTRY.put("BOTAO_AMARELO", botaoAmarelo);

    Botao botaoVermelho = new Botao();
    botaoVermelho.setCor("Vermelha");
    botaoVermelho.setAltura(30);
    botaoVermelho.setLargura(100);
    botaoVermelho.setTipoBorda(TipoBordaEnum.FINA);
    REGISTRY.put("BOTAO_VERMELHO", botaoVermelho);

    Botao botaoAzul = new Botao();
    botaoAzul.setCor("Azul");
    botaoAzul.setAltura(35);
    botaoAzul.setLargura(125);
    botaoAzul.setTipoBorda(TipoBordaEnum.TRACEJADA);
    REGISTRY.put("BOTAO_AZUL", botaoAzul);
  }

  public static BotaoRegistro getInstance(){
    if (Objects.isNull(botaoRegistro)) {
      botaoRegistro = new BotaoRegistro();
      return botaoRegistro;
    }

    return botaoRegistro;
  }

  public static Botao getBotao(String chave){
    return BotaoFactory.getInstance(REGISTRY.get(chave));
  }

  public static void addRegistro(String chave, Botao botao){
    REGISTRY.put(chave, botao);
  }
}
