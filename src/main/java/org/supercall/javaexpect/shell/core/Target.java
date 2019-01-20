package org.supercall.javaexpect.shell.core;

/**
 * 远程连接的目标对象，
 * 存储了所有的用户登录信息
 */

public interface Target {

    /**
     * 默认的命令执行超时时间
     */
    int DEFAULT_COMMAND_TIMEOUT = 300;
    int INVALID_PORT = -1;

    /**
     * 是否自动登录
     *
     * @return
     */
    boolean isAutoLogin();

    /**
     * @see #setSUWithLoginShell(boolean)
     */
    boolean isSUWithLoginShell();

    /**
     * @param suWithLoginShell 是否使用登录的Shell执行
     *                         如果为True, 则su的命令如下
     *                         <code>su - [user]</code>
     *                         否则
     *                         <code>su [user]</code>
     */
    Target setSUWithLoginShell(boolean suWithLoginShell);

    String getHost();

    Target setHost(String host);

    int getPort();

    Target setPort(int port);

    String getLoginName();

    Target setLoginName(String loginName);

    String getLoginPassword();

    Target setLoginPassword(String loginPassword);

    String getLoginPrompt();

    Target setLoginPrompt(String loginPrompt);

    Boolean getAutoLogin();

    Target setAutoLogin(Boolean autoLogin);

    boolean isInitialCR();

    Target setInitialCR(boolean initialCR);

    String getSuName();

    Target setSuName(String suName);

    String getSuPassword();

    Target setSuPassword(String suPassword);

    String getSuPrompt();

    Target setSuPrompt(String suPrompt);

    boolean isAutoSU();

    Target setAutoSU(boolean autoSU);

    int getCommandTimeout();

    Target setCommandTimeout(int commandTimeout);

    boolean isInvalidPort();

    Target setShellID(String id);

    String getShellID();
}
