package goncalves.ribeiro.lucas;

import java.time.LocalDate;

public class Titulo {
    private double valor;
    private String descrição;
    private LocalDate dataDeVencimento; //Para guardar dados de data
    private double jurosAoDia;

    public Titulo(double valor, String descrição, String dataDeVencimento, double jurosAoDia) {
        this.valor = valor;
        this.descrição = descrição;
        this.dataDeVencimento = LocalDate.parse(dataDeVencimento);
        this.jurosAoDia = jurosAoDia;
    }

    public double totalParaPagar(){
        if (!estaAtrasada()){
            return this.valor;
        }else{
            return calcularjuros();
        }
    }

    private double calcularjuros() {
        return this.valor + this.valor * this.jurosAoDia * dataDeVencimento.until();
    }

    private boolean estaAtrasada() {
        return LocalDate.now().isAfter(dataDeVencimento);
    }
}
