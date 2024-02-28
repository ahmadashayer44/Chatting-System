/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np2;

import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyledDocument;
import java.awt.Color;
import java.awt.Font;
import java.net.*;
import java.io.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.*;
import java.util.logging.Level;
/**
 *
 * @author EliteBook
 */
public class client extends javax.swing.JFrame {
 DataInputStream din;
    DataOutputStream dout;
    
mythread net;
sendThread net1;
DefaultListModel dlm;
JPanel panel = new JPanel();

String selectedUser;
static int peers[] = {1111,2222,3333,4444};
static ArrayList <Integer>ports=new ArrayList <Integer>();
static Map<Integer,String> map=new HashMap<Integer,String>();
static ArrayList <String>names=new ArrayList <String>();

List <String>l;
static int pp[]={0,0,0};
int myport;
String myname;
    public client() {
                   panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
             initComponents();
         dlm = new DefaultListModel();
            UL.setModel(dlm);   
          try {
            List<NetworkInterface> interfaces = Collections.list(NetworkInterface.getNetworkInterfaces());
            for (NetworkInterface intf : interfaces) {
                List<InetAddress> addrs = Collections.list(intf.getInetAddresses());
                for (InetAddress addr : addrs) {
                    if (!addr.isLoopbackAddress()) {
                        String sAddr = addr.getHostAddress();
                        if(sAddr.contains("192.168.1")||sAddr.contains("172.16.")||sAddr.contains("172.31.")) {//possible ip addresses
                                    lip.setText(sAddr);
                                dip.setText(sAddr);
                                serverip.setText(sAddr);
                        }
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
                    try {
        
        DatagramSocket p2p = new DatagramSocket(myport);
        net= new mythread(p2p);
        net.start();
      
    } catch (Exception e) {
        //Logger.getLogger(network.class.getName()).log(Level.SEVERE, null, ex);
        
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        st = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        UL = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        serverip = new javax.swing.JTextField();
        serverport = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        msg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dip = new javax.swing.JTextField();
        lip = new javax.swing.JTextField();
        dp = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        send = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        text = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        all = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        A1 = new javax.swing.JTextPane();
        name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Online Users");

        UL.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ULValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(UL);

        jLabel3.setText("TCP Server IP :");

        jLabel4.setText("TCP Server Port :");

        serverip.setText("192.168.3.163");
        serverip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serveripActionPerformed(evt);
            }
        });

        serverport.setText("8888");

        jLabel5.setText("Available Interfaces");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setText(" Local IP:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel7.setText(" Local Port:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel8.setText("Remote IP :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Username:");

        msg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        msg.setForeground(new java.awt.Color(153, 153, 153));
        msg.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        msg.setMargin(new java.awt.Insets(-50, 2, 0, 0));
        msg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                msgFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                msgFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Status:");

        lp.setText("1111");
        lp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lpActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel9.setText("Remote Port ");

        dip.setText("192.168.3.154");

        lip.setText("192.168.3.163");
        lip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lipActionPerformed(evt);
            }
        });

        dp.setText("2222");
        dp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpActionPerformed(evt);
            }
        });

        login.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 51, 51));
        login.setLabel("Login");
        login.setMaximumSize(new java.awt.Dimension(75, 35));
        login.setMinimumSize(new java.awt.Dimension(75, 35));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        send.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        jButton2.setLabel("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        text.setLabel("test Button");
        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "wi-fi :192.168.1.112", "Ethernet: 169.254.49.56", "loopback Pseudo-Interface 1: 127.0.0.1" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Password:");

        all.setText("Send to all");
        all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(A1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(serverip, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(serverport)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(dip, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(send)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(all, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(dp, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lp, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lip, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serverport, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(serverip, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lip, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(dip, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(dp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(all, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(text))
                                .addGap(51, 51, 51))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ULValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ULValueChanged
        // TODO add your handling code here:
        if(UL.getSelectedIndices().length==1){
            selectedUser=UL.getSelectedValue();
            l=UL.getSelectedValuesList();
            String array[]=selectedUser.split("-");
            dip.setText(array[1]);
            dp.setText(array[2]);}
        else{
            l=UL.getSelectedValuesList();

        }
    }//GEN-LAST:event_ULValueChanged

    private void msgFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_msgFocusGained
        // TODO add your handling code here:
        if(msg.getText().equals("enter text here")){
            msg.setText("");
            msg.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_msgFocusGained

    private void msgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_msgFocusLost
        // TODO add your handling code here:
        if(msg.getText().equals("")){
            msg.setText("enter text here");
            msg.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_msgFocusLost

    private void lpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lpActionPerformed

    private void lipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lipActionPerformed

    private void dpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
      /////////////
    
            try {
      File myObj = new File("aa.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String nameAndpass[]=data.split(",");
        String name= nameAndpass[0];
        String password = nameAndpass[1];
        mapOfNamePass.put(name, password);
        
      }
      
      myReader.close();
      //Traversing Map  
    Set set=mapOfNamePass.entrySet();//Converting to Set so that we can traverse  
    Iterator itr=set.iterator();  
       while(itr.hasNext()){  
        //Converting to Map.Entry so that we can get key and value separately  
        Map.Entry entry=(Map.Entry)itr.next();  
        System.out.println(entry.getKey()+".."+entry.getValue());  
    }  
       
       
       
       
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        
      
      
       System.out.println("reached444");
        try {
           boolean register=false;
           System.out.println("reached333");
               //Traversing Map  
    Set set=mapOfNamePass.entrySet();
    Iterator itr=set.iterator();  
   
       while(itr.hasNext()){  System.out.println("reached122");
            Map.Entry entry=(Map.Entry)itr.next();  
             System.out.println((entry.getKey().toString().trim().compareTo(name.getText().toString().trim()))+" "+( entry.getValue().toString().trim().compareTo(password.getText().trim()))); 
            if((entry.getKey().toString().trim().compareTo(name.getText().toString().trim())==0)&&
                   ( entry.getValue().toString().trim().compareTo(password.getText().trim()))==0)
              {   register=true;
                  JOptionPane.showMessageDialog(this, "logged in succesfully\n");
                   break;
              }
        
       }
      
           if (register==false) JOptionPane.showMessageDialog(this, "invalid login information, either user name or password\n");
           else{
           
            String id = name.getText()+"-"+lip.getText()+"-"+lp.getText();
            Socket s = new Socket(serverip.getText().trim(),Integer.parseInt(serverport.getText()));
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF(id);
            String in = new DataInputStream(s.getInputStream()).readUTF();
            if (in.equals("you are Already Registered!")) {
                JOptionPane.showMessageDialog(this, "You've  Already Registered....!!\n");

            }
            else{
                // boolean flag=false;
                String port=lp.getText();
                myport=Integer.parseInt(port);
              
                    myname=name.getText();
                    
                    st.setText("welcome "+name.getText() +" on port: "+lp.getText()+" ip: "+lip.getText());
                    new Read(s,id).start();
                   
                    try {
                        DatagramSocket p2p = new DatagramSocket(myport);
                        net= new mythread(p2p);
                        net.start();
                    } catch (Exception e) {
                        Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, e);
                    }
                    
                

            }
           }
        } catch (Exception ex) {

            ex.printStackTrace();

        }

    }//GEN-LAST:event_loginActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed

        try {
            DatagramSocket clientSocket = new DatagramSocket();

            String dstip= dip.getText();     //destenation ip
            InetAddress IPAddress = InetAddress.getByName(dstip);
            net1= new sendThread(clientSocket);
            net1.start();

        } catch (Exception ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_sendActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            String id = name.getText()+"-"+lip.getText()+"-"+lp.getText();
            Socket s = new Socket(serverip.getText().trim(),Integer.parseInt(serverport.getText()));
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("logout:"+id);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
        // TODO add your handling code here:
        boolean flag=false;
        String port=lp.getText();
        myport=Integer.parseInt(port);
        for(int i=0;i<4;i++){
            if(myport==peers[i]){flag=true;break;}
        }
        if(flag==true){
            myname=name.getText();
            map.put(myport,myname);
            ports.add(Integer.parseInt(lp.getText()));    names.add(name.getText());
            st.setText("welcome "+myname+" on port: "+myport);
            int k=0;
            for(int i=0;i<4;i++){
                if(peers[i]!=myport){

                    pp[k]=peers[i];
                    k++;
                }
            }

            name.setText( myname);
            String p=String.valueOf (myport);
            lp.setText(p);
            try {
                DatagramSocket p2p = new DatagramSocket(myport);
                net= new mythread(p2p);
                net.start();
            } catch (Exception e) {
                //Logger.getLogger(network.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(flag==false){
            JOptionPane.showMessageDialog(rootPane,"plese enter a new port because this port not in the system", port, HEIGHT);
        }
    }//GEN-LAST:event_textActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void serveripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serveripActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serveripActionPerformed

    private void allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allActionPerformed
        // TODO add your handling code here:
                try {
            DatagramSocket clientSocket = new DatagramSocket();

           
            net1= new sendThread(clientSocket);
            net1.start();

        } catch (Exception ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_allActionPerformed

  static Map<String,String> mapOfNamePass=new HashMap();
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new client().setVisible(true);
            }
        });
        
    }
public class sendThread extends Thread {
DatagramSocket rp1;
LocalDate dateObj = LocalDate.now();
		String currentDate = dateObj.toString();
        public sendThread(DatagramSocket ds) {
            rp1=ds;
        }
        
        @Override
        public void run() {
    try {
        
        
         byte[] sendData = new byte[1024];
           
            String mess=msg.getText()+'\n';
            msg.setText("");
             int ReciverPort=0;
             int flag=1;
                       if (!dp.getText().equals("")) 
                        {
                            if(l.size()==1){
                                 Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                                     String FinalMessage = timestamp + "Me" + ":" + mess;   
                                      StyledDocument doc = A1.getStyledDocument();
                                      SimpleAttributeSet attrs = new SimpleAttributeSet();
                                      JLabel label = new JLabel(FinalMessage);
                                      label.setOpaque(true);
 String h=name.getText();
                                      if(h.equals("Ali"))
                                              label.setBackground(Color.RED);
                                      else if(h.equals("Adam"))
                                          label.setBackground(Color.BLUE);
                                      else if(h.equals("Aws"))
                                          label.setBackground(Color.GREEN);
                                      else
                                          label.setBackground(Color.PINK);
                                          
                                              
                                      
                                      panel.add(label);
                                      A1.insertComponent(panel);
                                     
                                     ReciverPort = Integer.parseInt(dp.getText());
                        }
                            else {
                                for(int i=0;i<l.size();i++){
                                String str=l.get(i);
                                String array[]=str.split("-");
                                InetAddress ip=InetAddress.getByName(array[1]);
                                mess =mess+"-"+myname+"-"+flag+"-"+myport+'\n';
            
                                sendData = mess.getBytes();
                                 DatagramPacket sendPacket =
            new DatagramPacket(sendData, sendData.length ,ip ,Integer.parseInt(array[2]));
            rp1.send(sendPacket);
                                flag=3;
                                
                                }
                                
                            }
                        }
                       
                       
                        else {
                            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                                     String FinalMessage = timestamp +"Me to all:"+mess+"from"+myport+"\n"+currentDate+"\n";   
                                      StyledDocument doc = A1.getStyledDocument();
                                      SimpleAttributeSet attrs = new SimpleAttributeSet();
                                      JLabel label = new JLabel(FinalMessage);
                                      label.setOpaque(true);
 String h=name.getText();
                                      if(h.equals("Ali"))
                                              label.setBackground(Color.RED);
                                      else if(h.equals("Adam"))
                                          label.setBackground(Color.BLUE);
                                      else if(h.equals("Aws"))
                                          label.setBackground(Color.GREEN);
                                      else
                                          label.setBackground(Color.PINK);
                                          
                                              
                                      
                                      panel.add(label);
                                      A1.insertComponent(panel);
                                     
                              flag=2;
                             }
                       
            mess =mess+"-"+myname+"-"+flag+"-"+myport+'\n';
            String dstip= dip.getText();     //destenation ip 
            InetAddress IPAddress = InetAddress.getByName(dstip);
            
            sendData = mess.getBytes();
            if(flag==1){
            DatagramPacket sendPacket =
            new DatagramPacket(sendData, sendData.length ,IPAddress , ReciverPort);
            rp1.send(sendPacket);
            st.setText("Send to: IP:"+dip.getText()+" Port:"+ReciverPort);
            }
            else if(flag==2) {
                for(int i=0;i<dlm.getSize();i++){
                String ii=(String) dlm.get(i);
                String array[]=ii.split("-");
                InetAddress ip=InetAddress.getByName(array[1]);
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length ,ip,Integer.parseInt(array[2]));
         rp1.send(sendPacket);
                }
          st.setText("Send to all");
            }
           
        }
        catch(Exception a){// TODO add your handling code here:
            //System.out.println(a.getMessage());
        }
      
    }
    }
    
     private class mythread extends Thread{
        DatagramSocket RP;
        LocalDate dateObj = LocalDate.now();
		String currentDate = dateObj.toString();
        mythread( DatagramSocket d){
            RP=d;
        }
        @Override
        public void run() {
    try {
        while(true){
        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        RP.receive(receivePacket);
        String sentenc= null;
        sentenc = new String(receivePacket.getData());
        
        String rip=receivePacket.getAddress().toString();
        
        //get name and message
        String recived[] = sentenc.split("-");
         String rport=recived[3];
          if(recived[2].trim().equals("2"))
          {
              Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                                     String FinalMessage = timestamp +recived[1]+" :"+recived[0] +"from"+rport+currentDate+"\n";
                                      StyledDocument doc = A1.getStyledDocument();
                                      SimpleAttributeSet attrs = new SimpleAttributeSet();
                                      JLabel label = new JLabel(FinalMessage);
                                      label.setOpaque(true);
 String h=recived[1];
                                      if(h.equals("Ali"))
                                              label.setBackground(Color.RED);
                                      else if(h.equals("Adam"))
                                          label.setBackground(Color.BLUE);
                                      else if(h.equals("Aws"))
                                          label.setBackground(Color.GREEN);
                                      else
                                          label.setBackground(Color.PINK);
                                          
                                              
                                      
                                      panel.add(label);
                                      A1.insertComponent(panel);
              
              
              
            st.setText("Received from:IP= "+rip.trim()+" ,Port="+rport+" to all.");
            
          }
          else 
          {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                                     String FinalMessage = timestamp +recived[1]+" :"+recived[0]+"from"+rport+"\n";
                                      StyledDocument doc = A1.getStyledDocument();
                                      SimpleAttributeSet attrs = new SimpleAttributeSet();
                                      JLabel label = new JLabel(FinalMessage);
                                      label.setOpaque(true);
 String h=recived[1];
                                      if(h.equals("Ali"))
                                              label.setBackground(Color.RED);
                                      else if(h.equals("Adam"))
                                          label.setBackground(Color.BLUE);
                                      else if(h.equals("Aws"))
                                          label.setBackground(Color.GREEN);
                                      else
                                          label.setBackground(Color.PINK);
                                          
                                              
                                      
                                      panel.add(label);
                                      A1.insertComponent(panel);
             
             st.setText("Received from:IP="+rip+" ,Port="+rport);
          
          }
        }
         //To change body of generated methods, choose Tools | Templates.
    } catch (Exception ex) {
        //Logger.getLogger(c1.class.getName()).log(Level.SEVERE, null, ex);
    }
        }}
     class Read extends Thread {
Socket s;
String id;

        private Read(Socket s, String id) {
this.id=id;
         this.s=s;        }
         
         
        @Override
        public void run() {

            while (true) {
                try {
                    din =new DataInputStream(s.getInputStream());
                    
                        String m = din.readUTF();
                           
                             System.out.println(m);
                             
                             
                            dlm.clear();
                            String array []=m.split(",");
                            for(int i=0;i<array.length;i++) {
                                
                                if (!this.id.equals(array[i])) {
                                    dlm.addElement(array[i]);UL.setModel(dlm);
                                }
                                
                                
                                
                            }}
                        
                     catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }

            }
            
         
     }   
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane A1;
    private javax.swing.JList<String> UL;
    private javax.swing.JButton all;
    private javax.swing.JTextField dip;
    private javax.swing.JTextField dp;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField lip;
    private javax.swing.JButton login;
    private javax.swing.JTextField lp;
    private javax.swing.JTextField msg;
    public javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton send;
    private javax.swing.JTextField serverip;
    private javax.swing.JTextField serverport;
    private javax.swing.JTextField st;
    private javax.swing.JButton text;
    // End of variables declaration//GEN-END:variables
}
