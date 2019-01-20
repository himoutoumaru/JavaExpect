package org.supercall.javaexpect.shell.driver;

import org.supercall.javaexpect.shell.Shell;

/**
 * 一个用于登陆系统的驱动信息接口
 */
public interface ShellDriver {
    Shell open();

    ShellDriver setHost(String host);

    ShellDriver setPort(int port);

    ShellDriver setAutoLogin(String loginName, String loginPassword,
                             String shellPrompt);

    ShellDriver setAutoSU(String suName, String suPassword, String shellPrompt);

    ShellDriver setCommandTimeout(int timeout);

    ShellDriver setSendInitialCR(boolean sendInitialCR);
}
