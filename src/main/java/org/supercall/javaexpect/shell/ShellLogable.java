package org.supercall.javaexpect.shell;

import org.supercall.javaexpect.shell.logger.ShellLogger;

/**
 *
 *
 */
interface ShellLogable {
    /**
     * 为每个Shell提供UID
     * @return
     */
    String getShellId();

    void log(String command, String result);

    ShellLogger getLogger();
}
