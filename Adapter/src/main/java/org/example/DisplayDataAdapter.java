package org.example;

import java.util.ArrayList;
import java.util.List;
//adapter
public class DisplayDataAdapter implements DatabaseDataConverter{
    @Override
    //database data aragena convert karanwa display data bawata
    public List<DisplayData3rdParty> convertData(List<DatabaseData> databaseData) {

        List<DisplayData3rdParty> list = new ArrayList<>();

        for (DatabaseData point:databaseData
             ) {
            float index = point.position; //position kiwwe interger ekak me kara tyenne interger index kiyana float ekata map karala
            String data = Integer.toString(point.amount);//amount kiyala integer ekak enwa database ekn,eka convert karanawa string ekakata

            DisplayData3rdParty d = new DisplayData3rdParty(index,data);
            list.add(d);
        }

        return list;
    }
}
