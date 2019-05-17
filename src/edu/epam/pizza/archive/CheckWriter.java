package edu.epam.pizza.archive;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CheckWriter {

    private static Logger logger = LogManager.getLogger();
    private static final String FILE_PATH = "data\\checkdata.txt";

    public void writeToFile(String message){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH,true))) {
            writer.write(message + "\n");
        } catch (IOException e) {
            logger.fatal("File doesnt exist", e, Level.FATAL);
            e.printStackTrace();
        }
    }
}
