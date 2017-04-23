# kotlin-gradle-subplugin-example

```bash
# comment out classpath "com.github.hotchemi:gradle-subplugin-example:$kotlin_version"
$ ./gradlew clean plugin:uploadArchives
$ ./gradlew clean example:test
```

and you'll get:

```bash
ExampleKotlinGradleSubplugin loaded
ExampleKotlinGradleSubplugin loaded
ExampleKotlinGradleSubplugin loaded
ExampleKotlinGradleSubplugin loaded
:example:clean
:plugins:clean UP-TO-DATE
:example:compileKotlin
Using kotlin incremental compilation
e: java.util.ServiceConfigurationError: org.jetbrains.kotlin.compiler.plugin.ComponentRegistrar: Error reading configuration file
        at java.util.ServiceLoader.fail(ServiceLoader.java:232)
        at java.util.ServiceLoader.parse(ServiceLoader.java:309)
        at java.util.ServiceLoader.access$200(ServiceLoader.java:185)
        at java.util.ServiceLoader$LazyIterator.hasNextService(ServiceLoader.java:357)
        at java.util.ServiceLoader$LazyIterator.hasNext(ServiceLoader.java:393)
        at java.util.ServiceLoader$1.hasNext(ServiceLoader.java:474)
        at kotlin.collections.CollectionsKt___CollectionsKt.toCollection(_Collections.kt:1038)
        at kotlin.collections.CollectionsKt___CollectionsKt.toMutableList(_Collections.kt:1071)
        at org.jetbrains.kotlin.cli.jvm.PluginCliParser.loadPlugins(PluginCliParser.kt:41)
        at org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute(K2JVMCompiler.kt:72)
        at org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute(K2JVMCompiler.kt:55)
        at org.jetbrains.kotlin.cli.common.CLICompiler.exec(CLICompiler.java:191)
        at org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged(IncrementalJvmCompilerRunner.kt:443)
        at org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally(IncrementalJvmCompilerRunner.kt:304)
        at org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile(IncrementalJvmCompilerRunner.kt:128)
        at org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler(CompileServiceImpl.kt:454)
        at org.jetbrains.kotlin.daemon.CompileServiceImpl.access$execIncrementalCompiler(CompileServiceImpl.kt:95)
        at org.jetbrains.kotlin.daemon.CompileServiceImpl$compile$1$$special$$inlined$withIC$lambda$1.invoke(CompileServiceImpl.kt:381)
        at org.jetbrains.kotlin.daemon.CompileServiceImpl$compile$1$$special$$inlined$withIC$lambda$1.invoke(CompileServiceImpl.kt:95)
        at org.jetbrains.kotlin.daemon.CompileServiceImpl$doCompile$2$$special$$inlined$withValidClientOrSessionProxy$lambda$1.invoke(CompileServiceImpl.kt:750)
        at org.jetbrains.kotlin.daemon.CompileServiceImpl$doCompile$2$$special$$inlined$withValidClientOrSessionProxy$lambda$1.invoke(CompileServiceImpl.kt:95)
        at org.jetbrains.kotlin.daemon.common.DummyProfiler.withMeasure(PerfUtils.kt:137)
        at org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile(CompileServiceImpl.kt:777)
        at org.jetbrains.kotlin.daemon.CompileServiceImpl.access$checkedCompile(CompileServiceImpl.kt:95)
        at org.jetbrains.kotlin.daemon.CompileServiceImpl$doCompile$2.invoke(CompileServiceImpl.kt:749)
        at org.jetbrains.kotlin.daemon.CompileServiceImpl$doCompile$2.invoke(CompileServiceImpl.kt:95)
        at org.jetbrains.kotlin.daemon.CompileServiceImpl.ifAlive(CompileServiceImpl.kt:930)
        at org.jetbrains.kotlin.daemon.CompileServiceImpl.ifAlive$default(CompileServiceImpl.kt:817)
        at org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile(CompileServiceImpl.kt:743)
        at org.jetbrains.kotlin.daemon.CompileServiceImpl.access$doCompile(CompileServiceImpl.kt:95)
        at org.jetbrains.kotlin.daemon.CompileServiceImpl$compile$1.invoke(CompileServiceImpl.kt:380)
        at org.jetbrains.kotlin.daemon.CompileServiceImpl$compile$1.invoke(CompileServiceImpl.kt:95)
        at org.jetbrains.kotlin.daemon.CompileServiceImpl.ifAlive(CompileServiceImpl.kt:930)
        at org.jetbrains.kotlin.daemon.CompileServiceImpl.ifAlive$default(CompileServiceImpl.kt:817)
        at org.jetbrains.kotlin.daemon.CompileServiceImpl.compile(CompileServiceImpl.kt:339)
        at sun.reflect.GeneratedMethodAccessor67.invoke(Unknown Source)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at sun.rmi.server.UnicastServerRef.dispatch(UnicastServerRef.java:323)
        at sun.rmi.transport.Transport$1.run(Transport.java:200)
        at sun.rmi.transport.Transport$1.run(Transport.java:197)
        at java.security.AccessController.doPrivileged(Native Method)
        at sun.rmi.transport.Transport.serviceCall(Transport.java:196)
        at sun.rmi.transport.tcp.TCPTransport.handleMessages(TCPTransport.java:568)
        at sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run0(TCPTransport.java:826)
        at sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.lambda$run$0(TCPTransport.java:683)
        at java.security.AccessController.doPrivileged(Native Method)
        at sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run(TCPTransport.java:682)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
        at java.lang.Thread.run(Thread.java:745)
Caused by: java.io.FileNotFoundException: JAR entry META-INF/services/org.jetbrains.kotlin.compiler.plugin.ComponentRegistrar not found in /Users/hotchemi/.m2/repository/com/github/hotchemi/gradle-subplugin-example/1.1.1/gradle-subplugin-example-1.1.1.jar
        at sun.net.www.protocol.jar.JarURLConnection.connect(JarURLConnection.java:142)
        at sun.net.www.protocol.jar.JarURLConnection.getInputStream(JarURLConnection.java:150)
        at java.net.URL.openStream(URL.java:1045)
        at java.util.ServiceLoader.parse(ServiceLoader.java:304)
        ... 49 more

:example:compileKotlin FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':example:compileKotlin'.
> Compilation error. See log for more details

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output.

BUILD FAILED
```
