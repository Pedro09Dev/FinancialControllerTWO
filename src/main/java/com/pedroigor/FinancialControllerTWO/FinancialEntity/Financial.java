package com.pedroigor.FinancialControllerTWO.FinancialEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Data
public class Financial {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    private String transferencia;

    private String mediaGasto;

    public Financial(Long id, String name, Date date, String transferencia, String mediaGasto) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.transferencia = transferencia;
        this.mediaGasto = mediaGasto;
    }

    public Financial(){
        super();
    }

}
