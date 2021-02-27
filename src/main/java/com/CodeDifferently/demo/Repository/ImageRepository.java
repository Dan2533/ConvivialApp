package com.CodeDifferently.demo.Repository;

import com.CodeDifferently.demo.Model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {

}
