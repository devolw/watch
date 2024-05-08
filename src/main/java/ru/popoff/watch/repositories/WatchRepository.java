package ru.popoff.watch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.popoff.watch.models.Watch;

import java.util.List;

@Repository
public interface WatchRepository extends JpaRepository<Watch, Integer> {

    // Список моделей
    @Query("SELECT w.model FROM Watch w")
    List<String> getModels();

    // Список производителей
    @Query("select distinct w.category from Watch w")
    List<String> getCategories();

    // Список категорий
    @Query("select distinct w.producer from Watch w")
    List<String> getProducers();

    // Список часов из категории
    List<Watch> findByCategory(String category);

    // Список часов от производителя
    List<Watch> findByProducer(String producer);
}