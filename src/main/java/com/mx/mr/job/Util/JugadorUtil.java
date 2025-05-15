package com.mx.mr.job.Util;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class JugadorUtil {
	public String validarTexto(String texto) {
		String resultado = "NO";
		if(texto != null && !texto.equals("")) {
			resultado = "SI";
		}
		return resultado;
	} 
	public String validarEntero(String texto) {
		String resultado = "SI";
		try {
			Integer variable = Integer.parseInt(texto);
		}catch(NumberFormatException nfe) {
			return "NO";
		}
		return resultado;
	}
	public String validarChar(Character texto) {
		String resultado = "NO";
		if(texto != null ) {
			resultado = "SI";
		}
		return resultado;
	} 
	public String validarLong(String texto) {
		String resultado = "SI";
		try {
			Long variable = Long.parseLong(texto);
		}catch(NumberFormatException nfe) {
			return "NO";
		}
		return resultado;
	}

        public boolean esFechaValida(String fecha) {
            try {
                LocalDate.parse(fecha, DateTimeFormatter.ISO_DATE);
                return true;
            } catch (DateTimeParseException e) {
                return false;
            }
        }
    

}
