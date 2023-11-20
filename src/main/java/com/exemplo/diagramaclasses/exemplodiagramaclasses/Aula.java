package com.exemplo.diagramaclasses.exemplodiagramaclasses;

import java.util.ArrayList;
import java.util.Date;

public class Aula {
    public int numero;
    public String conteudo;
    public Date data;

    public Disciplina disciplina;
    public Professor professor;
    public Monitor monitor;
    public ArrayList<Aluno> alunos;

    public Aula(){
        this.professor = new Professor();
        this.disciplina = new Disciplina();
        this.monitor = new Monitor();
        this.alunos = new ArrayList<>();
    }
}
