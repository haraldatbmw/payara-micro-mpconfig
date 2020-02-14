package com.bmw.reproducer;

import javax.annotation.sql.DataSourceDefinition;

// hardcoded version works
// @DataSourceDefinition(
//     name            = "java:global/jdbc/reproducer",
//     className       = "org.postgresql.ds.PGSimpleDataSource", 
//     serverName      = "",
//     url             = "jdbc:postgresql://localhost:5432/postgres",
//     user            = "postgres",
//     password        = "mysecretpassword"
// )

// fully microprofile config does not work
// @DataSourceDefinition(
//     name            = "java:global/jdbc/reproducer",
//     className       = "${MPCONFIG=dataSource.className}", 
//     serverName      = "",
//     url             = "${MPCONFIG=dataSource.url}",
//     user            = "${MPCONFIG=dataSource.user}",
//     password        = "${MPCONFIG=dataSource.password}"
// )

// partial microprofile config does not work
// @DataSourceDefinition(
//     name            = "java:global/jdbc/reproducer",
//     className       = "org.postgresql.ds.PGSimpleDataSource", 
//     serverName      = "",
//     url             = "${MPCONFIG=dataSource.url}",
//     user            = "${MPCONFIG=dataSource.user}",
//     password        = "${MPCONFIG=dataSource.password}"
// )
public class MyDataSource {    
}