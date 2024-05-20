package ru.popoff.watch.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "watch")
public class Watch {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Наименование модели не может быть пустым")
    @Column(name = "model")
    @Size(min = 5, max = 100, message = "Наименование модели должно содержать от 5 до 100 символов")
    private String model;

    @NotEmpty(message = "Наименование производителя не может быть пустым")
    @Column(name = "producer")
    @Size(min = 3, max = 100, message = "Наименование производителя должно содержать от 3 до 100 символов")
    private String producer;

    @NotEmpty(message = "Наименование категории не может быть пустым")
    @Column(name = "category")
    @Size(min = 3, max = 50, message = "Наименование категории должно содержать от 3 до 50 символов")
    private String category;

    public Watch() {
    }

    public Watch(String model, String producer, String category) {
        this.model = model;
        this.producer = producer;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
