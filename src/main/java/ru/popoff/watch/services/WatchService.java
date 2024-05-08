package ru.popoff.watch.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.popoff.watch.models.Watch;
import ru.popoff.watch.repositories.WatchRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class WatchService {

    private final WatchRepository watchRepository;

    @Autowired
    public WatchService(WatchRepository watchRepository) {
        this.watchRepository = watchRepository;
    }

    // Список моделей
    public List<String> getModels() {
        return watchRepository.getModels();
    }

    // Список производителей
    public List<String> getProducers() {
        return watchRepository.getProducers();
    }

    // Список категорий
    public List<String> getCategories() {
        return watchRepository.getCategories();
    }

    // Список часов из категории
    public List<Watch> findByCategory(String category) {
        return watchRepository.findByCategory(category);
    }

    // Список часов от производителя
    public List<Watch> findByProducer(String producer) {
        return watchRepository.findByProducer(producer);
    }
}