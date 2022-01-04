package br.net.gradual.solid.dependencyInversion.factory;

import br.net.gradual.solid.dependencyInversion.model.DbType;
import br.net.gradual.solid.dependencyInversion.model.IDbProduct;
import br.net.gradual.solid.dependencyInversion.model.MongoDbProduct;
import br.net.gradual.solid.dependencyInversion.model.MySQLProduct;

public class DbProductFactory {

    public static IDbProduct create(DbType dbTyoe){
        if (dbTyoe == DbType.MySQL){
            return new MySQLProduct();
        } else if(dbTyoe == DbType.MongoDb){
            return new MongoDbProduct();
        }else
            return  null;
    }
}
