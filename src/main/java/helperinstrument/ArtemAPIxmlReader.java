package main.java.helperinstrument;

import io.qameta.allure.Step;

import java.io.*;

/**
 * Class to read xml file and convert to String to set body data for API test
 */
public class ArtemAPIxmlReader {

    /**
     * default constructor
     */
    public ArtemAPIxmlReader() {
    }

    /**
     * method to read xml file
     * @return xml file in String format
     */
    @Step("Reading xml file to set body")
    public String readXml() {
        try {
            File xmlFile = new File("src/main/java/data/ArtemAPI.xml");
            Reader fileReader = new FileReader(xmlFile);
            BufferedReader bufReader = new BufferedReader(fileReader);

            StringBuilder sb = new StringBuilder();
            String line = bufReader.readLine();
            while (line != null) {
                sb.append(line).append("\n");
                line = bufReader.readLine();
            }
            return sb.toString();
        } catch (IOException e) {
            return e.getMessage();
        }
    }
}
