package com.flightmanager.app.utils;

public class StripeResponse {
    boolean status;
    String description;

    public StripeResponse(){
        this.status = false;
    }

    public StripeResponse(boolean status){
        this.status = status;
    }

    public StripeResponse(boolean status, String description){
        this.status = status;
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return "Response{\n"+
                "status: "+status+",\n"+
                "description: \'"+description+"\'"+
                "\n}";
    }
}
