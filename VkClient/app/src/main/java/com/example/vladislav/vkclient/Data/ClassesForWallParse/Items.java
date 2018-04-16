package com.example.vladislav.vkclient.Data.ClassesForWallParse;

import java.util.List;

public class Items {
    private int id;

    private int from_id;

    private int owner_id;

    private int date;

    private int marked_as_ads;

    private String post_type;

    private String text;

    private List<Root.Attachments> attachments;

    private Root.Post_source post_source;

    private Root.Comments comments;

    private Root.Likes likes;

    private Root.Reposts reposts;

    private Root.Views views;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setFrom_id(int from_id){
        this.from_id = from_id;
    }
    public int getFrom_id(){
        return this.from_id;
    }
    public void setOwner_id(int owner_id){
        this.owner_id = owner_id;
    }
    public int getOwner_id(){
        return this.owner_id;
    }
    public void setDate(int date){
        this.date = date;
    }
    public int getDate(){
        return this.date;
    }
    public void setMarked_as_ads(int marked_as_ads){
        this.marked_as_ads = marked_as_ads;
    }
    public int getMarked_as_ads(){
        return this.marked_as_ads;
    }
    public void setPost_type(String post_type){
        this.post_type = post_type;
    }
    public String getPost_type(){
        return this.post_type;
    }
    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return this.text;
    }
    public void setAttachments(List<Root.Attachments> attachments){
        this.attachments = attachments;
    }
    public List<Root.Attachments> getAttachments(){
        return this.attachments;
    }
    public void setPost_source(Root.Post_source post_source){
        this.post_source = post_source;
    }
    public Root.Post_source getPost_source(){
        return this.post_source;
    }
    public void setComments(Root.Comments comments){
        this.comments = comments;
    }
    public Root.Comments getComments(){
        return this.comments;
    }
    public void setLikes(Root.Likes likes){
        this.likes = likes;
    }
    public Root.Likes getLikes(){
        return this.likes;
    }
    public void setReposts(Root.Reposts reposts){
        this.reposts = reposts;
    }
    public Root.Reposts getReposts(){
        return this.reposts;
    }
    public void setViews(Root.Views views){
        this.views = views;
    }
    public Root.Views getViews(){
        return this.views;
    }
}