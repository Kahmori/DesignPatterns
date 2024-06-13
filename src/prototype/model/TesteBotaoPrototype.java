package prototype.model;

import prototype.Botao;
import prototype.TipoBordaEnum;

public class TesteBotaoPrototype {

  public static void main(String[] args) {
    
    Botao botaoVermelho = BotaoRegistro.getBotao("BOTAO_VERMELHO");
    System.out.println(botaoVermelho.toString()); 

    Botao botaoVermelho2 = BotaoRegistro.getBotao("BOTAO_VERMELHO");
    botaoVermelho2.setLargura(200);
    System.out.println(botaoVermelho2.toString()); 

    Botao botaoVermelho3 = BotaoRegistro.getBotao("BOTAO_VERMELHO");
    System.out.println(botaoVermelho3.toString());
    
    String chave = "BOTAO_PRETO";
    Botao botaoPreto = new Botao();
    botaoPreto.setCor("Preto");
    botaoPreto.setAltura(50);
    botaoPreto.setLargura(300);
    botaoPreto.setTipoBorda(TipoBordaEnum.FINA);

    BotaoRegistro.addRegistro(chave, botaoPreto);

    Botao botaoPretoClone = BotaoRegistro.getBotao("BOTAO_PRETO");
    System.out.println(botaoPretoClone);

  }
}
