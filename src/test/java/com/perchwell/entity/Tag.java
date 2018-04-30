package com.perchwell.entity;

public class Tag {

    private String uniqueTagName;
    private  String existingTagName;


    public void setUniqueTagName(String uniqueTagName) {
        this.uniqueTagName = uniqueTagName;
    }

    public String getUniqueTagName() {
        return uniqueTagName;
    }

    public String getExistingTagName() {
        return existingTagName;
    }

    public void setExistingTagName(String existingTagName) {
        this.existingTagName = existingTagName;
    }
}
