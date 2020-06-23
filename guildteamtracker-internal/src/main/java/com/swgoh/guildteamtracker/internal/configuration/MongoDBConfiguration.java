//package com.swgoh.guildteamtracker.internal.configuration;
//
//import org.eclipse.microprofile.config.inject.ConfigProperty;
//import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
//
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//
//public class MongoDBConfiguration extends AbstractMongoClientConfiguration {
//
//    @ConfigProperty(name = "mongodb.host:127.0.0.1")
//    private String host;
//
//    @ConfigProperty(name = "mongodb.port:27017")
//    private String port;
//
//    @ConfigProperty(name = "mongodb.username")
//    private String username;
//
//    @ConfigProperty(name = "mongodb.password")
//    private String password;
//
//    @ConfigProperty(name = "mongodb.database")
//    private String database;
//
//    private static String MONGO_DB_PREFIX = "mongodb://";
//
//    @Override
//    public MongoClient mongoClient() {
//        return MongoClients.create(MONGO_DB_PREFIX + host + ":" + port);
//    }
//
//    @Override
//    protected String getDatabaseName() {
//        return database;
//    }
//
//}
