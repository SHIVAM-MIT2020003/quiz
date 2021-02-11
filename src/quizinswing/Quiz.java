package quizinswing;

import static db.ConnectDB.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Quiz extends javax.swing.JFrame 
{
    private ResultSet rs;
    private int score=0;
    private int flag=0;
    private static boolean status=false;
    public Quiz() throws SQLException {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
            try 
            {

                rs = statement.executeQuery("select * from Questions");
                setNextData();
            } 
            catch(SQLException e)
            { }
    }
    public void setNextData()
    {
        try 
        {
            next.setEnabled(false);
            rs.next();
            question.setText(convertToMultiline(rs.getString(1)));
            ans1.setText(convertToMultiline(rs.getString(2)));
            ans2.setText(convertToMultiline(rs.getString(3)));
            ans3.setText(convertToMultiline(rs.getString(4)));
            ans4.setText(convertToMultiline(rs.getString(5))); 
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(Exception e){ }
    }
     
    public void setPreviousData()
    {
         try 
        {
            rs.previous();
            question.setText(convertToMultiline(rs.getString(1)));
            ans1.setText(convertToMultiline(rs.getString(2)));
            ans2.setText(convertToMultiline(rs.getString(3)));
            ans3.setText(convertToMultiline(rs.getString(4)));
            ans4.setText(convertToMultiline(rs.getString(5))); 
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(Exception e){ }
    }
    
    private String convertToMultiline(String string) 
    {
        return "<html>" + string.replaceAll("\n", "<br>");
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        question = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        opt1 = new javax.swing.JLabel();
        ans1 = new javax.swing.JLabel();
        opt2 = new javax.swing.JLabel();
        opt3 = new javax.swing.JLabel();
        ans3 = new javax.swing.JLabel();
        opt4 = new javax.swing.JLabel();
        ans4 = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        finish = new javax.swing.JButton();
        ans2 = new javax.swing.JLabel();
        restart = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java OCJP quiz");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(250, 250, 0, 0));
        setLocation(new java.awt.Point(250, 250));
        setMaximizedBounds(new java.awt.Rectangle(250, 250, 903, 545));
        setMinimumSize(new java.awt.Dimension(903, 545));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Java Quiz");
        jPanel1.add(jLabel1);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jScrollPane1.setBorder(null);

        question.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        question.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        question.setAlignmentX(10.0F);
        question.setAutoscrolls(true);
        jScrollPane1.setViewportView(question);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
        );

        opt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        opt1.setText("A");

        ans1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ans1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ans1MouseClicked(evt);
            }
        });

        opt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        opt2.setText("B");

        opt3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        opt3.setText("C");

        ans3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ans3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ans3MouseClicked(evt);
            }
        });

        opt4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        opt4.setText("D");

        ans4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ans4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ans4MouseClicked(evt);
            }
        });

        next.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        next.setText("Next");
        next.setEnabled(false);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        finish.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        finish.setText("Finish");
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });

        ans2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ans2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ans2MouseClicked(evt);
            }
        });

        restart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        restart.setText("Restart");
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(opt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ans1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(opt2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ans2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(opt3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ans3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(opt4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ans4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(restart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finish, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opt1)
                    .addComponent(ans1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opt2)
                    .addComponent(ans2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opt3)
                    .addComponent(ans3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opt4)
                    .addComponent(ans4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next)
                    .addComponent(finish)
                    .addComponent(restart))
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Restart");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem3.setText("about");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ans4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ans4MouseClicked
      if(status == false){
             String ans=opt4.getText();
            try {
                if(ans.equalsIgnoreCase(rs.getString(6)))
                {
                    next.setEnabled(true);
                    ans4.setForeground(Color.GREEN);
                    opt4.setForeground(Color.GREEN);
                    score++;
                    opt1.setEnabled(false);

                    ans1.setEnabled(false);
                    opt2.setEnabled(false);
                    ans2.setEnabled(false);
                    opt3.setEnabled(false);
                    ans3.setEnabled(false);
                    status = true;
                }
                else
               {
                   flag=1;
                   ans4.setForeground(Color.RED);
                   opt4.setForeground(Color.RED);
                   JOptionPane.showMessageDialog(null,"Wrong Answer"+"\n"+"Score "+String.valueOf(score));
                   opt1.setEnabled(false);
                   ans1.setEnabled(false);
                   opt2.setEnabled(false);
                   ans2.setEnabled(false);
                   opt3.setEnabled(false);
                   ans3.setEnabled(false);
                   next.setEnabled(false);
               }
            } 
            catch (SQLException ex) {
                Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      else{
          return;
      }       
    }//GEN-LAST:event_ans4MouseClicked

    private void ans3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ans3MouseClicked
        if(status == false){
            String ans=opt3.getText();
            try {
                    if(ans.equalsIgnoreCase(rs.getString(6)))
                    {
                        next.setEnabled(true);
                        ans3.setForeground(Color.GREEN);
                        opt3.setForeground(Color.GREEN);
                        score++;
                        opt1.setEnabled(false);
                        ans1.setEnabled(false);
                        opt2.setEnabled(false);
                        ans2.setEnabled(false);
                        opt4.setEnabled(false);
                        ans4.setEnabled(false);
                        status = true;
                    }
                    else
                    {
                        flag=1;
                        ans3.setForeground(Color.RED);
                        opt3.setForeground(Color.RED);
                        JOptionPane.showMessageDialog(null,"Wrong Answer"+"\n"+"Score "+String.valueOf(score));
                        opt1.setEnabled(false);
                        ans1.setEnabled(false);
                        opt2.setEnabled(false);
                        ans2.setEnabled(false);
                        opt4.setEnabled(false);
                        ans4.setEnabled(false);
                    }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     else
        {
            return;
        } 
    }//GEN-LAST:event_ans3MouseClicked

    private void ans1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ans1MouseClicked
        if(status == false){
           String ans=opt1.getText();
           try {
               if(ans.equalsIgnoreCase(rs.getString(6)))
               {
                   next.setEnabled(true);
                   ans1.setForeground(Color.GREEN);
                   opt1.setForeground(Color.GREEN);
                   score++;
                   opt2.setEnabled(false);
                   ans2.setEnabled(false);
                   opt3.setEnabled(false);
                   ans3.setEnabled(false);
                   opt4.setEnabled(false);
                   ans4.setEnabled(false);
                   status = true;
               }
               else
               {
                   flag=1;
                   ans1.setForeground(Color.RED);
                   opt1.setForeground(Color.RED);
                   opt2.setEnabled(false);
                   ans2.setEnabled(false);
                   opt3.setEnabled(false);
                   ans3.setEnabled(false);
                   opt4.setEnabled(false);
                   ans4.setEnabled(false);
                   JOptionPane.showMessageDialog(null,"Wrong Answer"+"\n"+"Score "+String.valueOf(score));
               }
           } catch (SQLException ex) {
               Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        else{
            return;
        }
    }//GEN-LAST:event_ans1MouseClicked

    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
      
        if(flag==0)
        {
            JOptionPane.showMessageDialog(null,String.valueOf("Score "+score));
            System.exit(0);
        }
        else
        {
           System.exit(0);
        }
    }//GEN-LAST:event_finishActionPerformed

    private void ans2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ans2MouseClicked
        if(status == false){
            String ans=opt2.getText();
            try {
                if(ans.equalsIgnoreCase(rs.getString(6)))
                {
                    next.setEnabled(true);
                    ans2.setForeground(Color.GREEN);
                    opt2.setForeground(Color.GREEN);
                    score++;
                    opt1.setEnabled(false);
                    ans1.setEnabled(false);
                    opt3.setEnabled(false);
                    ans3.setEnabled(false);
                    opt4.setEnabled(false);
                    ans4.setEnabled(false);
                    status = true;
                }
                else
                {
                    flag=1;
                    ans2.setForeground(Color.RED);
                    opt2.setForeground(Color.RED);
                    opt1.setEnabled(false);
                    ans1.setEnabled(false);
                    opt3.setEnabled(false);
                    ans3.setEnabled(false);
                    opt4.setEnabled(false);
                    ans4.setEnabled(false);
                    JOptionPane.showMessageDialog(null,"Wrong Answer"+"\n"+"Score "+String.valueOf(score));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            return;
        }
       
    }//GEN-LAST:event_ans2MouseClicked

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        ans1.setForeground(Color.BLACK);
        ans2.setForeground(Color.BLACK);
        ans3.setForeground(Color.BLACK);
        ans4.setForeground(Color.BLACK);
        opt1.setForeground(Color.BLACK);
        opt2.setForeground(Color.BLACK);
        opt3.setForeground(Color.BLACK);
        opt4.setForeground(Color.BLACK);
        //previous.setEnabled(true);
        
        opt1.setEnabled(true);
        ans1.setEnabled(true);
        opt2.setEnabled(true);
        ans2.setEnabled(true);
        opt3.setEnabled(true);
        ans3.setEnabled(true);
        opt4.setEnabled(true);
        ans4.setEnabled(true);
        status = false;
        try
        {
            setNextData();
        }catch(Exception e){ }
        
    }//GEN-LAST:event_nextActionPerformed

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
         
        try {
            //rs.first();
            new Quiz().setVisible(true);
            dispose();
            
            question.setText(convertToMultiline(rs.getString(1)));
            ans1.setText(convertToMultiline(rs.getString(2)));
            ans2.setText(convertToMultiline(rs.getString(3)));
            ans3.setText(convertToMultiline(rs.getString(4)));
            ans4.setText(convertToMultiline(rs.getString(5)));
            
            ans1.setForeground(Color.BLACK);
            ans2.setForeground(Color.BLACK);
            ans3.setForeground(Color.BLACK);
            ans4.setForeground(Color.BLACK);
            opt1.setForeground(Color.BLACK);
            opt2.setForeground(Color.BLACK);
            opt3.setForeground(Color.BLACK);
            opt4.setForeground(Color.BLACK);
        
            opt1.setEnabled(true);
            ans1.setEnabled(true);
            opt2.setEnabled(true);
            ans2.setEnabled(true);
            opt3.setEnabled(true);
            ans3.setEnabled(true);
            opt4.setEnabled(true);
            ans4.setEnabled(true);
            score=0;
            status = false;
        
        } catch (SQLException ex) {
            Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_restartActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        restartActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new About().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Quiz q=new Quiz();
                    q.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ans1;
    private javax.swing.JLabel ans2;
    private javax.swing.JLabel ans3;
    private javax.swing.JLabel ans4;
    private javax.swing.JButton finish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton next;
    private javax.swing.JLabel opt1;
    private javax.swing.JLabel opt2;
    private javax.swing.JLabel opt3;
    private javax.swing.JLabel opt4;
    private javax.swing.JLabel question;
    private javax.swing.JButton restart;
    // End of variables declaration//GEN-END:variables
}
