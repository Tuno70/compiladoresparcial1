/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainApp;

import mainApp.Botones.CConexion;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class mainFom extends javax.swing.JFrame {
    

    /**
     * Creates new form mainFom
     */
    public mainFom() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InputTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        OutputTextArea = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        InputTextArea.setColumns(20);
        InputTextArea.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        InputTextArea.setRows(5);
        jScrollPane1.setViewportView(InputTextArea);

        OutputTextArea.setEditable(false);
        OutputTextArea.setColumns(20);
        OutputTextArea.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        OutputTextArea.setRows(5);
        jScrollPane2.setViewportView(OutputTextArea);

        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Ingreso de Datos");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Resultado del Analisis");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setText("Flujo de Caracteres");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("Mostrar Caracteres");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Cargar Archivo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Seleccionar Archivo");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Lineas y Columnas");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Tokens");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("TEST DB");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(241, 241, 241)
                .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(162, 162, 162)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton7)
                    .addComponent(jButton9))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Input_Text=InputTextArea.getText();
        char[] Split = Input_Text.toCharArray();
        String Resultado_Split = "";
        int Split_Length = Split.length;
        
        /**
         ASCII
         */
        int ASCII = 0;
        
        for (int i = 0; i < Split_Length; i++)
        {
            ASCII = (int) Split[i];
            
            if(Character.isLetter(Split[i]))
            {
                Resultado_Split = Resultado_Split + String.valueOf(Split[i]) + "\n";
            }
            else if (Character.isDigit(Split[i]))
            {
                Resultado_Split = Resultado_Split + String.valueOf(Split[i]) + "\n";
            }
            else if (ASCII == 9)
            {
                Resultado_Split = Resultado_Split + "Tabulacion (Chr = 9)\n";
            }
            else if (ASCII == 32)
            {
                Resultado_Split = Resultado_Split + "Espacio en Blanco (Chr = 32)\n";
            }
            else if (ASCII == 10)
            {
                Resultado_Split = Resultado_Split + "Salto de linea (Chr = 10)\n";
                Resultado_Split = Resultado_Split + "Fin de linea (Chr = 13)\n";
            }
            else
            {
                Resultado_Split = Resultado_Split + String.valueOf(Split[i]) + "\n";
            }
        }
        
        OutputTextArea.setText(Resultado_Split);
        System.out.println(Input_Text);
        System.out.println(Split_Length);
        System.out.println(Resultado_Split);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        InputTextArea.setText("");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        OutputTextArea.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String Input_Text=InputTextArea.getText();
        char[] Split = Input_Text.toCharArray();
        String Resultado_Split = "";
        int Split_Length = Split.length;
        
        /**
         ASCII
         */
        int ASCII = 0;
        
        for (int i = 0; i < Split_Length; i++)
        {
            ASCII = (int) Split[i];
            
            if(Character.isLetter(Split[i]))
            {
                Resultado_Split = Resultado_Split + String.valueOf(Split[i]);
                JOptionPane.showMessageDialog(this, Split[i]);
            }
            else if (Character.isDigit(Split[i]))
            {
                Resultado_Split = Resultado_Split + String.valueOf(Split[i]);
                JOptionPane.showMessageDialog(this, Split[i]);
            }
            else if (ASCII == 9)
            {
                Resultado_Split = Resultado_Split + "Tabulacion (Chr = 9)\n";
                JOptionPane.showMessageDialog(this, "Tabulacion (Chr = 9)");
            }
            else if (ASCII == 32)
            {
                Resultado_Split = Resultado_Split + "Espacio en Blanco (Chr = 32)\n";
                JOptionPane.showMessageDialog(this, "Espacio en Blanco (Chr = 32)");
            }
            else if (ASCII == 10)
            {
                Resultado_Split = Resultado_Split + "Salto de linea (Chr = 10)\n";
                JOptionPane.showMessageDialog(this, "Salto de linea (Chr = 10)");
                
                Resultado_Split = Resultado_Split + "Fin de Linea (Chr = 13)\n";
                JOptionPane.showMessageDialog(this, "Fin de Linea (Chr = 13)");
            }
            else
            {
                Resultado_Split = Resultado_Split + String.valueOf(Split[i]) + "\n";
                JOptionPane.showMessageDialog(this, Split[i]);
            }
            
            //JOptionPane.showMessageDialog(this, Resultado_Split);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        JFileChooser FC = new JFileChooser();
        FC.showOpenDialog(null);
        File Archivo = FC.getSelectedFile();
        
        try
        {
            FileReader FR = new FileReader (Archivo);
            BufferedReader BR = new BufferedReader(FR);
            String texto = "";
            String linea = "";
            while (((linea = BR.readLine()) !=null))
            {
                texto += linea + "\n";
            }
            OutputTextArea.setText("");
            InputTextArea.setText(texto);
        }
        catch (Exception e)
        {
            System.out.println("Error cargando el archivo");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String Input_Text=InputTextArea.getText();
        char[] Split = Input_Text.toCharArray();
        String Resultado_Split = "";
        int Split_Length = Split.length;
        
        int Fila = 1;
        int Columna = 1;
        
        /**
         ASCII
         */
        int ASCII = 0;
        
        for (int i = 0; i < Split_Length; i++)
        {
            ASCII = (int) Split[i];
            
            if(Character.isLetter(Split[i]))
            {
                Resultado_Split = Resultado_Split + String.valueOf(Split[i]) + "    Fila: " + String.valueOf(Fila) + "  Columna: " + String.valueOf(Columna) + "\n";
                Columna = Columna +1;
            }
            else if (Character.isDigit(Split[i]))
            {
                Resultado_Split = Resultado_Split + String.valueOf(Split[i]) + "    Fila: " + String.valueOf(Fila) + "  Columna: " + String.valueOf(Columna) + "\n";
                Columna = Columna +1;
            }
            else if (ASCII == 9)
            {
                Resultado_Split = Resultado_Split + "Tabulacion (Chr = 9)" + "    Fila: " + String.valueOf(Fila) + "  Columna: " + String.valueOf(Columna) + "\n";
                Columna = Columna +1;
            }
            else if (ASCII == 32)
            {
                Resultado_Split = Resultado_Split + "Espacio en Blanco (Chr = 32)" + "    Fila: " + String.valueOf(Fila) + "  Columna: " + String.valueOf(Columna) + "\n";
                Columna = Columna +1;
            }
            else if (ASCII == 10)
            {
                Resultado_Split = Resultado_Split + "Salto de linea (Chr = 10)" + "    Fila: " + String.valueOf(Fila) + "  Columna: " + String.valueOf(Columna) + "\n";
                Columna = Columna +1;
                Resultado_Split = Resultado_Split + "Fin de Linea (Chr = 13)" + "    Fila: " + String.valueOf(Fila) + "  Columna: " + String.valueOf(Columna) + "\n";
                Columna = 0;
                Fila = Fila +1;
            }
            else
            {
                Resultado_Split = Resultado_Split + String.valueOf(Split[i]) + "    Fila: " + String.valueOf(Fila) + "  Columna: " + String.valueOf(Columna) + "\n";
                Columna = Columna +1;
            }
            
            //JOptionPane.showMessageDialog(this, Resultado_Split);
        }
        OutputTextArea.setText(Resultado_Split);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        JFileChooser FC = new JFileChooser();
        FC.showOpenDialog(null);
        File Archivo = FC.getSelectedFile();
        String Texto2;
        
        try
        {
            FileReader FR = new FileReader (Archivo);
            BufferedReader BR = new BufferedReader(FR);
            String texto = "";
            String linea = "";
            while (((linea = BR.readLine()) !=null))
            {
                texto += linea + "\n";
            }
            Texto2 = InputTextArea.getText();
            Texto2 = Texto2 + texto;
            
            InputTextArea.setText(Texto2);
        }
        catch (Exception e)
        {
            System.out.println("Error cargando el archivo");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        //Tokens
        
        String Input_Text=InputTextArea.getText();
        char[] Split = Input_Text.toCharArray();
        String Resultado_Split = "";
        int Split_Length = Split.length;
        
        int Fila = 1;
        int Columna = 1;
        
        /**
         ASCII
         */
        int ASCII = 0;
        int ASCII2 = 0;
        String PalabraAux = "";
        
        for (int i = 0; i < Split_Length; i++)
        {
            ASCII = (int) Split[i];
            
            if(Character.isLetter(Split[i]))
            {
                PalabraAux = PalabraAux + String.valueOf(Split[i]);
                Columna = Columna +1;
                i++;
                
                while(Character.isLetter(Split[i]) || Character.isDigit(Split[i]))
                {
                    PalabraAux = PalabraAux + String.valueOf(Split[i]);
                    Columna = Columna +1;
                    i++;
                }
                if(PalabraAux.equals("Main") || PalabraAux.equals("Dim") || PalabraAux.equals("As") || PalabraAux.equals("Integer") || PalabraAux.equals("Decimal") || PalabraAux.equals("String") || PalabraAux.equals("If") || PalabraAux.equals("Then") || PalabraAux.equals("Else") || PalabraAux.equals("Call"))
                {
                    Resultado_Split = Resultado_Split + PalabraAux + "    Palabras Reservada" + '\n';
                    Columna = Columna +1;
                    PalabraAux = "";
                    i--;
                }
                else
                {
                    Resultado_Split = Resultado_Split + PalabraAux + "    Variable" + '\n';
                    Columna = Columna +1;
                    PalabraAux = "";
                    i--;
                }
            }
            //Numeros
            else if (Character.isDigit(Split[i]))
            {
                while(Character.isDigit(Split[i]))
                {
                    PalabraAux = PalabraAux + String.valueOf(Split[i]);
                    Columna = Columna +1;
                    i++;
                }
                if(Split[i] == '.')
                {
                    PalabraAux = PalabraAux + String.valueOf(Split[i]);
                    Columna = Columna +1;
                    i++;
                    
                   while(Character.isDigit(Split[i]))
                    {
                        PalabraAux = PalabraAux + String.valueOf(Split[i]);
                        Columna = Columna +1;
                        i++;
                    }
                    Resultado_Split = Resultado_Split + PalabraAux + "    Numero Decimal" + '\n';
                    PalabraAux = "";
                    i--;
                }
                else
                {
                   Resultado_Split = Resultado_Split + PalabraAux + "    Numero Entero" + '\n';
                   PalabraAux = "";
                   i--;
                }
            }
            else if (ASCII == 9)
            {
                Columna = Columna +1;
            }
            //Operadores
            else if (ASCII == 60)
            {
                Resultado_Split = Resultado_Split + "<   Operador Menor" + "\n";
                Columna = Columna +1;
            }
            else if (ASCII == 62)
            {
                Resultado_Split = Resultado_Split + ">   Operador Mayor" + "\n";
                Columna = Columna +1;
            }
            else if (ASCII == 42)
            {
                Resultado_Split = Resultado_Split + "*    Operador Multiplicacion" + "\n";
                Columna = Columna +1;
            }
            else if (ASCII == 43)
            {
                Resultado_Split = Resultado_Split + "+    Operador Suma" + "\n";
                Columna = Columna +1;
            }
            else if (ASCII == 58)
            {
                Resultado_Split = Resultado_Split + ":";
                ASCII2 = (int) Split[i+1];
                
                if(ASCII2 == 61)
                {
                    Resultado_Split = Resultado_Split + "=    Operador Igual A\n";
                    Columna = Columna + 2;
                    i++;
                }
                else
                {
                    Resultado_Split = "Error Sintaxis" + "    Fila: " + String.valueOf(Fila) + "  Columna: " + String.valueOf(Columna) + "\n";
                    Columna = Columna + 1;
                }
            }
            else if (ASCII == 61)
            {
                Resultado_Split = Resultado_Split + "=";
                ASCII2 = (int) Split[i+1];
                
                if(ASCII2 == 61)
                {
                    Resultado_Split = Resultado_Split + "=    Operador Igual A\n";
                    Columna = Columna + 2;
                    i++;
                }
                else
                {
                    Resultado_Split = "Error Sintaxis" + "    Fila: " + String.valueOf(Fila) + "  Columna: " + String.valueOf(Columna) + "\n";
                    Columna = Columna + 1;
                }
            }
            else if (ASCII == 33)
            {
                Resultado_Split = Resultado_Split + "!";
                ASCII2 = (int) Split[i+1];
                
                if(ASCII2 == 61)
                {
                    Resultado_Split = Resultado_Split + "=    Operador No Es Igual\n";
                    Columna = Columna + 2;
                    i++;
                }
                else
                {
                    Resultado_Split = "Error Sintaxis" + "    Fila: " + String.valueOf(Fila) + "  Columna: " + String.valueOf(Columna) + "\n";
                    Columna = Columna + 1;
                }
            }
            
            else if (ASCII == 92)
            {
                PalabraAux = String.valueOf(Split[i]);
                
                if(Split[i+1] == 'n' || Split[i+1] == 't' || Split[i+1] == '"')
                {
                    i++;
                    PalabraAux = PalabraAux + String.valueOf(Split[i]);
                    Resultado_Split = Resultado_Split + PalabraAux + "    Simbolo Especial" + '\n';
                }
                Columna = Columna +1;
            }
            //Signos
            else if (ASCII == 59)
            {
                Resultado_Split = Resultado_Split + ";    Signo Punto y Coma" + "\n";
                Columna = Columna +1;
            }
            else if (ASCII == 40)
            {
                Resultado_Split = Resultado_Split + "(    Signo Abrir Parentesis" + "\n";
                Columna = Columna +1;
            }
            else if (ASCII == 41)
            {
                Resultado_Split = Resultado_Split + ")    Signo Cerrar Parentesis" + "\n";
                Columna = Columna +1;
            }
            else if (ASCII == 125)
            {
                Resultado_Split = Resultado_Split + "}    Signo Cerrar Llave" + "\n";
                Columna = Columna +1;
            }
            else if (ASCII == 123)
            {
                Resultado_Split = Resultado_Split + "{    Signo Abrir Llave" + "\n";
                Columna = Columna +1;
            }
            else if (ASCII == 34)
            {
                PalabraAux = String.valueOf(Split[i]);
                i++;
                
                while(Split[i] != '"')
                {
                    PalabraAux = PalabraAux + String.valueOf(Split[i]);
                    i++;
                }
                PalabraAux = PalabraAux + String.valueOf(Split[i]);
                Resultado_Split = Resultado_Split + PalabraAux + "    Cadena de Texto" + "\n";
                Columna = Columna +1;
                PalabraAux = "";
            }
            else if (ASCII == 47)
            {
                if(Split[i+1] == '/')
                {
                    while(ASCII2 != 10)
                    {
                        ASCII2 = (int) Split[i];
                        i++;
                    }
                    Fila = Fila + 1;
                    i--;
                }
                else if(Split[i+1] == '*')
                {
                    i= i+2;
                    while(Split[i] != '*' && Split[i+1] != '/')
                    {
                        ASCII2 = (int)Split[i];
                        i++;
                        if(ASCII2 == 10)
                        {
                            Fila = Fila +1;
                        }
                    }
                    Fila = Fila +1;
                }
            }
            else if (ASCII == 39)
            {
                while(ASCII2 != 10)
                {
                    ASCII2 = (int) Split[i];
                    i++;
                }
                Fila = Fila + 1;
                i--;
            }
            else if (ASCII == 35)
            {
                while(ASCII2 != 10)
                {
                    ASCII2 = (int) Split[i];
                    i++;
                }
                Fila = Fila + 1;
                i--;
            }
                
            else if (ASCII == 32)
            {
                Columna = Columna +1;
            }
            else if (ASCII == 10)
            {
                Columna = 0;
                Fila = Fila +1;
            }
            else
            {
                Resultado_Split = Resultado_Split + String.valueOf(Split[i]) + "    Error Sintaxis" + "    Fila: " + String.valueOf(Fila) + "  Columna: " + String.valueOf(Columna) + "\n";
                Columna = Columna +1;
            }
            
            //JOptionPane.showMessageDialog(this, Resultado_Split);
        }
        OutputTextArea.setText(Resultado_Split);                                   
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        CConexion objetoConexion = new CConexion();
        objetoConexion.establecerConexion();
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(mainFom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFom().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea InputTextArea;
    private javax.swing.JTextArea OutputTextArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
