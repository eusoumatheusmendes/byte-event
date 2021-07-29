package br.com.mendesdeveloper.byteevent.regras;

public class VagaIndisponivelException extends RuntimeException {
    public VagaIndisponivelException(String mensagem) {
        super(mensagem);
    }
}
