package org.supercall.javaexpect.shell;

import java.util.regex.Pattern;

public interface CommandResult {

    String getCommandResult();

    String getCommand();

    int getExitCode();

    /**
     * 断言结果是与给定正则式匹配的
     *
     * @throws NullPointerException 如果给定的正则式为null {@code null}.
     */
    CommandResult requireText(String expected);

    /**
     * 断言结果是与给定正则式匹配的
     *
     * @throws NullPointerException 如果给定的正则式为null {@code null}.
     */
    CommandResult requireText(Pattern pattern);

    /**
     * 断言结果与给定的编码匹配
     */
    CommandResult requireExitCode(int expected);
}
