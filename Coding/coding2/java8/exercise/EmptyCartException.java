import javax.management.RuntimeMBeanException;

public class EmptyCartException extends RuntimeMBeanException{
    public EmptyCartException(String message) {
        super(message);
    }
}
