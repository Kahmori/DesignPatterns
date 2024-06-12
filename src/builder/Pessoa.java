package builder;
import java.time.LocalDate;

public class Pessoa {

  private String nome;
    private String sobrenome;
    private String documento;
    private String email;
    private String apelido;
    private LocalDate dataNascimento;

    public Pessoa(String nome, String sobrenome, String documento, String email, String apelido, LocalDate dataNascimento){
      this.nome = nome;
      this.sobrenome = sobrenome;
      this.documento = documento;
      this.email = email;
      this.apelido = apelido;
      this.dataNascimento = dataNascimento;
    }

    public String getNome(){return nome;}
    public String getSobrenome(){return sobrenome;}
    public String getDocumento(){return documento;}
    public String getEmail(){return email;}
    public String getApelido(){return apelido;}
    public LocalDate getDataNascimento(){return dataNascimento;}

    @Override
    public String toString(){
      return "Pessoa{" +
              "nome='" + nome + '\'' +
              ", sobrenome=" + sobrenome + '\'' +
              ", documento=" + documento + '\'' +
              ", email=" + email + '\'' +
              ", apelido=" + apelido + '\'' +
              ", dataNascimento=" + dataNascimento + '\'' +
              '}';
    }

    public static void main(String[] args) {
     Pessoa pessoa1 = new PessoaBuilder()
          .nome("Felipe")
          .sobrenome("Feliciano")
          .documento("13128497X")
          .email("fefeliciano@gmail.com")
          .apelido("Fefe")
          .dataNascimento(LocalDate.of(1990, 4, 10))
          .criarPessoa();

          System.out.println(pessoa1); 
  }
}
