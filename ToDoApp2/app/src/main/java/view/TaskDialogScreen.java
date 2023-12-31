/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.TaskController;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Project;
import model.Task;

/**
 *
 * @author Natalia
 */
public class TaskDialogScreen extends javax.swing.JDialog {

    TaskController controller;
    Project project;
    /**
     * Creates new form TaskDialogScreen
     */
    public TaskDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        hideErrorFields();
        
        controller = new TaskController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTaskHeader = new javax.swing.JPanel();
        jLabelTaskHeaderTitle = new javax.swing.JLabel();
        jLabelTaskHeaderSave = new javax.swing.JLabel();
        jPanelTaskBody = new javax.swing.JPanel();
        jLabelTaskNameTitle = new javax.swing.JLabel();
        jTextFieldTaskNameBody = new javax.swing.JTextField();
        jLableTaskDescriptionTitle = new javax.swing.JLabel();
        jScrollPaneTaskDescription = new javax.swing.JScrollPane();
        jTextAreaTaskDescriptionBody = new javax.swing.JTextArea();
        jLabelTaskDeadlineTitle = new javax.swing.JLabel();
        jLabelTaskNotesTitle = new javax.swing.JLabel();
        jScrollPaneTaskNotes = new javax.swing.JScrollPane();
        jTextAreaTaskNotesBody = new javax.swing.JTextArea();
        jFormattedTextFieldDeadline = new javax.swing.JFormattedTextField();
        jLabelNameError = new javax.swing.JLabel();
        jLabelDeadlineError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelTaskHeader.setBackground(new java.awt.Color(0, 153, 102));
        jPanelTaskHeader.setSize(new java.awt.Dimension(100, 49));

        jLabelTaskHeaderTitle.setFont(new java.awt.Font("Gotham Bold", 0, 18)); // NOI18N
        jLabelTaskHeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTaskHeaderTitle.setText("Task");

        jLabelTaskHeaderSave.setFont(new java.awt.Font("Gotham Bold", 0, 18)); // NOI18N
        jLabelTaskHeaderSave.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTaskHeaderSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        jLabelTaskHeaderSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTaskHeaderSaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTaskHeaderLayout = new javax.swing.GroupLayout(jPanelTaskHeader);
        jPanelTaskHeader.setLayout(jPanelTaskHeaderLayout);
        jPanelTaskHeaderLayout.setHorizontalGroup(
            jPanelTaskHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTaskHeaderTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTaskHeaderSave)
                .addContainerGap())
        );
        jPanelTaskHeaderLayout.setVerticalGroup(
            jPanelTaskHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskHeaderLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelTaskHeaderTitle)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(jPanelTaskHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTaskHeaderSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelTaskBody.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTaskNameTitle.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTaskNameTitle.setFont(new java.awt.Font("Gotham Bold", 0, 14)); // NOI18N
        jLabelTaskNameTitle.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTaskNameTitle.setText("Name");

        jTextFieldTaskNameBody.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTaskNameBody.setFont(new java.awt.Font("Gotham Rounded", 0, 12)); // NOI18N
        jTextFieldTaskNameBody.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldTaskNameBody.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldTaskNameBody.setToolTipText("");

        jLableTaskDescriptionTitle.setBackground(new java.awt.Color(255, 255, 255));
        jLableTaskDescriptionTitle.setFont(new java.awt.Font("Gotham Bold", 0, 14)); // NOI18N
        jLableTaskDescriptionTitle.setForeground(new java.awt.Color(0, 0, 0));
        jLableTaskDescriptionTitle.setText("Description");

        jTextAreaTaskDescriptionBody.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaTaskDescriptionBody.setColumns(20);
        jTextAreaTaskDescriptionBody.setFont(new java.awt.Font("Gotham Rounded", 0, 12)); // NOI18N
        jTextAreaTaskDescriptionBody.setForeground(new java.awt.Color(51, 51, 51));
        jTextAreaTaskDescriptionBody.setRows(5);
        jScrollPaneTaskDescription.setViewportView(jTextAreaTaskDescriptionBody);

        jLabelTaskDeadlineTitle.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTaskDeadlineTitle.setFont(new java.awt.Font("Gotham Bold", 0, 14)); // NOI18N
        jLabelTaskDeadlineTitle.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTaskDeadlineTitle.setText("Deadline");

        jLabelTaskNotesTitle.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTaskNotesTitle.setFont(new java.awt.Font("Gotham Bold", 0, 14)); // NOI18N
        jLabelTaskNotesTitle.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTaskNotesTitle.setText("Notes");

        jTextAreaTaskNotesBody.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaTaskNotesBody.setColumns(20);
        jTextAreaTaskNotesBody.setFont(new java.awt.Font("Gotham Rounded", 0, 12)); // NOI18N
        jTextAreaTaskNotesBody.setForeground(new java.awt.Color(51, 51, 51));
        jTextAreaTaskNotesBody.setRows(5);
        jScrollPaneTaskNotes.setViewportView(jTextAreaTaskNotesBody);

        jFormattedTextFieldDeadline.setBackground(new java.awt.Color(255, 255, 255));
        jFormattedTextFieldDeadline.setForeground(new java.awt.Color(51, 51, 51));
        jFormattedTextFieldDeadline.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedTextFieldDeadline.setFont(new java.awt.Font("Gotham Rounded", 0, 12)); // NOI18N
        jFormattedTextFieldDeadline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDeadlineActionPerformed(evt);
            }
        });

        jLabelNameError.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNameError.setFont(new java.awt.Font("Gotham Medium", 0, 12)); // NOI18N
        jLabelNameError.setForeground(new java.awt.Color(204, 0, 0));
        jLabelNameError.setText("*Required field");

        jLabelDeadlineError.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDeadlineError.setFont(new java.awt.Font("Gotham Medium", 0, 12)); // NOI18N
        jLabelDeadlineError.setForeground(new java.awt.Color(204, 0, 0));
        jLabelDeadlineError.setText("*Required field");

        javax.swing.GroupLayout jPanelTaskBodyLayout = new javax.swing.GroupLayout(jPanelTaskBody);
        jPanelTaskBody.setLayout(jPanelTaskBodyLayout);
        jPanelTaskBodyLayout.setHorizontalGroup(
            jPanelTaskBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTaskBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTaskNotesTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelTaskBodyLayout.createSequentialGroup()
                        .addComponent(jLabelTaskDeadlineTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDeadlineError)
                        .addGap(160, 160, 160))
                    .addComponent(jTextFieldTaskNameBody)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTaskBodyLayout.createSequentialGroup()
                        .addComponent(jLableTaskDescriptionTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(69, 69, 69))
                    .addComponent(jScrollPaneTaskNotes)
                    .addComponent(jScrollPaneTaskDescription, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextFieldDeadline)
                    .addGroup(jPanelTaskBodyLayout.createSequentialGroup()
                        .addComponent(jLabelTaskNameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNameError)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelTaskBodyLayout.setVerticalGroup(
            jPanelTaskBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskBodyLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanelTaskBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTaskNameTitle)
                    .addComponent(jLabelNameError))
                .addGap(2, 2, 2)
                .addComponent(jTextFieldTaskNameBody, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLableTaskDescriptionTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTaskDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelTaskBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTaskDeadlineTitle)
                    .addComponent(jLabelDeadlineError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTaskNotesTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneTaskNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTaskHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTaskBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTaskHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTaskBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelTaskHeaderSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTaskHeaderSaveMouseClicked
        // TODO add your handling code here:
        try {
            if (isFieldValid()) {
                Task task = new Task();
            
                task.setProjectId(project.getId()); //setando o id do projeto a qual ela pertence

                task.setName(jTextFieldTaskNameBody.getText());
                task.setDescription(jTextAreaTaskDescriptionBody.getText());
                task.setNotes(jTextAreaTaskNotesBody.getText());
                task.setIsComplete(false);

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date deadline = null;

                deadline = dateFormat.parse(jFormattedTextFieldDeadline.getText());
                task.setDeadline(deadline);

                controller.save(task);

                JOptionPane.showMessageDialog(rootPane, "Success saving task!");

                this.dispose();
            } else {
                hideErrorFields();
                if (jTextFieldTaskNameBody.getText().isEmpty()) {
                    jLabelNameError.setVisible(true);
                }
                if (jFormattedTextFieldDeadline.getText().isEmpty()) {
                    jLabelDeadlineError.setVisible(true);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
    }//GEN-LAST:event_jLabelTaskHeaderSaveMouseClicked

    private void jFormattedTextFieldDeadlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDeadlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDeadlineActionPerformed

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
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TaskDialogScreen dialog = new TaskDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextFieldDeadline;
    private javax.swing.JLabel jLabelDeadlineError;
    private javax.swing.JLabel jLabelNameError;
    private javax.swing.JLabel jLabelTaskDeadlineTitle;
    private javax.swing.JLabel jLabelTaskHeaderSave;
    private javax.swing.JLabel jLabelTaskHeaderTitle;
    private javax.swing.JLabel jLabelTaskNameTitle;
    private javax.swing.JLabel jLabelTaskNotesTitle;
    private javax.swing.JLabel jLableTaskDescriptionTitle;
    private javax.swing.JPanel jPanelTaskBody;
    private javax.swing.JPanel jPanelTaskHeader;
    private javax.swing.JScrollPane jScrollPaneTaskDescription;
    private javax.swing.JScrollPane jScrollPaneTaskNotes;
    private javax.swing.JTextArea jTextAreaTaskDescriptionBody;
    private javax.swing.JTextArea jTextAreaTaskNotesBody;
    private javax.swing.JTextField jTextFieldTaskNameBody;
    // End of variables declaration//GEN-END:variables

    public void setProject(Project project) {
        this.project = project;
    }
    
    public void hideErrorFields() {
        jLabelNameError.setVisible(false);
        jLabelDeadlineError.setVisible(false);
    }
     
    public boolean isFieldValid() {
        if ((!jTextFieldTaskNameBody.getText().isEmpty()) && (!jFormattedTextFieldDeadline.getText().isEmpty())) {
            return true;
        } else {
            return false;
        }
    }  
}
