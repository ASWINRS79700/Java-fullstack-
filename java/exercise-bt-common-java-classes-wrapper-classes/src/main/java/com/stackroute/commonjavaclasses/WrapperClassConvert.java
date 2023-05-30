package com.stackroute.commonjavaclasses;

public class WrapperClassConvert {

    //write logic to determine and convert given primitive type to its wrapper class and return result
    public Object convertToWrapper(Object input) {
        if(input instanceof Integer ){
            Integer i =((Integer) input);
            return i;
        }
        else if(input instanceof Character){
            Character i=((Character) input);
            return i;
        }
        else if(input instanceof Float){
            Float i=((Float)input);
            return i;
        }
        else if(input instanceof Double) {
            Double i = ((Double) input);
            return i;
        }
        else if(input instanceof Boolean) {
            Boolean i = ((Boolean) input);
            return i;
        }
        else if(input instanceof Long) {
            Long i = ((Long)input);
            return i;
        }
        else if(input instanceof Short) {
            Short i = ((Short)input);
            return i;
        }
        else if(input instanceof Byte) {
            Byte i = ((Byte)input);
            return i;
        }
        else {
            return "Give proper primitive type as input";
        }

    }
}