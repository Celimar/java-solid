package br.net.gradual.solid.dependencyInversion.model;

public class MySQLProduct implements IDbProduct{

    public String getProductById(String productId) {
        return "MySQL: product by Id "+productId;
    }
}
