package br.net.gradual.solid.dependencyInversion.model;

public class MongoDbProduct implements IDbProduct{

    public String getProductById(String productId) {
        return "MongoDb: product by Id "+productId;
    }
}
