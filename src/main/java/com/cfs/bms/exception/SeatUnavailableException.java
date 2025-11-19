package com.cfs.bms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SeatUnavailableException extends RuntimeException{

    public SeatUnavailableException(String message){

        super(message);
    }
}
