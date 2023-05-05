opackage com.nkh1987.rest_postgresql.exception;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    /** This class extends an exception class, so if serialversionUID not provided compiler will give error. 
     *  More info in https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html for
     */
    // Typically a long random number
    private static final long serialVersionUID = 13297384567962L;

    public ResourceNotFoundException(String message) {
        // Pass message as argument to the supercalss, i.e. RuntimeException
        super(message);
        
    }
}
