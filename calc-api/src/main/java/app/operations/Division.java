package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

public class Division {

    @Path("/div/{num1}/{num2}")
    @GET
    public String routeDivision(@PathParam String num1, @PathParam String num2) {

        try {
            // converter em double
            double division = Double.parseDouble(num1) / Double.parseDouble(num2);
            // retornar soma dos parametros
            return String.format("Result: %s", division);
        } catch (NumberFormatException nfe) {
            new BadRequestException(String.format("Formato invalido"));
        }
        return "";
    }

    public double division(String num1, String num2) throws IllegalArgumentException {
        double op1 = 0;
        try {
            op1 = Double.parseDouble(num1);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException(String.format("numero invalido:\"%s\"", op1));
        }
        double op2 = 0.;
        try {
            op2 = Double.parseDouble(num2);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException(String.format("numero invalido:\"%s\"", op2));
        }
        return op1 / op2;
    }

}
