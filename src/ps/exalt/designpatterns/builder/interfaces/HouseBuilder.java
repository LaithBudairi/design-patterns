package ps.exalt.designpatterns.builder.interfaces;

import ps.exalt.designpatterns.builder.classes.House;

public interface HouseBuilder {
    void buildBasement();

    void buildStructure();

    void buildRoof();

    void buildInterior();

    House getHouse();
}
