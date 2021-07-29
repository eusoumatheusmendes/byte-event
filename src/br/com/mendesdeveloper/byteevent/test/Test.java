package br.com.mendesdeveloper.byteevent.test;

import br.com.mendesdeveloper.byteevent.model.Event;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Event event1 = new Event();
        Event event2 = new Event();

        LocalDate agora = LocalDate.of(2022, 04, 9);
        LocalDateTime horarioAgora = LocalDateTime.now();

        event1.setData(agora);
        event1.setHorario(horarioAgora);
        event1.setDescricao("Aprofundando em Java");

        LocalDate agora2 = LocalDate.now();
        LocalDateTime horarioAgora2 = LocalDateTime.now();

        event2.setData(agora2);
        event2.setHorario(horarioAgora2);
        event2.setDescricao("Fundamentos Java");

        List<Event> eventos = new ArrayList<>();
        eventos.add(event1);
        eventos.add(event2);

        System.out.println("Antes da ordenação dos eventos por data mais próxima");
        for (Event event : eventos) {
            System.out.println(event);
        }

        System.out.println("Após ordenação dos eventos por data mais próxima");
        Collections.sort(eventos);
        for (Event event : eventos) {
            System.out.println(event);
        }

    }
}
