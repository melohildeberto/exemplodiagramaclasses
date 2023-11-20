package com.exemplo.diagramaclasses.exemplodiagramaclasses;

public class Aluno extends Pessoa{
    public int matricula;
    public float nota1;
    public float nota2;

    public float getMedia(){
        return (nota1 + nota2) / 2;
    }
}
