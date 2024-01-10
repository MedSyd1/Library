package org.example;

import java.time.LocalDate;

public class Loan implements Comparable<Loan>{

    private String titleName;
    private int id;
    private LocalDate LD;
    private LocalDate BD;
    
    public Loan(String titleName, int id, LocalDate lD, LocalDate bD) {
        this.titleName = titleName;
        this.id = id;
        LD = lD;
        BD = bD;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getLD() {
        return LD;
    }

    public void setLD(LocalDate lD) {
        LD = lD;
    }

    public LocalDate getBD() {
        return BD;
    }

    public void setBD(LocalDate bD) {
        BD = bD;
    }

    @Override
    public int compareTo(Loan o) {
        return Integer.compare(id, this.getId());
    }
    
    

    
}
