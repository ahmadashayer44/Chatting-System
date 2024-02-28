/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np2;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;


/**
 *
 * @author EliteBook
 */
public class TCPServer extends javax.swing.JFrame {

    /**
     * Creates new form TcpServer
     */
        
    ServerSocket serversocket;
    HashMap Clients=new HashMap();
    String id;
    AcceptClient ac;
    ReadMsg rm;
    PrepareClientList p;
    DefaultListModel dlm;
    public TCPServer() {
        initComponents();
        dlm=new DefaultListModel();
        onlineList.setModel(dlm);
    
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
        port = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        a = new javax.swing.JTextArea();
        status = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        onlineList = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Port:");

        port.setText("8888");
        port.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "wi-fi :192.168.1.112", "Ethernet: 169.254.49.56", "loopback Pseudo-Interface 1: 127.0.0.1" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        a.setColumns(20);
        a.setRows(5);
        jScrollPane1.setViewportView(a);

        jLabel2.setText("Server Status:");

        onlineList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                onlineListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(onlineList);

        jButton1.setText("Start Listening");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(status))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel1)
                            .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void portActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void onlineListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_onlineListValueChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_onlineListValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        try {
            serversocket=new ServerSocket(Integer.parseInt(port.getText()));
            status.setText("server started at port:"+port.getText());
            ac=new AcceptClient();
            ac.start();
        } catch (IOException ex) {
            Logger.getLogger(TCPServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public class AcceptClient extends Thread{
        @Override
        public void run(){
            while(true){
            try{
            Socket s=serversocket.accept();
             String in = new DataInputStream(s.getInputStream()).readUTF();
             if(in.contains("logout:")){
                 in=in.substring(7);
                 Clients.remove(in);
                 a.append(in+" logged out. \n");
                 new PrepareClientList().start();
             }
             else{id=in;
             String  array []=in.split("-");
             if(Clients.containsKey(array[0])&&Clients.containsKey(array[1])){
             DataOutputStream dout = new DataOutputStream(s.getOutputStream());
             dout.writeUTF("you are Already Registered!");
             }
             else{
             Clients.put(in, s);
             a.append(in + " Joined !\n");
             DataOutputStream dout = new DataOutputStream(s.getOutputStream());
             dout.writeUTF("");
             rm=new ReadMsg(s,in);
             rm.start();
             if(!in.isEmpty())
             new PrepareClientList().start();
             }             
             }
            }catch(Exception e){
            status.setText(e.getMessage());
            }
            }
    
    }
        
    }
    
    class ReadMsg extends Thread{
        Socket sock;
        String id;

        private ReadMsg(Socket s, String in) {
            this.id=in;
            this.sock=s;
        }
       /* @Override
        public void run(){
            while(!Clients.isEmpty()){
                try {
                    String in =new DataInputStream(sock.getInputStream()).readUTF();
                    if(in.equals("logout")){
                         
                    Clients.remove(id);
                    a.append(id+": removed! \n");
                    new PrepareClientList().start();
                    
                    Set k=Clients.keySet();
                    Iterator itr=k.iterator();
                    while(itr.hasNext()){
                    String key=(String) itr.next();
                    if(!key.equalsIgnoreCase(id)){
                    
                        try{
                        
                        new DataOutputStream(((Socket)Clients.get(key)).getOutputStream()).writeUTF("< "+id+" to All >"+"im leave");
                        }catch(Exception ex){
                        Clients.remove(key);
                        a.append(key+": removed! \n");
                        new PrepareClientList().start();
                        }
                    }
                    
                } 
            }
                    
        }catch (IOException ex) {
                    Logger.getLogger(TcpServer.class.getName()).log(Level.SEVERE, null, ex);
                }
        
    }
    
    
    }*/
    }
    public class PrepareClientList extends Thread{

            public PrepareClientList() {
            }
            @Override
        public void run(){
            try{
             dlm.clear();
            
             String ids="";
              Set k=Clients.keySet();
              Iterator itr=k.iterator();
              while(itr.hasNext()){
               String key=(String)itr.next();
              ids+=key+",";
              }
              if(ids.length()!=0)
                  ids=ids.substring(0,ids.length()-1);
              itr=k.iterator();
              while(itr.hasNext()){
              String key =(String)itr.next();
              try{
               new DataOutputStream(((Socket)Clients.get(key)).getOutputStream()).writeUTF(ids);
              
               
              
            
        }
    
              catch (IOException ex) {
                     Logger.getLogger(TCPServer.class.getName()).log(Level.SEVERE, null, ex);
                 }}
            StringTokenizer st = new StringTokenizer(ids, ",");
                        while (st.hasMoreTokens()) {

                            String u = st.nextToken();
                                dlm.addElement(u);
                                
                            }
            }catch(Exception ex){
              
              }}}
    
    public static void main(String args[]) {
             try {
      File myObj = new File("credential.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             
             new TCPServer().setVisible(true);

            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea a;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> onlineList;
    private javax.swing.JTextField port;
    private javax.swing.JTextField status;
    // End of variables declaration//GEN-END:variables
}
