package org.supercall.javaexpect.shell.exception;

public class CommandTimeoutException extends RuntimeException {

    public CommandTimeoutException(String string) {
        super(string);
    }

    private static final long serialVersionUID = -5931241291266067540L;

}
