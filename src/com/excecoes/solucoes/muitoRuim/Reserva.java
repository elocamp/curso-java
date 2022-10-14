package com.excecoes.solucoes.muitoRuim;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    private Integer numeroQuarto;
    private Date dataChegada;
    private Date dataSaida;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva() {
    }

    public Reserva(Integer numeroQuarto, Date dataChegada, Date dataSaida) {
        this.numeroQuarto = numeroQuarto;
        this.dataChegada = dataChegada;
        this.dataSaida = dataSaida;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getDataChegada() {
        return dataChegada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public long duracao() {
        long diferenca = dataSaida.getTime() - dataChegada.getTime();
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }

    public void atualizarReserva(Date dataChegada, Date dataSaida) {
        this.dataChegada = dataChegada;
        this.dataSaida = dataSaida;
    }

    @Override
    public String toString() {
        return "Reserva - " +
                "Quarto: " + numeroQuarto +
                ", Check-in: " + sdf.format(dataChegada) +
                ", Check-out: " + sdf.format(dataSaida) +
                ", Duração: " +  duracao() +
                " noites";
    }
}
