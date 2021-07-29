package br.com.mendesdeveloper.byteevent.test;

import br.com.mendesdeveloper.byteevent.model.Event;
import br.com.mendesdeveloper.byteevent.model.Participant;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Test {

    public static void main(String[] args) {

        Event event1 = new Event();
        Event event2 = new Event();

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

        Participant participant1 = new Participant();
        participant1.setNome("Matheus Mendes");
        participant1.setCpf("57689494");

        Participant participant2 = new Participant();
        participant2.setNome("Maria");
        participant2.setCpf("94857575");

        event1.inscrever(participant1);
        event1.inscrever(participant2);

        int quantidadeDeVagas = event1.getQuantidadeDeVagas();

        System.out.println(event1.getQuantidadeDeVagasDisponivel());
    }
}
