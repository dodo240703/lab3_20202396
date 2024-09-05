package com.example.lab2_20202396.Models;

public class Seguro {

    private String empresaAseguradora;
    private double coberturaMaxima;
    private double tarifa;

    public String getEmpresaAseguradora() {
        return empresaAseguradora;
    }

    public void setEmpresaAseguradora(String empresaAseguradora) {
        this.empresaAseguradora = empresaAseguradora;
    }

    public double getCoberturaMaxima() {
        return coberturaMaxima;
    }

    public void setCoberturaMaxima(double coberturaMaxima) {
        this.coberturaMaxima = coberturaMaxima;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
