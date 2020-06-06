package service;

import model.Image;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ImageService {
    Page<Image> findAll(Pageable pageable);

    Image findById(Integer id);

    void save(Image image);

    void remove(Integer id);
}
