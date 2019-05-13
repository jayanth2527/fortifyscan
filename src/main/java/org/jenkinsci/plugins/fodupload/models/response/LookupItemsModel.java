package org.jenkinsci.plugins.fodupload.models.response;

public class LookupItemsModel {
    public LookupItemsModel(String value, String text, String group) {
        this.value = value;
        this.text = text;
        this.group = group;
    }

    private String value;
    private String text;
    private String group;

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    public String getGroup() {
        return group;
    }
}
