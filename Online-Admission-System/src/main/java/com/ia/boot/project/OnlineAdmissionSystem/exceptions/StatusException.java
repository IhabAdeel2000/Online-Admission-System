package com.ia.boot.project.OnlineAdmissionSystem.exceptions;

public class StatusException extends Exception{

    public void invalidStatus(){
        System.out.println("Status can only be \'Approved\\' or \'Declined\\'");
    }
}
