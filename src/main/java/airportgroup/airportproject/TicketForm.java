package airportgroup.airportproject;


import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 1blak
 */
public class TicketForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    private Connection connection;
    
    public TicketForm() {
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

        jLabel1 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userID = new javax.swing.JTextField();
        seat = new javax.swing.JTextField();
        flightID = new javax.swing.JTextField();
        newButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        ticketID = new javax.swing.JLabel();
        menuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ticket Form");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Tickets");

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        userList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        userList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                userListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(userList);

        jLabel2.setText("Ticket ID:");

        jLabel3.setText("User ID:");

        jLabel4.setText("Flight ID:");

        jLabel5.setText("Seat:");

        userID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDActionPerformed(evt);
            }
        });

        seat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatActionPerformed(evt);
            }
        });

        flightID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightIDActionPerformed(evt);
            }
        });

        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        ticketID.setText("          ");

        menuButton.setText("Menu");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(seat, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ticketID)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(flightID, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(userID))))
                .addGap(162, 162, 162)
                .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newButton)
                .addGap(18, 18, 18)
                .addComponent(deleteButton)
                .addGap(18, 18, 18)
                .addComponent(saveButton)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(refreshButton))
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(ticketID)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(menuButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(flightID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(118, 118, 118)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newButton)
                    .addComponent(deleteButton)
                    .addComponent(saveButton))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        refresh();
    }//GEN-LAST:event_refreshButtonActionPerformed

    public boolean connect(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root","dinosaur");
            return true;
        } catch(Exception exception){
            exception.printStackTrace();
            return false;
        }
    }
    
    public void refresh(){
        try{
            if(connect()){
                String query = "select * from reguser";
                Statement sta = connection.createStatement();

                ResultSet rs = sta.executeQuery(query);
                DefaultListModel listModel;
                listModel = new DefaultListModel();
                while(rs.next()){
                    listModel.addElement(rs.getString("ID") + " - " + rs.getString("first_name") + " " + 
                            rs.getString("last_name"));
                }
                userList.clearSelection();
                userList.setModel(listModel);
                connection.close();
            }
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
    }
    
    private void userIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIDActionPerformed

    private void seatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatActionPerformed

    private void flightIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightIDActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        try{
            if (connect() && !userID.getText().isEmpty() && !flightID.getText().isEmpty()){
                PreparedStatement stmt = connection.prepareStatement("insert into reguser values(?,?,?,?,?,?,?,?,?,?,?)");
                stmt.setString(2, userID.getText());
                stmt.setString(3, flightID.getText());
                stmt.setString(10, seat.getText());
                stmt.setString(1, Integer.toString(getUniqueID()));
                stmt.executeUpdate();  
                refresh();
            }
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
    }//GEN-LAST:event_newButtonActionPerformed

    private void userListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_userListValueChanged
       //Get the index of the selected item         
       int index = userList.getSelectedIndex(); 
       if(index>=0){
        //Log the output         
        System.out.println("Index Selected: " + index);
        //Grab the selected value of the item.
        String s = (String) userList.getSelectedValue();
        //log the value
        System.out.println("Value Selected: " + s);
        //This function breaks apart the values by splitting the string based on "-"
        String[] parts = s.split("-");
        //Grab the first item - this is the id
        String ID = parts[0].trim();
        System.out.println("ID: " + ID);
        //Call the update form funciton to update the screen
        updateform(ID);
        // TODO add your handling code here:
       }
    }//GEN-LAST:event_userListValueChanged

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try{
            if (connect() && !userID.getText().isEmpty() && !flightID.getText().isEmpty()){
                PreparedStatement stmt = connection.prepareStatement("update reguser set "
                        + "first_name=?, last_name=?, email=?, address=?, city=?, state=?, zip=?, occupation=?, birth_date=?, phone=? "
                        + "where ID=?");
                stmt.setString(11, ticketID.getText());
                stmt.setString(1, userID.getText());
                stmt.setString(2, flightID.getText());
                stmt.setString(9, seat.getText());
                stmt.executeUpdate();   
                refresh();
            }
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try{
            if (connect()){
                PreparedStatement stmt = connection.prepareStatement("delete from reguser where ID=?");
                stmt.setString(1, ticketID.getText());
                stmt.executeUpdate();
                refresh();
            }
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_menuButtonActionPerformed

    public void updateform(String id){
        try {
            //Establish mysql connection
            connect();
            //Initialize the query
            String query = "select * from reguser where ID="+id;
            //create the statement
            Statement sta = connection.createStatement();
            //Set the results
            ResultSet rs = sta.executeQuery(query);  
            //Because we are targeting a primary key, we simply set the values to the results taht are retrieved.  
            while (rs.next()) {
                //Set the controls to the dtabase values
               userID.setText(rs.getString("first_name"));
               flightID.setText(rs.getString("last_name"));
               seat.setText(rs.getString("birth_date"));
               ticketID.setText(rs.getString("ID"));
            } 
            //close the connection
            connection.close();
        } catch (Exception exception) { //catch any exceptions that may have occured
            exception.printStackTrace(); //print any errors
        } 
    }
    
    private int getUniqueID(){
        int id = 1;
        Boolean found = false;
       /* for(int i = 0; i < userList.getComponentCount(); i++){
            
        }*/
        try{
            if(connect()){
                while (!found){
                    String query = "select ID from reguser where ID="+id;
                //create the statement
                Statement sta = connection.createStatement();
                //Set the results
                ResultSet rs = sta.executeQuery(query); 
                if(!rs.next())
                    found = true;
                else
                    id++;
                }
            } else
                System.out.println("Connection failed...");
        } catch(Exception exception) {
            exception.printStackTrace();
        }
        return id;
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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField flightID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menuButton;
    private javax.swing.JButton newButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField seat;
    private javax.swing.JLabel ticketID;
    private javax.swing.JTextField userID;
    private javax.swing.JList<String> userList;
    // End of variables declaration//GEN-END:variables

    //Custom Variable declaration
    private String[] passwords = {"dinosaur", "", "Xxwujak!uq8du3"};
    private String password = passwords[2];
}
