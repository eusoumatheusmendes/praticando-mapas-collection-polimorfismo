package br.com.mendesdeveloper.estudentbyte.model;

public class Professor {

    private String nome;
    private String curriculo;

    public Professor(String nome, String curriculo){
        this.nome = nome;
        this.curriculo = curriculo;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", curriculo='" + curriculo + '\'' +
                '}';
    }


}
