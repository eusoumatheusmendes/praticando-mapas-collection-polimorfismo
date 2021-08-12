package br.com.mendesdeveloper.estudentbyte.model;

import br.com.mendesdeveloper.estudentbyte.services.Pagavel;

import java.util.*;

public class Curso implements Pagavel {

    private String nome;
    private int cargaHoraria;
    private double valor;
    private Collection<Professor> professores;
    private Collection<Estudante> estudantes;
    private Map<Integer, Estudante> matriculaDevolveAluno;

    public Curso(String nome, int cargaHoraria, double valor){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.valor = valor;
        this.professores = new HashSet<>();
        this.estudantes = new HashSet<>();
        this.matriculaDevolveAluno = new LinkedHashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Collection<Estudante> getEstudantes() {
        return Collections.unmodifiableCollection(estudantes);
    }

    public Collection<Professor> getProfessores() {
        return Collections.unmodifiableCollection(professores);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Curso curso = (Curso) o;
        return this.nome.equals(curso.nome);
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

    public void matricular(Estudante estudante){
        this.estudantes.add(estudante);
        this.matriculaDevolveAluno.put(estudante.getMatricula(), estudante);
    }

    @Override
    public double getValor() {
        return this.estudantes.size() * this.valor;
    }

    public int getQuantidadeDeAlunosMatriculados(){
        return this.estudantes.size();
    }

    public Estudante pesquisarEstudantePorMatricula(int matricula){
         if(this.matriculaDevolveAluno.get(matricula) == null){
             throw new NullPointerException("Matrícula inexistente!");
         }
         return this.matriculaDevolveAluno.get(matricula);
    }
}
