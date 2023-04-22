package com.nkh1987.rest_postgresql.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    /** Repeated from https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html for
     *  clarity:
     *  The serialization runtime associates with each serializable class a version number, called a serialVersionUID,
     *  which is used during deserialization to verify that the sender and receiver of a serialized object have loaded
     *  classes for that object that are compatible with respect to serialization. If the receiver has loaded a class
     *  for the object that has a different serialVersionUID than that of the corresponding sender's class, then
     *  deserialization will result in an InvalidClassException. A serializable class can declare its own
     *  serialVersionUID explicitly by declaring a field named serialVersionUID that must be static, final,
     *  and of type long*/
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
