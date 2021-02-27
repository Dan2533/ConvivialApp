package com.CodeDifferently.demo.Service;

import com.CodeDifferently.demo.Model.Image;

import java.util.List;

public interface ImageService {
    Image selectImage(Image image);

    List<Image> getAllImages();

    Image URLImage(Image image);

    Image UpdateImageById(Long id, Image image);

    void deleteByImageId(Long id);

}


