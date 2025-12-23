package com.martinachov.hexagonal.domain.exception;
//exception
public class ProductNotFoundException extends RuntimeException{
    
    public ProductNotFoundException(String msg){
        super(msg);
    }
}
