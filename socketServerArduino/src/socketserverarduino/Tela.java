/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketserverarduino;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author Harvian
 */
public class Tela extends javax.swing.JFrame {
    
    private final ControlePorta arduino;
    
    public Tela() {
        
        setVisible(true);
        initComponents();
        String estado1 = "Desligado";
        String estado2 = "Desligado";
        String estado3 = "Desligado";
        String estado4 = "Desligado";
        String estado5 = "Desligado";
        String estado6 = "Desligado";
        String pwm1 = "0";
        String pwm2 = "0";
        String pwm3 = "0";
        String pwm4 = "0";
        String pwm5 = "0";
        String pwm6 = "0";
        String PortaSerial = null;
        PortaSerial = JOptionPane.showInputDialog("Digite o numero da porta serial a ser usada:");
        arduino = new ControlePorta("COM"+PortaSerial, 19200);
            
        String clientSentence;
      
        int variavel1;
        
  while(true){    
    try {
 
           // Cria um SocketServer (Socket característico de um servidor)
           ServerSocket socket = new ServerSocket(40000);
   
           while(true) {    
    
               Socket connectionSocket = socket.accept();
               BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
               DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
               clientSentence = inFromClient.readLine();
               //System.out.println("Recebido do client: " + clientSentence);
               //outToClient.writeBytes("OK" + "\n");                   
               
               
               if(clientSentence.charAt(0) == 'G'){
                   pwm1 = clientSentence.replaceAll("G", ""); 
                   arduino.enviaDadosSt(clientSentence + "\n");
                   outToClient.writeBytes("" + "\n");
               }
               
               if(clientSentence.charAt(0) == 'H'){
                   pwm2 = clientSentence.replaceAll("H", ""); 
                   arduino.enviaDadosSt(clientSentence + "\n");
                   outToClient.writeBytes("" + "\n");
               }
               
               if(clientSentence.charAt(0) == 'I'){
                   pwm3 = clientSentence.replaceAll("I", ""); 
                   arduino.enviaDadosSt(clientSentence + "\n");
                   outToClient.writeBytes("" + "\n");
               }
               
               if(clientSentence.charAt(0) == 'J'){
                   pwm4 = clientSentence.replaceAll("J", ""); 
                   arduino.enviaDadosSt(clientSentence + "\n");
                   outToClient.writeBytes("" + "\n");
               }
               
               if(clientSentence.charAt(0) == 'K'){
                   pwm5 = clientSentence.replaceAll("K", ""); 
                   arduino.enviaDadosSt(clientSentence + "\n");
                   outToClient.writeBytes("" + "\n");
               }
               
               if(clientSentence.charAt(0) == 'L'){
                   pwm6 = clientSentence.replaceAll("L", ""); 
                   arduino.enviaDadosSt(clientSentence + "\n");
                   outToClient.writeBytes("" + "\n");
               }
               
               if("pino2".equals(clientSentence)){
                   if("Desligado".equals(estado1)){
                       estado1 = "Ligado";
                       arduino.enviaDadosSt("A1" + "\n");
                       outToClient.writeBytes(estado1 + "\n");
                   }else{
                       estado1 = "Desligado";
                       arduino.enviaDadosSt("A0" + "\n");
                       outToClient.writeBytes(estado1 + "\n");
                   }
               }
               
               if("pino4".equals(clientSentence)){
                   if("Desligado".equals(estado2)){
                       estado2 = "Ligado";
                       arduino.enviaDadosSt("B1" + "\n");
                       outToClient.writeBytes(estado2 + "\n");
                   }else{
                       estado2 = "Desligado";
                       arduino.enviaDadosSt("B0" + "\n");
                       outToClient.writeBytes(estado2 + "\n");
                   }
               }
               
               if("pino7".equals(clientSentence)){
                   if("Desligado".equals(estado3)){
                       estado3 = "Ligado";
                       arduino.enviaDadosSt("C1" + "\n");
                       outToClient.writeBytes(estado3 + "\n");
                   }else{
                       estado3 = "Desligado";
                       arduino.enviaDadosSt("C0" + "\n");
                       outToClient.writeBytes(estado3 + "\n");
                   }
               }
               
               if("pino8".equals(clientSentence)){
                   if("Desligado".equals(estado4)){
                       estado4 = "Ligado";
                       arduino.enviaDadosSt("D1" + "\n");
                       outToClient.writeBytes(estado4 + "\n");
                   }else{
                       estado4 = "Desligado";
                       arduino.enviaDadosSt("D0" + "\n");
                       outToClient.writeBytes(estado4 + "\n");
                   }
               }
               
               if("pino12".equals(clientSentence)){
                   if("Desligado".equals(estado5)){
                       estado5 = "Ligado";
                       arduino.enviaDadosSt("E1" + "\n");
                       outToClient.writeBytes(estado5 + "\n");
                   }else{
                       estado5 = "Desligado";
                       arduino.enviaDadosSt("E0" + "\n");
                       outToClient.writeBytes(estado5 + "\n");
                   }
               }
               
               if("pino13".equals(clientSentence)){
                   if("Desligado".equals(estado6)){
                       estado6 = "Ligado";
                       arduino.enviaDadosSt("F1" + "\n");
                       outToClient.writeBytes(estado6 + "\n");
                   }else{
                       estado6 = "Desligado";
                       arduino.enviaDadosSt("F0" + "\n");
                       outToClient.writeBytes(estado6 + "\n");
                   }
               }
               
               if("atualiza1".equals(clientSentence)){
                   outToClient.writeBytes(estado1 + "\n");
                   }
               
               if("atualiza2".equals(clientSentence)){
                   outToClient.writeBytes(estado2 + "\n");
                   }
               
               if("atualiza3".equals(clientSentence)){
                   outToClient.writeBytes(estado3 + "\n");
                   }
               
               if("atualiza4".equals(clientSentence)){
                   outToClient.writeBytes(estado4 + "\n");
                   }
               
               if("atualiza5".equals(clientSentence)){
                   outToClient.writeBytes(estado5 + "\n");
                   }
               
               if("atualiza6".equals(clientSentence)){
                   outToClient.writeBytes(estado6 + "\n");
                   }
               
               if("atualizaPwm1".equals(clientSentence)){
                   outToClient.writeBytes(pwm1 + "\n");
                   }
               
               if("atualizaPwm2".equals(clientSentence)){
                   outToClient.writeBytes(pwm2 + "\n");
                   }
               
               if("atualizaPwm3".equals(clientSentence)){
                   outToClient.writeBytes(pwm3 + "\n");
                   }
               
               if("atualizaPwm4".equals(clientSentence)){
                   outToClient.writeBytes(pwm4 + "\n");
                   }
               
               if("atualizaPwm5".equals(clientSentence)){
                   outToClient.writeBytes(pwm5 + "\n");
                   }
               
               if("atualizaPwm6".equals(clientSentence)){
                   outToClient.writeBytes(pwm6 + "\n");
                   }
               
               
               
            } 
      
       } catch (IOException e) {
           
           System.out.println("Ocorreu um erro...");
           // TODO Auto-generated catch block
           //e.printStackTrace();
       }
        
    }
 }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Servidor Socket Arduino");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
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
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
