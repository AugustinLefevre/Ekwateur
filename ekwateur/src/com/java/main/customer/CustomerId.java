package com.java.main.customer;

import java.util.regex.Pattern;

public class CustomerId {
    public static final String BASE_ID = "EKW";
    private final String id;

    public CustomerId(String idContent) {
        if(!isValidBaseId(idContent)){
            throw new RuntimeException("Invalid id");
        }else{
            id = BASE_ID + idContent;
        }
    }

    private boolean isValidBaseId(String idContent) {
        return idContent.length() == 8 && containsHeightNumbers(idContent);
    }

    private boolean containsHeightNumbers(String idContent){
        Pattern pattern = Pattern.compile("\\d{8}");
        return pattern.matcher(idContent).find();
    }

    public String getId() {
        return id;
    }
}
