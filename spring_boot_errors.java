The src/resources/application.yml file, and how to fix 'Could not resolve placeholder ${salt}' type errors

 @Value("${salt}")
  private String salt;

<dependency>
    <groupId>org.yaml</groupId>
    <artifactId>snakeyaml</artifactId>
</dependency>

############################################################################

Address already in use: JVM_Bind" error?
 
If you know what port the process is running you can type: lsof -i:<port>.

For instance, lsof -i:8080, to list the process (pid) running on port 8080.

Then kill the process with kill <pid>
 
 https://stackoverflow.com/questions/12737293/how-do-i-resolve-the-java-net-bindexception-address-already-in-use-jvm-bind

###########################################################################
 H2 database connection
application:
  name: TEST ENVIROMENT
  
spring:
  datasource:
    url: jdbc:h2:mem:testdb
    driver-class-name: org.h2.Driver
    username: sa
    password: password
  
  jpa:
    database-platform: org.hibernate.dialect.H2Dialect
  
  h2:
    console:
      enabled: true
      path: /h2-console
      
# Dependencies
#    <dependency>
#      <groupId>org.springframework.boot</groupId>
#      <artifactId>spring-boot-starter-data-jpa</artifactId>
#    </dependency>
#    
#    <dependency>
#      <groupId>com.h2database</groupId>
#      <artifactId>h2</artifactId>
#    </dependency>
###############################################################################


