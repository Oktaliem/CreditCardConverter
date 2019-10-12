# CreditCardConverter

## Test Output Log
<details>
<summary>
CLICK ME
</summary>
<p>
 
```maven
"C:\Program Files\Java\jdk1.8.0_161\bin\java" -agentlib:jdwp=transport=dt_socket,address=127.0.0.1:27567,suspend=y,server=n -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:C:\Users\User\.IdeaIC2018.1\system\captureAgent\debugger-agent.jar=file:/C:/Users/User/AppData/Local/Temp/capture.props -Dfile.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2018.1\lib\idea_rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2018.1\plugins\junit\lib\junit-rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2018.1\plugins\junit\lib\junit5-rt.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\rt.jar;C:\Users\User\Documents\GitHub\CreditCardConverter\target\test-classes;C:\Users\User\Documents\GitHub\CreditCardConverter\target\classes;C:\Users\User\.m2\repository\junit\junit\4.12\junit-4.12.jar;C:\Users\User\.m2\repository\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar" com.intellij.rt.execution.junit.JUnitStarter -ideVersion5 -junit4 com.test.application.test.CreditCardMaskTest
Connected to the target VM, address: '127.0.0.1:27567', transport: 'socket'
Credit Card Number before masking: 5327463548960777
Credit Card Number after masking: xxxxxxxxxxxx0777
Credit Card Number before masking: 5275330192145447
Credit Card Number after masking: 5275-3301-9214-5447
Credit Card Number before masking: 5327463548960777
Credit Card Number after masking: 5327
Credit Card Number before masking: 5327463548960777
Credit Card Number after masking: xxxx-xxxx-xxxx-0777
Credit Card Number before masking: 5327463548960777
Credit Card Number after masking: xxxx-4635-xxxx-xxxx
Credit Card Number before masking: 5327463548960777
Credit Card Number after masking: Invalid Request : Mask is Empty

org.junit.ComparisonFailure: 
Expected :Number is Empty
Actual   :Invalid Request : Number is Empty
 <Click to see difference>


	at org.junit.Assert.assertEquals(Assert.java:115)
	at org.junit.Assert.assertEquals(Assert.java:144)
	at com.test.application.test.CreditCardMaskTest.unableToMaskingCreditCardIfNumberIsEmpty(CreditCardMaskTest.java:93)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)
	at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)
	at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)
	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)

Disconnected from the target VM, address: '127.0.0.1:27567', transport: 'socket'

Process finished with exit code -1
```
