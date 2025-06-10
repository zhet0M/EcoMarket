package com.pago.pago.dto;

import java.time.LocalDate;
import lombok.*;

@Data 
@NoArgsConstructor
@AllArgsConstructor
public class Pago_dto {
    private Integer id_pago;
    private LocalDate fecha_pago;
    private Integer monto;
    private String referencia_pago;
    private String estado_pago;
    private Integer id_metodo;
    private Integer id_venta;

}
