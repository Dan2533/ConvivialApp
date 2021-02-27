package com.CodeDifferently.demo.Service;


import com.CodeDifferently.demo.Controller.ResourceNotFoundException;
import com.CodeDifferently.demo.Model.Image;
import com.CodeDifferently.demo.Repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImageServiceImpl implements ImageService{
   @Autowired
    private ImageRepository imageRepository;

    @Override
    public Image selectImage(Image image) {
        return imageRepository.save(image);
    }

    @Override
    public List<Image> getAllImages() {
        return this.imageRepository.findAll();
    }

    @Override
    public Image URLImage(Image image) { return imageRepository.save(image);
    }

    @Override
    public Image UpdateImageById(Long id, Image image) {
        Optional<Image> imageDb = this.imageRepository.findById(image.getImageId());
        if(imageDb.isPresent()) {
            Image imageUpdate = imageDb.get();
            imageUpdate.setImageId(image.getImageId());
            imageUpdate.setNameOfImage(image.getNameOfImage());
            imageUpdate.setURLImage(image.getURLImage());
            imageRepository.save(imageUpdate);
            return imageUpdate;
         }else{
            throw new ResourceNotFoundException("Image Not found with id : " + image.getImageId());
        }
    }

    @Override
    public void deleteByImageId(Long id ) {
    Optional<Image> imageDb = this.imageRepository.findById(id);

    if(imageDb.isPresent()){
        this.imageRepository.delete(imageDb.get());
    } else{
        throw new ResourceNotFoundException("Image not found with id: " + id);
    }
    }
}
