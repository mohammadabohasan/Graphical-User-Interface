package MohammadAboHasan_201913064;

import javax.swing.JOptionPane;

public class Sign_up extends javax.swing.JFrame {

    /**
     * Creates new form Sign_up
     */
    public boolean ok = false;
    public MyArrayList<Employee> list_Employee = new MyArrayList<>();
    public MyArrayList<Student> list_Student = new MyArrayList<>();

    public Sign_up() {
        initComponents();
        setLocationRelativeTo(null);
        btn_sgn2.setVisible(false);
        Employee_Visible(false);
        Student_Visible(false);
    }

    public void Employee_Visible(boolean b) {
        txt_job.setVisible(b);
        txt_company.setVisible(b);
        txt_salary.setVisible(b);

        lbl_job.setVisible(b);
        lbl_company.setVisible(b);
        lbl_salary.setVisible(b);

        print_employee.setVisible(b);
    }

    public void Student_Visible(boolean b) {
        txt_university.setVisible(b);
        txt_college.setVisible(b);
        txt_level.setVisible(b);

        lbl_university.setVisible(b);
        lbl_college.setVisible(b);
        lbl_level.setVisible(b);

        print_student.setVisible(b);
    }

    public boolean isInteger(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                return false;
            }
        }
        Long l = Long.valueOf(s);
        if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public boolean isDouble(String s) {
        int c = 1;
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9' || s.charAt(i) == '.' && c-- > 0)) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sign_up = new javax.swing.JPanel();
        lbl_id = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lbl_gender = new javax.swing.JLabel();
        lbbl_age = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_pass1 = new javax.swing.JLabel();
        lbl_pass2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_gender = new javax.swing.JTextField();
        txt_age = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        lbl_phone = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        btn_employee = new javax.swing.JButton();
        btn_student = new javax.swing.JButton();
        lbl_Welcome = new javax.swing.JLabel();
        pass_one = new javax.swing.JPasswordField();
        pass_two = new javax.swing.JPasswordField();
        lbl_job = new javax.swing.JLabel();
        txt_job = new javax.swing.JTextField();
        lbl_company = new javax.swing.JLabel();
        txt_company = new javax.swing.JTextField();
        lbl_salary = new javax.swing.JLabel();
        txt_salary = new javax.swing.JTextField();
        lbl_university = new javax.swing.JLabel();
        txt_university = new javax.swing.JTextField();
        lbl_college = new javax.swing.JLabel();
        txt_college = new javax.swing.JTextField();
        lbl_level = new javax.swing.JLabel();
        txt_level = new javax.swing.JTextField();
        btn_sgn1 = new javax.swing.JButton();
        btn_sgn2 = new javax.swing.JButton();
        print_student = new javax.swing.JButton();
        print_employee = new javax.swing.JButton();
        copyRight = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");
        setBackground(new java.awt.Color(153, 255, 153));
        setResizable(false);

        Sign_up.setBackground(new java.awt.Color(153, 255, 153));

        lbl_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_id.setText("ID");

        lbl_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_name.setText("Name");

        lbl_gender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_gender.setText("Gender");

        lbbl_age.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbbl_age.setText("Age");

        lbl_address.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_address.setText("Address");

        lbl_email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_email.setText("Email");

        lbl_pass1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_pass1.setText("Password");

        lbl_pass2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_pass2.setText("Confirm Password");

        txt_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lbl_phone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_phone.setText("Phone");

        txt_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneActionPerformed(evt);
            }
        });

        btn_employee.setBackground(new java.awt.Color(102, 255, 255));
        btn_employee.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_employee.setText("Employee");
        btn_employee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_employeeActionPerformed(evt);
            }
        });

        btn_student.setBackground(new java.awt.Color(255, 204, 204));
        btn_student.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_student.setText("Student");
        btn_student.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_studentActionPerformed(evt);
            }
        });

        lbl_Welcome.setFont(new java.awt.Font("Agency FB", 1, 26)); // NOI18N
        lbl_Welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Welcome.setText("Welcome");

        lbl_job.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_job.setText("Job");

        txt_job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jobActionPerformed(evt);
            }
        });

        lbl_company.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_company.setText("Company");

        lbl_salary.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_salary.setText("Salary");

        lbl_university.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_university.setText("University");

        txt_university.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_universityActionPerformed(evt);
            }
        });

        lbl_college.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_college.setText("College");

        txt_college.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_collegeActionPerformed(evt);
            }
        });

        lbl_level.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_level.setText("Level");

        btn_sgn1.setBackground(new java.awt.Color(102, 255, 0));
        btn_sgn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_sgn1.setForeground(new java.awt.Color(255, 255, 255));
        btn_sgn1.setText("Sign Up");

        btn_sgn2.setBackground(new java.awt.Color(102, 255, 0));
        btn_sgn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_sgn2.setForeground(new java.awt.Color(255, 255, 255));
        btn_sgn2.setText("Sign Up");
        btn_sgn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sgn2ActionPerformed(evt);
            }
        });

        print_student.setBackground(new java.awt.Color(255, 102, 102));
        print_student.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        print_student.setText("Print");
        print_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_studentActionPerformed(evt);
            }
        });

        print_employee.setBackground(new java.awt.Color(255, 102, 102));
        print_employee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        print_employee.setText("Print");
        print_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_employeeActionPerformed(evt);
            }
        });

        copyRight.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        copyRight.setText("mohammad-abohasan ©");

        javax.swing.GroupLayout Sign_upLayout = new javax.swing.GroupLayout(Sign_up);
        Sign_up.setLayout(Sign_upLayout);
        Sign_upLayout.setHorizontalGroup(
            Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sign_upLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sign_upLayout.createSequentialGroup()
                        .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_address)
                            .addComponent(lbl_gender)
                            .addComponent(lbl_pass1)
                            .addComponent(lbl_id)
                            .addGroup(Sign_upLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Sign_upLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(print_employee))
                                    .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_salary)
                                        .addComponent(txt_company)
                                        .addComponent(lbl_salary)
                                        .addComponent(lbl_company, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                        .addComponent(lbl_job)
                                        .addComponent(txt_job)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Sign_upLayout.createSequentialGroup()
                        .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_id, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(txt_gender)
                                .addComponent(txt_address)
                                .addComponent(pass_one)
                                .addComponent(txt_phone))
                            .addComponent(lbl_phone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Sign_upLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btn_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_student, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                        .addComponent(txt_university, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_level, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_email, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbbl_age, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_pass2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_name, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_college, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_level, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_college, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_university, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_age, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_email, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pass_two, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Sign_upLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(btn_sgn1)
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sign_upLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
            .addGroup(Sign_upLayout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(btn_sgn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(print_student)
                .addGap(93, 93, 93))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sign_upLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(copyRight)
                .addContainerGap())
        );
        Sign_upLayout.setVerticalGroup(
            Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sign_upLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id)
                    .addComponent(lbl_name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_id, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txt_name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbbl_age, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_gender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_gender, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txt_age))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_address)
                    .addComponent(lbl_email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_address, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txt_email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_pass1)
                    .addComponent(lbl_pass2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pass_one, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(pass_two))
                .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sign_upLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_phone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Sign_upLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_student, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btn_sgn1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_job, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_university))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_job, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txt_university))
                .addGap(11, 11, 11)
                .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_company)
                    .addComponent(lbl_college))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_college, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txt_company))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_level)
                    .addComponent(lbl_salary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_level, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txt_salary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sgn2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(print_student)
                    .addComponent(print_employee))
                .addGap(18, 18, 18)
                .addComponent(copyRight)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sign_up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sign_up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_jobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jobActionPerformed

    private void btn_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_studentActionPerformed
        // TODO add your handling code here:
        ok = true;
        Student_Visible(true);
        Employee_Visible(false);
        btn_sgn1.setVisible(false);
        btn_sgn2.setVisible(true);
    }//GEN-LAST:event_btn_studentActionPerformed

    private void btn_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_employeeActionPerformed
        // TODO add your handling code here:
        ok = false;
        Employee_Visible(true);
        Student_Visible(false);
        btn_sgn1.setVisible(false);
        btn_sgn2.setVisible(true);
    }//GEN-LAST:event_btn_employeeActionPerformed

    private void txt_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneActionPerformed

    private void txt_universityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_universityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_universityActionPerformed

    private void txt_collegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_collegeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_collegeActionPerformed

    private void btn_sgn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sgn2ActionPerformed
        // TODO add your handling code here:
        if (ok) {
            if (pass_one.getText().equals(pass_two.getText())
                    && !txt_id.getText().equals("")
                    && !txt_age.getText().equals("") 
                    && !txt_phone.getText().equals("") 
                    && !txt_name.getText().equals("") 
                    && !txt_gender.getText().equals("") 
                    && !txt_address.getText().equals("") 
                    && !txt_email.getText().equals("") 
                    && !pass_one.getText().equals("") 
                    && !txt_level.getText().equals("") 
                    && !txt_college.getText().equals("") 
                    && !txt_university.getText().equals("") 
                    && isInteger(txt_id.getText()) 
                    && isInteger(txt_age.getText()) 
                    && isInteger(txt_phone.getText()) 
                    && isInteger(txt_level.getText())) {
                Student st = new Student(Integer.valueOf(txt_id.getText()), 
                                            Integer.valueOf(txt_age.getText()), 
                                            Integer.valueOf(txt_phone.getText()),
                                            txt_name.getText(), 
                                            txt_gender.getText(), 
                                            txt_address.getText(), 
                                            txt_email.getText(), 
                                            pass_one.getText(), 
                                            Integer.valueOf(txt_level.getText()), 
                                            txt_college.getText(), 
                                            txt_university.getText());
                list_Student.add(st);
                JOptionPane.showMessageDialog(null, "Done", "Done", JOptionPane.DEFAULT_OPTION);
                txt_id.setText("");
                txt_age.setText("");
                txt_phone.setText("");
                txt_name.setText("");
                txt_gender.setText("");
                txt_address.setText("");
                txt_email.setText("");
                pass_one.setText("");
                pass_two.setText("");
                txt_level.setText("");
                txt_college.setText("");
                txt_university.setText("");
                txt_level.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if (pass_one.getText().equals(pass_two.getText()) 
                    && !txt_id.getText().equals("") 
                    && !txt_age.getText().equals("") 
                    && !txt_phone.getText().equals("") 
                    && !txt_name.getText().equals("") 
                    && !txt_gender.getText().equals("") 
                    && !txt_address.getText().equals("") 
                    && !txt_email.getText().equals("") 
                    && !pass_one.getText().equals("") 
                    && !txt_job.getText().equals("") 
                    && !txt_company.getText().equals("") 
                    && !txt_salary.getText().equals("") 
                    && isInteger(txt_id.getText()) 
                    && isInteger(txt_age.getText()) 
                    && isDouble(txt_salary.getText())) {
                Employee em = new Employee(Integer.valueOf(txt_id.getText()), 
                                            Integer.valueOf(txt_age.getText()), 
                                            Integer.valueOf(txt_phone.getText()), 
                                            txt_name.getText(), 
                                            txt_gender.getText(), 
                                            txt_address.getText(), 
                                            txt_email.getText(), 
                                            pass_one.getText(), 
                                            txt_job.getText(), 
                                            txt_company.getText(), 
                                            Double.valueOf(txt_salary.getText()));
                list_Employee.add(em);
                JOptionPane.showMessageDialog(null, "Done", "Done", JOptionPane.DEFAULT_OPTION);
                txt_id.setText("");
                txt_age.setText("");
                txt_phone.setText("");
                txt_name.setText("");
                txt_gender.setText("");
                txt_address.setText("");
                txt_email.setText("");
                pass_one.setText("");
                pass_two.setText("");
                txt_job.setText("");
                txt_company.setText("");
                txt_salary.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_sgn2ActionPerformed

    private void print_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_employeeActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, list_Employee + "", "Employees: ", JOptionPane.DEFAULT_OPTION);
//        System.out.println("Employees: " + list_Employee);
    }//GEN-LAST:event_print_employeeActionPerformed

    private void print_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_studentActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, list_Student + "", "Student: ", JOptionPane.DEFAULT_OPTION);
//        System.out.println("Student: " + list_Student);
    }//GEN-LAST:event_print_studentActionPerformed

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
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Sign_up;
    private javax.swing.JButton btn_employee;
    private javax.swing.JButton btn_sgn1;
    private javax.swing.JButton btn_sgn2;
    private javax.swing.JButton btn_student;
    private javax.swing.JLabel copyRight;
    private javax.swing.JLabel lbbl_age;
    private javax.swing.JLabel lbl_Welcome;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_college;
    private javax.swing.JLabel lbl_company;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_job;
    private javax.swing.JLabel lbl_level;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_pass1;
    private javax.swing.JLabel lbl_pass2;
    private javax.swing.JLabel lbl_phone;
    private javax.swing.JLabel lbl_salary;
    private javax.swing.JLabel lbl_university;
    private javax.swing.JPasswordField pass_one;
    private javax.swing.JPasswordField pass_two;
    private javax.swing.JButton print_employee;
    private javax.swing.JButton print_student;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_college;
    private javax.swing.JTextField txt_company;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_gender;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_job;
    private javax.swing.JTextField txt_level;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_university;
    // End of variables declaration//GEN-END:variables
}