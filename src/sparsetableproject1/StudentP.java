package sparsetableproject1;

import javax.swing.JOptionPane;

public class StudentP extends javax.swing.JFrame {
static StudentP student=new StudentP();
    static StudentNodes meth2=new StudentNodes();
    public StudentP() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IDgetCou = new javax.swing.JTextField();
        jButtongetcourse = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        courseArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButtonaddcouforstu = new javax.swing.JButton();
        jButtonremovecouforstu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonback = new javax.swing.JButton();
        couname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewcou = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        jLabel5.setBackground(new java.awt.Color(255, 204, 204));
        jLabel5.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Adminstrator");

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Student ID :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Get Courses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel6.setBackground(new java.awt.Color(255, 204, 204));
        jLabel6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("  Student");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Student ID :");

        IDgetCou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDgetCouActionPerformed(evt);
            }
        });

        jButtongetcourse.setText("Get Courses");
        jButtongetcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtongetcourseActionPerformed(evt);
            }
        });

        courseArea.setColumns(20);
        courseArea.setRows(5);
        jScrollPane3.setViewportView(courseArea);

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText(" Course Name :");

        jButtonaddcouforstu.setText("Add");
        jButtonaddcouforstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaddcouforstuActionPerformed(evt);
            }
        });

        jButtonremovecouforstu.setText("Remove ");
        jButtonremovecouforstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonremovecouforstuActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mariam Habshi\\Downloads\\OIP (1).jpeg")); // NOI18N
        jLabel1.setText("jLabel1");

        jButtonback.setText("Back");
        jButtonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbackActionPerformed(evt);
            }
        });

        couname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                counameActionPerformed(evt);
            }
        });

        viewcou.setColumns(20);
        viewcou.setRows(5);
        viewcou.setText("Here's the options:");
        jScrollPane1.setViewportView(viewcou);

        jButton2.setText("View options");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(121, 121, 121)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(couname, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(jButtonaddcouforstu, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonremovecouforstu)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(IDgetCou, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtongetcourse))
                                    .addComponent(jScrollPane1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonback)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtongetcourse)
                    .addComponent(IDgetCou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(50, 50, 50)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(couname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonaddcouforstu)
                            .addComponent(jButtonremovecouforstu)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jButtonback)))
                .addGap(11, 11, 11))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void IDgetCouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDgetCouActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDgetCouActionPerformed
public void printStudentCourses(int idd){
        if(meth2.checkId(idd)!=null){
            StudentNodes.csNode tempNode = meth2.checkId(idd).linkWithCourse;
            if(tempNode!=null){
                StringBuilder coursesText = new StringBuilder();
            while(tempNode!=null){
                coursesText.append(tempNode.course).append("\n");
                tempNode= tempNode.nextDown;
            }
            
            courseArea.append(coursesText.toString() + "\n");
            }else{
               JOptionPane.showMessageDialog(this,"There is no courses for this id");
            }
        
        }else{
          JOptionPane.showMessageDialog(this,"ID not found\nBack to add it to system!");
        }
    }
    private void jButtongetcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtongetcourseActionPerformed
        if(student.IDgetCou.getText().equals("")){
        JOptionPane.showMessageDialog(this,"Please enter id");    
        }else{
        // TODO add your handling code here:
        courseArea.setText("");
        printStudentCourses(Integer.parseInt(student.IDgetCou.getText()));       
        }
        
    }//GEN-LAST:event_jButtongetcourseActionPerformed
    public void addCourse(int idd, String c){
        if(meth2.isCourseExist(c)!=null && meth2.isCourseExist(c).course.equals(c)){ //check if course is exist in system
        if(meth2.checkId(idd)!=null){  //check student is in system
            StudentNodes.sNode tempStudent  = meth2.checkId(idd);
            StudentNodes.cNode tempCourse = meth2.isCourseExist(c);
            
            if (meth2.isFirstCourse(idd)){ //is first course for this student
                StudentNodes.csNode newNode = new StudentNodes.csNode(idd, c);
                tempStudent.linkWithCourse = newNode;
                newNode.firstUp = tempStudent;
                newNode.nextDown=null;
                if(tempCourse.linkWithStudent==null){ //this course was first one added to any student
                    tempCourse.linkWithStudent = newNode;
                    newNode.nextRight=null;
                }else{
                    StudentNodes.csNode tempNode = tempCourse.linkWithStudent; // assign first course to temp node as temp head
                    while(tempNode.nextRight!=null){
                        tempNode=tempNode.nextRight;
                    }
                    tempNode.nextRight=newNode;
                    newNode.nextRight=null;
                } 
            }else{ //there are a courses for this student
                StudentNodes.csNode newNode = new StudentNodes.csNode(idd, c);
                StudentNodes.csNode temp = tempStudent.linkWithCourse;
                while(temp.nextDown!=null){
                    temp = temp.nextDown;
                }
                temp.nextDown=newNode;
                newNode.up = temp;
                newNode.nextDown=null;
                
                if(tempCourse.linkWithStudent==null){ //this course was first one added to any student
                    tempCourse.linkWithStudent = newNode;
                    newNode.nextRight=null;
                }else{
                    StudentNodes.csNode tempNode = tempCourse.linkWithStudent; // assign first course to temp node as temp head
                    while(tempNode.nextRight!=null){
                        tempNode=tempNode.nextRight;
                    }
                    tempNode.nextRight=newNode;
                    newNode.nextRight=null;
                }
        
            }
            JOptionPane.showMessageDialog(this,"This course has been added for you");
        }else{
        JOptionPane.showMessageDialog(this,"ID is not found");
        } 
        }else{
        JOptionPane.showMessageDialog(this,"Course is not exist");    
        }
        
    }
    private void jButtonaddcouforstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddcouforstuActionPerformed
      if(!couname.getText().equals("")){
        addCourse(Integer.parseInt(student.IDgetCou.getText()), (String)student.couname.getText());}
      else{
        JOptionPane.showMessageDialog(this,"Enter course name");    
        }
      
// TODO add your handling code here:
    }//GEN-LAST:event_jButtonaddcouforstuActionPerformed
 public void deleteCourseFromStudent(int idd , String c){
      StudentNodes.sNode student = meth2.checkId(idd);

    if (student != null) { // Check if the student is in the system
        StudentNodes.cNode course = meth2.isCourseExist(c);

        if (course != null) { // Check if the course is in the system
            // Find the csNode that connects the student and the course
            StudentNodes.csNode prevNode = null;
            StudentNodes.csNode currentNode = course.linkWithStudent;

            while (currentNode != null && currentNode.id != idd) {
                prevNode = currentNode;
                currentNode = currentNode.nextRight;
            }

            // If the connection is found
            if (currentNode != null) {
                if (prevNode == null) {
                    // If the connection is the first in the list
                    course.linkWithStudent = currentNode.nextRight;
                } else {
                    // If the connection is not the first in the list
                    prevNode.nextRight = currentNode.nextRight;
                }

                // Update the student's linkWithCourse
                if (student.linkWithCourse == currentNode) {
                    student.linkWithCourse = currentNode.nextDown;
                } else {
                    StudentNodes.csNode prevCourseNode = student.linkWithCourse;
                    while (prevCourseNode.nextDown != null && prevCourseNode.nextDown != currentNode) {
                        prevCourseNode = prevCourseNode.nextDown;
                    }
                    if (prevCourseNode.nextDown != null) {
                        prevCourseNode.nextDown = currentNode.nextDown;
                    }
                }

                // Clean up the currentNode
                currentNode.nextRight = null;
                currentNode.nextDown = null;

                JOptionPane.showMessageDialog(this, "Course has been removed successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Student is not enrolled in the specified course");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Course is not exist");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Your id is not exist in the system");
    }
         /*if(meth2.checkId(idd)!=null){ //check student is in system
            if(meth2.isCourseExist(c)!=null && meth2.isCourseExist(c).course.equals(c)){  //check if course is exist in system
                StudentNodes.sNode tempStudent  = meth2.checkId(idd);
                StudentNodes.cNode tempCourse = meth2.isCourseExist(c);
                StudentNodes.csNode myNode ,prevNode;
//                prevNode = tempCourse.linkWithStudent;
  //              myNode = prevNode.nextRight;
                 for(prevNode = tempCourse.linkWithStudent , myNode=prevNode.nextRight ; ( (prevNode.id!=idd) && (prevNode.nextRight!=null)) && (myNode.id!=idd ) ; myNode = myNode.nextRight , prevNode= prevNode.nextRight) ;             
                 
                if (prevNode.firstUp == tempStudent && tempCourse.linkWithStudent == prevNode && prevNode.id == idd) {
                    tempCourse.linkWithStudent = myNode;
                    tempStudent.linkWithCourse = prevNode.nextDown;
                    if(prevNode.nextDown!=null){
                    prevNode.nextDown.firstUp = tempStudent;
                    prevNode.firstUp = null;
                    prevNode.nextDown.up = null;
                    }else{
                        prevNode.firstUp=null;
                    }
                } else if (myNode.id == idd && myNode.firstUp == tempStudent) {
                    prevNode.nextRight = myNode.nextRight;
                    if(myNode.nextDown==null){}else{
                        myNode.nextDown.firstUp = tempStudent;
                     }
                    tempStudent.linkWithCourse = myNode.nextDown;
                    myNode.firstUp = null;
                    //myNode.nextDown.up = null;
                } else if (prevNode == tempCourse.linkWithStudent && prevNode.id == idd && prevNode.firstUp == null) {
                    tempCourse.linkWithStudent = myNode;
                    prevNode.up.nextDown = prevNode.nextDown;
                    if(prevNode.nextDown !=null){
                    prevNode.nextDown.up = prevNode.up;
                    prevNode.up =prevNode.nextDown= null;
                    }else{
                    prevNode.up =prevNode.nextDown= null; 
                    }
                } else {
                    prevNode.nextRight = myNode.nextRight;
                    myNode.up.nextDown = myNode.nextDown;
                    if(myNode.nextDown!=null){
                    myNode.nextDown.up = myNode.up;
                    myNode.up = myNode.nextDown = myNode.nextDown = null;
                    }else{
                    myNode.up = myNode.nextDown = myNode.nextDown = null;
                    }
                }
                JOptionPane.showMessageDialog(this,"Course has been removed successfully ");
            } else {
                JOptionPane.showMessageDialog(this,"Course is not exist");
            }
        } else {
            JOptionPane.showMessageDialog(this,"Your id is not exist in system");
        }
    */
    }
    private void jButtonremovecouforstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonremovecouforstuActionPerformed
      if(!couname.getText().equals("")){
        deleteCourseFromStudent(Integer.parseInt(student.IDgetCou.getText()), (String)student.couname.getText());}
      else {
          JOptionPane.showMessageDialog(this,"Enter course name");
      }
    }//GEN-LAST:event_jButtonremovecouforstuActionPerformed

    private void jButtonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbackActionPerformed
        // TODO add your handling code here:
        System.mysys.setVisible(true);
         setVisible(false);
    }//GEN-LAST:event_jButtonbackActionPerformed

    private void counameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_counameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_counameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
      student.viewcou.setText("");
      StudentNodes.cNode printcou=meth2.courseHead;     
      while(printcou!=null){
      student.viewcou.append(printcou.course+"\n");
      printcou=printcou.next;
      //student.viewcou.setText("");
    }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDgetCou;
    private javax.swing.JTextField couname;
    private javax.swing.JTextArea courseArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonaddcouforstu;
    private javax.swing.JButton jButtonback;
    private javax.swing.JButton jButtongetcourse;
    private javax.swing.JButton jButtonremovecouforstu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea viewcou;
    // End of variables declaration//GEN-END:variables
}
