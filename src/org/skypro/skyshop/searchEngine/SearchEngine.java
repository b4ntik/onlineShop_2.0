package org.skypro.skyshop.searchEngine;

public class SearchEngine {
    //private Searchable product;
    private Searchable[] searchables;

    public SearchEngine() {
        searchables = new Searchable[5];


    }

    public String[] search(String findWord) {
        String[] found = new String[5];
        if (searchables != null) {
            for (int i = 0; i < searchables.length; i++) {
                if (findWord.toLowerCase().trim().contains(searchables[i].getSearchTerm())) {

                    found[i] = searchables[i].getStringRepresentation();
                }

            }
        }
        return found;
    }

    public void addProductsToSearchEngine(Searchable product) {
        for (int i = 0; i < searchables.length; i++) {
            if (searchables[i] == null) {
                searchables[i] = product;
            }
        }
    }
}



