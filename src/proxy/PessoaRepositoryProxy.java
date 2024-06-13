package proxy;

import java.util.logging.Logger;

import builder.Pessoa;

public class PessoaRepositoryProxy extends PessoaRepository {

  private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());

  @Override
  public void save(Pessoa pessoa) {
    log.info("Iniciando chamada do método save...");
    super.save(pessoa);
    log.info("Chamada do método save finalizada.");
  }

  @Override
  public Pessoa findById(Long id) {
    log.info("Iniciando chamada do método findById...");
    Pessoa pessoa = super.findById(id);
    log.info("Chamada do método findById finalizada.");
    return pessoa;
  }
}
