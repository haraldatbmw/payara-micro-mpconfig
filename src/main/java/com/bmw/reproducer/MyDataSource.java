package com.bmw.reproducer;

import javax.annotation.sql.DataSourceDefinition;

// hardcoded version works
// @DataSourceDefinition(
//     name            = "java:global/jdbc/reproducer",
//     className       = "org.postgresql.ds.PGSimpleDataSource", 
//     serverName      = "localhost",
//     portNumber      = 5432,
//     databaseName    = "postgres",
//     user            = "postgres",
//     password        = "mysecretpassword"
// )

// fully microprofile config does not work
// @DataSourceDefinition(
//     name            = "java:global/jdbc/reproducer",
//     className       = "${MPCONFIG=dataSource.className}", 
//     serverName      = "${MPCONFIG=dataSource.serverName}",
//     portNumber      = 5432,
//     databaseName    = "${MPCONFIG=dataSource.databaseName}",
//     user            = "${MPCONFIG=dataSource.user}",
//     password        = "${MPCONFIG=dataSource.password}"
// )

// partial microprofile config does not work
// @DataSourceDefinition(
//     name            = "java:global/jdbc/reproducer",
//     className       = "org.postgresql.ds.PGSimpleDataSource", 
//     serverName      = "${MPCONFIG=dataSource.serverName}",
//     portNumber      = 5432,
//     databaseName    = "${MPCONFIG=dataSource.databaseName}",
//     user            = "${MPCONFIG=dataSource.user}",
//     password        = "${MPCONFIG=dataSource.password}"
// )
public class MyDataSource {    
}