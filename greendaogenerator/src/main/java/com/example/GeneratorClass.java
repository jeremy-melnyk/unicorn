package com.example;
import org.greenrobot.greendao.generator.DaoGenerator;
import org.greenrobot.greendao.generator.Entity;
import org.greenrobot.greendao.generator.Schema;

public class GeneratorClass {

    public static void main(String[] args)  throws Exception {

        //place where db folder will be created inside the project folder
        Schema schema = new Schema(1,"com.potato.unicornpotato.db");

        //Entity Users or table Users
        Entity user= schema.addEntity("Users");
        user.addIdProperty();                       //It is the primary key for uniquely identifying a row
        user.addStringProperty("Firstname").notNull();    //Not null is SQL constrain
        user.addStringProperty("Email");
        user.addStringProperty("Password");
        user.addDateProperty("Lastname");

        //  ./app/src/main/java/   ----   com/codekrypt/greendao/db is the full path
        new DaoGenerator().generateAll(schema, "./app/src/main/java");
    }
}