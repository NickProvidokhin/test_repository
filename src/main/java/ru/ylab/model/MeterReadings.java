package ru.ylab.model;

import java.util.Date;
import java.util.List;

public class MeterReadings {
    int id;
    Date date;// todo подумать про тип
    //Беру целое, потому что передают в целых числах
    int count;
    List<TypeOfResource> typeOfResourceList;
}
