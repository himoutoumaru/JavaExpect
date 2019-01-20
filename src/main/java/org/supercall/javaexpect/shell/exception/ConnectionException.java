package org.supercall.javaexpect.shell.exception;

/**
 * 远程连接异常
 */
public class ConnectionException extends RuntimeException {

    public ConnectionException(String string) {
        super(string);
    }

    private static final long serialVersionUID = -73516638907418988L;

}
