package br.com.mendesdeveloper.estudentbyte.model;

public class Estudante {

    private String nome;
    private String cpf;
    private int matricula;

    public Estudante(String nome, String cpf, int matricula){
        if(nome == null || cpf == null){
            throw new NullPointerException("Nome ou CPF não podem ser nulos!");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Estudante estudante = (Estudante) o;
        return this.cpf.equals(estudante.cpf);
    }

    @Override
    public int hashCode() {
        return this.cpf.hashCode();
    }

    public int getMatricula() {
        return matricula;
    }
}
