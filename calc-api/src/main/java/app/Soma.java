package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;
public class Soma{
    
    @Path("/soma/{op}/{po}")
    @GET
    public String rotaSoma(@PathParam ("op") String op, @PathParam ("po") String po){
   
       try{  
           //converter em double
            double sum = Double.parseDouble(op) + Double.parseDouble(po);
            // retornar soma dos parametros 
            return String.format("Soma:%s", sum);
        } catch (NumberFormatException nfe) {
            new BadRequestException (String.format("Formato inválido"));
        }   
    return "";

    }

}
