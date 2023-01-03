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


