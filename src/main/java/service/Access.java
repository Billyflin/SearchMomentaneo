package service;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import inteface.validate;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Access implements validate {
    public Access() {
    }
    static String RUTA_LOGIN = "src/main/Server/Login.csv";
    public static int accessLevel=0;

    public static int getAccessLevel() {
        return accessLevel;
    }

    public static void setAccessLevel(int accessLevel) {
        Access.accessLevel = accessLevel;
    }

    public static boolean isValid(String id, String password) {
        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
        CSVReaderBuilder builder = null;
        try {
            builder = new CSVReaderBuilder(new FileReader(RUTA_LOGIN));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try (CSVReader reader = builder != null ? builder.withCSVParser(parser).withSkipLines(1).build() : null) {
            String[] nextLine;
            while (true) {
                assert reader != null;
                if ((nextLine = reader.readNext()) == null) break;
                if(nextLine[0].equals(id) && nextLine[1].equals(password)){
                    Access.setAccessLevel(Integer.parseInt(nextLine[2]));
                    return true;
                }
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean registerisValid(String id) {
        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
        CSVReaderBuilder builder = null;
        try {
            builder = new CSVReaderBuilder(new FileReader(RUTA_LOGIN));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try (CSVReader reader = builder != null ? builder.withCSVParser(parser).withSkipLines(1).build() : null) {
            String[] nextLine;
            while (true) {
                assert reader != null;
                if ((nextLine = reader.readNext()) == null) break;
                if(nextLine[0].equals(id)){
                    return false;
                }
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
        return true;
    }
}
