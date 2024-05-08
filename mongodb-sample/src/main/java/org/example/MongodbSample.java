package org.example;

import com.mongodb.*;
import com.mongodb.client.*;
import org.bson.Document;

import java.util.stream.StreamSupport;

public class MongodbSample {
    static final String password = "";
    static final String connectionString = "mongodb+srv://park940529:" + password + "@cluster0.mbf5jgc.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

    public static void main(String[] args) {
        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();
        // Create a new client and connect to the server
        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                MongoDatabase database = mongoClient.getDatabase("testdb");
//                database.runCommand(new Document("ping", 1));
//                System.out.println("Pinged your deployment. You successfully connected to MongoDB!");

                // 모든 도큐먼트 개수 출력
                MongoCollection<Document> collection = database.getCollection("testcol");
                long countDocuments = collection.countDocuments();
                System.out.println("Count of documents: " + countDocuments);

                // 모든 도큐먼트 내용 출력
                FindIterable<Document> allFound = collection.find();
                Document[] allFoundArr = StreamSupport.stream(allFound.spliterator(), false).toArray(Document[]::new);
                System.out.println("Found Documents ...");
                for (Document doc : allFoundArr) {
                    System.out.println(doc.toJson());
                }

                // insert

                // update

                // delete
            } catch (MongoException e) {
                e.printStackTrace();
            }
        }
    }
}
