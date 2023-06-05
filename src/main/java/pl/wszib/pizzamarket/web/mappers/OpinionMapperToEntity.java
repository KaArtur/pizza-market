package pl.wszib.pizzamarket.web.mappers;

import pl.wszib.pizzamarket.data.entities.OpinionEntity;
import pl.wszib.pizzamarket.web.models.OpinionModel;


public class OpinionMapperToEntity {


    public static OpinionEntity toEntity(OpinionModel model) {
        OpinionEntity entity = new OpinionEntity();
        entity.setName(model.getName());
        entity.setOpinion(model.getOpinion());

        return entity;
    }
}
