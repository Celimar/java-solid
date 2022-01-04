package br.net.gradual.solid.dependencyInversion.payment;

import br.net.gradual.solid.dependencyInversion.factory.DbProductFactory;
import br.net.gradual.solid.dependencyInversion.model.DbType;
import br.net.gradual.solid.dependencyInversion.model.IDbProduct;
import br.net.gradual.solid.dependencyInversion.model.MySQLProduct;

public class Payment {

    public void pay(String productId){
        IDbProduct dbProduct = DbProductFactory.create(DbType.MongoDb);
        String product = dbProduct.getProductById(productId);
        System.out.println(product);
    }
}
