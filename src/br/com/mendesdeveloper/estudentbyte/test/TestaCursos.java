package br.com.mendesdeveloper.estudentbyte.test;

import br.com.mendesdeveloper.estudentbyte.model.CalculadoraDeRetornoFinanceiroDosCursos;
import br.com.mendesdeveloper.estudentbyte.model.Curso;
import br.com.mendesdeveloper.estudentbyte.model.Estudante;

public class TestaCursos {

    public static void main(String[] args) {

        Curso javaFundamentos = new Curso("Programação em Java I", 30, 2000);
        Curso javaIntermediario = new Curso("Programação em Java II", 25, 1500);
        Curso javaAvancado = new Curso("Programação em Java III", 40, 3000);

        Estudante priscila = new Estudante("Priscila", "4994949494", 10);
        Estudante ester = new Estudante("Ester", "8575757", 13);
        Estudante marcos = new Estudante("Marcos", "345575775", 20);

        javaFundamentos.matricular(priscila);
        javaIntermediario.matricular(marcos);
        javaAvancado.matricular(ester);

        CalculadoraDeRetornoFinanceiroDosCursos calculadora = new CalculadoraDeRetornoFinanceiroDosCursos();

        calculadora.calcularValorObtidoComCursos(javaAvancado);
        calculadora.calcularValorObtidoComCursos(javaFundamentos);
        calculadora.calcularValorObtidoComCursos(javaIntermediario);

        Estudante estudante = javaAvancado.pesquisarEstudantePorMatricula(13);

        System.out.println(estudante);

        System.out.println("Total obtido com os cursos: " +calculadora.getValorTotalComCursos());
    }
}
