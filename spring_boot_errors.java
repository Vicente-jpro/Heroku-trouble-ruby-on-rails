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

##########################################################################


How to Install Maven on Linux (Ubuntu)
 https://www.digitalocean.com/community/tutorials/install-maven-linux-ubuntu


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
Hibernate Error executing DDL via JDBC Statement

https://stackoverflow.com/questions/43191294/hibernate-error-executing-ddl-via-jdbc-statement
Adding this configuration in application.properties file to fixed this issue easily.

spring.jpa.properties.hibernate.globally_quoted_identifiers=true
################################################################################

ERROR TYPE
Description:

The dependencies of some of the beans in the application context form a cycle:

┌─────┐
|  securityConfiguration (field private com.prity.springbootdemo1.service.UserService com.prity.springbootdemo1.config.SecurityConfiguration.userService)
↑     ↓
|  userServiceImpl (field private org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder com.prity.springbootdemo1.service.UserServiceImpl.passwordEncoder)
└─────┘


Action:

Relying upon circular references is discouraged and they are prohibited by default. Update your application to remove the dependency cycle between beans. As a last resort, it may be possible to break the cycle automatically by setting spring.main.allow-circular-references to true.


SOLUTION:
https://stackoverflow.com/questions/71867218/relying-upon-circular-reference-is-discouraged-and-they-are-prohibited-by-defaul
Add it to file application.properties

spring.main.allow-circular-references=true
###############################################################################





