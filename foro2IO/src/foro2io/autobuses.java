/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package foro2io;

/**
 *
 * @author Jacquie
 */

import com.lindo.Lingd20;
import javax.swing.JOptionPane;
public class autobuses extends javax.swing.JFrame {
    
     // Cargar la Lingo JNI interface
    static {
      System.loadLibrary( "Lingj64_20");
    }
    
    //Objeto Lingo
    Lingd20 objLng = new Lingd20();
    
    // Almacena el puntero al entorno Lingo JNI
   Object pLngEnv;

   int nLastIterationCount;

    /**
     * Creates new form autobuses
     */
    public autobuses() {
        initComponents();
        pLngEnv = objLng.LScreateEnvLng();
       if ( pLngEnv == null)
       {
          JOptionPane.showMessageDialog(null, "No se pudo crear el entorno Lingo");
          return;
       }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblHorarioTit = new javax.swing.JLabel();
        lblHorario1 = new javax.swing.JLabel();
        lblHorario2 = new javax.swing.JLabel();
        lblHorario3 = new javax.swing.JLabel();
        lblHorario4 = new javax.swing.JLabel();
        lblHorario5 = new javax.swing.JLabel();
        lblHorario6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfHorario1 = new javax.swing.JTextField();
        tfHorario2 = new javax.swing.JTextField();
        tfHorario3 = new javax.swing.JTextField();
        tfHorario4 = new javax.swing.JTextField();
        tfHorario5 = new javax.swing.JTextField();
        tfHorario6 = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTurno1 = new javax.swing.JLabel();
        lblTurno2 = new javax.swing.JLabel();
        lblTurno3 = new javax.swing.JLabel();
        lblTurno4 = new javax.swing.JLabel();
        lblTurno5 = new javax.swing.JLabel();
        lblTurno6 = new javax.swing.JLabel();
        tfTurno1 = new javax.swing.JTextField();
        tfTurno2 = new javax.swing.JTextField();
        tfTurno3 = new javax.swing.JTextField();
        tfTurno4 = new javax.swing.JTextField();
        tfTurno5 = new javax.swing.JTextField();
        tfTurno6 = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setText("Programación de autobuses");

        lblHorarioTit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHorarioTit.setText("Horarios");

        lblHorario1.setText("00:00 am - 4:00 am");

        lblHorario2.setText("4:00 am - 8:00 am");

        lblHorario3.setText("8:00 am - 12:00 pm");

        lblHorario4.setText("12:00 pm - 4:00 pm");

        lblHorario5.setText("4:00 pm - 8:00 pm");

        lblHorario6.setText("8:00 pm - 0:00 am");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Demanda mínima de buses");

        tfHorario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHorario1ActionPerformed(evt);
            }
        });

        tfHorario3.setToolTipText("");

        tfHorario6.setToolTipText("");

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Turno");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Cantidad de buses");

        lblTurno1.setText("Turno 1");

        lblTurno2.setText("Turno 2");

        lblTurno3.setText("Turno 3");

        lblTurno4.setText("Turno 4");

        lblTurno5.setText("Turno 5");

        lblTurno6.setText("Turno 6");

        tfTurno1.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        tfTurno1.setEnabled(false);

        tfTurno2.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        tfTurno2.setEnabled(false);

        tfTurno3.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        tfTurno3.setEnabled(false);

        tfTurno4.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        tfTurno4.setEnabled(false);

        tfTurno5.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        tfTurno5.setEnabled(false);

        tfTurno6.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        tfTurno6.setEnabled(false);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHorario4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHorario1)
                            .addComponent(lblHorario2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lblHorarioTit)))
                        .addGap(1, 1, 1))
                    .addComponent(lblHorario3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHorario5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHorario6, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfHorario1)
                            .addComponent(tfHorario2)
                            .addComponent(tfHorario3)
                            .addComponent(tfHorario4)
                            .addComponent(tfHorario5)
                            .addComponent(tfHorario6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(174, 174, 174))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(95, 95, 95)
                        .addComponent(lblTurno1)
                        .addGap(48, 48, 48)
                        .addComponent(lblTurno2)
                        .addGap(48, 48, 48)
                        .addComponent(lblTurno3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(lblTurno4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(tfTurno1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(tfTurno2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(tfTurno3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(tfTurno4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(291, 291, 291)
                                .addComponent(btnGenerar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(lblTitulo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTurno5)
                            .addComponent(tfTurno5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTurno6)
                            .addComponent(tfTurno6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo))
                    .addComponent(btnSalir))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(lblHorarioTit)
                                                            .addComponent(jLabel8))
                                                        .addGap(26, 26, 26)
                                                        .addComponent(lblHorario1))
                                                    .addComponent(tfHorario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(lblHorario2))
                                            .addComponent(tfHorario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(lblHorario3))
                                    .addComponent(tfHorario3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lblHorario4))
                            .addComponent(tfHorario4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblHorario5))
                    .addComponent(tfHorario5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfHorario6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHorario6))
                .addGap(18, 18, 18)
                .addComponent(btnGenerar)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTurno1)
                    .addComponent(lblTurno2)
                    .addComponent(lblTurno3)
                    .addComponent(lblTurno4)
                    .addComponent(lblTurno5)
                    .addComponent(lblTurno6))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfTurno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTurno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTurno3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTurno4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTurno5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTurno6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private static int MySolverCallback( Object pnLng, int iLoc, Object jobj)
    {
       autobuses objAutob = (autobuses) jobj;
       int nIterations[] = new int [1];
       objAutob.objLng.LSgetCallbackInfoIntLng( pnLng, Lingd20.LS_IINFO_ITERATIONS_LNG, nIterations);
       return( 0);
    }

    private static int MyErrorCallback( Object pnLng, int nErrorCode, String jsErrMessage, Object jobj)
    {
       JOptionPane.showMessageDialog(null,
        "Lingo error code: " + nErrorCode);
       JOptionPane.showMessageDialog(null,
        "Lingo error message:\n\n " + jsErrMessage);
       return( 0);
    }
    
    private void tfHorario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHorario1ActionPerformed

       
    }//GEN-LAST:event_tfHorario1ActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
       String input;
       Double hr = 0.;

       double hrDemanda[] = new double[6];
       double hrCantidadB[] = new double [6];
       double dObj[] = new double [1];
       double dStatus[] = new double [1];
       
       StringBuffer sbHorarios = new StringBuffer( "1 \n 2 \n 3 \n 4 \n 5 \n 6");
       StringBuffer sbTurnos = new StringBuffer( "Turno1 \n Turno2 \n Turno3 \n Turno4 \n Turno5 \n Turno6");

       //Llenando las demandas mínimas en el arreglo hrDemanda
       try
       {
          input = tfHorario1.getText();   
          hrDemanda[0] = Double.parseDouble(input);
          input = tfHorario2.getText();
          hrDemanda[1] = Double.parseDouble(input);
          input = tfHorario3.getText();
          hrDemanda[2] = Double.parseDouble(input);
          input = tfHorario4.getText();
          hrDemanda[3] = Double.parseDouble(input);
          input = tfHorario5.getText();
          hrDemanda[4] = Double.parseDouble(input);
          input = tfHorario6.getText();
          hrDemanda[5] = Double.parseDouble(input);
       }
       catch ( Exception e)
       {
          JOptionPane.showMessageDialog(null, "Se deben llenar las demandas mínimas");
          return;
       }
       
       // se abre un archivo log
       int nErr = objLng.LSopenLogFileLng( pLngEnv, "c:/junk/lingo.log");
       if ( nErr != objLng.LSERR_NO_ERROR_LNG )
       {
          JOptionPane.showMessageDialog(null, "LSopenLogFileLng() error: " + nErr);
          return;
       }
       
       // se envia al Lingo el nombre de la funcion de solver
       nErr = objLng.LSsetCallbackSolverLng( pLngEnv, "MySolverCallback", this);
       if ( nErr != objLng.LSERR_NO_ERROR_LNG )
       {
          JOptionPane.showMessageDialog(null, "LSsetCallbackSolverLng() error");
          return;
       }
       
       // se envia al lingo el nombre de la funcion de manejo de error
       nErr = objLng.LSsetCallbackErrorLng( pLngEnv, "MyErrorCallback", this);
       if ( nErr != objLng.LSERR_NO_ERROR_LNG )
       {
          JOptionPane.showMessageDialog(null, "LSsetCallbackErrorLng() error");
          return;
       }
       
       // se pasa a lingo un puntero al set de horarios y turnos
       int[] nPointersNow = new int[1];
       nErr = objLng.LSsetPointerStringLng( pLngEnv, sbHorarios, nPointersNow);
       if ( nErr != objLng.LSERR_NO_ERROR_LNG )
       {
          JOptionPane.showMessageDialog(null, "LSsetPointerStringLng() error");
          return;
       }
       
       int[] nPointersNow2 = new int[1];
       nErr = objLng.LSsetPointerStringLng( pLngEnv, sbTurnos, nPointersNow2);
       if ( nErr != objLng.LSERR_NO_ERROR_LNG )
       {
          JOptionPane.showMessageDialog(null, "LSsetPointerStringLng() error");
          return;
       }
       
       // se pasa a lingo un puntero al arreglo de las demandas minimas
       nErr = objLng.LSsetPointerLng( pLngEnv, hrDemanda, nPointersNow);
       if ( nErr != objLng.LSERR_NO_ERROR_LNG )
       {
           JOptionPane.showMessageDialog(null, "LSsetPointerLng() error");
           return;
       }
       
       // se pasa un puntero hacia el area de resultados - cantidad de buses por turno
       nErr = objLng.LSsetPointerLng( pLngEnv, hrCantidadB, nPointersNow);
       if ( nErr != objLng.LSERR_NO_ERROR_LNG )
       {
          JOptionPane.showMessageDialog(null, "LSsetPointerLng() error");
          return;
       }
       
       //puntero hacia el arreglo que almacenara el status de la solucion
       nErr = objLng.LSsetPointerLng( pLngEnv, dStatus, nPointersNow);
       if ( nErr != objLng.LSERR_NO_ERROR_LNG )
       {
          JOptionPane.showMessageDialog(null, "LSsetPointerLng() error");
          return;
       }
       
       // Se contruye el script para ejecutar el lingo
       // echo input to log file
       String sScript = "SET ECHOIN 1" + "\n";

       // load the model from disk
       sScript = sScript + "TAKE Lingo_Buses.lng" + "\n";

       // view the formulation
       sScript = sScript + "LOOK ALL" + "\n";

       // solve
       sScript = sScript + "GO" + "\n";

       // exit script processor
       sScript = sScript + "QUIT" + "\n";
       
       // ejecutar el script
       dStatus[0] = -1;
       nLastIterationCount = -1;
       nErr = objLng.LSexecuteScriptLng( pLngEnv, sScript);
       if ( nErr != objLng.LSERR_NO_ERROR_LNG )
       {
          System.out.println( "***LSexecuteScriptLng error***: " + nErr);
          return;
       }
       
       // clear the pointers to force update of local arrays
       // ***NOTE*** solution won't get passed to local arrays until
       // LSclearPointersLng is called!!!
       nErr = objLng.LSclearPointersLng( pLngEnv);
       if ( nErr != objLng.LSERR_NO_ERROR_LNG )
       {
          System.out.println( "***LSclearPointerLng() error***: " + nErr);
          return;
       }

       // Verifica el status de la solucion
       if ( dStatus[0] != objLng.LS_STATUS_GLOBAL_LNG)
        System.out.println( "***Unable to Solve*** dStatus:" + dStatus[0]);
       
       // se cierra el log de lingo
       nErr = objLng.LScloseLogFileLng( pLngEnv);
       if ( nErr != objLng.LSERR_NO_ERROR_LNG )
       {
          System.out.println( "***LScloseLogFileLng() error***: " + nErr);
          return;
       }
       
       // mostrar la solucion
       Integer num;
       
       //***turno 1***
       hr = hrCantidadB[0]; 
       num = hr.intValue();  
       tfTurno1.setText( num.toString());
       
       //***turno 2***
       hr = hrCantidadB[1]; 
       num = hr.intValue();  
       tfTurno2.setText( num.toString());
       
       //***turno 3***
       hr = hrCantidadB[2]; 
       num = hr.intValue();  
       tfTurno3.setText( num.toString());
       
       //***turno 4***
       hr = hrCantidadB[3]; 
       num = hr.intValue();  
       tfTurno4.setText( num.toString());
       
       //***turno 5***
       hr = hrCantidadB[4]; 
       num = hr.intValue();  
       tfTurno5.setText( num.toString());
       
       //***turno 6***
       hr = hrCantidadB[5]; 
       num = hr.intValue();  
       tfTurno6.setText( num.toString());
       
       
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        objLng.LSdeleteEnvLng( pLngEnv);
        System.exit( 0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void windowClosing(java.awt.event.WindowEvent evt) {                               
       // delete the Lingo environment
       objLng.LSdeleteEnvLng( pLngEnv);
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
            java.util.logging.Logger.getLogger(autobuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(autobuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(autobuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(autobuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new autobuses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblHorario1;
    private javax.swing.JLabel lblHorario2;
    private javax.swing.JLabel lblHorario3;
    private javax.swing.JLabel lblHorario4;
    private javax.swing.JLabel lblHorario5;
    private javax.swing.JLabel lblHorario6;
    private javax.swing.JLabel lblHorarioTit;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTurno1;
    private javax.swing.JLabel lblTurno2;
    private javax.swing.JLabel lblTurno3;
    private javax.swing.JLabel lblTurno4;
    private javax.swing.JLabel lblTurno5;
    private javax.swing.JLabel lblTurno6;
    private javax.swing.JTextField tfHorario1;
    private javax.swing.JTextField tfHorario2;
    private javax.swing.JTextField tfHorario3;
    private javax.swing.JTextField tfHorario4;
    private javax.swing.JTextField tfHorario5;
    private javax.swing.JTextField tfHorario6;
    private javax.swing.JTextField tfTurno1;
    private javax.swing.JTextField tfTurno2;
    private javax.swing.JTextField tfTurno3;
    private javax.swing.JTextField tfTurno4;
    private javax.swing.JTextField tfTurno5;
    private javax.swing.JTextField tfTurno6;
    // End of variables declaration//GEN-END:variables
}
