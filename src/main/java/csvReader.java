/**
 * @autor Chekmarev Andrey
 * 3rd year, 7th group
 * @version 1.0
 *  Converter class from .csv to List<>
 */

import au.com.bytecode.opencsv.CSVReader;
import java.io.*;
import java.util.List;

public class csvReader {

    /** File path field */
    private static String csvFilePath = "C:/Users/super/Documents/Untitled Folder/foreign_names/foreign_names.csv";

    /**
     * @param humanList - the list to fill in
     * @return the filled list passed to the @param
     * Opens a file at the specified path
     * Reads line by line
     * Divides rows and distributes them
     * to the appropriate fields of temporary instance of class Human
     * Adds an instance to the list
     * @throws IOException if the I/O operation failed or was aborted
     */
     static List<Human> csvToList(List<Human> humanList) throws IOException {

         CSVReader reader = new CSVReader(new FileReader(csvFilePath), ';');
         String[] nextLine;
         while ((nextLine = reader.readNext()) != null) {
             if (nextLine != null) {
                 Human tmpHuman = new Human();
                 tmpHuman.setID(nextLine[0]);
                 tmpHuman.setName(nextLine[1]);
                 tmpHuman.setGender(nextLine[2]);
                 tmpHuman.setBirtDate(nextLine[3]);
                 tmpHuman.setDivision(new Division(nextLine[4]));
                 tmpHuman.setSalary(nextLine[5]);
                 humanList.add(tmpHuman);
             }
         }
         return humanList;
     }
}