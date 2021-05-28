package br.com.zupacademy.romeu.transacao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ControllerExceptionHandler {

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<List<ErroPadrao>> handle(MethodArgumentNotValidException methodArgumentNotValidException) {
    List<ErroPadrao> listaDeErros = new ArrayList<>();
    BindingResult bindingResult = methodArgumentNotValidException.getBindingResult();

    List<FieldError> fieldErrors = bindingResult.getFieldErrors();
    fieldErrors.forEach(fieldError -> {
      ErroPadrao erro = new ErroPadrao(fieldError.getField(), fieldError.getDefaultMessage());
      listaDeErros.add(erro);
    });

    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(listaDeErros);
  }

  @ExceptionHandler(ApiException.class)
  protected ResponseEntity<?> handle(ApiException ex) {
    ErroPadrao erro = new ErroPadrao(ex.getCampo(), ex.getMessage());
    HttpStatus httpStatus = ex.getHttpStatus();
    return ResponseEntity.status(httpStatus).body(erro);
  }
}
