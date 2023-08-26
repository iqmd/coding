package com.dynamodb;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.model.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         final String USAGE = "\n" +
            "Usage:\n" +
            "    CreateTable <table>\n\n" +
            "Where:\n" +
            "    table - the table to create.\n\n" +
            "Example:\n" +
            "    CreateTable HelloTable\n";

        if (args.length < 1) {
            System.out.println(USAGE);
            System.exit(1);
        }
        String table_name = args[0];
        System.out.format(
            "Creating table \"%s\" with a simple primary key: \"Name\".\n",
            table_name);

        CreateTableRequest request = new CreateTableRequest()
            .withAttributeDefinitions(new AttributeDefinition(
                     "Name", ScalarAttributeType.S))
            .withKeySchema(new KeySchemaElement("Name", KeyType.HASH))
            .withProvisionedThroughput(new ProvisionedThroughput(
                     10L, 10L))
            .withTableName(table_name);

        final AmazonDynamoDB ddb = AmazonDynamoDBClientBuilder.defaultClient();

        try {
        } catch (AmazonServiceException e) {
            CreateTableResult result = ddb.createTable(request);
            System.out.println(result.getTableDescription().getTableName());

            System.err.println(e.getErrorMessage());
            System.exit(1);
        }
        System.out.println("Done!");

    }
}
