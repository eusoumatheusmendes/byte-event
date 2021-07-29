package br.com.mendesdeveloper.byteevent.model;

import br.com.mendesdeveloper.byteevent.regras.VagaIndisponivelException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Event implements Comparable<Event>{

    private String descricao;
    private String local;
    private LocalDate data;
    private LocalDateTime horario;
    List<Participant> participantes;
    private int quantidadeDeVagas;
    private int totalDeInscritos;

    public Event(){
        this.participantes = new ArrayList<>();
    }

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

    public int getTotalDeInscritos() {
        return totalDeInscritos;
    }

    public int getQuantidadeDeVagas() {
        return quantidadeDeVagas;
    }

    public void setParticipantes(List<Participant> participantes) {
        this.participantes = participantes;
    }

    public void setQuantidadeDeVagas(int quantidadeDeVagas) {
        this.quantidadeDeVagas = quantidadeDeVagas;
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

    /**
     * Método equals sobrescrito para comparar eventos e retornar igualdade caso os eventos possuem
     * as mesmas datas e horários
     * @param referencia
     * @return
     */
    @Override
    public boolean equals(Object referencia) {
        Event evento = (Event) referencia;
        return this.horario == evento.getHorario() && this.local == evento.getLocal();
    }

    /**
     * Método sobrescrito da interface Comparable que faz a comparação dos eventos por suas
     * datas e, consequentemente, a lista de eventos pode ser retornada com base nos eventos com datas
     * mais próximas
     * @param event
     * @return
     */
    @Override
    public int compareTo(Event event) {
        return LocalDate.MIN.compareTo(event.getData());
    }

    public boolean haVagasDisponiveis(){
        if(this.quantidadeDeVagas <= this.totalDeInscritos){
            throw new VagaIndisponivelException("Este evento não possui mais vagas. " +
                    "Veja nossos outros eventos disponíveis.");
        }
        return true;
    }

    public void inscrever(Participant participant){
        this.haVagasDisponiveis();
        this.participantes.add(participant);
        this.totalDeInscritos++;
    }

    public int getQuantidadeDeVagasDisponivel(){
        return this.getQuantidadeDeVagas() - this.totalDeInscritos;
    }

    public List<Participant> getParticipantes() {
        return participantes;
    }
}
