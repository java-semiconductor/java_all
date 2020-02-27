set MVN_HOME=C:\devel\apache-maven-3.6.3

set JAVA_HOME=C:\devel\jdk-11.0.6

%MVN_HOME%/bin/mvn clean install -P build && %JAVA_HOME%/bin/java.exe -jar target/jaxrs_client-1.0-SNAPSHOT-jar-with-dependencies.jar
