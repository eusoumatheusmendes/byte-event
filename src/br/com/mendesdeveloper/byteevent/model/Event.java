package br.com.mendesdeveloper.byteevent.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Event {

    private String descricao;
    private String local;
    private LocalDate data;
    private LocalDateTime horario;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Event{" +
                "descricao='" + descricao + '\'' +
                ", local='" + local + '\'' +
                ", data=" + data +
                ", horario=" + horario +
                '}';
    }

    @Override
    public boolean equals(Object referencia) {
        Event evento = (Event) referencia;
        return this.horario == evento.getHorario() && this.local == evento.getLocal();
    }
}
