package com.CodeDifferently.demo.Model;


import javax.persistence.*;

@Entity
@Table(name = "Image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long imageId;

    @Column(name ="image")
    private String nameOfImage;

    @Column(name = "URLImage")
    private String URLImage;

    @Column(name = "blogUrl")
    private String blogUrl;


    public Image() {
    }

    public Image(Long imageId, String selectedImage,  String URLImage, String blogUrl) {
        this.imageId = imageId;
        this.nameOfImage = selectedImage;
        this.URLImage = URLImage;
        this.blogUrl = blogUrl;

    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public String getNameOfImage() {
        return nameOfImage;
    }

    public void setNameOfImage(String nameOfImage) {
        this.nameOfImage = nameOfImage;
    }

    public String getURLImage() {
        return URLImage;
    }

    public void setURLImage(String URLImage) {
        this.URLImage = URLImage;
    }

    public String getBlogUrl() {
        return blogUrl; }

    public void setBlogUrl(String blogUrl) {
        this.blogUrl = blogUrl;
    }
}
