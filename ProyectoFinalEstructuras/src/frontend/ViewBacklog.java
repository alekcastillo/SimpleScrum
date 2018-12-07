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
public class ViewBacklog extends javax.swing.JFrame {
    private BackEnd backend;
    private Project project;
    private Sprint sprint;

    /**
     * Creates new form ViewProject
     */
        
    public ViewBacklog(BackEnd backend, Project project) {
        initComponents();
        this.backend = backend;
        this.project = project;
        this.sprint = project.backlog;
        
        fillForm();
    }
    
    private void enableEditButtons() {
        btnDeleteTask.setEnabled(true);
        btnEditTask.setEnabled(true);
    }
    
    private void fillForm() {
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
        
        //for (int x = 1; x <= sprint.tasks.length(); x++) {
            //model.addRow(sprint.tasks.get(x).getObject().getTableRow());
        //}
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTasks = new javax.swing.JTable();
        btnNewTask = new javax.swing.JButton();
        btnNewTask1 = new javax.swing.JButton();

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
        btnEditTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditTaskActionPerformed(evt);
            }
        });

        btnDeleteTask.setText("Delete task");
        btnDeleteTask.setEnabled(false);
        btnDeleteTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTaskActionPerformed(evt);
            }
        });

        lblInformation.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblInformation.setText("Backlog");

        lblTasks.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblTasks.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTasks.setText("Tasks");

        txtProject.setEditable(false);
        txtProject.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

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
        btnNewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewTaskActionPerformed(evt);
            }
        });

        btnNewTask1.setText("Move task to sprint");
        btnNewTask1.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReturn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteTask)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditTask)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNewTask, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNewTask1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblProject)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProject, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTasks))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProject)
                    .addComponent(txtProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTasks)
                    .addComponent(lblInformation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteTask)
                    .addComponent(btnEditTask)
                    .addComponent(btnNewTask)
                    .addComponent(btnReturn)
                    .addComponent(btnNewTask1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        new ViewProject(backend, project).show();
        dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnNewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewTaskActionPerformed
        new ViewTask(backend, project, sprint).show();
        dispose();
    }//GEN-LAST:event_btnNewTaskActionPerformed

    private void btnEditTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditTaskActionPerformed
        //new ViewTask(backend, project, sprint, sprint.tasks.get(tblTasks.getSelectedRow() + 1).getObject()).show();
        dispose();
    }//GEN-LAST:event_btnEditTaskActionPerformed

    private void btnDeleteTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTaskActionPerformed
        int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this task?");
        
        if (confirmation == JOptionPane.YES_OPTION) {
            //sprint.tasks.delete(tblTasks.getSelectedRow() + 1);
            fillForm();
            
            JOptionPane.showMessageDialog(null, "Task deleted succesfully!");
        }
    }//GEN-LAST:event_btnDeleteTaskActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteTask;
    private javax.swing.JButton btnEditTask;
    private javax.swing.JButton btnNewTask;
    private javax.swing.JButton btnNewTask1;
    private javax.swing.JButton btnReturn;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInformation;
    private javax.swing.JLabel lblProject;
    private javax.swing.JLabel lblTasks;
    private javax.swing.JTable tblTasks;
    private javax.swing.JTextField txtProject;
    // End of variables declaration//GEN-END:variables
}