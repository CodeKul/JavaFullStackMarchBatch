package com.example.JavaFullStackMarchBatch.colorlib.controller;

import com.example.JavaFullStackMarchBatch.colorlib.domain.MealPreference;
import com.example.JavaFullStackMarchBatch.colorlib.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/meal")
public class MealPrefController {

    @Autowired
    private MealRepository mealRepository;

    @PostMapping(value = "saveMeal")
    public ResponseEntity<?> saveMeal(@RequestBody MealPreference mealPreference) {
        try {
            mealRepository.save(mealPreference);
            return new ResponseEntity<>("saved...", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Not Saved..", HttpStatus.BAD_REQUEST);
        }
    }



    @GetMapping(value = "getMeal")
    public ResponseEntity<?> getMeal() {
        try {
            return new ResponseEntity<>(mealRepository.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error not found", HttpStatus.BAD_REQUEST);
        }
    }



}
