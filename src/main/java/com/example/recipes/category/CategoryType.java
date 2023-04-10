package com.example.recipes.category;

public enum CategoryType {
    BREAKFAST("Śniadanie"),

    LUNCH("Obiad"),

    DINNER("Kolacja"),

    SNACK("Przekąska"),

    DESSERT("Deser");

    private final String text;

    CategoryType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
