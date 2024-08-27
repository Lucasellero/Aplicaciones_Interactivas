package com.uade.tpo.cars_e_commerce.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "El auto que se intenta agregar ya existe")
public class CarDuplicateException extends Exception {

}
