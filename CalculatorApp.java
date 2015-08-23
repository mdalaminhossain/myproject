
package calculatorapp;
//import java.math.*;
public class CalculatorApp extends javax.swing.JFrame {

   private double total1=0.0;
   private double total2=0.0;
   private double total3=0.0;
   private char math_operator;
   private double fact=1.0;
   private String str;
   private boolean decdisp;
   private boolean dgrrad;
   private boolean sh;
   private byte op;
   private boolean zerodisp;
   private double ina;
   private double inb;
   private double out;
   public CalculatorApp() {
         super(" Created by Md.Al~Amin Hossain Id:(63)");
          initComponents(); 
         pic.setText("                           Md.Al~Amin Hossain");
         pic.setToolTipText("My Name");
         btn1.setToolTipText("This is  (1) buttom");
         btn00.setToolTipText("This is  (pi) buttom");
         btnpm.setToolTipText("This is  (pm) buttom");
         btn2.setToolTipText("This is  (2) buttom");
         btn3.setToolTipText("This is  (3) buttom");
         btn4.setToolTipText("This is  (4) buttom");
         btn5.setToolTipText("This is  (5) buttom");
         btn6.setToolTipText("This is  (6) buttom");
         btn7.setToolTipText("This is  (7) buttom");
         btn8.setToolTipText("This is  (8) buttom");
         btn9.setToolTipText("This is  (9) buttom");
         btn0.setToolTipText("This is  (0) buttom");
         btnadd.setToolTipText("This is (+) buttom");
         btnsub.setToolTipText("This is  (-) buttom");
         btnmul.setToolTipText("This is  (x) buttom");
         btndiv.setToolTipText("This is  (/) buttom");
         btnCE.setToolTipText("This is  Cancel buttom");
         sinbtn.setToolTipText("This is  sin() buttom");
         cosbtn.setToolTipText("This is  cos() buttom");
         tanbtn.setToolTipText("This is  tan() buttom");
         //cotbtn.setToolTipText("This is  cot() buttom");
         pow.setToolTipText("This is  (x)2 buttom");
         btndot.setToolTipText("This is (.) buttom");
         btnequals.setToolTipText("This is  (=) buttom");
         log.setToolTipText("This is (log) buttom");
         fac.setToolTipText("This is (!) buttom");
         S.setToolTipText("This is (Root) buttom");
         XpowY.setToolTipText("This is (x^y) buttom");
        }
    private void getOperator(String btnText)
    {
    math_operator= btnText.charAt(0);
    if(btnText.charAt(0)=='s')
    { 
       total1=total1+Double.parseDouble(Display.getText());
       Display.setText("Sin"+"("+total1+")");
     
    }
else  if(btnText.charAt(0)=='c')
    { 
       
     total1=total1+Double.parseDouble(Display.getText());
    Display.setText("Cos"+"("+total1+")");}
else  if(btnText.charAt(0)=='t')
    { 
        total1=total1+Double.parseDouble(Display.getText());
    Display.setText("tan"+"("+total1+")");}
else  if(btnText.charAt(0)=='k')
    { 
        total1=total1+Double.parseDouble(Display.getText());
    Display.setText("cot"+"("+total1+")");}
else  if(btnText.charAt(0)=='x')
    { 
        
       total1=total1+Double.parseDouble(Display.getText());
    Display.setText("("+total1+")"+"2");}
else  if(btnText.charAt(0)=='l')
    { 
        
        total1=total1+Double.parseDouble(Display.getText());
    Display.setText("Log"+"("+total1+")");}
else  if(btnText.charAt(0)=='X')
    { 
        total2=0.0;
        total1 = total1 + Double.parseDouble( Display.getText( ) ) ;
   Display.setText("");
    }
else  if(btnText.charAt(0)=='S')
    { 
         total1=total1+Double.parseDouble(Display.getText());
    Display.setText("Sqrt"+"("+total1+")");
       }
else  if(btnText.charAt(0)=='n')
    { 
        
        total3=total3+Double.parseDouble(Display.getText());
        Display.setText(total3+"!");
       factorial(total3);
      
    }
else 
        
    {
        total1 = total1 + Double.parseDouble( Display.getText( ) ) ;
   Display.setText("");} 
    }
    private void factorial(double total)
    {
     int   total4=(int)total;
    for(int i=total4;i>=1;i--)
    {
     double  j=(int)i;
    fact=fact*j;
    }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnsub = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnmul = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnequals = new javax.swing.JButton();
        btndiv = new javax.swing.JButton();
        sinbtn = new javax.swing.JButton();
        cosbtn = new javax.swing.JButton();
        tanbtn = new javax.swing.JButton();
        pic = new javax.swing.JLabel();
        log = new javax.swing.JButton();
        S = new javax.swing.JButton();
        XpowY = new javax.swing.JButton();
        fac = new javax.swing.JButton();
        btndot = new javax.swing.JButton();
        btn00 = new javax.swing.JButton();
        btnpm = new javax.swing.JButton();
        pow = new javax.swing.JButton();
        Display = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        btnCE = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        jMenu1.setText("File");
        jMenuBar5.add(jMenu1);

        jMenu9.setText("Edit");
        jMenuBar5.add(jMenu9);

        jMenu10.setText("File");
        jMenuBar6.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar6.add(jMenu11);

        jMenu12.setText("jMenu12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(0, 0, 0));
        btnadd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnadd.setForeground(new java.awt.Color(204, 0, 0));
        btnadd.setText("+");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnsub.setBackground(new java.awt.Color(0, 0, 0));
        btnsub.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnsub.setForeground(new java.awt.Color(204, 0, 0));
        btnsub.setText("-");
        btnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnmul.setBackground(new java.awt.Color(0, 0, 0));
        btnmul.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnmul.setForeground(new java.awt.Color(204, 0, 0));
        btnmul.setText("*");
        btnmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmulActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnequals.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnequals.setForeground(new java.awt.Color(204, 0, 0));
        btnequals.setText("=");
        btnequals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnequalsActionPerformed(evt);
            }
        });

        btndiv.setBackground(new java.awt.Color(0, 0, 0));
        btndiv.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btndiv.setForeground(new java.awt.Color(204, 0, 0));
        btndiv.setText("/");
        btndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivActionPerformed(evt);
            }
        });

        sinbtn.setBackground(new java.awt.Color(0, 0, 0));
        sinbtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        sinbtn.setForeground(new java.awt.Color(204, 0, 0));
        sinbtn.setText("sin");
        sinbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinbtnActionPerformed(evt);
            }
        });

        cosbtn.setBackground(new java.awt.Color(0, 0, 0));
        cosbtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        cosbtn.setForeground(new java.awt.Color(204, 0, 0));
        cosbtn.setText("cos");
        cosbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosbtnActionPerformed(evt);
            }
        });

        tanbtn.setBackground(new java.awt.Color(0, 0, 0));
        tanbtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        tanbtn.setForeground(new java.awt.Color(204, 0, 0));
        tanbtn.setText("tan");
        tanbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanbtnActionPerformed(evt);
            }
        });

        log.setBackground(new java.awt.Color(0, 0, 0));
        log.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        log.setForeground(new java.awt.Color(204, 0, 0));
        log.setText("log");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        S.setBackground(new java.awt.Color(0, 0, 0));
        S.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        S.setForeground(new java.awt.Color(204, 0, 0));
        S.setText("Sqrt");
        S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SActionPerformed(evt);
            }
        });

        XpowY.setBackground(new java.awt.Color(0, 0, 0));
        XpowY.setForeground(new java.awt.Color(204, 0, 0));
        XpowY.setText("^");
        XpowY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XpowYActionPerformed(evt);
            }
        });

        fac.setBackground(new java.awt.Color(0, 0, 0));
        fac.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        fac.setForeground(new java.awt.Color(153, 0, 0));
        fac.setText("n!");
        fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facActionPerformed(evt);
            }
        });

        btndot.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btndot.setText(".");
        btndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndotActionPerformed(evt);
            }
        });

        btn00.setBackground(new java.awt.Color(0, 0, 0));
        btn00.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btn00.setForeground(new java.awt.Color(204, 0, 0));
        btn00.setText("pi");
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });

        btnpm.setBackground(new java.awt.Color(0, 0, 0));
        btnpm.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnpm.setForeground(new java.awt.Color(204, 0, 0));
        btnpm.setText("+/-");
        btnpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpmActionPerformed(evt);
            }
        });

        pow.setBackground(new java.awt.Color(0, 0, 0));
        pow.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        pow.setForeground(new java.awt.Color(204, 0, 0));
        pow.setText("x2");
        pow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(fac, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(S)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(XpowY, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btndot, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(1, 1, 1)
                                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnequals, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btnsub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sinbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(cosbtn)
                                .addGap(18, 18, 18)
                                .addComponent(tanbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnpm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pow, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fac, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(XpowY, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnpm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tanbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cosbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sinbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn7)
                            .addComponent(btn8)
                            .addComponent(btn9))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4)
                            .addComponent(btn5)
                            .addComponent(btn6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsub, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnmul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn2)
                                    .addComponent(btn1)
                                    .addComponent(btn3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnequals, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btndot, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn0)))
                            .addComponent(btndiv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Display.setBackground(new java.awt.Color(0, 0, 0));
        Display.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Display.setForeground(new java.awt.Color(240, 240, 240));
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(204, 0, 0));
        jTextField1.setForeground(new java.awt.Color(240, 240, 240));
        jTextField1.setText("0");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btnCE.setBackground(new java.awt.Color(204, 0, 0));
        btnCE.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        btnCE.setText("AC");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Display, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCE, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        //display.setText(b4.getText());
         String btn6Text = Display.getText() + btn4.getText();
        Display.setText(btn6Text);
    }//GEN-LAST:event_btn4ActionPerformed

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
       
        
    }//GEN-LAST:event_DisplayActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
     
        String btnOneText = Display.getText() + btn1.getText();
        
        Display.setText(btnOneText);  
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed

        String btntwoText = Display.getText() + btn2.getText();
        Display.setText(btntwoText);    
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
         String btnthreeText = Display.getText() + btn3.getText();
        Display.setText(btnthreeText);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
 
         String btn5Text = Display.getText() + btn5.getText();
        Display.setText(btn5Text);

    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
      
         String btn6Text = Display.getText() + btn6.getText();
        Display.setText(btn6Text);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
      
         String btn7Text = Display.getText() + btn7.getText();
        Display.setText(btn7Text);
       
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
 String btn8Text = Display.getText() + btn8.getText();
        Display.setText(btn8Text);}
         //display.setText(b8.getText());    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
       
         String btn9Text = Display.getText() + btn9.getText();
        Display.setText(btn9Text);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
 String btn0Text = Display.getText() + btn0.getText();
        Display.setText(btn0Text);        
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
    total2=0;     
        Display.setText("");   
    }//GEN-LAST:event_btnCEActionPerformed
 /*private void dotActionPerformed(java.awt.event.ActionEvent evt) {                                   
    total2=0;     
        display.setText(".");   
    }*/    
    private void btnequalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnequalsActionPerformed
      switch ( math_operator ) {
        case '+':
            total2 = total1 + Double.parseDouble(Display.getText( ) );
        break;
        case '-':
            total2 = total1 - Double.parseDouble(Display.getText( ) );
        break;
        case '/':
            total2 = total1 / Double.parseDouble(Display.getText( ) );
        break;
        case '*':
            
            total2 = total1*Double.parseDouble(Display.getText( ) );
           
        break;
        case 's':
          
            total2=java.lang.Math.sin(total1*(Math.PI/180.0));
            
            break;
              case 'c':
            total2=java.lang.Math.cos(total1*Math.PI/180.0);
            break;
                    case 't':
            total2=java.lang.Math.tan(total1*Math.PI/180.0);
            break;        
                  case 'x':
                          total2=java.lang.Math.pow(total1,2);
            break;
            case 'l':
                          total2=java.lang.Math.log(total1);
            break;
                case 'S':
                          total2=java.lang.Math.sqrt(total1);
            break;
                     case 'X':
                          //total2=total2+Double.parseDouble(display.getText( ));
                         
                          total2=java.lang.Math.pow(total1, total2);
                          
                          
                          
                          
            break;
                         case 'n':
                          total2=fact;
                          total3=0;
                          fact=1;
                         
            break;
        }
        
      
        Display.setText( Double.toString(total2) );
        total1 = 0;
        
    
    }//GEN-LAST:event_btnequalsActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
       String button_text = btnadd.getText();
        getOperator(button_text);
        
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubActionPerformed
       
         String button_text = btnsub.getText();
        getOperator(button_text);
    }//GEN-LAST:event_btnsubActionPerformed

    private void btnmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmulActionPerformed
       
         String button_text = btnmul.getText();
        getOperator(button_text);
    }//GEN-LAST:event_btnmulActionPerformed

    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivActionPerformed
       
         String button_text = btndiv.getText();
        getOperator(button_text);
    }//GEN-LAST:event_btndivActionPerformed

    private void sinbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinbtnActionPerformed
         
         String sinText =sinbtn.getText();
       
        getOperator(sinText);
       
        
         
    }//GEN-LAST:event_sinbtnActionPerformed

    private void cosbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosbtnActionPerformed
        String cosText =cosbtn.getText();
         
        getOperator(cosText); 
    }//GEN-LAST:event_cosbtnActionPerformed

    private void tanbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanbtnActionPerformed
       String tanText =tanbtn.getText();
         
        getOperator(tanText); 
    }//GEN-LAST:event_tanbtnActionPerformed

    private void powActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powActionPerformed
       String powbtn=pow.getText();
      
       getOperator(powbtn); 
       
       
    }//GEN-LAST:event_powActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
       String logbtn=log.getText();
       
       getOperator(logbtn); 
    }//GEN-LAST:event_logActionPerformed

    private void SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SActionPerformed
       String Sqrtbtn=S.getText();
      
       getOperator(Sqrtbtn); 
    }//GEN-LAST:event_SActionPerformed

    private void XpowYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XpowYActionPerformed
        
      
       String XpowYbtn=XpowY.getText();
       getOperator(XpowYbtn);
    }//GEN-LAST:event_XpowYActionPerformed

    private void facActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facActionPerformed
      
      
        String fbtn=fac.getText();
      
       getOperator(fbtn);
    }//GEN-LAST:event_facActionPerformed

    private void btndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndotActionPerformed
       String dotbtn=btndot.getText();
       
       getOperator(dotbtn); 
    }//GEN-LAST:event_btndotActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
       Display.setText(String.valueOf(Math.PI));
    }//GEN-LAST:event_btn00ActionPerformed

    private void btnpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpmActionPerformed
       inb = Double.parseDouble(String.valueOf(Display.getText()));
       out=inb * -1 ;
      
       if( out > -100000000 && out < 100000000 ){
           Display.setText(String.valueOf(out));
       }
       else{
              Display.setText("Error");
       }
       decdisp = true;
       out = 0;
    }//GEN-LAST:event_btnpmActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorApp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Display;
    private javax.swing.JButton S;
    private javax.swing.JButton XpowY;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndiv;
    private javax.swing.JButton btndot;
    private javax.swing.JButton btnequals;
    private javax.swing.JButton btnmul;
    private javax.swing.JButton btnpm;
    private javax.swing.JButton btnsub;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cosbtn;
    private javax.swing.JButton fac;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton log;
    private javax.swing.JLabel pic;
    private javax.swing.JButton pow;
    private javax.swing.JButton sinbtn;
    private javax.swing.JButton tanbtn;
    // End of variables declaration//GEN-END:variables



    
}
