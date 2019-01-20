# JavaExpect
使用Java实现的SSH/Telnet远程执行命令的lib库

* 支持SSH远程执行命令
* 支持SSH到目标主机后执行su，切换到其他账户

使用示例

```
Target defaultTaget = new DefaultTarget("xx.xx.xx.xx");
defaultTaget.setLoginName("xx");
defaultTaget.setLoginPassword("xx");
SshDriver sshDriver = new SshDriver(defaultTaget);
Shell shell = sshDriver.open();
shell.execute("ps -ef");
```

