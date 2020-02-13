# Reproducer for payara issue

Payara Micro is not able to use MicroProfile Config properties inside ``@DataSourceDefinition`` annotation.

## Steps to reproduce

1. Start a postgres db using Docker

    ```bash
    docker run --name mypostgres -p 5432:5432 -e POSTGRES_PASSWORD=mysecretpassword -d postgres
    ```

2. Start Payara Micro using Maven

    ```bash
    mvn package payara-micro:start
    ```

3. See exception in the logfile

    ```bash
    [2020-02-13T11:35:45.809+0100] [] [SEVERE] [] [javax.enterprise.system.core] [tid: _ThreadID=1 _ThreadName=main] [timeMillis: 1581590145809] [levelValue: 1000] [[
    Exception while preparing the app : Exception [EclipseLink-4002] (Eclipse Persistence Services - 2.7.4.payara-p2): org.eclipse.persistence.exceptions.DatabaseException
    Internal Exception: java.sql.SQLException: Error in allocating a connection. Cause: Class name is wrong or classpath is not set for : ${MPCONFIG=dataSource.className}
    Error Code: 0
    ```