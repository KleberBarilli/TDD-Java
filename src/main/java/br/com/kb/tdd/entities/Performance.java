package br.com.kb.tdd.entities;

import java.math.BigDecimal;

public enum Performance {
    POOR {
        @Override
        public BigDecimal readjustPercentage(){
            return new BigDecimal("0.03");
        }
    },
    GOOD {
    @Override
    public BigDecimal readjustPercentage(){
        return new BigDecimal("0.15");
    }
    },
    AWESOME
    {  @Override
        public BigDecimal readjustPercentage(){
        return new BigDecimal("0.20");
    }};


    public abstract BigDecimal readjustPercentage();
}
