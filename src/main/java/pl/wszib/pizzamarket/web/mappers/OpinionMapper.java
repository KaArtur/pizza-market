package pl.wszib.pizzamarket.web.mappers;

import pl.wszib.pizzamarket.data.entities.OpinionEntity;
import pl.wszib.pizzamarket.web.models.OpinionModel;


public class OpinionMapper {
    public static OpinionModel toModelOpinion (OpinionEntity opinionEntity) {
        return new OpinionModel(
                opinionEntity.getId(),
                opinionEntity.getName(),
                opinionEntity.getOpinion()
        );
    }

}
