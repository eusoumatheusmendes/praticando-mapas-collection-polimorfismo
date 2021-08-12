package br.com.mendesdeveloper.estudentbyte.model;

import br.com.mendesdeveloper.estudentbyte.services.Pagavel;

public class CalculadoraDeRetornoFinanceiroDosCursos {

    private double valorTotalComCursos;

    public void calcularValorObtidoComCursos(Pagavel pagavel){
        this.valorTotalComCursos += pagavel.getValor();
    }

    public double getValorTotalComCursos() {
        return valorTotalComCursos;
    }
}
