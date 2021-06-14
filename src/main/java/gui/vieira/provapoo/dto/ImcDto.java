/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.vieira.provapoo.dto;

/**
 *
 * @author Note Moraes
 */
public class ImcDto {
    private float peso;
    private float altura;
    private float imc;
    private String classificacao;
    private String risco;

    public ImcDto(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }
    
    

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        this.imc = this.peso/(this.altura*this.altura);
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getRisco() {
        return risco;
    }

    public void setRisco(String risco) {
        this.risco = risco;
    }
}
