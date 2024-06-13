package proxy;

import builder.Pessoa;

public class PessoaServiceProxy {
  private ProxyPessoa proxyPessoa;

  public PessoaServiceProxy(ProxyPessoa proxyPessoa){
    this.proxyPessoa = proxyPessoa;
  }

  public void save(Pessoa pessoa) {
    proxyPessoa.save(pessoa);
  }

  public Pessoa findById(Long id){
    return proxyPessoa.findById(id);
  }
}
