### 0.预备
##### markdown + uml
依赖: A ..> B 

泛化: A --|> B

实现: A ..|> B

关联: A --> B

聚合: A --o B

组合: A --* B
 
### 1.单例模式 - singleton
##### 1.实现方式
饿汉式、懒汉式、内部类、枚举
##### 2.jdk demo
java.lang.Runtime

### 2.工厂模式 - factory
##### 1.实现
简单工厂模式、工厂方法模式、抽象工厂模式
##### 2.jdk demo
java.util.Calendar

### 3.原型模式 -prototype
##### 1.拷贝(clone)
深拷贝(深拷贝的方式-最好时候序列化的方式)、浅拷贝
##### 2.spring demo
Bean的创建(prototype)
