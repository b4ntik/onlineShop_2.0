package org.skypro.skyshop.article;

import org.skypro.skyshop.searchEngine.Searchable;

public class Article implements Searchable {
    private String articleName;
    private String articleBody;
            public Article(String articleName, String articleBody){
                this.articleName = articleName;
                this.articleBody = articleBody;
            }

    public String getArticleName() {
        return articleName;
    }

    public String getArticleBody() {
        return articleBody;
    }

    public String toString(){
               return  getArticleName() + "\n"+ getArticleBody();
            }

    @Override
    public String getSearchTerm() {
        return "ARTICLE";
    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }

    @Override
    public String getNameSearchableObject() {
        return "";
    }

    @Override
    public String getStringRepresentation() {
        return "";
    }
}
