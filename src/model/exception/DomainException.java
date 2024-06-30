package model.exception;

import java.net.PortUnreachableException;

public class DomainException extends  Exception {
    private static final long serialVersionuid = 1l;

    public DomainException(String msg){
        super(msg);
    }

}
