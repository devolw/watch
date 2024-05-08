package ru.popoff.watch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.popoff.watch.services.WatchService;


@Controller
@RequestMapping("/watch")
public class WatchController {

    private final WatchService watchService;

    public WatchController(WatchService watchService) {
        this.watchService = watchService;
    }

    // Список моделей
    @GetMapping("/models")
    public String getModels(Model model) {
        model.addAttribute("models", watchService.getModels());
        return "list/models";
    }

    // Список производителей
    @GetMapping("/producers")
    public String getProducers(Model model) {
        model.addAttribute("producers", watchService.getProducers());
        return "list/producers";
    }

    // Список категорий
    @GetMapping("/categories")
    public String getCategories(Model model) {
        model.addAttribute("categories", watchService.getCategories());
        return "list/categories";
    }

    // Список часов из категории
    @GetMapping("/categories/{category}")
    public String showByCategories(Model model, @PathVariable("category") String category) {
        model.addAttribute("watches", watchService.findByCategory(category));
        return "show/showbycategories";
    }

    // Список часов от производителя
    @GetMapping("/producers/{producer}")
    public String showByProducers(Model model, @PathVariable("producer") String producer) {
        model.addAttribute("watches", watchService.findByProducer(producer));
        return "show/showbyproducers";
    }
}