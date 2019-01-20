package org.supercall.javaexpect.shell.core;

/**
 * 一个用户登录的对象
 */
public class DefaultTarget implements Target {
    public DefaultTarget() {
        super();
    }

    public DefaultTarget(String host) {
        this.host = host;
    }

    /**
     * Shell ID
     */
    private String shellID;

    /**
     * IP或主机名
     */
    private String host;

    /**
     * 连接所使用的端口
     */
    private int port = INVALID_PORT;

    /**
     * 用户登录的信息
     */
    private String loginName;

    /**
     * 登录密码
     */
    private String loginPassword = "";

    /**
     * 远程登录提示
     */
    private String loginPrompt = ".*(>|\\$)";

    /**
     * 设置是否自动登录
     */
    private boolean autoLogin = false;

    /**
     * 设置在自动登录前是否发送空格字符
     */
    private boolean initialCR = false;

    /**
     * su: 切换账号所用的登录信息
     */
    private String suName;

    /**
     * 切换用户的密码
     */
    private String suPassword = "";

    /**
     * 切换用户的登录提示
     */
    private String suPrompt = ".*(>|\\$)";

    /**
     * 是否自动切换用户
     */
    private boolean autoSU = false;

    /**
     * 命令执行超时时间
     */
    private int commandTimeout = DEFAULT_COMMAND_TIMEOUT;

    /**
     * 使用登录的账号进行SU切换
     */
    private boolean suWithLoginShell = false;

    @Override
    public boolean isAutoLogin() {
        return autoLogin;
    }

    @Override
    public boolean isSUWithLoginShell() {
        return suWithLoginShell;
    }

    @Override
    public Target setSUWithLoginShell(boolean suWithLoginShell) {
        this.suWithLoginShell = suWithLoginShell;
        return this;
    }

    @Override
    public String getHost() {
        return host;
    }

    @Override
    public Target setHost(String host) {
        this.host = host;
        return this;
    }

    @Override
    public int getPort() {
        return port;
    }

    @Override
    public Target setPort(int port) {
        this.port = port;
        return this;
    }

    @Override
    public String getLoginName() {
        return loginName;
    }

    @Override
    public Target setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }

    @Override
    public String getLoginPassword() {
        return loginPassword;
    }

    @Override
    public Target setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
        return this;
    }

    @Override
    public String getLoginPrompt() {
        return loginPrompt;
    }

    @Override
    public Target setLoginPrompt(String loginPrompt) {
        this.loginPrompt = loginPrompt;
        return this;
    }

    @Override
    public Boolean getAutoLogin() {
        return autoLogin;
    }

    @Override
    public Target setAutoLogin(Boolean autoLogin) {
        this.autoLogin = autoLogin;
        return this;
    }

    @Override
    public boolean isInitialCR() {
        return initialCR;
    }

    @Override
    public Target setInitialCR(boolean initialCR) {
        this.initialCR = initialCR;
        return this;
    }

    @Override
    public String getSuName() {
        return suName;
    }

    @Override
    public Target setSuName(String suName) {
        this.suName = suName;
        return this;
    }

    @Override
    public String getSuPassword() {
        return suPassword;
    }

    @Override
    public Target setSuPassword(String suPassword) {
        this.suPassword = suPassword;
        return this;
    }

    @Override
    public String getSuPrompt() {
        return suPrompt;
    }

    @Override
    public Target setSuPrompt(String suPrompt) {
        this.suPrompt = suPrompt;
        return this;
    }

    @Override
    public boolean isAutoSU() {
        return autoSU;
    }

    @Override
    public Target setAutoSU(boolean autoSU) {
        this.autoSU = autoSU;
        return this;
    }

    @Override
    public int getCommandTimeout() {
        return commandTimeout;
    }

    @Override
    public Target setCommandTimeout(int commandTimeout) {
        this.commandTimeout = commandTimeout;
        return this;
    }

    @Override
    public boolean isInvalidPort() {
        return (port == INVALID_PORT);
    }

    /**
     * 设置后Shell会使用设置的用户名和密码进行登录 然后登录提示字符串
     *
     * @param loginName
     * @param loginPassword
     * @param shellPrompt   正则式可以参考 {@link java.lang.String#matches(String regex)}
     * @return Target itself
     */
    Target setAutoLogin(String loginName, String loginPassword,
                        String shellPrompt) {
        this.setAutoLogin(true);
        this.setLoginName(loginName);
        this.setLoginPassword(loginPassword);
        this.setLoginPrompt(shellPrompt);
        return this;
    }

    /**
     * 设置后Shell会su到提供的用户名下 然后等待提示字符串
     *
     * @param suName
     * @param suPassword
     * @param shellPrompt 可以参考 {@link java.lang.String#matches(String regex)}
     * @return Target itself
     */
    Target setAutoSU(String suName, String suPassword, String shellPrompt) {
        this.setSuName(suName);
        this.setSuPassword(suPassword);
        this.setSuPrompt(shellPrompt);
        this.setAutoSU(true);
        return this;
    }

    @Override
    public Target setShellID(String id) {
        this.shellID = id;
        return this;
    }

    @Override
    public String getShellID() {
        return shellID;
    }
}
