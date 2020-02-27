set project_home=C:/devel
rem %project_home%/apache-maven-3.6.3/bin/mvn clean install -P java_fx && ^
rem %project_home%/jdk-11.0.6/bin/java.exe -jar target/java4-1.0-SNAPSHOT-jar-with-dependencies.jar

%project_home%/apache-maven-3.6.3/bin/mvn clean install jfx:native