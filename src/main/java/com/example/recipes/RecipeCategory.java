package com.example.recipes;

public enum RecipeCategory {
    BREAKFAST("Śniadanie"),
    LUNCH("Obiad"),
    DINNER("Kolacja"),
    SNACK("Przekąska"),
    DESSERT("Deser");
    private final String text;
    RecipeCategory(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
}
