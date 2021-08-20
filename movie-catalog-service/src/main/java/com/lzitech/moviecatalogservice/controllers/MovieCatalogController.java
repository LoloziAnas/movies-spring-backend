package com.lzitech.moviecatalogservice.controllers;

import com.lzitech.moviecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    @RequestMapping("{userId}")
    public Collection<CatalogItem> getCatalog(@PathVariable("userId") Long userId){
        return Collections.singletonList(new CatalogItem("Old Wise Man","a story of a wise man lives in sea",5));
    }
}
