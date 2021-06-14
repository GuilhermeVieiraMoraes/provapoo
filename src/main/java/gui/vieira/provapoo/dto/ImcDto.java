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
        if(this.imc < 18.5){
            this.classificacao="Abaixo do Peso";
        }else if(this.imc >= 18.5 & this.imc <=24.99){
            this.classificacao="Peso Ideal";
        }else if(this.imc >= 25 & this.imc <=29.99){
            this.classificacao="Excesso de Peso";
        }else if(this.imc >= 30 & this.imc <=34.99){
            this.classificacao="Obesidade Grau 1";
        }else if(this.imc >= 35 & this.imc <=39.99){
            this.classificacao="Obesidade Grau 2";
        }else{
            this.classificacao="Obesidade Grau 3";
        }
        
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getRisco() {
        if(this.imc < 18.5){
            this.risco="Elevado";
        }if(this.imc >= 18.5 & this.imc <=24.99){
            this.risco="Inexistente";
        }if(this.imc >= 25 & this.imc <=29.99){
            this.risco="Elevado";
        }if(this.imc >= 30 & this.imc <=34.99){
            this.risco="Muito Elevado";
        }if(this.imc >= 35 & this.imc <=39.99){
            this.risco="Muitíssimo Elevado";
        }else{
            this.risco="Obesidade Mórbida";
        }
        return risco;
    }

    public void setRisco(String risco) {
        this.risco = risco;
    }
}
