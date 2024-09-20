package com.zosh.service.impl;

import com.zosh.exception.ProductException;
import com.zosh.model.Product;
import com.zosh.model.Rating;
import com.zosh.model.User;
import com.zosh.repository.RatingRepository;
import com.zosh.request.RatingRequest;
import com.zosh.service.ProductService;
import com.zosh.service.RatingService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Resource
    private RatingRepository ratingRepository;

    @Resource
    private ProductService productService;

    @Override
    public Rating createRating(RatingRequest req, User user) throws ProductException {
        Product product=productService.findProductById(req.getProductId());

        Rating rating=new Rating();
        rating.setProduct(product);
        rating.setUser(user);
        rating.setRating(req.getRating());
        rating.setCreatedAt(LocalDateTime.now());

        return ratingRepository.save(rating);

    }

    @Override
    public List<Rating> getProductsRating(Long productId) {
        return ratingRepository.getAllProductsRating(productId);
    }
}
