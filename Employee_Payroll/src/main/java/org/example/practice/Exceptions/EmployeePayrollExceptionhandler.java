package org.example.practice.Exceptions;

import lombok.extern.slf4j.Slf4j;

import org.example.practice.Model.Response;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.MethodNotAllowedException;

@ControllerAdvice
@Slf4j
public class EmployeePayrollExceptionhandler {
    private static final String message = "Exception while processing REST request";


    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> httpMessageNotReadableException(HttpMessageNotReadableException e) {
//        log.error("Invalid",e);
        Response response = new Response(message,"Should be in proper format");
        return new ResponseEntity<String>(response.toString(), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(MethodNotAllowedException.class)
    public ResponseEntity<String> methodNotAllowedException(MethodNotAllowedException e) {
//        log.error("Method not allowed",e);
        Response response = new Response(message,e.getMessage());
        return new ResponseEntity<>(response.toString(), HttpStatus.METHOD_NOT_ALLOWED);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> exception(Exception e) {
//        log.error("Exception",e);
        Response response = new Response(message,e.getMessage());
        return new ResponseEntity<>(response.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
