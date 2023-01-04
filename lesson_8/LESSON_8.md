# Lesson 8

## Information

Today we will build & run java web apps.

### Jetty

We will first build a jetty jar <https://github.com/fictive-reality/devops22-java_jetty>

### Jetty Webapp

Follow the instruction to setup a Jetty webapp <https://github.com/fictive-reality/devops22-java_jetty_webapp>

### Tomcat

You could install Tomcat on your target system, but in this example we use docker to get started quickly.

1. Start a docker container running tomcat 9

    ```sh
    docker run -it -p 8888:8080 --name my_tomcat tomcat:9.0

    # IF you run in windows git bash run with winpty
    winpty docker run -it -p 8888:8080 --name my_tomcat tomcat:9.0
    ```

2. Leave the container logs open in a terminal so we can see our changes taking effect.
3. Copy the tomcat-users.xml config from the container. This file defines user for the tomcat server.

    ```sh
    docker cp my_tomcat:/usr/local/tomcat/conf/tomcat-users.xml .
    ```

4. In `tomcat-users.xml` find the comment `user username="admin" password="<must-be-changed>" roles="manager-gui"/>` and uncomment it.
5. Change the password in tomcat-users.xml
6. Copy back our changed tomcat-users.xml file to the container

    ```sh
    docker cp tomcat-users.xml my_tomcat:/usr/local/tomcat/conf/
    ```

7. To enable the manager gui we need to deploy a webapp that are in the webapps.dist folder. For security reasons it's not enabled by default.

    ```sh
    # This will copy from one folder to another inside the container
    docker exec my_tomcat cp -r /usr/local/tomcat/webapps.dist/manager /usr/local/tomcat/webapps/manager
    ```

8. Check the logs and test to open the <http://localhost:8888/manager/html> it should say 403 access denied
9. Now you need to add a context file that allow us to log into the manger.

    ```sh
    # copy from the examples folder in lesson_8 to the container folder
    docker cp examples/context.xml my_tomcat:/usr/local/tomcat/webapps/manager/META-INF/
    ```

10. Test to open the <http://localhost:8888/manager/html> it should now ask for username and password, login and make sure you can see the Tomcat Web Application Manager in your browser.

11. Now we should try to deploy a spring boot app go to the demo folder in lesson_8.
12. In pom.xml change `<packaging>jar</packaging>` to `<packaging>war</packaging>`
13. Run package to build the new war:

    ```sh
    mvn clean package
    ```

14. Select WAR file to upload, and find your demo.war file in the file browser.
15. Click deploy

16. You can also do a file deploy directly with:

    ```sh
    docker cp target/demo.war my_tomcat:/usr/local/tomcat/webapps/
    ```
