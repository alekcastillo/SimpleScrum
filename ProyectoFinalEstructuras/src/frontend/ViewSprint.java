/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.BackEnd;
import backend.Project;
import backend.Sprint;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alekc
 */
public class ViewSprint extends javax.swing.JFrame {
    private BackEnd backend;
    private Project project;
    private Sprint sprint;

    /**
     * Creates new form ViewProject
     */
    
    public ViewSprint(BackEnd backend, Project project) {
        initComponents();
        this.backend = backend;
        this.project = project;
        
        lblInformation.setText("New sprint");
        setEditable(true);
        btnDiscard.setEnabled(false);
        
        fillForm();
    }
        
    public ViewSprint(BackEnd backend, Project project, Sprint sprint) {
        initComponents();
        this.backend = backend;
        this.project = project;
        this.sprint = sprint;
        
        fillForm();
    }
    
    private void enableEditButtons() {
        btnDeleteTask.setEnabled(true);
        btnEditTask.setEnabled(true);
    }

    public void saveSprint() {
        sprint.setTitle(txtTitle.getText());
        sprint.setDescription(txtDescription.getText());
    }
    
    public void fillForm() {
        txtProject.setText(project.getTitle());
        
        tblTasks.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                if (tblTasks.getSelectedRow() > -1) {
                    enableEditButtons();
                }
            }
        });
        
        DefaultTableModel model = new DefaultTableModel(
            null,
            new String [] {"Title", "Priority", "Status"});
        
        if (sprint != null) {
            //for (int x = 1; x <= sprint.tasks.length(); x++) {
                //model.addRow(sprint.tasks.get(x).getObject().getTableRow());
            //}
            
            txtTitle.setText(sprint.getTitle());
            txtDescription.setText(sprint.getDescription());
            btnNewTask.setEnabled(true);
        }
    }
    
    public void setEditable(boolean editable) {
        txtTitle.setEditable(editable);
        txtDescription.setEditable(editable);
        btnEdit.setEnabled(!editable);
        btnSave.setEnabled(editable);
        btnDiscard.setEnabled(editable);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        lblProject = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        btnEditTask = new javax.swing.JButton();
        btnDeleteTask = new javax.swing.JButton();
        lblInformation = new javax.swing.JLabel();
        lblTasks = new javax.swing.JLabel();
        txtProject = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        lblDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTasks = new javax.swing.JTable();
        btnNewTask = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDiscard = new javax.swing.JButton();
        lblEnd = new javax.swing.JLabel();
        lblStart = new javax.swing.JLabel();
        dateStart = new com.toedter.calendar.JDateChooser();
        dateEnd = new com.toedter.calendar.JDateChooser();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblProject.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblProject.setText("Project");

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        btnEditTask.setText("View/Edit task");
        btnEditTask.setEnabled(false);

        btnDeleteTask.setText("Delete task");
        btnDeleteTask.setEnabled(false);

        lblInformation.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblInformation.setText("Sprint Information");

        lblTasks.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblTasks.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTasks.setText("Tasks");

        txtProject.setEditable(false);
        txtProject.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        txtDescription.setEditable(false);
        txtDescription.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lblDescription.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblDescription.setText("Description");

        tblTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTasks);

        btnNewTask.setText("Add task");
        btnNewTask.setEnabled(false);

        lblTitle.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblTitle.setText("Title");

        txtTitle.setEditable(false);
        txtTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDiscard.setText("Discard");
        btnDiscard.setEnabled(false);
        btnDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscardActionPerformed(evt);
            }
        });

        lblEnd.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblEnd.setText("End date");

        lblStart.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblStart.setText("Start date");

        dateStart.setEnabled(false);

        dateEnd.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblProject)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProject, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTasks))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnReturn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteTask)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditTask)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNewTask, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(7, 7, 7)
                                .addComponent(btnDiscard)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSave))
                            .addComponent(txtTitle)
                            .addComponent(txtDescription)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTitle)
                                    .addComponent(lblDescription)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblEnd)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(dateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblStart)
                                            .addGap(18, 18, 18)
                                            .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblProject)
                        .addComponent(txtProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTasks))
                    .addComponent(lblInformation))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDescription)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblStart))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEnd)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDiscard, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(dateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteTask)
                    .addComponent(btnEditTask)
                    .addComponent(btnNewTask)
                    .addComponent(btnReturn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to save this sprint?");

        if (confirmation == JOptionPane.YES_OPTION) {
            if (sprint != null) {
                saveSprint();
            } else {
                sprint = project.addSprint(txtTitle.getText(), txtDescription.getText());
            }

            JOptionPane.showMessageDialog(null, "Sprint saved succesfully!");
            
            fillForm();
            setEditable(false);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        setEditable(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscardActionPerformed
        int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to discard your changes to this sprint?");

        if (confirmation == JOptionPane.YES_OPTION) {
            fillForm();
            setEditable(false);
        }
    }//GEN-LAST:event_btnDiscardActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        new ViewProject(backend, project).show();
        dispose();
    }//GEN-LAST:event_btnReturnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteTask;
    private javax.swing.JButton btnDiscard;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEditTask;
    private javax.swing.JButton btnNewTask;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSave;
    private com.toedter.calendar.JDateChooser dateEnd;
    private com.toedter.calendar.JDateChooser dateStart;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblEnd;
    private javax.swing.JLabel lblInformation;
    private javax.swing.JLabel lblProject;
    private javax.swing.JLabel lblStart;
    private javax.swing.JLabel lblTasks;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblTasks;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtProject;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
