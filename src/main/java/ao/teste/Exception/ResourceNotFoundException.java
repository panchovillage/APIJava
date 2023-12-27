package ao.teste.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {


    /**
     * @param mensagem
     */
    public ResourceNotFoundException(String mensagem){
        super(mensagem);
    }
    

}
