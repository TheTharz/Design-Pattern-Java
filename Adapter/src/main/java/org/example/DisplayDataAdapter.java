package org.example;

import java.util.ArrayList;
import java.util.List;

public class DisplayDataAdapter implements DatabaseDataConverter{
    @Override
    public List<DisplayData3rdParty> convertData(List<DatabaseData> databaseData) {
        List<DisplayData3rdParty> list = new ArrayList<>();
        for (DatabaseData point:databaseData
             ) {
            float index = point.position;
            String data = Integer.toString(point.amount);

            DisplayData3rdParty d = new DisplayData3rdParty(index,data);
            list.add(d);
        }

        return list;
    }
}
