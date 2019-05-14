package edu.epam.train.Main;

import java.util.List;

public interface Service {
    void addIngredients(Ingredients ingredient);
    String getIngredientsList(List<? extends Ingredients> list);
}
