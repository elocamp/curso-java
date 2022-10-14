package model.excecoes.solucoes.boa;

import java.io.Serial;

public class BusinessException extends Exception{
    @Serial
    private static final long serialVersionUID = 1L;

    public BusinessException(String mensagem) {
        super(mensagem);
    }
}
