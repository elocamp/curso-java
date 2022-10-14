package com.excecoes.solucoes.muitoRuim;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Reserva de hotel");
        System.out.print("Número do quarto: ");
        Integer numQuarto = sc.nextInt(); sc.nextLine();

        System.out.print("Data de chegada (dd/MM/yyyy): ");
        Date dataChegada = sdf.parse(sc.next());

        System.out.print("Data de Saída (dd/MM/yyyy): ");
        Date dataSaida = sdf.parse(sc.next());

        if (!dataSaida.after(dataChegada)) {
            System.out.println("Erro na reserva: a data de saída não pode ser anterior à data de chegada");
        }
        else {
            Reserva reserva = new Reserva(numQuarto, dataChegada, dataSaida);
            System.out.println(reserva.toString());

            System.out.println("Atualização de reserva");
            System.out.print("Insira a nova data de chegada (dd/MM/yyyy): ");
            dataChegada = sdf.parse(sc.next());

            System.out.print("Insira a nova data de saída (dd/MM/yyyy): ");
            dataSaida = sdf.parse(sc.next());

            Date agora = new Date();

            if (dataChegada.before(agora) || (dataSaida.before(agora))) {
                System.out.println("Erro de atualização de reserva: as datas inseridas precisam ser futuras");
            }
            else {
                reserva.atualizarReserva(dataChegada, dataSaida);
                System.out.println("Nova " + reserva.toString());
            }
        }

        sc.close();
    }

}
