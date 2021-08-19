package io.javabrains.ratingsdataservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingdate")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(String movieId){

        return new Rating(movieId, 4);

    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRatings(@PathVariable String userId){

        List<Rating> ratings = Arrays.asList(

                new Rating("1234", 4),
                new Rating("5678", 3)
        );
        UserRating userRatings = new UserRating(userId, ratings);
        return userRatings;
    }
}
