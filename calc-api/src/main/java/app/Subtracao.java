package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

public class Subtracao {
    @Path("/subtracao/{num1}/{num2}")
    @GET
    public String rotaSub(@PathParam String num1, @PathParam String num2) {
        try {
            // converter em double
            double sub = Double.parseDouble(num1) - Double.parseDouble(num2);
            // retornar a subtração dos parametros
            return String.format("Subtração:%s", sub);
        } catch (NumberFormatException nfe) {
            new BadRequestException(String.format("Formato inválido"));
        }
        return "";
    }

    public double sub(String num11, String num22) throws IllegalArgumentException {
        double num1 = 0;
        try {
            num1 = Double.parseDouble(num11);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException(String.format("número inválido:\"%s\"", num11));
        }
        double num2 = 0.;
        try {
            num2 = Double.parseDouble(num22);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException(String.format("número inválido:\"%s\"", num22));
        }
        return num1 - num2;
    }

}

