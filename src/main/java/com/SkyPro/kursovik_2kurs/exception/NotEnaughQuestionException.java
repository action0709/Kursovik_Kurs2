package com.SkyPro.kursovik_2kurs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NotEnaughQuestionException extends RuntimeException {
    public NotEnaughQuestionException() {
    }

    public NotEnaughQuestionException(String message) {
        super(message);
    }

    public NotEnaughQuestionException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnaughQuestionException(Throwable cause) {
        super(cause);
    }

    public NotEnaughQuestionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
