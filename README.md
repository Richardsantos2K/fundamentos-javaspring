## Diagrama de Classes (Treino Poo, simulando um banco)

```mermaid
classDiagram
  class CadastroBanco {
    -String nome
    -String cpf
    -String numconta
    -int idade
    -boolean statusconta
    -float saldoconta
    -ArrayList<String> historicoTransacoes
    +String getNome()
    +void setNome(String nome)
    +String getCpf()
    +void setCpf(String cpf)
    +String getNumconta()
    +void setNumconta(String numconta)
    +int getIdade()
    +void setIdade(int idade)
    +boolean isStatusconta()
    +void setStatusconta(boolean statusconta)
    +float getSaldoconta()
    +void setSaldoconta(float saldoconta)
    +CadastroBanco()
    +void criarConta()
    +void excluirConta()
    +void exibirConta()
    +void sacar(float valorsacar)
    +void depositar(float valordepositar)
    +void depositarMultiplos(float[] valores)
    +void sacarMultiplos(float[] valores)
    +void exibirTrasacoes()
    +void exibirSaldo()
  }
