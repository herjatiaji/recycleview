package com.pad1.recycleview;

public class Item {
    private String title;
    private String content;
    private int pics;

    public int getPics() {
        return pics;
    }

    public void setPics(int pics) {
        this.pics = pics;
    }

    public Item(String title, String content, int pics) {
        this.title = title;
        this.content = content;
        this.pics = pics;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
