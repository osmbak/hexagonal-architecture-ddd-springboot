package com.martinachov.hexagonal.domain.exception;
//exception branche_chicky 1
public class ProductNotFoundException extends RuntimeException{
    
    public ProductNotFoundException(String msg){
        super(msg);
    }
}
