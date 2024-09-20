package com.zosh.service;


import com.zosh.exception.ProductException;
import com.zosh.model.Rating;
import com.zosh.model.User;
import com.zosh.request.RatingRequest;

import java.util.List;

public interface RatingService {
    public Rating createRating(RatingRequest req, User user) throws ProductException;

    public List<Rating> getProductsRating(Long productId);

}
