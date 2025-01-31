package main;

import domain.*;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class APP {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("808.808.808-80", "Marcos", "Rua Queiroz 333 Lisboa  Portugal", "(00)99999-9999", 
                                      "marcosProductOwner@ProductOwner.com", Date.valueOf("01/01/2001"), "MASCULINO");

        Cidade cidade = new Cidade("Rio de Janeiro", "-22.9068, -43.1729");

        Hotel hotel = new Hotel("Praia de Copacabana, 200, Rio de Janeiro - RJ", "Copacabana", "4 estrelas",
                                Time.valueOf("8:00:00"), Time.valueOf("12:00:00"), "Hotel com vista para a praia de Copacabana", 1); 

        Passagem passagem = new Passagem(373.58, Date.valueOf("2001-01-01"), 
                                          Date.valueOf("2001-01-10"), "Aeroporto de Carpintópolis", "Aeroporto de Pintortópolis", 1);

        AdquirePassagem adquirePassagem = new AdquirePassagem(Date.valueOf("Aeroporto de Pintortópolis"), 500.0, 20, 
                                                                cliente.getCod_cliente(), 1);
        List<Passagem> passagens = new ArrayList<>();
        passagens.add(passagem);
        adquirePassagem.setPassagens(passagens);

        Hospedagem hospedagem = new Hospedagem(9, 101, 500.0, 1, hotel.getCodHotel());

        PontosTuristicos pontoTuristico = new PontosTuristicos(1, "Praia de Copacabana, 100, Rio de Janeiro - RJ", 
                                                                "Cristo Redentro", 5, "08:00 - 19:00", 1);
        
        Voo voo = new Voo(1, 12345, 12, Date.valueOf("2024-12-01"), Date.valueOf("2001-01-01"), 
                          "São Paulo", "Rio de Janeiro", 1);

        TipoHospedagem tipoHospedagem = new TipoHospedagem(1, 1, "Standard");

        TipoPassagem tipoPassagem = new TipoPassagem("Econômica");

        EscalaVoo adquireVoo = new EscalaVoo(1, voo.getCodVoo());

        HospedagemCliente hospedagemCliente = new HospedagemCliente(1200.0, Date.valueOf("2001-01-01"), 
                                                                     Date.valueOf("2001-01-10"), 
                                                                     0, cliente.getCod_cliente(), hospedagem.getCodHospedagem());
        
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
        
        System.out.println("\nCidade: " + cidade.getNomeCidade());
        System.out.println("Coordenadas: " + cidade.getCoordenadas());
        
        System.out.println("\nHotel: " + hotel.getNomeHotel());
        System.out.println("Classificação: " + hotel.getClassificacaoHotel());
        
        System.out.println("\nPassagem: ");
        System.out.println("De: " + passagem.getLocal_ida() + " Para: " + passagem.getLocal_volta());
        System.out.println("Preço: " + passagem.getPreco());
        
        System.out.println("\nAquisição de Passagem:");
        System.out.println("Data: " + adquirePassagem.getDataAquisicao());
        System.out.println("Valor Pago: " + adquirePassagem.getValorPago());
        
        System.out.println("\nHospedagem:");
        System.out.println("Quarto Número: " + hospedagem.getNumQuarto());
        System.out.println("Preço: " + hospedagem.getPrecoQuarto());
        
        System.out.println("\nPonto Turístico: " + pontoTuristico.getNomeTuristico());
        System.out.println("Endereço: " + pontoTuristico.getEndereco());
        
        System.out.println("\nVoo:");
        System.out.println("Número do Voo: " + voo.getNumVoo());
        System.out.println("Embarque: " + voo.getLocalEmbarque());
        System.out.println("Desembarque: " + voo.getLocalDesembarque());
        
        System.out.println("\nTipo de Hospedagem: " + tipoHospedagem.getNivel_qualidade());
        System.out.println("Quantidade de Camas: " + tipoHospedagem.getQuantCamas());
        
        System.out.println("\nTipo de Passagem: " + tipoPassagem.getNomeTp());
        
        System.out.println("\nAquisição de Voo:");
        System.out.println("Código do Bilhete: " + adquireVoo.getCodBilhete());
        System.out.println("Código do Voo: " + adquireVoo.getCodVoo());
        
        System.out.println("\nHospedagem do Cliente:");
        System.out.println("Valor Pago: " + hospedagemCliente.getValorPago());
        System.out.println("Data Início: " + hospedagemCliente.getDataInicio());
        System.out.println("Data Término: " + hospedagemCliente.getDataTermino());
    }
}
