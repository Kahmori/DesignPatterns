package proxy;

import java.time.LocalDate;

import builder.Pessoa;
import builder.PessoaBuilder;

public class PessoaTesteProxy {
  public static void main(String[] args) {
    PessoaServiceProxy pessoaService = new PessoaServiceProxy(new PessoaRepositoryProxy());

    Pessoa pessoa = new PessoaBuilder()
          .nome("Felipe")
          .sobrenome("Feliciano")
          .documento("13128497X")
          .email("fefeliciano@gmail.com")
          .apelido("Fefe")
          .dataNascimento(LocalDate.of(1990, 4, 10))
          .criarPessoa();

          pessoaService.save(pessoa);

          Pessoa pessoaRetornada = pessoaService.findById(1L);
          System.out.println(pessoaRetornada);
  }
}
