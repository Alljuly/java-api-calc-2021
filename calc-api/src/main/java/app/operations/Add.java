package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

public class Add {

    @Path("/add/{op}/{po}")
    @GET
    public String routeAdd(@PathParam String op, @PathParam String po) {

        try {
            // converter em double
            double sum = Double.parseDouble(op) + Double.parseDouble(po);
            // retornar soma dos parametros
            return String.format("Result :%s", sum);
        } catch (NumberFormatException nfe) {
            new BadRequestException(String.format("Formato inválido"));
        }
        return "";
    }

    public double add(String op1, String po1) throws IllegalArgumentException {
        double op = 0;
        try {
            op = Double.parseDouble(op1);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException(String.format("número inválido:\"%s\"", op1));
        }
        double po = 0.;
        try {
            po = Double.parseDouble(po1);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException(String.format("número inválido:\"%s\"", po1));
        }
        return op + po;
    }

}
