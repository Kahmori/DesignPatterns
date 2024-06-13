package proxy;

import builder.Pessoa;

public class PessoaServiceProxy {
  private PessoaRepositoryProxy pessoaRepositoryProxy;

  public PessoaServiceProxy(PessoaRepositoryProxy pessoaRepositoryProxy){
    this.pessoaRepositoryProxy = pessoaRepositoryProxy;
  }

  public void save(Pessoa pessoa) {
    pessoaRepositoryProxy.save(pessoa);
  }

  public Pessoa findById(Long id){
    return pessoaRepositoryProxy.findById(id);
  }
}
