package com.application.Sorting.controller;

import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.Sorting.service.Sortingservice;




@RestController
public class Sortingcontroller {
	@Autowired
    Sortingservice Sortingservice;

    @GetMapping("/sort")
    public int[] bsort(@RequestBody int[] array) {
	Sortingservice.bubblesort(array);
	return array;
}


}
