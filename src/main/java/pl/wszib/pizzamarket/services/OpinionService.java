package pl.wszib.pizzamarket.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import pl.wszib.pizzamarket.data.entities.OpinionEntity;
import pl.wszib.pizzamarket.data.repositories.OpinionRepository;
import pl.wszib.pizzamarket.web.mappers.OpinionMapper;
import pl.wszib.pizzamarket.web.mappers.OpinionMapperToEntity;
import pl.wszib.pizzamarket.web.models.OpinionModel;

import java.util.List;

@Service
public class OpinionService {

    private final OpinionRepository opinionRepository;

    public OpinionService(OpinionRepository opinionRepository) {
        this.opinionRepository = opinionRepository;
    }

    public List<OpinionModel> findAll() {
        List<OpinionEntity> opinionEntities = opinionRepository.findAll();
        return opinionEntities.stream().map(OpinionMapper::toModelOpinion).toList();
    }

    public void saveOpinion( OpinionModel opinionModel) {
    OpinionEntity opinionEntity = OpinionMapperToEntity.toEntity(opinionModel);
        opinionRepository.save(opinionEntity);
    }

    public void deleteExample(Long id) {
        opinionRepository.deleteById(id);
    }


}
