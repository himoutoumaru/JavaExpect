package org.supercall.javaexpect.shell.logger;

public class DefaultShellLogger implements ShellLogger {

    @Override
    public void log(String lineIntestCase, String id, String command, String shellOutput) {
        if (shellOutput != null)
            System.out.print(shellOutput);
    }

}
