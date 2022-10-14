package com.excecoes.solucoes.ruim;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Reserva de hotel");
            System.out.print("Número do quarto: ");
            Integer numQuarto = sc.nextInt(); sc.nextLine();

            System.out.print("Data de chegada (dd/MM/yyyy): ");
            Date dataChegada = sdf.parse(sc.next());

            System.out.print("Data de Saída (dd/MM/yyyy): ");
            Date dataSaida = sdf.parse(sc.next());

            Reserva reserva = new Reserva(numQuarto, dataChegada, dataSaida);
            System.out.println(reserva.toString());

            System.out.println("Atualização de reserva");
            System.out.print("Insira a nova data de chegada (dd/MM/yyyy): ");
            dataChegada = sdf.parse(sc.next());

            System.out.print("Insira a nova data de saída (dd/MM/yyyy): ");
            dataSaida = sdf.parse(sc.next());

            reserva.atualizarReserva(dataChegada, dataSaida);
            System.out.println("Nova " + reserva.toString());
        }
        catch (ParseException e) {
            System.out.println("Formato de data inválido.");;
        }
        catch (IllegalArgumentException e) {
            System.out.println("Erro na reserva: " + e.getMessage());
        }
        sc.close();
    }
}
