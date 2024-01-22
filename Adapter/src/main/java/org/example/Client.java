package org.example;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        //database ekakin ena data
        DatabaseDataGenerator gen = new DatabaseDataGenerator();
        DisplayDataAdapter adapter = new DisplayDataAdapter();


        List<DisplayData3rdParty> legacyData = adapter.convertData(gen.generateData());

        //clienta oni database data tika convert karala display krnna
        for (DisplayData3rdParty data:legacyData
             ) {
            data.displayData();
        }
    }
}


