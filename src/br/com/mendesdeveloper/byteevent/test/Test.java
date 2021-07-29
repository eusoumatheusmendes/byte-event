package br.com.mendesdeveloper.byteevent.test;

import br.com.mendesdeveloper.byteevent.model.Event;
import br.com.mendesdeveloper.byteevent.model.Participant;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Event event1 = new Event();
        Event event2 = new Event();
        List<Event> eventos = new ArrayList<>();

        LocalDate agora = LocalDate.of(2022, 04, 9);
        LocalDateTime horarioAgora = LocalDateTime.now();

        event1.setData(agora);
        event1.setHorario(horarioAgora);
        event1.setDescricao("Aprofundando em Java");
        event1.setQuantidadeDeVagas(2);

        LocalDate agora2 = LocalDate.now();
        LocalDateTime horarioAgora2 = LocalDateTime.now();

        event2.setData(agora2);
        event2.setHorario(horarioAgora2);
        event2.setDescricao("Fundamentos Java");

        eventos.add(event1);
        eventos.add(event2);

        Participant participant1 = new Participant();
        participant1.setNome("Matheus Mendes");
        participant1.setCpf("57689494");
        participant1.setEmail("emailteste@email.com");

        Participant participant2 = new Participant();
        participant2.setNome("Maria");
        participant2.setCpf("94857575");

        Participant participante3 = new Participant();
        participante3.setNome("Juliana");
        participante3.setCpf("09877");
        participante3.setEmail("emailteste@email.com");

        event1.inscrever(participant1);
        event1.inscrever(participant2);

        System.out.println(event1.getQuantidadeDeVagasDisponivel());

        List<Participant> participants = new ArrayList<>();
        participants.add(participant1);
        participants.add(participant2);

        //O método equals sobrescrito retorna true para participantes com o mesmo cpf ou e-mail
       boolean contem = participants.contains(participante3);
       System.out.println(contem);

       //Retornando os eventos baseando-se nas datas mais próximas
        //Conseguimos o resultado desejado em virtude da implementação da interface Comparable e consequentemente
        //a sobrescrita do método compareTo.
        Collections.sort(eventos);

        for (Event event : eventos) {
            System.out.println(event);
        }
    }
}
