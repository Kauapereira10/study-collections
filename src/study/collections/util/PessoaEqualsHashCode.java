package study.collections.util;

import java.util.Objects;

public class PessoaEqualsHashCode {
    private String cpf;   
    private String nome;
    private int idade;

    public PessoaEqualsHashCode(String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }   

    /**
     * Método equals: define quando dois objetos são "iguais"
     * 
     * Regras importantes:
     * 1️⃣ Se dois objetos são iguais pelo equals, eles devem ter o mesmo hashCode.
     * 2️⃣ equals deve ser reflexivo, simétrico e transitivo.
     */
    @Override
    public boolean equals(Object obj) {
        // 1️⃣ Verifica se é o mesmo objeto na memória
        if(this == obj) return true;

        // 2️⃣ Verifica se o objeto é null ou de classe diferente
        if(obj == null || getClass() != obj.getClass()) return false;

        // 3️⃣ Faz o casting para poder acessar atributos
        PessoaEqualsHashCode outro = (PessoaEqualsHashCode)obj;

        // 4️⃣ Compara apenas o CPF, que é único para cada pessoa
        return Objects.equals(this.cpf, outro.cpf);
    }

    /**
     * Método hashCode: gera um número inteiro baseado no objeto
     * 
     * Usado em coleções como HashSet e HashMap para otimizar buscas
     * Regra importante:
     * Se equals diz que dois objetos são iguais, eles devem ter o mesmo hashCode
     */
    @Override
    public int hashCode() {
        // Se CPF for null, retorna 0, senão retorna o hash do CPF
        return cpf == null ? 0 : this.cpf.hashCode();
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
}
