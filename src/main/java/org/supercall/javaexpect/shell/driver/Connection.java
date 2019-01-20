package org.supercall.javaexpect.shell.driver;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * 一个包含输入输出流的远程连接
 */
public interface Connection {
    void close();

    OutputStream getOutputStream();

    InputStream getInputStream();

    boolean isActive();
}
