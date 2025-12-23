package com.martinachov.hexagonal.domain.exception;
//exception branche_chicky
public class ProductNotFoundException extends RuntimeException{
    
    public ProductNotFoundException(String msg){
        super(msg);
    }
}
