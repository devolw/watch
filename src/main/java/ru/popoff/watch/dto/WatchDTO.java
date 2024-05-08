package ru.popoff.watch.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class WatchDTO {

    @NotEmpty(message = "Наименование модели не может быть пустым")
    @Size(min = 5, max = 100, message = "Наименование модели должно содержать от 5 до 100 символов")
    private String model;

    @NotEmpty(message = "Наименование производителя не может быть пустым")
    @Size(min = 3, max = 100, message = "Наименование производителя должно содержать от 3 до 100 символов")
    private String producer;

    @NotEmpty(message = "Наименование категории не может быть пустым")
    @Size(min = 3, max = 50, message = "Наименование категории должно содержать от 3 до 50 символов")
    private String category;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
