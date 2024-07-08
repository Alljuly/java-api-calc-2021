package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

public class Subtraction {
    @Path("/sub/{num1}/{num2}")
    @GET
    public String routeSub(@PathParam String num1, @PathParam String num2) {
        try {
            // converter em double
            double sub = Double.parseDouble(num1) - Double.parseDouble(num2);
            // retornar a subtração dos parametros
            return String.format("Result: %s", sub);
        } catch (NumberFormatException nfe) {
            new BadRequestException(String.format("Formato inválido"));
        }
        return "";
    }

    public double sub(String num1, String num2) throws IllegalArgumentException {
        double op1 = 0;
        try {
            op1 = Double.parseDouble(num1);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException(String.format("número inválido:\"%s\"", num1));
        }
        double op2 = 0.;
        try {
            op2 = Double.parseDouble(num2);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException(String.format("número inválido:\"%s\"", num2));
        }
        return op1 - op2;
    }

}

