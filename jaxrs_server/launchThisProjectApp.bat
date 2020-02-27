set MVN_HOME=C:\devel\apache-maven-3.6.3

set JAVA_HOME=C:\devel\jdk-11.0.6

set PAYARA=C:\devel\payara-micro-5.194.jar

%MVN_HOME%/bin/mvn clean install && %JAVA_HOME%/bin/java.exe -jar %PAYARA% --deploy target/restapp.war --port 8091 --rootDir payaraDeploy
