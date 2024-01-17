package org.example;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

    }

    public void whenJavaGotFromXmlFile_thenCorrect() throws IOException {
        File file = new File("ClientInfo.xml");
        XmlMapper xmlMapper = new XmlMapper();
        ClientInfo value = xmlMapper.readValue(file, ClientInfo.class);
    }
}
