## 说明
当前项目属于 energyScreen 项目的子集，用来提供oracle数据库数据的获取。<br>
后期可以扩展为其他项目使用。<br>

## 准备
1. 安装 jdk1.8，下载地址: https://www.oracle.com/java/technologies/javase-jdk8-downloads.html <br>
2. 下载 Oracle Db Driver，下载地址： https://www.oracle.com/database/technologies/jdbc-ucp-122-downloads.html <br>
3. mvn 导入driver：
mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0.3 -Dpackaging=jar -Dfile=ojdbc8.jar

### pom.xml 添加依赖 <br>

```xml
<dependency>
    <groupId>com.oracle</groupId>
    <artifactId>ojdbc6</artifactId>
    <version>11.2.0.3</version>
</dependency>
```

### application.properties 添加配置<br>

```
#spring.datasource.url=jdbc:oracle:thin:@192.168.127.20:1521:WQDQ
#spring.datasource.username=vqor4s
#spring.datasource.password=vqor314400
#spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
```

**WQDQ: 指数据库的SID**<br>


## 运行
`nohup java -Dspring.profiles.active=prod -jar oracle-conn-1.0.jar &`

