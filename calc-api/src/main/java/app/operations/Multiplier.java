package app;


import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

public class Multiplier {
    @Path("/mult/{num1}/{num2}")
    @GET
    public String routeMult(@PathParam String num1, @PathParam String num2){
        try{
            double mult = Double.parseDouble(num1) * Double.parseDouble(num2);
            return String.format("Result: %s", mult);
        } catch (NumberFormatException nfe) {
            new BadRequestException(String.format("Formato inválido"));
        }
        return "";
    }

    public double mult(String num1, String num2){
        double op1 = 0;
        try {
            op1 = Double.parseDouble(num1);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException(String.format("numero invalido:\"%s\"", num1));
        }
        double op2 = 0.;
        try {
            op2 = Double.parseDouble(num2);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException(String.format("numero invalido:\"%s\"", num1));
        }
        return op1 * op2;
    }

}