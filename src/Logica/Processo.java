/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author lumni
 */
public class Processo {
    private String nome;
    private int tempo;
    private int periodo;
    private state estado;
    private int timeSinceLastReady;
    private int timeExecuted;
    private int totalTimeExecuted;
    private static int pnumber=0;
    private int number;

    public static int getPnumber() {
        return pnumber;
    }

    public static void setPnumber(int pnumber) {
        Processo.pnumber = pnumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public int getTotalTimeExecuted() {
        return totalTimeExecuted;
    }

    public void setTotalTimeExecuted(int totalTimeExecuted) {
        this.totalTimeExecuted = totalTimeExecuted;
    }

    public int getTimeExecuted() {
        return timeExecuted;
    }

    public void setTimeExecuted(int timeExecuted) {
        this.timeExecuted = timeExecuted;
    }

    public int getTimeSinceLastReady() {
        return timeSinceLastReady;
    }

    public void setTimeSinceLastReady(int timeSinceLastExec) {
        this.timeSinceLastReady = timeSinceLastExec;
    }

    public state getEstado() {
        return estado;
    }

    public void setEstado(state estado) {
        this.estado = estado;
    }
    public enum state {
        executando,
        pronto,
        dormindo,
        terminado;
    }
    
    public Processo(){
        this.nome = "T" + pnumber++;
        number = pnumber;
        this.tempo = 2;
        this.periodo = 10;
        this.estado = state.pronto;
        this.timeSinceLastReady = 0;
        this.timeExecuted = 0;
        this.totalTimeExecuted = 0;
    }
    
    public Processo(String nome, int tempo, int periodo){
        pnumber++;
        number = pnumber;
        this.nome = nome;
        this.tempo = tempo;
        this.periodo = periodo;
        this.estado = state.pronto;
        this.timeSinceLastReady = 0;
        this.timeExecuted = 0;
        this.totalTimeExecuted = 0;
    }
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

}
