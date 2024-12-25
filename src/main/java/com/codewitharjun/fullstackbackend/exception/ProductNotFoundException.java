package com.codewitharjun.fullstackbackend.exception;
/* Created by Arjun Gautam */

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(Long id){
        super("Could not found the user with id "+ id);
    }
}
