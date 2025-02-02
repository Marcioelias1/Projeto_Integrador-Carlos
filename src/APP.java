import dao.*;
import domain.*;

import java.sql.*;

public class APP {
    public static void main(String[] args) {
        try {
            // Criar e inserir uma nova cidade
            Cidade cidade = new Cidade(11, "Rio de Janeiro", "-22.9068, -43.1729");
            CidadeDao cidadeDao = new CidadeDao();
            cidadeDao.inserir(cidade);
            System.out.println("Cidade inserida: " + cidade.getNomeCidade() + " (ID: " + cidade.getCodCidade() + ")");

            // Criar e inserir um novo cliente
            Cliente cliente = new Cliente(11, "808.808.808-80", "Marcos", "Rua Queiroz 333, Lisboa, Portugal", "(00)99999-9999", 
                                          "marcosProductOwner@ProductOwner.com", Date.valueOf("2001-01-01"), "MASCULINO");
            ClienteDao clienteDao = new ClienteDao();
            clienteDao.inserir(cliente);
            System.out.println("Cliente inserido: " + cliente.getNome() + " (ID: " + cliente.getCodCliente() + ")");

            // Criar e inserir um novo hotel
            Hotel hotel = new Hotel(11, "Praia de Copacabana, 200, Rio de Janeiro - RJ", "Copacabana", "4 estrelas",
                                    Time.valueOf("08:00:00"), Time.valueOf("12:00:00"), "Hotel com vista para a praia de Copacabana", cidade);
            HotelDao hotelDao = new HotelDao();
            hotelDao.inserir(hotel);
            System.out.println("Hotel inserido: " + hotel.getNomeHotel() + " (ID: " + hotel.getCodHotel() + ")");

            // Criar e inserir uma nova passagem
            Passagem passagem = new Passagem(11, 373.58, 
                                               null, null, null, cliente, cidade, cidade, 20);
            PassagemDao passagemDao = new PassagemDao();
            passagemDao.inserir(passagem);
            System.out.println("Passagem inserida: (Bilhete: " + passagem.getNumBilhete() + ")");

            // Criar e inserir uma nova hospedagem
            TipoHosp tipoHosp = new TipoHosp(5, 10, "Confortável");
            Hospedagem hospedagem = new Hospedagem(101, 101, 500.0, tipoHosp, hotel);
            HospedagemDao hospedagemDao = new HospedagemDao();
            hospedagemDao.inserir(hospedagem);
            System.out.println("Hospedagem inserida: (ID: " + hospedagem.getCodHospedagem() + ")");

            // Criar e inserir um ponto turístico
            PontosTuristicos pontoTuristico = new PontosTuristicos(11, "Praia de Copacabana, 100, Rio de Janeiro - RJ", 
                                                                    "Cristo Redentor", 5, "08:00 - 19:00", cidade);
            PontosTuristicosDao pontosTuristicosDao = new PontosTuristicosDao();
            pontosTuristicosDao.inserir(pontoTuristico);
            System.out.println("Ponto turístico inserido: " + pontoTuristico.getNomePontoTuristico() + " (ID: " + pontoTuristico.getCodPontoTuristico() + ")");

            // Criar e inserir a hospedagem do cliente
            HospCliente hospCliente = new HospCliente(11, 1200.0, Date.valueOf("2024-01-01"), 
                                                      Date.valueOf("2024-01-10"), 0, cliente, hospedagem);
            HospClienteDao hospClienteDao = new HospClienteDao();
            hospClienteDao.inserir(hospCliente);
            System.out.println("Hospedagem do cliente inserida: (ID: " + hospCliente.getCodClienteHospedagem() + ")");

            // Criar e inserir um voo
            Voo voo = new Voo(11, "AB123", "Companhia A", 
                          java.time.LocalDateTime.of(2024, 1, 10, 10, 0), 
                          java.time.LocalDateTime.of(2024, 1, 10, 12, 0), 
                          "Boeing 737", cidade.getCodCidade(), cidade.getCodCidade());
            VooDao vooDao = new VooDao();
            vooDao.inserir(voo);
            System.out.println("Voo inserido: " + voo.getPrefixoVoo() + " (ID: " + voo.getCodVoo() + ")");

            // Criar e inserir uma escala de voo
            EscalaVoo escalaVoo = new EscalaVoo(11, voo, passagem,  "12A");
            EscalaVooDao escalaVooDao = new EscalaVooDao();
            escalaVooDao.inserir(escalaVoo);
            System.out.println("Escala de voo inserida: (ID: " + escalaVoo.getCodEscala() + ")");

            // Criar e inserir um tipo de hospedagem
            TipoHospDao tipoHospDao = new TipoHospDao();
            tipoHospDao.inserir(tipoHosp);
            System.out.println("Tipo de hospedagem inserido: (ID: " + tipoHosp.getNumTipoHospedagem() + ")");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}