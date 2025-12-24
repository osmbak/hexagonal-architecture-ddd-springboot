package com.martinachov.hexagonal.domain.exception;
//exception branch_24
public class ProductNotFoundException extends RuntimeException{
    
    public ProductNotFoundException(String msg){
        super(msg);
    }
}
