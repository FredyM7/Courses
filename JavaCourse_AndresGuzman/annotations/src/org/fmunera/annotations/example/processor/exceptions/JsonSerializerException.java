package org.fmunera.annotations.example.processor.exceptions;

public class JsonSerializerException extends RuntimeException {
    public JsonSerializerException(String message) {
        super(message);
    }
}
