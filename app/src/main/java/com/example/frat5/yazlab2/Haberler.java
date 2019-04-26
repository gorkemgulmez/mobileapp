package com.example.frat5.yazlab2;

public class Haberler {
    private int id,like_number,disslike_number,view_count;
    private String name;

    public Haberler(){

    }
    public Haberler(int id, int like_number, int disslike_number, int view_count, String name, String content, String type, String image_link) {
        this.id = id;
        this.like_number = like_number;
        this.disslike_number = disslike_number;
        this.view_count = view_count;
        this.name = name;
        this.content = content;
        this.type = type;
        this.image_link = image_link;
    }

    public int getId(int i) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLike_number() {
        return like_number;
    }

    public void setLike_number(int like_number) {
        this.like_number = like_number;
    }

    public int getDisslike_number() {
        return disslike_number;
    }

    public void setDisslike_number(int disslike_number) {
        this.disslike_number = disslike_number;
    }

    public int getView_count() {
        return view_count;
    }

    public void setView_count(int view_count) {
        this.view_count = view_count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }

    private String content;
    private String type;
    private String image_link;

}
