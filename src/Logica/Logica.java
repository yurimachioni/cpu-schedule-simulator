/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


/**
 *
 * @author lumni
 */
public abstract class Logica {
    
    
    public static int[] RoundRobin(Processo[] procs, int quantum){
        Queue<Processo> prontos = new LinkedList<>();
        Queue<Processo> dormindo = new LinkedList<>();
        Processo procNaCPU = procs[0];
        boolean CPUocupada = false;
        int[] timeline = new int[200];
        
        /*todos comecam prontos*/
        prontos.addAll(Arrays.asList(procs));
        
        /*em cada unidade de tempo*/
        for(int i = 0; i < 200; i++){ 
            for (Processo proc : procs) 
                if (proc != null) 
                    proc.setTimeSinceLastReady(proc.getTimeSinceLastReady() + 1);
               
            /*tenta entrar no processador*/
            if(!CPUocupada){                
                procNaCPU = prontos.poll();
                if(procNaCPU != null){
                    CPUocupada = true;
                    procNaCPU.setEstado(Processo.state.executando);
                }
            }
            
            /*faz passar o tempo pra cada processo dormindo*/
            int ndormindo = dormindo.size();
            for(int j = 0; j < ndormindo; j++){
                Processo temp = dormindo.poll();
                if(temp != null){
                    if(temp.getTimeSinceLastReady() >= temp.getPeriodo()){      //ve se ta na hora de acordar
                        temp.setEstado(Processo.state.pronto);               //acorda se ta
                        temp.setTimeSinceLastReady(0);
                        prontos.add(temp);
                    } else
                        dormindo.add(temp);                                  //continua dormindo se nao
                }  
            }
            
            /*passa o tempo para o processo que esta na CPU*/
            if(procNaCPU != null){
                procNaCPU.setTimeExecuted(procNaCPU.getTimeExecuted()+1);
                procNaCPU.setTotalTimeExecuted(procNaCPU.getTotalTimeExecuted()+1); 
                timeline[i] = procNaCPU.getNumber();
            } else timeline[i] = 0;
                
            /*ve se ja ta na hora de sair*/
            if(procNaCPU != null){
                
                if(procNaCPU.getTotalTimeExecuted()>= procNaCPU.getTempo()){
                    CPUocupada = false;
                    procNaCPU.setEstado(Processo.state.dormindo);
                    procNaCPU.setTimeExecuted(0);
                    procNaCPU.setTotalTimeExecuted(0);
                    if(procNaCPU.getTempo() != procNaCPU.getPeriodo())
                        dormindo.add(procNaCPU);
                    else
                        prontos.add(procNaCPU);
                    procNaCPU = null;
                } else if (procNaCPU.getTimeExecuted() >= quantum){
                    CPUocupada = false;
                    procNaCPU.setEstado(Processo.state.pronto);
                    procNaCPU.setTimeExecuted(0);
                    prontos.add(procNaCPU);
                    procNaCPU = null;
                }
            }
        }
        return timeline;
    }
    
    public static int[] RateMonotonic(Processo[] procs){
        
        ComparadorRM cmp = new ComparadorRM();
        PriorityQueue<Processo> prontos = new PriorityQueue<>(6,cmp);
        Queue<Processo> dormindo = new LinkedList<>();
        Processo procNaCPU = procs[0];
        boolean CPUocupada = false;
        int[] timeline = new int[200];
        
        for (Processo proc : procs) {
            if (proc != null) {
                prontos.add(proc);
            }
        }
        
        /*em cada unidade de tempo*/
                for(int i = 0; i < 200; i++){ 
            for (Processo proc : procs) 
                if (proc != null) 
                    proc.setTimeSinceLastReady(proc.getTimeSinceLastReady() + 1);
               
            /*tenta entrar no processador*/
            if(!CPUocupada){                
                procNaCPU = prontos.poll();
                if(procNaCPU != null){
                    CPUocupada = true;
                    procNaCPU.setEstado(Processo.state.executando);
                }
            }
            
            /*faz passar o tempo pra cada processo dormindo*/
            int ndormindo = dormindo.size();
            for(int j = 0; j < ndormindo; j++){
                Processo temp = dormindo.poll();
                if(temp != null){
                    if(temp.getTimeSinceLastReady() >= temp.getPeriodo()){      //ve se ta na hora de acordar
                        temp.setEstado(Processo.state.pronto);               //acorda se ta
                        temp.setTimeSinceLastReady(0);
                        prontos.add(temp);
                    } else
                        dormindo.add(temp);                                  //continua dormindo se nao
                }  
            }
            
            /*passa o tempo para o processo que esta na CPU*/
            if(procNaCPU != null){
                procNaCPU.setTimeExecuted(procNaCPU.getTimeExecuted()+1);
                procNaCPU.setTotalTimeExecuted(procNaCPU.getTotalTimeExecuted()+1); 
                timeline[i] = procNaCPU.getNumber();
            } else timeline[i] = 0;
                
            /*ve se ja ta na hora de sair*/
            if(procNaCPU != null){
                
                if(procNaCPU.getTotalTimeExecuted()>= procNaCPU.getTempo()){
                    CPUocupada = false;
                    procNaCPU.setEstado(Processo.state.dormindo);
                    procNaCPU.setTimeExecuted(0);
                    procNaCPU.setTotalTimeExecuted(0);
                    if(procNaCPU.getTempo() != procNaCPU.getPeriodo())
                        dormindo.add(procNaCPU);
                    else
                        prontos.add(procNaCPU);
                    procNaCPU = null;
                }  else if (prontos.peek() != null){
                    if(procNaCPU.getPeriodo() > prontos.peek().getPeriodo()){
                        CPUocupada = false;
                        procNaCPU.setEstado(Processo.state.pronto);
                        procNaCPU.setTimeExecuted(0);
                        prontos.add(procNaCPU);
                        procNaCPU = null;
                    }
                }
            }
        }
        return timeline;
    }
    
    
    
   public static int[] EDF(Processo[] procs){
        
        ComparadorEDF cmp = new ComparadorEDF();
        PriorityQueue<Processo> prontos = new PriorityQueue<>(6,cmp);
        Queue<Processo> dormindo = new LinkedList<>();
        Processo procNaCPU = procs[0];
        boolean CPUocupada = false;
        int[] timeline = new int[200];
        
        for (Processo proc : procs) {
            if (proc != null) {
                prontos.add(proc);
            }
        }
        
        /*em cada unidade de tempo*/
        for(int i = 0; i < 200; i++){ 
            for (Processo proc : procs) 
                if (proc != null) 
                    proc.setTimeSinceLastReady(proc.getTimeSinceLastReady() + 1);
               
            /*tenta entrar no processador*/
            if(!CPUocupada){                
                procNaCPU = prontos.poll();
                if(procNaCPU != null){
                    CPUocupada = true;
                    procNaCPU.setEstado(Processo.state.executando);
                }
            }
            
            /*faz passar o tempo pra cada processo dormindo*/
            int ndormindo = dormindo.size();
            for(int j = 0; j < ndormindo; j++){
                Processo temp = dormindo.poll();
                if(temp != null){
                    if(temp.getTimeSinceLastReady() >= temp.getPeriodo()){      //ve se ta na hora de acordar
                        temp.setEstado(Processo.state.pronto);               //acorda se ta
                        temp.setTimeSinceLastReady(0);
                        prontos.add(temp);
                    } else
                        dormindo.add(temp);                                  //continua dormindo se nao
                }  
            }
            
            /*passa o tempo para o processo que esta na CPU*/
            if(procNaCPU != null){
                procNaCPU.setTimeExecuted(procNaCPU.getTimeExecuted()+1);
                procNaCPU.setTotalTimeExecuted(procNaCPU.getTotalTimeExecuted()+1); 
                timeline[i] = procNaCPU.getNumber();
            } else timeline[i] = 0;
                
            /*ve se ja ta na hora de sair*/
            if(procNaCPU != null){
                
                if(procNaCPU.getTotalTimeExecuted()>= procNaCPU.getTempo()){
                    CPUocupada = false;
                    procNaCPU.setEstado(Processo.state.dormindo);
                    procNaCPU.setTimeExecuted(0);
                    procNaCPU.setTotalTimeExecuted(0);
                    if(procNaCPU.getTempo() != procNaCPU.getPeriodo())
                        dormindo.add(procNaCPU);
                    else
                        prontos.add(procNaCPU);
                    procNaCPU = null;
                }  else if (prontos.peek() != null){
                    if( procNaCPU.getTempo() - procNaCPU.getTotalTimeExecuted() > prontos.peek().getTempo() - prontos.peek().getTotalTimeExecuted()){
                        CPUocupada = false;
                        procNaCPU.setEstado(Processo.state.pronto);
                        procNaCPU.setTimeExecuted(0);
                        prontos.add(procNaCPU);
                        procNaCPU = null;
                    }
                }
            }
        }
        return timeline;
    }
}