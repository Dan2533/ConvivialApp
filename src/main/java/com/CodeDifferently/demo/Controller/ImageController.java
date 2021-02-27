package com.CodeDifferently.demo.Controller;

import com.CodeDifferently.demo.Model.Image;
import com.CodeDifferently.demo.Service.ImageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ImageController {
    @Autowired
    private ImageService imageService;

    @GetMapping("/images")
    public ResponseEntity <List<Image>> getAllImages() {
        return ResponseEntity.ok().body(this.imageService.getAllImages());
    }

    @GetMapping("images/{id}")
    public ResponseEntity <Image> URLImage(@PathVariable Image image) {
        return ResponseEntity.ok().body(this.imageService.URLImage(image));
    }


    @PostMapping("/images")
    public ResponseEntity <Image> selectImage(@RequestBody Image image){
        return (ResponseEntity<Image>) ResponseEntity.ok().body(this.imageService.selectImage(image));
    }


    @PutMapping("images/{id}")
    public ResponseEntity <Image> updateImageId(@PathVariable long id, Image image) {
        return ResponseEntity.ok().body(this.imageService.UpdateImageById(id, image));
    }

    @DeleteMapping("/images/{id}")
    public HttpStatus deleteByImageId(@PathVariable long id){
        this.imageService.deleteByImageId(id);
        return HttpStatus.OK;
    }


}



