package com.perchwell.entity;

public class Tag {
    private String uniqueTagName;
    private  String existingTagname;
    public void setUniqueTagName(String uniqueTagName) {
        this.uniqueTagName = uniqueTagName;
    }

    public String getUniqueTagName() {
        return uniqueTagName;
    }

    public String getExistingTagname() {
        return existingTagname;
    }

    public void setExistingTagname(String existingTagname) {
        this.existingTagname = existingTagname;
    }
}
