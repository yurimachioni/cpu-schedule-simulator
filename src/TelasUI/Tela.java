/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TelasUI;

import static Logica.Logica.*;
import Logica.Processo;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author lumni
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */

    
    
    public Tela() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        QuantumTEXT = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        tempoLabel = new javax.swing.JLabel();
        periodoLabel = new javax.swing.JLabel();
        nome1 = new java.awt.TextField();
        nome2 = new java.awt.TextField();
        nome4 = new java.awt.TextField();
        nome3 = new java.awt.TextField();
        nome5 = new java.awt.TextField();
        nome6 = new java.awt.TextField();
        e1 = new java.awt.TextField();
        e2 = new java.awt.TextField();
        e3 = new java.awt.TextField();
        e4 = new java.awt.TextField();
        e5 = new java.awt.TextField();
        e6 = new java.awt.TextField();
        p1 = new java.awt.TextField();
        p2 = new java.awt.TextField();
        p3 = new java.awt.TextField();
        p4 = new java.awt.TextField();
        p5 = new java.awt.TextField();
        p6 = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        slider1 = new javax.swing.JSlider();
        nprocs = new javax.swing.JLabel();
        RoundRob = new javax.swing.JRadioButton();
        RateMono = new javax.swing.JRadioButton();
        EDF = new javax.swing.JRadioButton();
        Schedule = new javax.swing.JButton();
        QuantumLabel = new javax.swing.JLabel();
        canvas1 = new java.awt.Canvas();
        canvas2 = new java.awt.Canvas();
        canvas3 = new java.awt.Canvas();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        out3 = new javax.swing.JLabel();
        out2 = new javax.swing.JLabel();
        out1 = new javax.swing.JLabel();
        out5 = new javax.swing.JLabel();
        out6 = new javax.swing.JLabel();
        out4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        idle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        quantumTEXT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        utilizacao = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        QuantumTEXT.setText("4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1150, 530));
        setMinimumSize(new java.awt.Dimension(895, 530));
        setName("telaInicial"); // NOI18N
        setPreferredSize(new java.awt.Dimension(895, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomeLabel.setText("Nome do processo");
        getContentPane().add(nomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 11, 110, -1));

        tempoLabel.setText("Tempo de Execução");
        getContentPane().add(tempoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        periodoLabel.setText("Período de Execução");
        getContentPane().add(periodoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        nome1.setBackground(new java.awt.Color(128, 128, 128));
        nome1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nome1.setEditable(false);
        nome1.setText("T1");
        nome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome1ActionPerformed(evt);
            }
        });
        getContentPane().add(nome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 35, 92, -1));

        nome2.setBackground(new java.awt.Color(128, 128, 128));
        nome2.setEditable(false);
        nome2.setText("T2");
        getContentPane().add(nome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 65, 92, -1));

        nome4.setBackground(new java.awt.Color(128, 128, 128));
        nome4.setEditable(false);
        nome4.setText("T4");
        getContentPane().add(nome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 128, 92, -1));

        nome3.setBackground(new java.awt.Color(128, 128, 128));
        nome3.setEditable(false);
        nome3.setText("T3");
        getContentPane().add(nome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 95, 92, -1));

        nome5.setBackground(new java.awt.Color(128, 128, 128));
        nome5.setEditable(false);
        nome5.setText("T5");
        getContentPane().add(nome5, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 158, 92, -1));

        nome6.setBackground(new java.awt.Color(128, 128, 128));
        nome6.setEditable(false);
        nome6.setText("T6");
        getContentPane().add(nome6, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 188, 92, -1));

        e1.setBackground(new java.awt.Color(128, 128, 128));
        e1.setEditable(false);
        e1.setText("1");
        e1.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                e1TextValueChanged(evt);
            }
        });
        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });
        e1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                e1CaretPositionChanged(evt);
            }
        });
        getContentPane().add(e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 92, -1));

        e2.setBackground(new java.awt.Color(128, 128, 128));
        e2.setEditable(false);
        e2.setText("2");
        e2.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                e2TextValueChanged(evt);
            }
        });
        getContentPane().add(e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 92, -1));

        e3.setBackground(new java.awt.Color(128, 128, 128));
        e3.setEditable(false);
        e3.setText("5");
        e3.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                e3TextValueChanged(evt);
            }
        });
        getContentPane().add(e3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 92, -1));

        e4.setBackground(new java.awt.Color(128, 128, 128));
        e4.setEditable(false);
        e4.setText("4");
        e4.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                e4TextValueChanged(evt);
            }
        });
        getContentPane().add(e4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 92, -1));

        e5.setBackground(new java.awt.Color(128, 128, 128));
        e5.setEditable(false);
        e5.setText("3");
        e5.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                e5TextValueChanged(evt);
            }
        });
        getContentPane().add(e5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 92, -1));

        e6.setBackground(new java.awt.Color(128, 128, 128));
        e6.setEditable(false);
        e6.setText("3");
        e6.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                e6TextValueChanged(evt);
            }
        });
        getContentPane().add(e6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 92, -1));

        p1.setBackground(new java.awt.Color(128, 128, 128));
        p1.setEditable(false);
        p1.setText("4");
        p1.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                p1TextValueChanged(evt);
            }
        });
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 92, -1));

        p2.setBackground(new java.awt.Color(128, 128, 128));
        p2.setEditable(false);
        p2.setText("5");
        p2.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                p2TextValueChanged(evt);
            }
        });
        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 92, -1));

        p3.setBackground(new java.awt.Color(128, 128, 128));
        p3.setEditable(false);
        p3.setText("20");
        p3.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                p3TextValueChanged(evt);
            }
        });
        getContentPane().add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 92, -1));

        p4.setBackground(new java.awt.Color(128, 128, 128));
        p4.setEditable(false);
        p4.setText("15");
        p4.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                p4TextValueChanged(evt);
            }
        });
        getContentPane().add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 92, -1));

        p5.setBackground(new java.awt.Color(128, 128, 128));
        p5.setEditable(false);
        p5.setText("20");
        p5.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                p5TextValueChanged(evt);
            }
        });
        getContentPane().add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 92, -1));

        p6.setBackground(new java.awt.Color(128, 128, 128));
        p6.setEditable(false);
        p6.setText("20");
        p6.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                p6TextValueChanged(evt);
            }
        });
        getContentPane().add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 92, -1));

        jLabel1.setText("Numero de processos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        slider1.setForeground(new java.awt.Color(0, 0, 0));
        slider1.setMaximum(6);
        slider1.setPaintLabels(true);
        slider1.setPaintTicks(true);
        slider1.setToolTipText("Numero de Processos");
        slider1.setValue(0);
        slider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider1StateChanged(evt);
            }
        });
        getContentPane().add(slider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 160, -1));

        nprocs.setText("0");
        getContentPane().add(nprocs, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        buttonGroup1.add(RoundRob);
        RoundRob.setSelected(true);
        RoundRob.setText("Round Robin");
        RoundRob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoundRobActionPerformed(evt);
            }
        });
        getContentPane().add(RoundRob, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 129, -1));

        buttonGroup1.add(RateMono);
        RateMono.setText("Rate Monotonic");
        RateMono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RateMonoActionPerformed(evt);
            }
        });
        getContentPane().add(RateMono, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 129, -1));

        buttonGroup1.add(EDF);
        EDF.setText("Earliest Deadline First");
        EDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDFActionPerformed(evt);
            }
        });
        getContentPane().add(EDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, -1, -1));

        Schedule.setText("Schedule !");
        Schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScheduleActionPerformed(evt);
            }
        });
        getContentPane().add(Schedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 129, 83));

        QuantumLabel.setText("Quantum");
        getContentPane().add(QuantumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));
        getContentPane().add(canvas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 305, -1, -1));
        getContentPane().add(canvas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 522, -1, -1));
        getContentPane().add(canvas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 287, -1, -1));

        jLabel3.setText("T1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 254, -1, -1));

        jLabel4.setText("T2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 287, -1, -1));

        jLabel5.setText("T3");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 319, -1, -1));

        jLabel6.setText("T4");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 351, -1, -1));

        jLabel7.setText("T5");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 383, -1, -1));

        jLabel8.setText("T6");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 415, -1, -1));

        out3.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        out3.setForeground(new java.awt.Color(0, 140, 0));
        out3.setText("...");
        out3.setMaximumSize(new java.awt.Dimension(500, 14));
        getContentPane().add(out3, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 320, -1, -1));

        out2.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        out2.setForeground(new java.awt.Color(140, 0, 0));
        out2.setText("...");
        out2.setMaximumSize(new java.awt.Dimension(500, 14));
        getContentPane().add(out2, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 288, -1, -1));

        out1.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        out1.setForeground(new java.awt.Color(0, 0, 140));
        out1.setText("...");
        out1.setMaximumSize(new java.awt.Dimension(500, 14));
        getContentPane().add(out1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 255, -1, -1));

        out5.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        out5.setForeground(new java.awt.Color(0, 255, 0));
        out5.setText("...");
        out5.setMaximumSize(new java.awt.Dimension(500, 14));
        getContentPane().add(out5, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 384, -1, -1));

        out6.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        out6.setForeground(new java.awt.Color(0, 0, 255));
        out6.setText("...");
        out6.setMaximumSize(new java.awt.Dimension(500, 14));
        getContentPane().add(out6, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 416, -1, -1));

        out4.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        out4.setForeground(new java.awt.Color(255, 0, 0));
        out4.setText("...");
        out4.setMaximumSize(new java.awt.Dimension(500, 14));
        getContentPane().add(out4, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 352, -1, -1));

        jLabel15.setText("Idle");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 447, -1, -1));

        time.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        time.setText("...");
        time.setMaximumSize(new java.awt.Dimension(500, 14));
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        idle.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        idle.setText("...");
        idle.setMaximumSize(new java.awt.Dimension(500, 14));
        getContentPane().add(idle, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 448, -1, -1));

        jLabel2.setText("t");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        time1.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        time1.setText("...");
        time1.setMaximumSize(new java.awt.Dimension(500, 14));
        getContentPane().add(time1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        quantumTEXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantumTEXT.setText("4");
        getContentPane().add(quantumTEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 40, -1));

        jLabel9.setText("t");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        jLabel10.setText("Utilização da CPU");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, -1, -1));

        utilizacao.setText("0");
        getContentPane().add(utilizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 20, -1));

        jLabel12.setText("%");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, -1, -1));

        jLabel11.setText("Política de Escalonamento");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Processo[] readInputs(Processo[] procs){
        
        procs = new Processo[Integer.parseInt(nprocs.getText())];
        
        if(Integer.parseInt(nprocs.getText()) > 0)
            procs[0] = new Processo(nome1.getText(), Integer.parseInt(e1.getText()), Integer.parseInt(p1.getText()));
        
        if(Integer.parseInt(nprocs.getText()) > 1)
             procs[1] = new Processo(nome2.getText(), Integer.parseInt(e2.getText()), Integer.parseInt(p2.getText()));
        
        if(Integer.parseInt(nprocs.getText()) > 2)
            procs[2] = new Processo(nome3.getText(), Integer.parseInt(e3.getText()), Integer.parseInt(p3.getText()));
        
        if(Integer.parseInt(nprocs.getText()) > 3)
            procs[3] = new Processo(nome4.getText(), Integer.parseInt(e4.getText()), Integer.parseInt(p4.getText()));
        
        if(Integer.parseInt(nprocs.getText()) > 4)
            procs[4] = new Processo(nome5.getText(), Integer.parseInt(e5.getText()), Integer.parseInt(p5.getText()));
        
        if(Integer.parseInt(nprocs.getText()) > 5)
            procs[5] = new Processo(nome6.getText(), Integer.parseInt(e6.getText()), Integer.parseInt(p6.getText()));
        
        return procs;
    }
    
    private void nome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome1ActionPerformed

    private void slider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider1StateChanged
        nprocs.setText(""+slider1.getValue());
        if(slider1.getValue() == 0){
            nome1.setEditable(false); nome1.setBackground(Color.GRAY); 
            e1.setEditable(false);  e1.setBackground(Color.GRAY); 
            p1.setEditable(false); p1.setBackground(Color.GRAY); 
        } else if(slider1.getValue() == 1){
            e1.setEditable(true);  e1.setBackground(Color.WHITE); 
            p1.setEditable(true); p1.setBackground(Color.WHITE);

            nome2.setEditable(false);nome2.setBackground(Color.GRAY); 
            e2.setEditable(false);  e2.setBackground(Color.GRAY); 
            p2.setEditable(false); p2.setBackground(Color.GRAY);
            
        }else if(slider1.getValue() == 2){ 
            e2.setEditable(true);  e2.setBackground(Color.WHITE); 
            p2.setEditable(true); p2.setBackground(Color.WHITE);
            
            nome3.setEditable(false);nome3.setBackground(Color.GRAY); 
            e3.setEditable(false);  e3.setBackground(Color.GRAY); 
            p3.setEditable(false); p3.setBackground(Color.GRAY);
        }else if(slider1.getValue() == 3){
            e3.setEditable(true);  e3.setBackground(Color.WHITE); 
            p3.setEditable(true); p3.setBackground(Color.WHITE);
            
            nome4.setEditable(false);nome4.setBackground(Color.GRAY); 
            e4.setEditable(false);  e4.setBackground(Color.GRAY); 
            p4.setEditable(false); p4.setBackground(Color.GRAY);
        }else if(slider1.getValue() == 4){ 
            e4.setEditable(true);  e4.setBackground(Color.WHITE); 
            p4.setEditable(true); p4.setBackground(Color.WHITE);
            
            nome5.setEditable(false);nome5.setBackground(Color.GRAY);  
            e5.setEditable(false);  e5.setBackground(Color.GRAY); 
            p5.setEditable(false); p5.setBackground(Color.GRAY);
        }else if(slider1.getValue() == 5){  
            e5.setEditable(true);  e5.setBackground(Color.WHITE); 
            p5.setEditable(true); p5.setBackground(Color.WHITE);
            
            nome6.setEditable(false);nome6.setBackground(Color.GRAY);  
            e6.setEditable(false);  e6.setBackground(Color.GRAY); 
            p6.setEditable(false); p6.setBackground(Color.GRAY);
        }else if(slider1.getValue() == 6){
            e6.setEditable(true);  e6.setBackground(Color.WHITE); 
            p6.setEditable(true); p6.setBackground(Color.WHITE);
        }
        updateUtilizacao();
    }//GEN-LAST:event_slider1StateChanged

    private void RoundRobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoundRobActionPerformed
        QuantumLabel.setVisible(true);
        quantumTEXT.setVisible(true);
        
    }//GEN-LAST:event_RoundRobActionPerformed

    private void ScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScheduleActionPerformed
        int[] timeline;
        
        Processo.setPnumber(0);
        Processo[] procs = null;
        
        if(Integer.parseInt(nprocs.getText()) == 0) 
            JOptionPane.showMessageDialog(this, "É necessário no mínimo um processo","Inane error",JOptionPane.ERROR_MESSAGE);
        else {
            
            procs = readInputs(procs);
            if(RoundRob.isSelected()) {

                int inputquantum = Integer.parseInt(quantumTEXT.getText());
                if(inputquantum < 0 || inputquantum > 200){
                     JOptionPane.showMessageDialog(this, "Quantum invalido","Inane error",JOptionPane.ERROR_MESSAGE);
                }
                else {
                    timeline = RoundRobin(procs, inputquantum);
                    printOutput(timeline);
                }
            }
            else if(RateMono.isSelected()){ 
                timeline = RateMonotonic(procs);
                printOutput(timeline);
            }
            else if(EDF.isSelected()) {
                timeline = EDF(procs);   
                printOutput(timeline);
            }
        }
    }//GEN-LAST:event_ScheduleActionPerformed

    private void printOutput(int[] timeline){
        int nout = slider1.getValue() + 1;
        String[] out = new String[nout]; //cria nprocs + 1 (idle) strings
        String times = "";
        
        for(int j = 0; j < nout; j++)
            out[j]="";
        
        for (int i = 0; i <= 50; i++){
            for(int j = 0; j < nout; j++){
                if(j == timeline[i])
                    out[j] += "██ ";
                else out[j] += "   ";
            }
            if(i < 10) times += i + "  ";
            else times += i + " ";
        }
         
        idle.setText(out[0]);
        out1.setText(out[1]);
        time.setText(times);
        time1.setText(times);
        
        if(nout > 2)out2.setText(out[2]); else out2.setText("");
        if(nout > 3)out3.setText(out[3]); else out3.setText("");
        if(nout > 4)out4.setText(out[4]); else out4.setText("");
        if(nout > 5)out5.setText(out[5]); else out5.setText("");
        if(nout > 6)out6.setText(out[6]); else out6.setText("");
    }
    
    private void RateMonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RateMonoActionPerformed
        QuantumLabel.setVisible(false);
        quantumTEXT.setVisible(false);
    }//GEN-LAST:event_RateMonoActionPerformed

    private void EDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDFActionPerformed
        QuantumLabel.setVisible(false);
        quantumTEXT.setVisible(false);
    }//GEN-LAST:event_EDFActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1ActionPerformed

    private void e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e1ActionPerformed

    private void e1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_e1CaretPositionChanged
        
    }//GEN-LAST:event_e1CaretPositionChanged

    private void e1TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_e1TextValueChanged
        updateUtilizacao();
    }//GEN-LAST:event_e1TextValueChanged

    private void p1TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_p1TextValueChanged
        updateUtilizacao();
    }//GEN-LAST:event_p1TextValueChanged

    private void e2TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_e2TextValueChanged
        updateUtilizacao();
    }//GEN-LAST:event_e2TextValueChanged

    private void p2TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_p2TextValueChanged
        updateUtilizacao();
    }//GEN-LAST:event_p2TextValueChanged

    private void e3TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_e3TextValueChanged
        updateUtilizacao();
    }//GEN-LAST:event_e3TextValueChanged

    private void p3TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_p3TextValueChanged
        updateUtilizacao();
    }//GEN-LAST:event_p3TextValueChanged

    private void e4TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_e4TextValueChanged
        updateUtilizacao();
    }//GEN-LAST:event_e4TextValueChanged

    private void p4TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_p4TextValueChanged
        updateUtilizacao();
    }//GEN-LAST:event_p4TextValueChanged

    private void e5TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_e5TextValueChanged
        updateUtilizacao();
    }//GEN-LAST:event_e5TextValueChanged

    private void p5TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_p5TextValueChanged
        updateUtilizacao();
    }//GEN-LAST:event_p5TextValueChanged

    private void e6TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_e6TextValueChanged
        updateUtilizacao();
    }//GEN-LAST:event_e6TextValueChanged

    private void p6TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_p6TextValueChanged
        updateUtilizacao();
    }//GEN-LAST:event_p6TextValueChanged

    private void updateUtilizacao(){
        float U = 0;
        int percent;
        
        if(slider1.getValue() > 0 && Float.parseFloat(p1.getText()) != 0)
            U += Float.parseFloat(e1.getText())/ Float.parseFloat(p1.getText());
        if(slider1.getValue() > 1 && Float.parseFloat(p2.getText()) != 0)
            U += Float.parseFloat(e2.getText())/ Float.parseFloat(p2.getText());
        if(slider1.getValue() > 2 && Float.parseFloat(p3.getText()) != 0)
            U += Float.parseFloat(e3.getText())/ Float.parseFloat(p3.getText());
        if(slider1.getValue() > 3 && Float.parseFloat(p4.getText()) != 0)
            U += Float.parseFloat(e4.getText())/ Float.parseFloat(p4.getText());
        if(slider1.getValue() > 4 && Float.parseFloat(p5.getText()) != 0)
            U += Float.parseFloat(e5.getText())/ Float.parseFloat(p5.getText());
        if(slider1.getValue() > 5 && Float.parseFloat(p6.getText()) != 0)
            U += Float.parseFloat(e6.getText())/ Float.parseFloat(p6.getText());
        
        percent = (int) (U*100);
        
        utilizacao.setText(""+percent);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton EDF;
    private javax.swing.JLabel QuantumLabel;
    private javax.swing.JTextField QuantumTEXT;
    private javax.swing.JRadioButton RateMono;
    private javax.swing.JRadioButton RoundRob;
    private javax.swing.JButton Schedule;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private java.awt.Canvas canvas1;
    private java.awt.Canvas canvas2;
    private java.awt.Canvas canvas3;
    private java.awt.TextField e1;
    private java.awt.TextField e2;
    private java.awt.TextField e3;
    private java.awt.TextField e4;
    private java.awt.TextField e5;
    private java.awt.TextField e6;
    private javax.swing.JLabel idle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.TextField nome1;
    private java.awt.TextField nome2;
    private java.awt.TextField nome3;
    private java.awt.TextField nome4;
    private java.awt.TextField nome5;
    private java.awt.TextField nome6;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel nprocs;
    private javax.swing.JLabel out1;
    private javax.swing.JLabel out2;
    private javax.swing.JLabel out3;
    private javax.swing.JLabel out4;
    private javax.swing.JLabel out5;
    private javax.swing.JLabel out6;
    private java.awt.TextField p1;
    private java.awt.TextField p2;
    private java.awt.TextField p3;
    private java.awt.TextField p4;
    private java.awt.TextField p5;
    private java.awt.TextField p6;
    private javax.swing.JLabel periodoLabel;
    private javax.swing.JTextField quantumTEXT;
    private javax.swing.JSlider slider1;
    private javax.swing.JLabel tempoLabel;
    private javax.swing.JLabel time;
    private javax.swing.JLabel time1;
    private javax.swing.JLabel utilizacao;
    // End of variables declaration//GEN-END:variables
}
