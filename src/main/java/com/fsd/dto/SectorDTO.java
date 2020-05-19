package com.fsd.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SectorDTO implements Serializable {
    private static final long serialVersionUID = 3561409234966077219L;
    private BigDecimal value;
    @JsonSerialize(using= LocalDateTimeSerializer.class)
    @JsonFormat( pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime label;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public LocalDateTime getLabel() {
        return label;
    }

    public void setLabel(LocalDateTime label) {
        this.label = label;
    }


}
