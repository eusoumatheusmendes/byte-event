package br.com.mendesdeveloper.byteevent.model;

public class Participant {

    private String nome;
    private String cpf;
    private String email;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object referencia) {
        Participant participante = (Participant) referencia;
        return this.cpf == participante.getCpf() || this.email == participante.getEmail();
    }
}
