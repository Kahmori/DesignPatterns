package proxy;

import builder.Pessoa;

public interface ProxyPessoa {

  void save(Pessoa pessoa);

  Pessoa findById(Long id);
}
