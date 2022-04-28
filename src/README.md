### 编译
    javac className.java
### 查看汇编代码
    javap -verbose className
    java -XX:+UnlockDiagnosticVMOptions -XX:+PrintAssmbly className
### 查看GC信息
    java -XX:+PrintGC -XX:+PrintGCDetails className
