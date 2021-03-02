# Spring Cloud 微服务 Demo1


- `默认端口：` 随机（1024 ~ 9999）
- `依赖：` [Eureka 注册中心](https://github.com/microprograms/spring-cloud-starter-netflix-eureka-server-security-demo)


#### 版本依赖
- `Jdk` 1.8 及以上
- `Spring Boot` 2.3.9.RELEASE
- `Spring Cloud` Hoxton.SR10

#### 编译打包

```shell
# maven 编译打包（跳过测试）
mvn clean package -Dmaven.test.skip=true
```

#### 启动

```shell
# 编译打包之后，使用java命令启动，示例 java -jar target/spring-cloud-microservice-demo1-${版本号}.jar
# 如果启动多次，就会启动多个java进程（负载均衡），各自使用独立的随机端口号注册到“Eureka 注册中心”！
java -jar target/spring-cloud-microservice-demo1-1.0.0.jar
```

#### 停止

```shell
# 使用jps命令，查询所有java进程
jps

# 示例输出如下
# 26226 spring-cloud-starter-netflix-zuul-demo-1.0.0.jar
# 27639 zipkin-server-2.23.2-exec.jar
# 30793 Jps
# 25771 spring-cloud-starter-netflix-eureka-server-security-demo-1.0.0.jar
# 30783 spring-cloud-microservice-demo1-1.0.0.jar

# 根据pid杀死demo1对应的java进程，上例为 kill -9 30783
kill -9 {pid}
```
