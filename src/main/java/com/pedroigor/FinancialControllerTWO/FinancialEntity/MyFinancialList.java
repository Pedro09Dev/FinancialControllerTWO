package com.pedroigor.FinancialControllerTWO.FinancialEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "financial")
@Data
public class MyFinancialList {

    @Id
    private Long id;

    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    private String transferencia;

    private String mediaGasto;

    public MyFinancialList(Long id, String name, Date date, String transferencia, String mediaGasto){
        super();
        this.id = id;
        this.name = name;
        this.date = date;
        this.transferencia = transferencia;
        this.mediaGasto = mediaGasto;
    }

    public MyFinancialList(){
        super();
    }

}
