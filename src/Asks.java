/**
 * Created by mrchebik on 13.08.15.
 */
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class Asks extends JDialog {
    JLabel Tasks, l2, l3, WhiteTracing, l5, l6, l7, l8, l9;
    JLabel task1, task2, task3, task4, task5, task6, task7, task8;
    JLabel taskq1, taskq2, taskq3, taskq4, taskq5, taskq6, taskq7, taskq8;
    JLabel taskw1, taskw2, taskw3, taskw4, taskw5, taskw6, taskw7, taskw8;
    JLabel taske1, taske2, taske3, taske4, taske5, taske6, taske7, taske8;
    JLabel taskr1, taskr2, taskr3, taskr4, taskr5, taskr6, taskr7, taskr8;
    JLabel taskt1, taskt2, taskt3, taskt4, taskt5, taskt6, taskt7, taskt8;
    JLabel tasky1, tasky2, tasky3, tasky4, tasky5, tasky6, tasky7, tasky8;
    JLabel dialog1, dialog1pc, dialog2, dialog3, dialog4, dialog5, dialog6, dialog7;
    JLabel[] answer = new JLabel[6];
    JLabel[] lop = new JLabel[180];
    JLabel[] op = new JLabel[18];
    JLabel[] a = new JLabel[6];
    JLabel[] b = new JLabel[6];
    JLabel comboBoxBox, comboBoxAction, comboBoxClickAction, defBox, fakeBox;
    JLabel radiol1, radiol2, radiol3, radiol4, faker;
    JLabel fakeFruit;
    JLabel sl1, numberinsl, slidemove, fakeSlidera;
    JLabel fakeField;
    JLabel zorro1, zorro2, zorro3, fakezorro2, fakezorro3;
    JLabel infoProgress, infoUStatus, focusStat;
    JTextArea zaz, f1;
    JLabel m1;
    JButton comboBoxB;
    JButton b1;
    JButton comboBox1, comboBox2, comboBox3, comboBox4, comboBox5;
    JButton bf1, bf2, bf3, bf4, bf5;
    JButton fakeSlider;
    JLabel rb1, rb2, rb3, rb4;
    int intSlidera;
    Border B1, B2, B3;
    Color Blue;
    ImageIcon icon1, focus, onClick, true1, false1, comboBoxIcon, comboBoxClick, BoxBox, focusBox, perv, pervf, vtor, vtorf, pred, predf, posl, poslf, tak, takf, pervF, vtorF, predF, poslF, takF, defB, i1, i2, i3, i4, i5;
    ImageIcon radioB, radioB1, radioB2, radioB3, radioBF, radioBF1, radioBF2, radioBF3, rbn1, rbn2, rbn3, rbn4, faker1, faker2, faker3, faker4, fakernull;
    ImageIcon fr1, fr2, fr3, fr4, fr5, frf1, frf2, frf3, frf4, frf5, frF1, frF2, frF3, frF4, frF5, tf1, tf2, tf3, tf4, tf5, tf6;
    ImageIcon slider1, slider2, slid1, slid2, slid3, slid4, bordfield, z1, z2, z3, z4, z5, infoStatus, status, selectStatus, exit, exitF, exitSelect;
    int OS = 0, OS1 = 0, OS2 = 0, OS3 = 0, OS4 = 0, OS5 = 0, OS6 = 0, OS7 = 0, OS8 = 0, OS9 = 0, OS10 = 0;
    Font font, font1, font2, aFont;
    int col = 0, num = 0, cb = 0, F, rq1 = 0, rq2 = 0, rq3 = 0, rq4 = 0, bt = 0, fakeslide = 0, infoSlide = 0, infoMoveSlide = 0, infUpDown = 0, trueStat = 0, sec = 0, infoChange;
    int aPlainBold = Font.PLAIN;
    int aSize = 12;
    String OSname = System.getProperty("os.name");
    String OSString = "Droid Sans";
    ActionListener polosaTimer;
    Timer time1;
    Timer time5 = new Timer(500, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (infoSlide == 0) {
                if (getMousePosition().x > m1.getLocation().x) {
                    if (infoMoveSlide == 1) {
                        time6.start();
                        time5.stop();
                    } else {
                        Xplus();
                        if (m1.getX() > getMousePosition().x) time5.stop();
                    }
                } else {
                    if (infoMoveSlide == 1) {
                        time6.start();
                        time5.stop();
                    } else {
                        Xminus();
                        if (m1.getX() < getMousePosition().x) time5.stop();
                    }
                }
                predelX();
                outdialog();
            } else time5.stop();
        }
    });
    Timer time6 = new Timer(50, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (infoSlide == 0) {
                if (getMousePosition().x > m1.getLocation().x) {
                    Xplus();
                    if (m1.getX() > getMousePosition().x)
                        time6.stop();
                } else {
                    Xminus();
                    if (m1.getX() < getMousePosition().x) time6.stop();
                }
                predelX();
                outdialog();
            } else time6.stop();
        }
    });
    Timer time9 = new Timer(100, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            Zplus();
        }
    });
    Timer time10 = new Timer(100, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            Zminus();
        }
    });
    Timer time11 = new Timer(600, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (infUpDown == 2)
                time9.start();
            else
                time10.start();
            time11.stop();
        }
    });

    public Asks(JFrame frame, String s) {
        super(frame, s);
        if (!OSname.equals("Linux")) {
            OS = 2;
            OS1 = 9;
            OS2 = 1;
            OS3 = 24;
            OS4 = 29;
            OS5 = 5;
            OS6 = 8;
            OS7 = 30;
            OS8 = 7;
            OS9 = 3;
            OS10 = 83;
            OSString = "MS Sans Serif";
            aPlainBold = Font.PLAIN;
            aSize = 10;
        }
        aFont = new Font(OSString, aPlainBold, aSize);
        polosaTimer = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lop[num].setVisible(true);
                if (num == 29) {
                    time1stop();
                    lop[num].setVisible(true);
                }
                if (num == 59) {
                    time2stop();
                    lop[num].setVisible(true);
                }
                if (num == 89) {
                    time3stop();
                    lop[num].setVisible(true);
                }
                if (num == 119) {
                    time4stop();
                    lop[num].setVisible(true);
                }
                if (num == 149) {
                    time5stop();
                    lop[num].setVisible(true);
                }
                if (num == 179) {
                    time6stop();
                    lop[num].setVisible(true);
                }
                if (num >= 0 && num <= 29) num++;
                if (num >= 30 && num <= 59) num++;
                if (num >= 60 && num <= 89) num++;
                if (num >= 90 && num <= 119) num++;
                if (num >= 120 && num <= 149) num++;
                if (num >= 150 && num <= 179) num++;
                sec += 500;
            }
        };
        time1 = new Timer(517, polosaTimer);
        Blue = new Color(10, 36, 106);
        icon1 = new ImageIcon(Asks.class.getResource("tick.png"));
        focus = new ImageIcon(Asks.class.getResource("focus.png"));
        onClick = new ImageIcon(Asks.class.getResource("onClick.png"));
        true1 = new ImageIcon(Asks.class.getResource("true.png"));
        false1 = new ImageIcon(Asks.class.getResource("false.png"));
        comboBoxIcon = new ImageIcon(Asks.class.getResource("BoxB.png"));
        comboBoxClick = new ImageIcon(Asks.class.getResource("BoxClick.png"));
        BoxBox = new ImageIcon(Asks.class.getResource("BoxBox.png"));
        focusBox = new ImageIcon(Asks.class.getResource("focusBox.png"));
        pervf = new ImageIcon(Asks.class.getResource("Первая.png"));
        perv = new ImageIcon(Asks.class.getResource("ПерваяП.png"));
        vtorf = new ImageIcon(Asks.class.getResource("Вторая.png"));
        vtor = new ImageIcon(Asks.class.getResource("ВтораяВ.png"));
        predf = new ImageIcon(Asks.class.getResource("Предпоследняя.png"));
        pred = new ImageIcon(Asks.class.getResource("ПредпоследняяП.png"));
        poslf = new ImageIcon(Asks.class.getResource("Последняя.png"));
        posl = new ImageIcon(Asks.class.getResource("ПоследняяП.png"));
        takf = new ImageIcon(Asks.class.getResource("Так не Бывает.png"));
        tak = new ImageIcon(Asks.class.getResource("ТакНеБывает.png"));
        pervF = new ImageIcon(Asks.class.getResource("snapshot69.png"));
        vtorF = new ImageIcon(Asks.class.getResource("snapshot68.png"));
        predF = new ImageIcon(Asks.class.getResource("snapshot67.png"));
        poslF = new ImageIcon(Asks.class.getResource("snapshot66.png"));
        takF = new ImageIcon(Asks.class.getResource("snapshot65.png"));
        defB = new ImageIcon(Asks.class.getResource("snapshot54.png"));
        rbn1 = new ImageIcon(Asks.class.getResource("button2.png"));
        rbn2 = new ImageIcon(Asks.class.getResource("button1.png"));
        rbn3 = new ImageIcon(Asks.class.getResource("button.png"));
        rbn4 = new ImageIcon(Asks.class.getResource("button3.png"));
        radioB = new ImageIcon(Asks.class.getResource("rb1.png"));
        radioB1 = new ImageIcon(Asks.class.getResource("rb2.png"));
        radioB2 = new ImageIcon(Asks.class.getResource("rb3.png"));
        radioB3 = new ImageIcon(Asks.class.getResource("rb4.png"));
        radioBF = new ImageIcon(Asks.class.getResource("rbutton1.png"));
        radioBF1 = new ImageIcon(Asks.class.getResource("rbutton2.png"));
        radioBF2 = new ImageIcon(Asks.class.getResource("rbutton3.png"));
        radioBF3 = new ImageIcon(Asks.class.getResource("rbutton4.png"));
        i1 = new ImageIcon(Asks.class.getResource("snapshot97.png"));
        i2 = new ImageIcon(Asks.class.getResource("snapshot96.png"));
        i3 = new ImageIcon(Asks.class.getResource("snapshot95.png"));
        i4 = new ImageIcon(Asks.class.getResource("snapshot94.png"));
        i5 = new ImageIcon(Asks.class.getResource("snapshot93.png"));
        faker1 = new ImageIcon(Asks.class.getResource("snapshot101.png"));
        faker2 = new ImageIcon(Asks.class.getResource("snapshot100.png"));
        faker3 = new ImageIcon(Asks.class.getResource("snapshot99.png"));
        faker4 = new ImageIcon(Asks.class.getResource("snapshot98.png"));
        fakernull = new ImageIcon(Asks.class.getResource("snapshot104.png"));
        fr1 = new ImageIcon(Asks.class.getResource("banana.png"));
        fr2 = new ImageIcon(Asks.class.getResource("tomato.png"));
        fr3 = new ImageIcon(Asks.class.getResource("melon.png"));
        fr4 = new ImageIcon(Asks.class.getResource("cliva.png"));
        fr5 = new ImageIcon(Asks.class.getResource("apple.png"));
        frf1 = new ImageIcon(Asks.class.getResource("snapshot27.png"));
        frf2 = new ImageIcon(Asks.class.getResource("snapshot29.png"));
        frf3 = new ImageIcon(Asks.class.getResource("snapshot31.png"));
        frf4 = new ImageIcon(Asks.class.getResource("snapshot33.png"));
        frf5 = new ImageIcon(Asks.class.getResource("snapshot35.png"));
        frF1 = new ImageIcon(Asks.class.getResource("snapshot28.png"));
        frF2 = new ImageIcon(Asks.class.getResource("snapshot110.png"));
        frF3 = new ImageIcon(Asks.class.getResource("snapshot32.png"));
        frF4 = new ImageIcon(Asks.class.getResource("snapshot34.png"));
        frF5 = new ImageIcon(Asks.class.getResource("snapshot37.png"));
        tf1 = new ImageIcon(Asks.class.getResource("snapshot116.png"));
        tf2 = new ImageIcon(Asks.class.getResource("snapshot115.png"));
        tf3 = new ImageIcon(Asks.class.getResource("snapshot114.png"));
        tf4 = new ImageIcon(Asks.class.getResource("snapshot113.png"));
        tf5 = new ImageIcon(Asks.class.getResource("snapshot112.png"));
        tf6 = new ImageIcon(Asks.class.getResource("snapshot111.png"));
        slider1 = new ImageIcon(Asks.class.getResource("snapshot122.png"));
        slider2 = new ImageIcon(Asks.class.getResource("snapshot125.png"));
        slid1 = new ImageIcon(Asks.class.getResource("snapshot123.png"));
        slid2 = new ImageIcon(Asks.class.getResource("snapshot124.png"));
        slid3 = new ImageIcon(Asks.class.getResource("snapshot127.png"));
        slid4 = new ImageIcon(Asks.class.getResource("snapshot120.png"));
        bordfield = new ImageIcon(Asks.class.getResource("snapshot159.png"));
        z1 = new ImageIcon(Asks.class.getResource("snapshot161.png"));
        z2 = new ImageIcon(Asks.class.getResource("snapshot16112.png"));
        z3 = new ImageIcon(Asks.class.getResource("snapshot162.png"));
        z4 = new ImageIcon(Asks.class.getResource("snapshot1611.png"));
        z5 = new ImageIcon(Asks.class.getResource("snapshot165.png"));
        infoStatus = new ImageIcon(Asks.class.getResource("snapshot168.png"));
        status = new ImageIcon(Asks.class.getResource("status.jpg"));
        selectStatus = new ImageIcon(Asks.class.getResource("focustoyourstatus.png"));
        exitF = new ImageIcon(Asks.class.getResource("snapshot172.png"));
        exit = new ImageIcon(Asks.class.getResource("snapshot171.png"));
        exitSelect = new ImageIcon(Asks.class.getResource("snapshot175.png"));
        B1 = BorderFactory.createLineBorder(Color.decode("#808080"), 1);
        B2 = BorderFactory.createLineBorder(Color.WHITE, 1);
        B3 = BorderFactory.createLineBorder(Color.BLACK, 1);
        b1 = new JButton();
        b1.setSize(35, 30);
        b1.setBorder(B3);
        b1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (b1.getIcon() == exit)
                    b1.setIcon(exitSelect);
                else
                    b1.setIcon(focus);
            }

            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (b1.getIcon() == exitSelect)
                    b1.setIcon(exit);
                else
                    b1.setIcon(icon1);
            }
        });
        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (b1.getIcon() == exitSelect)
                    b1.setIcon(exitF);
                else
                    b1.setIcon(onClick);
            }

            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                if (b1.getIcon() == onClick)
                    b1.setIcon(focus);
                if (b1.getIcon() == exitF) {
                    System.exit(0);
                    b1.setIcon(exitSelect);
                }
                if (col == 0) {
                    if (OSname.equals("Linux")) {
                        dialog1.setLocation(0, 390);
                        WhiteTracing.setSize(277 + OS, 149 + OS6);
                        l5.setSize(1, 150 + OS6);
                        l7.setSize(1, 146 + OS6);
                        WhiteTracing.setLocation(0, 348);
                        Tasks.setLocation(2, 350);
                    } else {
                        dialog1pc.setLocation(13, 467);
                        dialog1.setLocation(13, 421 - OS7);
                        WhiteTracing.setLocation(0, 348 + OS4 + OS2);
                        Tasks.setLocation(2, 380);
                        l5.setSize(1, 139 + OS6 + OS9);
                        l7.setSize(1, 135 + OS6 + OS9);
                        WhiteTracing.setSize(277 + OS, 138 + OS6 + OS9);
                    }
                    setSize(848 + OS9 + OS9 - OS, 529 + OS1 + OS1 + OS9 + OS + OS2);
                    l5.setLocation(277 + OS, 348 + OS4 + OS2);
                    l3.setLocation(0, 497 + OS3 + OS9 + OS9);
                    l9.setLocation(2, 381 + OS4 + OS2);
                    l8.setLocation(2, 380 + OS4 + OS2);
                    l7.setLocation(1, 350 + OS4 + OS2);
                    l6.setLocation(1, 349 + OS4 + OS2);
                    setLocationRelativeTo(null);
                    task1.setVisible(true);
                    task2.setVisible(true);
                    task3.setVisible(true);
                    task4.setVisible(true);
                    task5.setVisible(true);
                    task6.setVisible(true);
                    task7.setVisible(true);
                    task8.setVisible(true);
                    dialog2.setVisible(true);
                    comboBoxB.setVisible(true);
                    comboBoxBox.setVisible(true);
                    comboBoxAction.setVisible(true);
                    op[0].setVisible(true);
                    op[1].setVisible(true);
                    op[2].setVisible(true);
                    time1.start();
                    col++;
                } else if (col == 1)
                    time1stop();
                else if (col == 2)
                    time2stop();
                else if (col == 3)
                    time3stop();
                else if (col == 4)
                    time4stop();
                else if (col == 5)
                    time5stop();
                else if (col == 6)
                    time6stop();
                if (OSname.equals("Linux")) {
                    setSize(848, 529);
                    setLocationRelativeTo(null);
                    setSize(848, 529);
                    setLocationRelativeTo(null);
                }
            }

            public void mouseExited(MouseEvent e) {
                super.mouseReleased(e);
                if (b1.getIcon() == onClick)
                    b1.setIcon(focus);
                if (b1.getIcon() == exitF)
                    b1.setIcon(exitSelect);
            }
        });
        add(b1);
        comboBox1 = new JButton();
        add(comboBox1);
        for (int i = 0; i < 6; i++) {
            a[i] = new JLabel("0 c.");
            a[i].setSize(40, 10);
            a[i].setLocation(360 + OS9, 388 + i * 18 + OS4 + OS);
            a[i].setFont(aFont);
            add(a[i]);
        }
        for (int i = 0; i < 6; i++) {
            b[i] = new JLabel("-");
            b[i].setSize(20, 10);
            b[i].setLocation(397 + OS9, 388 + i * 18 + OS4 + OS);
            b[i].setFont(aFont);
            add(b[i]);
        }
        for (int i = 0; i < 6; i++) {
            answer[i] = new JLabel();
            answer[i].setSize(20, 20);
            if (i == 0) answer[i].setLocation(7, 7);
            if (i == 1) answer[i].setLocation(287 + OS9, 7);
            if (i == 2) answer[i].setLocation(567 + OS9 + OS9, 7);
            if (i == 3) answer[i].setLocation(7, 181 + OS7);
            if (i == 4) answer[i].setLocation(287 + OS5, 201 + OS1 + OS2);
            if (i == 5) answer[i].setLocation(567 + OS5 + OS2, 221 + OS4 + OS6 + OS9);
            add(answer[i]);
        }
        infoProgress = new JLabel();
        infoProgress.setIcon(infoStatus);
        infoProgress.setSize(134, 112);
        infoProgress.setLocation(282 + OS9, 383 + OS4 + OS2);
        add(infoProgress);
        focusStat = new JLabel();
        focusStat.setIcon(selectStatus);
        focusStat.setSize(71, 114);
        focusStat.setLocation(416 + OS9, 382 + OS4);
        focusStat.setVisible(false);
        add(focusStat);
        infoUStatus = new JLabel();
        infoUStatus.setIcon(status);
        infoUStatus.setSize(397, 110);
        infoUStatus.setLocation(425 + OS, 384 + OS4);
        add(infoUStatus);
        tasky1 = new JLabel("д о с т и ж е н и я");
        tasky1.setFont(new Font(OSString, Font.PLAIN, 17));
        tasky1.setForeground(Color.decode("#555555"));
        tasky1.setBackground(Color.decode("#BBBBBB"));
        tasky1.setHorizontalAlignment(JLabel.CENTER);
        tasky1.setVerticalAlignment(JLabel.CENTER);
        tasky1.setLocation(282 + OS9, 350 + OS4 + OS2);
        tasky1.setOpaque(true);
        tasky2 = new JLabel();
        tasky2.setBorder(B1);
        tasky2.setOpaque(false);
        tasky2.setLocation(282 + OS9, 381 + OS4 + OS2);
        tasky3 = new JLabel();
        tasky3.setBorder(B2);
        tasky3.setOpaque(false);
        tasky3.setLocation(282 + OS9, 380 + OS4 + OS2);
        tasky4 = new JLabel();
        tasky4.setBorder(B1);
        tasky4.setOpaque(false);
        tasky4.setLocation(281 + OS9, 350 + OS4 + OS2);
        tasky5 = new JLabel();
        tasky5.setBorder(B1);
        tasky5.setOpaque(false);
        tasky5.setLocation(281 + OS9, 349 + OS4 + OS2);
        tasky6 = new JLabel();
        tasky6.setBorder(B1);
        tasky6.setOpaque(false);
        tasky7 = new JLabel();
        tasky7.setBorder(B2);
        tasky7.setOpaque(false);
        tasky7.setLocation(280 + OS9, 348 + OS4 + OS2);
        tasky8 = new JLabel();
        tasky8.setOpaque(true);
        tasky8.setBorder(B1);
        tasky2.setSize(554 + OS5, 1);
        tasky3.setSize(554 + OS5, 1);
        tasky5.setSize(555 + OS5, 1);
        tasky6.setLocation(837 + OS6, 348 + OS4 + OS2);
        if (OSname.equals("Linux")) {
            tasky7.setSize(557 + OS, 149 + OS1 + OS7);
            tasky6.setSize(1, 149 + OS1 + OS7);
            tasky8.setLocation(280, 497 + OS1 + OS7);
        } else {
            tasky7.setSize(557 + OS5, 149);
            tasky4.setSize(1, 146);
            tasky8.setLocation(281 + OS9, 527);
        }
        tasky6.setSize(1, 149);
        tasky8.setSize(558 + OS + OS, 1);
        tasky1.setSize(554 + OS5, 30);
        add(tasky1);
        add(tasky2);
        add(tasky3);
        add(tasky4);
        add(tasky5);
        add(tasky6);
        add(tasky7);
        add(tasky8);
        fakezorro2 = new JLabel();
        fakezorro2.setIcon(z2);
        fakezorro2.setSize(15, 13);
        fakezorro2.setLocation(737, 287 + OS4 + OS9 + OS);
        add(fakezorro2);
        fakezorro3 = new JLabel();
        fakezorro3.setIcon(z4);
        fakezorro3.setSize(15, 16);
        fakezorro3.setLocation(737, 300 + OS4 + OS9 + OS);
        add(fakezorro3);
        zaz = new JTextArea("0");
        zaz.setFont(new Font(OSString, Font.BOLD, 22 + OS2));
        zaz.setSize(26, 30);
        zaz.setLocation(711, 287 + OS4 + OS9 + OS);
        zaz.setEditable(false);
        add(zaz);
        zorro1 = new JLabel();
        zorro1.setIcon(z1);
        zorro1.setSize(46, 34);
        zorro1.setLocation(709, 285 + OS4 + OS9 + OS);
        add(zorro1);
        zorro2 = new JLabel();
        zorro2.setIcon(z2);
        zorro2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                infUpDown = 2;
                if (infUpDown == 2) {
                    zorro2.setIcon(z3);
                    Zplus();
                    time11.start();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                zorro2.setIcon(z2);
                time9.stop();
                time11.stop();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                zorro2.setIcon(z2);
                infUpDown = 1;
                time9.stop();
            }
        });
        zorro2.setSize(15, 13);
        zorro2.setLocation(737, 287 + OS4 + OS9 + OS);
        add(zorro2);
        zorro3 = new JLabel();
        zorro3.setIcon(z4);
        zorro3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                infUpDown = 0;
                if (infUpDown == 0) {
                    zorro3.setIcon(z5);
                    Zminus();
                    time11.start();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                zorro3.setIcon(z4);
                time10.stop();
                time11.stop();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                zorro3.setIcon(z4);
                infUpDown = 1;
                time10.stop();
            }
        });
        zorro3.setSize(15, 16);
        zorro3.setLocation(737, 300 + OS4 + OS9 + OS);
        add(zorro3);
        if (OSname.equals("Linux")) {
            dialog7 = new JLabel("<html><pre><font face=\"Droid Sans\">В числах от 1 до 50 цифра 3<br><br>   встречается              раз");
            dialog7.setFont(new Font(null, Font.BOLD, 15));
            dialog7.setLocation(560, 233);
        } else {
            dialog7 = new JLabel("<html><pre><font face=\"MS Sans Serif\">В числах от 1 до 50 цифра 3<br></font><font face=\"MS Sans Serif\" size = 1><br></font><font face=\"MS Sans Serif\">   встречается           раз");
            dialog7.setFont(new Font(null, Font.PLAIN, 19));
            dialog7.setLocation(560 + OS5 + OS2, 263 + OS9 + OS2);
        }
        dialog7.setHorizontalAlignment(JLabel.CENTER);
        dialog7.setSize(278, 105);
        add(dialog7);
        taskt1 = new JLabel("в о п р о с  6");
        taskt1.setFont(new Font(OSString, Font.PLAIN, 17 + OS2));
        taskt1.setForeground(Color.decode("#555555"));
        taskt1.setBackground(Color.decode("#BBBBBB"));
        taskt1.setHorizontalAlignment(JLabel.CENTER);
        taskt1.setVerticalAlignment(JLabel.CENTER);
        taskt1.setLocation(562 + OS5 + OS2, 216 + OS4 + OS6 + OS9);
        taskt1.setOpaque(true);
        taskt2 = new JLabel();
        taskt2.setBorder(B1);
        taskt2.setOpaque(false);
        taskt2.setLocation(562 + OS5 + OS2, 247 + OS4 + OS6 + OS9);
        taskt3 = new JLabel();
        taskt3.setBorder(B2);
        taskt3.setOpaque(false);
        taskt3.setLocation(562 + OS5 + OS2, 246 + OS4 + OS6 + OS9);
        taskt4 = new JLabel();
        taskt4.setBorder(B1);
        taskt4.setOpaque(false);
        taskt4.setLocation(561 + OS5 + OS2, 216 + OS4 + OS6 + OS9);
        taskt5 = new JLabel();
        taskt5.setBorder(B1);
        taskt5.setOpaque(false);
        taskt5.setLocation(561 + OS5 + OS2, 215 + OS4 + OS6 + OS9);
        taskt6 = new JLabel();
        taskt6.setBorder(B1);
        taskt6.setOpaque(false);
        taskt7 = new JLabel();
        taskt7.setBorder(B2);
        taskt7.setOpaque(false);
        taskt7.setLocation(560 + OS5 + OS2, 214 + OS4 + OS6 + OS9);
        taskt8 = new JLabel();
        taskt8.setOpaque(true);
        taskt8.setBorder(B1);
        taskt2.setSize(274 + OS, 1);
        taskt3.setSize(274 + OS, 1);
        taskt5.setSize(275 + OS, 1);
        taskt6.setLocation(837 + OS5 + OS2 + OS, 214 + OS4 + OS6 + OS9);
        if (OSname.equals("Linux")) {
            taskt7.setSize(277 + OS, 131 + OS1 + OS7);
            taskt6.setSize(1, 131 + OS1 + OS7);
            taskt4.setSize(1, 128 + OS1 + OS7);
            taskt8.setLocation(560, 345 + OS1 + OS7);
        } else {
            taskt7.setSize(277 + OS, 131 - OS1 - OS);
            taskt6.setSize(1, 131 - OS1 - OS);
            taskt4.setSize(1, 128 - OS1 - OS);
            taskt8.setLocation(560 + OS5 + OS2, 345 + OS4);
        }
        taskt8.setSize(278 + OS, 1);
        taskt1.setSize(274 + OS, 30);
        add(taskt1);
        add(taskt2);
        add(taskt3);
        add(taskt4);
        add(taskt5);
        add(taskt6);
        add(taskt7);
        add(taskt8);
        for (int i = 0; i < 180; i++) {
            lop[i] = new JLabel();
            lop[i].setOpaque(true);
            lop[i].setBackground(Blue);
            if (i == 0)
                lop[i].setLocation(5, 156 + OS4);
            if (i >= 1 && i <= 29)
                lop[i].setLocation(5 + 9 * i, lop[0].getY());
            if (i == 30)
                lop[i].setLocation(285 + OS9, 176 + OS1);
            if (i >= 31 && i <= 59)
                lop[i].setLocation(lop[i - 1].getX() + 9, lop[i - 1].getY());
            if (i == 60)
                lop[i].setLocation(565 + OS5 + OS2, 196 + OS1 + OS7);
            if (i >= 61 && i <= 89)
                lop[i].setLocation(lop[i - 1].getX() + 9, lop[i - 1].getY());
            if (i == 90)
                lop[i].setLocation(5, 330 + OS4);
            if (i >= 91 && i <= 119)
                lop[i].setLocation(lop[i - 1].getX() + 9, lop[i - 1].getY());
            if (i == 120)
                lop[i].setLocation(285 + OS9, 330 + OS4);
            if (i >= 121 && i <= 149)
                lop[i].setLocation(lop[i - 1].getX() + 9, lop[i - 1].getY());
            if (i == 150)
                lop[i].setLocation(565 + OS5 + OS2, 330 + OS4);
            if (i >= 151 && i <= 179)
                lop[i].setLocation(lop[i - 1].getX() + 9, lop[i - 1].getY());
            lop[i].setSize(7, 11);
            lop[i].setVisible(false);
            add(lop[i]);
        }
        for (int i = 0; i < 18; i++) {
            op[i] = new JLabel();
            if (i == 0 || i == 3 || i == 6 || i == 9 || i == 12 || i == 15)
                op[i].setBorder(B2);
            else
                op[i].setBorder(B1);
            op[i].setOpaque(false);
            if (i <= 2)
                op[i].setLocation(2, 153 + OS4);
            if (i >= 3 && i <= 5)
                op[i].setLocation(282 + OS9, 173 + OS1);
            if (i >= 6 && i <= 8)
                op[i].setLocation(562 + OS9 + OS9, 193 + OS1 + OS7);
            if (i >= 9 && i <= 11)
                op[i].setLocation(2, 327 + OS4);
            if (i >= 12 && i <= 14)
                op[i].setLocation(282 + OS9, 327 + OS4);
            if (i >= 15 && i <= 17)
                op[i].setLocation(562 + OS5 + OS2, 327 + OS4);
            if (i == 0 || i == 3 || i == 6 || i == 9 || i == 12 || i == 15)
                op[i].setSize(274 + OS, 17);
            if (i == 1 || i == 4 || i == 7 || i == 10 || i == 13 || i == 16)
                op[i].setSize(274 + OS, 1);
            if (i == 2 || i == 5 || i == 8 || i == 11 || i == 14 || i == 17)
                op[i].setSize(1, 16);
            op[i].setVisible(false);
            if (i == 17)
                for (int j = 17; j >= 0; j--)
                    add(op[j]);
        }
        f1 = new JTextArea();
        f1.setFont(new Font(OSString, Font.BOLD, 20));
        f1.setSize(117, 28);
        f1.setLocation(360 + OS5, 287 + OS1 + OS1 + OS5);
        f1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if (e.getKeyText(e.getKeyCode()) == "Enter") {
                    String str = f1.getText();
                    char[] ch = new char[255];
                    String text = "";
                    str.getChars(0, str.length(), ch, 0);
                    for (int i = 0; i < str.length() - 1; i++)
                        text += ch[i];
                    f1.setText(text);
                }
            }
        });
        f1.setBorder(null);
        add(f1);
        fakeField = new JLabel();
        fakeField.setIcon(bordfield);
        fakeField.setSize(121, 32);
        fakeField.setLocation(358 + OS5, 285 + OS1 + OS1 + OS5);
        add(fakeField);
        dialog6 = new JLabel("<html><pre><font face=\"" + OSString + "\">У отца Мэри пять дочерей:<br>  Чача, Чече, Чичи, Чочо и");
        dialog6.setHorizontalAlignment(JLabel.CENTER);
        if (OSname.equals("Linux"))
            dialog6.setFont(new Font(null, Font.BOLD, 15));
        else
            dialog6.setFont(new Font(null, Font.PLAIN, 19));
        dialog6.setLocation(280 + OS5, 213 + OS1);
        dialog6.setSize(278, 85);
        add(dialog6);
        taskr1 = new JLabel("в о п р о с  5");
        if (OSname.equals("Linux"))
            taskr1.setFont(new Font("Droid Sans", Font.PLAIN, 17));
        else
            taskr1.setFont(new Font("MS Sans Serif", Font.PLAIN, 18));
        taskr1.setForeground(Color.decode("#555555"));
        taskr1.setBackground(Color.decode("#BBBBBB"));
        taskr1.setHorizontalAlignment(JLabel.CENTER);
        taskr1.setVerticalAlignment(JLabel.CENTER);
        taskr1.setLocation(282 + OS9, 196 + OS1 + OS2);
        taskr1.setOpaque(true);
        taskr2 = new JLabel();
        taskr2.setBorder(B1);
        taskr2.setOpaque(false);
        taskr2.setLocation(282 + OS9, 227 + OS1 + OS2);
        taskr3 = new JLabel();
        taskr3.setBorder(B2);
        taskr3.setOpaque(false);
        taskr3.setLocation(282 + OS9, 226 + OS1 + OS2);
        taskr4 = new JLabel();
        taskr4.setBorder(B1);
        taskr4.setOpaque(false);
        taskr4.setLocation(281 + OS9, 196 + OS1 + OS2);
        taskr5 = new JLabel();
        taskr5.setBorder(B1);
        taskr5.setOpaque(false);
        taskr5.setLocation(281 + OS9, 195 + OS1 + OS2);
        taskr6 = new JLabel();
        taskr6.setBorder(B1);
        taskr6.setOpaque(false);
        taskr7 = new JLabel();
        taskr7.setBorder(B2);
        taskr7.setOpaque(false);
        taskr7.setLocation(280 + OS9, 194 + OS1 + OS2);
        taskr8 = new JLabel();
        taskr8.setOpaque(true);
        taskr8.setBorder(B1);
        taskr2.setSize(274 + OS, 1);
        taskr3.setSize(274 + OS, 1);
        taskr5.setSize(275 + OS, 1);
        taskr6.setLocation(557 + OS5, 194 + OS1 + OS2);
        if (OSname.equals("Linux")) {
            taskr7.setSize(277 + OS, 151 + OS1 + OS7);
            taskr6.setSize(1, 151 + OS1 + OS7);
            taskr4.setSize(1, 148 + OS1 + OS7);
            taskr8.setLocation(280, 345 + OS1 + OS7);
        } else {
            taskr7.setSize(277 + OS, 151 + OS3 - OS5);
            taskr6.setSize(1, 151 + OS3 - OS5);
            taskr4.setSize(1, 148 + OS3 - OS5);
            taskr8.setLocation(280 + OS9, 365 + OS5 + OS9 + OS2);
        }
        taskr8.setSize(278 + OS, 1);
        taskr1.setSize(274 + OS, 30);
        add(taskr1);
        add(taskr2);
        add(taskr3);
        add(taskr4);
        add(taskr5);
        add(taskr6);
        add(taskr7);
        add(taskr8);
        m1 = new JLabel();
        m1.setIcon(slid1);
        m1.setSize(11, 25);
        m1.setLocation(13, 260 + OS7 + OS9);
        m1.setOpaque(false);
        m1.setVisible(false);
        m1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                m1.setIcon(slid2);
                sl1.setIcon(slider1);
                if (dialog5.getText().equals("<html><pre><font face=\"MS Sans Serif\">   На руках 10 пальцев.<br>На 10 руках ??? пальцев"))
                    dialog5.setText("<html><pre><font face=\"" + OSString + "\">  На руках 10 пальцев.<br>На 10 руках 0 пальцев");
                b1.setIcon(icon1);
                fakeslide = 1;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                m1.setIcon(slid3);
            }
        });
        m1.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (MouseInfo.getPointerInfo().getLocation().x <= m1.getLocationOnScreen().x + 6) {
                    if (m1.getX() == 15) {
                        intSlidera = 0;
                        m1.setLocation(13, m1.getY());
                    } else if (m1.getX() == 18) {
                        intSlidera = 1;
                        m1.setLocation(15, m1.getY());
                    } else if (m1.getX() == 20) {
                        intSlidera = 2;
                        m1.setLocation(18, m1.getY());
                    } else if (m1.getX() == 23) {
                        intSlidera = 3;
                        m1.setLocation(20, m1.getY());
                    } else if (m1.getX() == 25) {
                        intSlidera = 4;
                        m1.setLocation(23, m1.getY());
                    } else if (m1.getX() == 27) {
                        intSlidera = 5;
                        m1.setLocation(25, m1.getY());
                    } else if (m1.getX() == 30) {
                        intSlidera = 6;
                        m1.setLocation(27, m1.getY());
                    } else if (m1.getX() == 32) {
                        intSlidera = 7;
                        m1.setLocation(30, m1.getY());
                    } else if (m1.getX() == 35) {
                        intSlidera = 8;
                        m1.setLocation(32, m1.getY());
                    } else if (m1.getX() == 37) {
                        intSlidera = 9;
                        m1.setLocation(35, m1.getY());
                    } else if (m1.getX() == 39) {
                        intSlidera = 10;
                        m1.setLocation(37, m1.getY());
                    } else if (m1.getX() == 42) {
                        intSlidera = 11;
                        m1.setLocation(39, m1.getY());
                    } else if (m1.getX() == 44) {
                        intSlidera = 12;
                        m1.setLocation(42, m1.getY());
                    } else if (m1.getX() == 47) {
                        intSlidera = 13;
                        m1.setLocation(44, m1.getY());
                    } else if (m1.getX() == 49) {
                        intSlidera = 14;
                        m1.setLocation(47, m1.getY());
                    } else if (m1.getX() == 51) {
                        intSlidera = 15;
                        m1.setLocation(49, m1.getY());
                    } else if (m1.getX() == 54) {
                        intSlidera = 16;
                        m1.setLocation(51, m1.getY());
                    } else if (m1.getX() == 56) {
                        intSlidera = 17;
                        m1.setLocation(54, m1.getY());
                    } else if (m1.getX() == 59) {
                        intSlidera = 18;
                        m1.setLocation(56, m1.getY());
                    } else if (m1.getX() == 61) {
                        intSlidera = 19;
                        m1.setLocation(59, m1.getY());
                    } else if (m1.getX() == 63) {
                        intSlidera = 20;
                        m1.setLocation(61, m1.getY());
                    } else if (m1.getX() == 66) {
                        intSlidera = 21;
                        m1.setLocation(63, m1.getY());
                    } else if (m1.getX() == 68) {
                        intSlidera = 22;
                        m1.setLocation(66, m1.getY());
                    } else if (m1.getX() == 71) {
                        intSlidera = 23;
                        m1.setLocation(68, m1.getY());
                    } else if (m1.getX() == 73) {
                        intSlidera = 24;
                        m1.setLocation(71, m1.getY());
                    } else if (m1.getX() == 75) {
                        intSlidera = 25;
                        m1.setLocation(73, m1.getY());
                    } else if (m1.getX() == 78) {
                        intSlidera = 26;
                        m1.setLocation(75, m1.getY());
                    } else if (m1.getX() == 80) {
                        intSlidera = 27;
                        m1.setLocation(78, m1.getY());
                    } else if (m1.getX() == 83) {
                        intSlidera = 28;
                        m1.setLocation(80, m1.getY());
                    } else if (m1.getX() == 85) {
                        intSlidera = 29;
                        m1.setLocation(83, m1.getY());
                    } else if (m1.getX() == 87) {
                        intSlidera = 30;
                        m1.setLocation(85, m1.getY());
                    } else if (m1.getX() == 90) {
                        intSlidera = 31;
                        m1.setLocation(87, m1.getY());
                    } else if (m1.getX() == 92) {
                        intSlidera = 32;
                        m1.setLocation(90, m1.getY());
                    } else if (m1.getX() == 95) {
                        intSlidera = 33;
                        m1.setLocation(92, m1.getY());
                    } else if (m1.getX() == 97) {
                        intSlidera = 34;
                        m1.setLocation(95, m1.getY());
                    } else if (m1.getX() == 99) {
                        intSlidera = 35;
                        m1.setLocation(97, m1.getY());
                    } else if (m1.getX() == 102) {
                        intSlidera = 36;
                        m1.setLocation(99, m1.getY());
                    } else if (m1.getX() == 104) {
                        intSlidera = 37;
                        m1.setLocation(102, m1.getY());
                    } else if (m1.getX() == 107) {
                        intSlidera = 38;
                        m1.setLocation(104, m1.getY());
                    } else if (m1.getX() == 109) {
                        intSlidera = 39;
                        m1.setLocation(107, m1.getY());
                    } else if (m1.getX() == 112) {
                        intSlidera = 40;
                        m1.setLocation(109, m1.getY());
                    } else if (m1.getX() == 114) {
                        intSlidera = 41;
                        m1.setLocation(112, m1.getY());
                    } else if (m1.getX() == 117) {
                        intSlidera = 42;
                        m1.setLocation(114, m1.getY());
                    } else if (m1.getX() == 119) {
                        intSlidera = 43;
                        m1.setLocation(117, m1.getY());
                    } else if (m1.getX() == 121) {
                        intSlidera = 44;
                        m1.setLocation(119, m1.getY());
                    } else if (m1.getX() == 124) {
                        intSlidera = 45;
                        m1.setLocation(121, m1.getY());
                    } else if (m1.getX() == 126) {
                        intSlidera = 46;
                        m1.setLocation(124, m1.getY());
                    } else if (m1.getX() == 129) {
                        intSlidera = 47;
                        m1.setLocation(126, m1.getY());
                    } else if (m1.getX() == 131) {
                        intSlidera = 48;
                        m1.setLocation(129, m1.getY());
                    } else if (m1.getX() == 134) {
                        intSlidera = 49;
                        m1.setLocation(131, m1.getY());
                    } else if (m1.getX() == 136) {
                        intSlidera = 50;
                        m1.setLocation(134, m1.getY());
                    } else if (m1.getX() == 139) {
                        intSlidera = 51;
                        m1.setLocation(136, m1.getY());
                    } else if (m1.getX() == 142) {
                        intSlidera = 52;
                        m1.setLocation(139, m1.getY());
                    } else if (m1.getX() == 144) {
                        intSlidera = 53;
                        m1.setLocation(142, m1.getY());
                    } else if (m1.getX() == 146) {
                        intSlidera = 54;
                        m1.setLocation(144, m1.getY());
                    } else if (m1.getX() == 148) {
                        intSlidera = 55;
                        m1.setLocation(146, m1.getY());
                    } else if (m1.getX() == 151) {
                        intSlidera = 56;
                        m1.setLocation(148, m1.getY());
                    } else if (m1.getX() == 153) {
                        intSlidera = 57;
                        m1.setLocation(151, m1.getY());
                    } else if (m1.getX() == 156) {
                        intSlidera = 58;
                        m1.setLocation(153, m1.getY());
                    } else if (m1.getX() == 158) {
                        intSlidera = 59;
                        m1.setLocation(156, m1.getY());
                    } else if (m1.getX() == 160) {
                        intSlidera = 60;
                        m1.setLocation(158, m1.getY());
                    } else if (m1.getX() == 163) {
                        intSlidera = 61;
                        m1.setLocation(160, m1.getY());
                    } else if (m1.getX() == 165) {
                        intSlidera = 62;
                        m1.setLocation(163, m1.getY());
                    } else if (m1.getX() == 168) {
                        intSlidera = 63;
                        m1.setLocation(165, m1.getY());
                    } else if (m1.getX() == 170) {
                        intSlidera = 64;
                        m1.setLocation(168, m1.getY());
                    } else if (m1.getX() == 172) {
                        intSlidera = 65;
                        m1.setLocation(170, m1.getY());
                    } else if (m1.getX() == 175) {
                        intSlidera = 66;
                        m1.setLocation(172, m1.getY());
                    } else if (m1.getX() == 177) {
                        intSlidera = 67;
                        m1.setLocation(175, m1.getY());
                    } else if (m1.getX() == 180) {
                        intSlidera = 68;
                        m1.setLocation(177, m1.getY());
                    } else if (m1.getX() == 182) {
                        intSlidera = 69;
                        m1.setLocation(180, m1.getY());
                    } else if (m1.getX() == 184) {
                        intSlidera = 70;
                        m1.setLocation(182, m1.getY());
                    } else if (m1.getX() == 187) {
                        intSlidera = 71;
                        m1.setLocation(184, m1.getY());
                    } else if (m1.getX() == 189) {
                        intSlidera = 72;
                        m1.setLocation(187, m1.getY());
                    } else if (m1.getX() == 192) {
                        intSlidera = 73;
                        m1.setLocation(189, m1.getY());
                    } else if (m1.getX() == 194) {
                        intSlidera = 74;
                        m1.setLocation(192, m1.getY());
                    } else if (m1.getX() == 196) {
                        intSlidera = 75;
                        m1.setLocation(194, m1.getY());
                    } else if (m1.getX() == 199) {
                        intSlidera = 76;
                        m1.setLocation(196, m1.getY());
                    } else if (m1.getX() == 201) {
                        intSlidera = 77;
                        m1.setLocation(199, m1.getY());
                    } else if (m1.getX() == 204) {
                        intSlidera = 78;
                        m1.setLocation(201, m1.getY());
                    } else if (m1.getX() == 206) {
                        intSlidera = 79;
                        m1.setLocation(204, m1.getY());
                    } else if (m1.getX() == 208) {
                        intSlidera = 80;
                        m1.setLocation(206, m1.getY());
                    } else if (m1.getX() == 211) {
                        intSlidera = 81;
                        m1.setLocation(208, m1.getY());
                    } else if (m1.getX() == 213) {
                        intSlidera = 82;
                        m1.setLocation(211, m1.getY());
                    } else if (m1.getX() == 216) {
                        intSlidera = 83;
                        m1.setLocation(213, m1.getY());
                    } else if (m1.getX() == 218) {
                        intSlidera = 84;
                        m1.setLocation(216, m1.getY());
                    } else if (m1.getX() == 220) {
                        intSlidera = 85;
                        m1.setLocation(218, m1.getY());
                    } else if (m1.getX() == 222) {
                        intSlidera = 86;
                        m1.setLocation(220, m1.getY());
                    } else if (m1.getX() == 225) {
                        intSlidera = 87;
                        m1.setLocation(222, m1.getY());
                    } else if (m1.getX() == 227) {
                        intSlidera = 88;
                        m1.setLocation(225, m1.getY());
                    } else if (m1.getX() == 230) {
                        intSlidera = 89;
                        m1.setLocation(227, m1.getY());
                    } else if (m1.getX() == 232) {
                        intSlidera = 90;
                        m1.setLocation(230, m1.getY());
                    } else if (m1.getX() == 235) {
                        intSlidera = 91;
                        m1.setLocation(232, m1.getY());
                    } else if (m1.getX() == 237) {
                        intSlidera = 92;
                        m1.setLocation(235, m1.getY());
                    } else if (m1.getX() == 240) {
                        intSlidera = 93;
                        m1.setLocation(237, m1.getY());
                    } else if (m1.getX() == 242) {
                        intSlidera = 94;
                        m1.setLocation(240, m1.getY());
                    } else if (m1.getX() == 244) {
                        intSlidera = 95;
                        m1.setLocation(242, m1.getY());
                    } else if (m1.getX() == 246) {
                        intSlidera = 96;
                        m1.setLocation(244, m1.getY());
                    } else if (m1.getX() == 249) {
                        intSlidera = 97;
                        m1.setLocation(246, m1.getY());
                    } else if (m1.getX() == 251) {
                        intSlidera = 98;
                        m1.setLocation(249, m1.getY());
                    } else if (m1.getX() == 254) {
                        intSlidera = 99;
                        m1.setLocation(251, m1.getY());
                    }
                }
                if (MouseInfo.getPointerInfo().getLocation().x >= m1.getLocationOnScreen().x + 6) {
                    if (m1.getX() == 13) {
                        intSlidera = 1;
                        m1.setLocation(15, m1.getY());
                    } else if (m1.getX() == 15) {
                        intSlidera = 2;
                        m1.setLocation(18, m1.getY());
                    } else if (m1.getX() == 18) {
                        intSlidera = 3;
                        m1.setLocation(20, m1.getY());
                    } else if (m1.getX() == 20) {
                        intSlidera = 4;
                        m1.setLocation(23, m1.getY());
                    } else if (m1.getX() == 23) {
                        intSlidera = 5;
                        m1.setLocation(25, m1.getY());
                    } else if (m1.getX() == 25) {
                        intSlidera = 6;
                        m1.setLocation(27, m1.getY());
                    } else if (m1.getX() == 27) {
                        intSlidera = 7;
                        m1.setLocation(30, m1.getY());
                    } else if (m1.getX() == 30) {
                        intSlidera = 8;
                        m1.setLocation(32, m1.getY());
                    } else if (m1.getX() == 32) {
                        intSlidera = 9;
                        m1.setLocation(35, m1.getY());
                    } else if (m1.getX() == 35) {
                        intSlidera = 10;
                        m1.setLocation(37, m1.getY());
                    } else if (m1.getX() == 37) {
                        intSlidera = 11;
                        m1.setLocation(39, m1.getY());
                    } else if (m1.getX() == 39) {
                        intSlidera = 12;
                        m1.setLocation(42, m1.getY());
                    } else if (m1.getX() == 42) {
                        intSlidera = 13;
                        m1.setLocation(44, m1.getY());
                    } else if (m1.getX() == 44) {
                        intSlidera = 14;
                        m1.setLocation(47, m1.getY());
                    } else if (m1.getX() == 47) {
                        intSlidera = 15;
                        m1.setLocation(49, m1.getY());
                    } else if (m1.getX() == 49) {
                        intSlidera = 16;
                        m1.setLocation(51, m1.getY());
                    } else if (m1.getX() == 51) {
                        intSlidera = 17;
                        m1.setLocation(54, m1.getY());
                    } else if (m1.getX() == 54) {
                        intSlidera = 18;
                        m1.setLocation(56, m1.getY());
                    } else if (m1.getX() == 56) {
                        intSlidera = 19;
                        m1.setLocation(59, m1.getY());
                    } else if (m1.getX() == 59) {
                        intSlidera = 20;
                        m1.setLocation(61, m1.getY());
                    } else if (m1.getX() == 61) {
                        intSlidera = 21;
                        m1.setLocation(63, m1.getY());
                    } else if (m1.getX() == 63) {
                        intSlidera = 22;
                        m1.setLocation(66, m1.getY());
                    } else if (m1.getX() == 66) {
                        intSlidera = 23;
                        m1.setLocation(68, m1.getY());
                    } else if (m1.getX() == 68) {
                        intSlidera = 24;
                        m1.setLocation(71, m1.getY());
                    } else if (m1.getX() == 71) {
                        intSlidera = 25;
                        m1.setLocation(73, m1.getY());
                    } else if (m1.getX() == 73) {
                        intSlidera = 26;
                        m1.setLocation(75, m1.getY());
                    } else if (m1.getX() == 75) {
                        intSlidera = 27;
                        m1.setLocation(78, m1.getY());
                    } else if (m1.getX() == 78) {
                        intSlidera = 28;
                        m1.setLocation(80, m1.getY());
                    } else if (m1.getX() == 80) {
                        intSlidera = 29;
                        m1.setLocation(83, m1.getY());
                    } else if (m1.getX() == 83) {
                        intSlidera = 30;
                        m1.setLocation(85, m1.getY());
                    } else if (m1.getX() == 85) {
                        intSlidera = 31;
                        m1.setLocation(87, m1.getY());
                    } else if (m1.getX() == 87) {
                        intSlidera = 32;
                        m1.setLocation(90, m1.getY());
                    } else if (m1.getX() == 90) {
                        intSlidera = 33;
                        m1.setLocation(92, m1.getY());
                    } else if (m1.getX() == 92) {
                        intSlidera = 34;
                        m1.setLocation(95, m1.getY());
                    } else if (m1.getX() == 95) {
                        intSlidera = 35;
                        m1.setLocation(97, m1.getY());
                    } else if (m1.getX() == 97) {
                        intSlidera = 36;
                        m1.setLocation(99, m1.getY());
                    } else if (m1.getX() == 99) {
                        intSlidera = 37;
                        m1.setLocation(102, m1.getY());
                    } else if (m1.getX() == 102) {
                        intSlidera = 38;
                        m1.setLocation(104, m1.getY());
                    } else if (m1.getX() == 104) {
                        intSlidera = 39;
                        m1.setLocation(107, m1.getY());
                    } else if (m1.getX() == 107) {
                        intSlidera = 40;
                        m1.setLocation(109, m1.getY());
                    } else if (m1.getX() == 109) {
                        intSlidera = 41;
                        m1.setLocation(112, m1.getY());
                    } else if (m1.getX() == 112) {
                        intSlidera = 42;
                        m1.setLocation(114, m1.getY());
                    } else if (m1.getX() == 114) {
                        intSlidera = 43;
                        m1.setLocation(117, m1.getY());
                    } else if (m1.getX() == 117) {
                        intSlidera = 44;
                        m1.setLocation(119, m1.getY());
                    } else if (m1.getX() == 119) {
                        intSlidera = 45;
                        m1.setLocation(121, m1.getY());
                    } else if (m1.getX() == 121) {
                        intSlidera = 46;
                        m1.setLocation(124, m1.getY());
                    } else if (m1.getX() == 124) {
                        intSlidera = 47;
                        m1.setLocation(126, m1.getY());
                    } else if (m1.getX() == 126) {
                        intSlidera = 48;
                        m1.setLocation(129, m1.getY());
                    } else if (m1.getX() == 129) {
                        intSlidera = 49;
                        m1.setLocation(131, m1.getY());
                    } else if (m1.getX() == 131) {
                        intSlidera = 50;
                        m1.setLocation(134, m1.getY());
                    } else if (m1.getX() == 134) {
                        intSlidera = 51;
                        m1.setLocation(136, m1.getY());
                    } else if (m1.getX() == 136) {
                        intSlidera = 52;
                        m1.setLocation(139, m1.getY());
                    } else if (m1.getX() == 139) {
                        intSlidera = 53;
                        m1.setLocation(142, m1.getY());
                    } else if (m1.getX() == 142) {
                        intSlidera = 54;
                        m1.setLocation(144, m1.getY());
                    } else if (m1.getX() == 144) {
                        intSlidera = 55;
                        m1.setLocation(146, m1.getY());
                    } else if (m1.getX() == 146) {
                        intSlidera = 56;
                        m1.setLocation(148, m1.getY());
                    } else if (m1.getX() == 148) {
                        intSlidera = 57;
                        m1.setLocation(151, m1.getY());
                    } else if (m1.getX() == 151) {
                        intSlidera = 58;
                        m1.setLocation(153, m1.getY());
                    } else if (m1.getX() == 153) {
                        intSlidera = 59;
                        m1.setLocation(156, m1.getY());
                    } else if (m1.getX() == 156) {
                        intSlidera = 60;
                        m1.setLocation(158, m1.getY());
                    } else if (m1.getX() == 158) {
                        intSlidera = 61;
                        m1.setLocation(160, m1.getY());
                    } else if (m1.getX() == 160) {
                        intSlidera = 62;
                        m1.setLocation(163, m1.getY());
                    } else if (m1.getX() == 163) {
                        intSlidera = 63;
                        m1.setLocation(165, m1.getY());
                    } else if (m1.getX() == 165) {
                        intSlidera = 64;
                        m1.setLocation(168, m1.getY());
                    } else if (m1.getX() == 168) {
                        intSlidera = 65;
                        m1.setLocation(170, m1.getY());
                    } else if (m1.getX() == 170) {
                        intSlidera = 66;
                        m1.setLocation(172, m1.getY());
                    } else if (m1.getX() == 172) {
                        intSlidera = 67;
                        m1.setLocation(175, m1.getY());
                    } else if (m1.getX() == 175) {
                        intSlidera = 68;
                        m1.setLocation(177, m1.getY());
                    } else if (m1.getX() == 177) {
                        intSlidera = 69;
                        m1.setLocation(180, m1.getY());
                    } else if (m1.getX() == 180) {
                        intSlidera = 70;
                        m1.setLocation(182, m1.getY());
                    } else if (m1.getX() == 182) {
                        intSlidera = 71;
                        m1.setLocation(184, m1.getY());
                    } else if (m1.getX() == 184) {
                        intSlidera = 72;
                        m1.setLocation(187, m1.getY());
                    } else if (m1.getX() == 187) {
                        intSlidera = 73;
                        m1.setLocation(189, m1.getY());
                    } else if (m1.getX() == 189) {
                        intSlidera = 74;
                        m1.setLocation(192, m1.getY());
                    } else if (m1.getX() == 192) {
                        intSlidera = 75;
                        m1.setLocation(194, m1.getY());
                    } else if (m1.getX() == 194) {
                        intSlidera = 76;
                        m1.setLocation(196, m1.getY());
                    } else if (m1.getX() == 196) {
                        intSlidera = 77;
                        m1.setLocation(199, m1.getY());
                    } else if (m1.getX() == 199) {
                        intSlidera = 78;
                        m1.setLocation(201, m1.getY());
                    } else if (m1.getX() == 201) {
                        intSlidera = 79;
                        m1.setLocation(204, m1.getY());
                    } else if (m1.getX() == 204) {
                        intSlidera = 80;
                        m1.setLocation(206, m1.getY());
                    } else if (m1.getX() == 206) {
                        intSlidera = 81;
                        m1.setLocation(208, m1.getY());
                    } else if (m1.getX() == 208) {
                        intSlidera = 82;
                        m1.setLocation(211, m1.getY());
                    } else if (m1.getX() == 211) {
                        intSlidera = 83;
                        m1.setLocation(213, m1.getY());
                    } else if (m1.getX() == 213) {
                        intSlidera = 84;
                        m1.setLocation(216, m1.getY());
                    } else if (m1.getX() == 216) {
                        intSlidera = 85;
                        m1.setLocation(218, m1.getY());
                    } else if (m1.getX() == 218) {
                        intSlidera = 86;
                        m1.setLocation(220, m1.getY());
                    } else if (m1.getX() == 220) {
                        intSlidera = 87;
                        m1.setLocation(222, m1.getY());
                    } else if (m1.getX() == 222) {
                        intSlidera = 88;
                        m1.setLocation(225, m1.getY());
                    } else if (m1.getX() == 225) {
                        intSlidera = 89;
                        m1.setLocation(227, m1.getY());
                    } else if (m1.getX() == 227) {
                        intSlidera = 90;
                        m1.setLocation(230, m1.getY());
                    } else if (m1.getX() == 230) {
                        intSlidera = 91;
                        m1.setLocation(232, m1.getY());
                    } else if (m1.getX() == 232) {
                        intSlidera = 92;
                        m1.setLocation(235, m1.getY());
                    } else if (m1.getX() == 235) {
                        intSlidera = 93;
                        m1.setLocation(237, m1.getY());
                    } else if (m1.getX() == 237) {
                        intSlidera = 94;
                        m1.setLocation(240, m1.getY());
                    } else if (m1.getX() == 240) {
                        intSlidera = 95;
                        m1.setLocation(242, m1.getY());
                    } else if (m1.getX() == 242) {
                        intSlidera = 96;
                        m1.setLocation(244, m1.getY());
                    } else if (m1.getX() == 244) {
                        intSlidera = 97;
                        m1.setLocation(246, m1.getY());
                    } else if (m1.getX() == 246) {
                        intSlidera = 98;
                        m1.setLocation(249, m1.getY());
                    } else if (m1.getX() == 249) {
                        intSlidera = 99;
                        m1.setLocation(251, m1.getY());
                    } else if (m1.getX() == 251) {
                        intSlidera = 100;
                        m1.setLocation(254, m1.getY());
                    }
                }
                outdialog();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        });
        add(m1);
        fakeSlidera = new JLabel();
        fakeSlidera.setIcon(slid4);
        fakeSlidera.setSize(11, 25);
        fakeSlidera.setVisible(false);
        add(fakeSlidera);
        slidemove = new JLabel();
        slidemove.setSize(248, 14);
        slidemove.setLocation(15, 264 + OS7);
        slidemove.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                infoSlide = 0;
                sl1.setIcon(slider1);
                if (getMousePosition().x > m1.getLocation().x)
                    Xplus();
                else
                    Xminus();
                predelX();
                outdialog();
                time5.start();
            }

            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                infoSlide = 1;
            }
        });
        slidemove.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                infoMoveSlide = 1;
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
        add(slidemove);
        fakeSlider = new JButton();
        fakeSlider.setSize(0, 0);
        fakeSlider.setLocation(0, 0);
        fakeSlider.setVisible(false);
        fakeSlider.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                dialog5.setText("<html><pre><font face=\"" + OSString + "\">  На руках 10 пальцев.<br>На 10 руках 0 пальцев");
                if (fakeslide == 1) {
                    b1.setIcon(focus);
                    fakeslide = 0;
                    sl1.setIcon(slider2);
                } else if (fakeslide == 0) {
                    sl1.setIcon(slider1);
                    if (b1.getIcon() == focus)
                        b1.setIcon(icon1);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                sl1.setIcon(slider2);
            }
        });
        add(fakeSlider);
        sl1 = new JLabel();
        sl1.setIcon(slider2);
        sl1.setSize(268, 45);
        sl1.setLocation(5, 258 + OS7 + OS9);
        sl1.setVisible(false);
        add(sl1);
        if (OSname.equals("Linux"))
            numberinsl = new JLabel("0   10  20  30  40  50  60  70  80  90 100");
        else
            numberinsl = new JLabel("0    10    20   30   40    50   60    70   80   90  100");
        numberinsl.setFont(new Font("MS Sans Serif", Font.PLAIN, 12));
        numberinsl.setSize(325, 20);
        numberinsl.setLocation(15, 297 + OS7 + OS9);
        numberinsl.setVisible(false);
        add(numberinsl);
        dialog5 = new JLabel("<html><pre><font face=\"" + OSString + "\">   На руках 10 пальцев.<br>На 10 руках ??? пальцев");
        dialog5.setHorizontalAlignment(JLabel.CENTER);
        if (OSname.equals("Linux")) {
            dialog5.setFont(new Font(null, Font.BOLD, 15));
            dialog5.setLocation(0, 193);
            dialog5.setSize(278, 85);
        } else {
            dialog5.setFont(new Font(null, Font.PLAIN, 19));
            dialog5.setLocation(0, 207);
            dialog5.setSize(278, 115);
        }
        add(dialog5);
        taske1 = new JLabel("в о п р о с  4");
        if (OSname.equals("Linux"))
            taske1.setFont(new Font("Droid Sans", Font.PLAIN, 17));
        else
            taske1.setFont(new Font("MS Sans Serif", Font.PLAIN, 18));
        taske1.setForeground(Color.decode("#555555"));
        taske1.setBackground(Color.decode("#BBBBBB"));
        taske1.setHorizontalAlignment(JLabel.CENTER);
        taske1.setVerticalAlignment(JLabel.CENTER);
        taske1.setLocation(2, 176 + OS7);
        taske1.setOpaque(true);
        taske2 = new JLabel();
        taske2.setBorder(B1);
        taske2.setOpaque(false);
        taske2.setLocation(2, 207 + OS7);
        taske3 = new JLabel();
        taske3.setBorder(B2);
        taske3.setOpaque(false);
        taske3.setLocation(2, 206 + OS7);
        taske4 = new JLabel();
        taske4.setBorder(B1);
        taske4.setOpaque(false);
        taske4.setLocation(1, 176 + OS7);
        taske5 = new JLabel();
        taske5.setBorder(B1);
        taske5.setOpaque(false);
        taske5.setLocation(1, 175 + OS7);
        taske6 = new JLabel();
        taske6.setBorder(B1);
        taske6.setOpaque(false);
        taske7 = new JLabel();
        taske7.setBorder(B2);
        taske7.setOpaque(false);
        taske7.setLocation(0, 174 + OS7);
        taske8 = new JLabel();
        taske8.setOpaque(true);
        taske8.setBorder(B1);
        taske2.setSize(274 + OS, 1);
        taske3.setSize(274 + OS, 1);
        taske5.setSize(275 + OS, 1);
        taske6.setLocation(277 + OS, 174 + OS7);
        if (OSname.equals("Linux")) {
            taske7.setSize(277, 171);
            taske6.setSize(1, 171);
            taske4.setSize(1, 168);
            taske8.setLocation(0, 345);
        } else {
            taske7.setSize(277 + OS, 171 - OS2);
            taske6.setSize(1, 171 - OS2);
            taske4.setSize(1, 168 - OS2);
            taske8.setLocation(0, 345 + OS4);
        }
        taske8.setSize(278 + OS, 1);
        taske1.setSize(274 + OS, 30);
        add(taske1);
        add(taske2);
        add(taske3);
        add(taske4);
        add(taske5);
        add(taske6);
        add(taske7);
        add(taske8);
        fakeFruit = new JLabel();
        fakeFruit.setSize(270, 54);
        fakeFruit.setLocation(564 + OS9 + OS2 + OS9, 135 + OS7 + OS);
        add(fakeFruit);
        bf1 = new JButton();
        bf1.setIcon(fr1);
        bf1.setBorder(null);
        bf1.setSize(54, 54);
        bf1.setLocation(564 + OS9 + OS2 + OS9, 135 + OS7 + OS);
        bf1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (bf1.getIcon() != frF1)
                    bf1.setIcon(frf1);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                if (bf1.getIcon() != fr1) {
                    bf1.setIcon(frF1);
                    bf2.setIcon(fr2);
                    bf3.setIcon(fr3);
                    bf4.setIcon(fr4);
                    bf5.setIcon(fr5);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (bf1.getIcon() != frF1)
                    bf1.setIcon(fr1);
            }
        });
        add(bf1);
        bf2 = new JButton();
        bf2.setIcon(fr2);
        bf2.setBorder(null);
        bf2.setSize(54, 54);
        bf2.setLocation(618 + OS9 + OS2 + OS9, 135 + OS7 + OS);
        bf2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (bf2.getIcon() != frF2)
                    bf2.setIcon(frf2);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                if (bf2.getIcon() != fr2) {
                    bf2.setIcon(frF2);
                    bf1.setIcon(fr1);
                    bf3.setIcon(fr3);
                    bf4.setIcon(fr4);
                    bf5.setIcon(fr5);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (bf2.getIcon() != frF2)
                    bf2.setIcon(fr2);
            }
        });
        add(bf2);
        bf3 = new JButton();
        bf3.setIcon(fr3);
        bf3.setBorder(null);
        bf3.setSize(54, 54);
        bf3.setLocation(672 + OS9 + OS2 + OS9, 135 + OS7 + OS);
        bf3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (bf3.getIcon() != frF3)
                    bf3.setIcon(frf3);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                if (bf3.getIcon() != fr3) {
                    bf3.setIcon(frF3);
                    bf2.setIcon(fr2);
                    bf1.setIcon(fr1);
                    bf4.setIcon(fr4);
                    bf5.setIcon(fr5);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (bf3.getIcon() != frF3)
                    bf3.setIcon(fr3);
            }
        });
        add(bf3);
        bf4 = new JButton();
        bf4.setIcon(fr4);
        bf4.setBorder(null);
        bf4.setSize(54, 54);
        bf4.setLocation(726 + OS9 + OS2 + OS9, 135 + OS7 + OS);
        bf4.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (bf4.getIcon() != frF4)
                    bf4.setIcon(frf4);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                if (bf4.getIcon() != fr4) {
                    bf4.setIcon(frF4);
                    bf2.setIcon(fr2);
                    bf3.setIcon(fr3);
                    bf1.setIcon(fr1);
                    bf5.setIcon(fr5);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (bf4.getIcon() != frF4)
                    bf4.setIcon(fr4);
            }
        });
        add(bf4);
        bf5 = new JButton();
        bf5.setIcon(fr5);
        bf5.setBorder(null);
        bf5.setSize(54, 54);
        bf5.setLocation(780 + OS9 + OS2 + OS9, 135 + OS7 + OS);
        bf5.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (bf5.getIcon() != frF5)
                    bf5.setIcon(frf5);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                if (bf5.getIcon() != fr5) {
                    bf5.setIcon(frF5);
                    bf2.setIcon(fr2);
                    bf3.setIcon(fr3);
                    bf4.setIcon(fr4);
                    bf1.setIcon(fr1);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (bf5.getIcon() != frF5)
                    bf5.setIcon(fr5);
            }
        });
        add(bf5);
        dialog4 = new JLabel("<html><pre><font face=\"" + OSString + "\">На столе лежат 3 банана,<br>   4 помидора, 5 арбузов,<br>         6 слив и 7 яблок.<br>          Каких фруктов<br> меньше всего на столе?");
        if (OSname.equals("Linux")) {
            dialog4.setFont(new Font(null, Font.BOLD, 15));
            dialog4.setLocation(560, 45);
            dialog4.setSize(278, 85);
        } else {
            dialog4.setFont(new Font(null, Font.PLAIN, 19));
            dialog4.setLocation(560 + OS9, 40);
            dialog4.setSize(278, 115);
        }
        dialog4.setHorizontalAlignment(JLabel.CENTER);
        add(dialog4);
        taskw1 = new JLabel("в о п р о с  3");
        taskw1.setFont(new Font(OSString, Font.PLAIN, 17 + OS2));
        taskw1.setForeground(Color.decode("#555555"));
        taskw1.setBackground(Color.decode("#BBBBBB"));
        taskw1.setHorizontalAlignment(JLabel.CENTER);
        taskw1.setVerticalAlignment(JLabel.CENTER);
        taskw1.setLocation(562 + OS9 + OS9, 2);
        taskw1.setOpaque(true);
        taskw2 = new JLabel();
        taskw2.setBorder(B1);
        taskw2.setOpaque(false);
        taskw2.setLocation(562 + OS9 + OS9, 33);
        taskw3 = new JLabel();
        taskw3.setBorder(B2);
        taskw3.setOpaque(false);
        taskw3.setLocation(562 + OS9 + OS9, 32);
        taskw4 = new JLabel();
        taskw4.setBorder(B1);
        taskw4.setOpaque(false);
        taskw4.setLocation(561 + OS9 + OS9, 2);
        taskw5 = new JLabel();
        taskw5.setBorder(B1);
        taskw5.setOpaque(false);
        taskw5.setLocation(561 + OS9 + OS9, 1);
        taskw6 = new JLabel();
        taskw6.setBorder(B1);
        taskw6.setOpaque(false);
        taskw7 = new JLabel();
        taskw7.setBorder(B2);
        taskw7.setOpaque(false);
        taskw7.setLocation(560 + OS9 + OS9, 0);
        taskw8 = new JLabel();
        taskw8.setOpaque(true);
        taskw8.setBorder(B1);
        taskw2.setSize(274 + OS, 1);
        taskw3.setSize(274 + OS, 1);
        taskw4.setSize(1, 208 + OS1 + OS7);
        taskw5.setSize(275 + OS, 1);
        taskw6.setSize(1, 211 + OS1 + OS7);
        taskw6.setLocation(837 + OS + OS9 + OS9, 0);
        taskw7.setSize(277 + OS, 211 + OS1 + OS7);
        taskw8.setSize(278 + OS, 1);
        taskw8.setLocation(560 + OS9 + OS9, 211 + OS1 + OS7);
        taskw1.setSize(274 + OS, 30);
        add(taskw1);
        add(taskw2);
        add(taskw3);
        add(taskw4);
        add(taskw5);
        add(taskw6);
        add(taskw7);
        add(taskw8);
        rb1 = new JLabel();
        rb1.setIcon(rbn1);
        rb1.setBorder(null);
        rb1.setSize(200, 26);
        rb1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                radiol2.setIcon(radioB1);
                radiol3.setIcon(radioB2);
                radiol4.setIcon(radioB3);
                rq1 = 0;
                if (rb1.getIcon() == rbn2)
                    rb1.setIcon(rbn4);
                else
                    rb1.setIcon(rbn3);
                radiol1.setIcon(radioBF);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (rb1.getIcon() == rbn3) {
                    rb1.setIcon(rbn1);
                    rq1 = 1;
                }
                if (rb1.getIcon() == rbn4) {
                    rb1.setIcon(rbn2);
                    rq1 = 1;
                }
            }

            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                if (rq1 == 0) {
                    rb1.setIcon(rbn2);
                    rb2.setIcon(rbn1);
                    rb3.setIcon(rbn1);
                    rb4.setIcon(rbn1);
                }
            }
        });
        rb1.setLocation(318 + OS9, 64);
        add(rb1);
        rb2 = new JLabel();
        rb2.setIcon(rbn1);
        rb2.setSize(200, 26);
        rb2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                radiol1.setIcon(radioB);
                radiol3.setIcon(radioB2);
                radiol4.setIcon(radioB3);
                rq2 = 0;
                if (rb2.getIcon() == rbn2)
                    rb2.setIcon(rbn4);
                else
                    rb2.setIcon(rbn3);
                radiol2.setIcon(radioBF1);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (rb2.getIcon() == rbn3) {
                    rb2.setIcon(rbn1);
                    rq2 = 1;
                }
                if (rb2.getIcon() == rbn4) {
                    rb2.setIcon(rbn2);
                    rq2 = 1;
                }
            }

            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                if (rq2 == 0) {
                    rb2.setIcon(rbn2);
                    rb1.setIcon(rbn1);
                    rb3.setIcon(rbn1);
                    rb4.setIcon(rbn1);
                }
            }
        });
        rb2.setLocation(318 + OS9, 90);
        add(rb2);
        rb3 = new JLabel();
        rb3.setIcon(rbn1);
        rb3.setSize(200, 26);
        rb3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                radiol1.setIcon(radioB);
                radiol2.setIcon(radioB1);
                radiol4.setIcon(radioB3);
                rq3 = 0;
                if (rb3.getIcon() == rbn2)
                    rb3.setIcon(rbn4);
                else
                    rb3.setIcon(rbn3);
                radiol3.setIcon(radioBF2);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (rb3.getIcon() == rbn3) {
                    rb3.setIcon(rbn1);
                    rq3 = 1;
                }
                if (rb3.getIcon() == rbn4) {
                    rb3.setIcon(rbn2);
                    rq3 = 1;
                }
            }

            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                if (rq3 == 0) {
                    rb3.setIcon(rbn2);
                    rb1.setIcon(rbn1);
                    rb2.setIcon(rbn1);
                    rb4.setIcon(rbn1);
                }
            }
        });
        rb3.setLocation(318 + OS9, 116);
        add(rb3);
        rb4 = new JLabel();
        rb4.setIcon(rbn1);
        rb4.setSize(200, 26);
        rb4.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                radiol1.setIcon(radioB);
                radiol2.setIcon(radioB1);
                radiol3.setIcon(radioB2);
                rq4 = 0;
                if (rb4.getIcon() == rbn2)
                    rb4.setIcon(rbn4);
                else
                    rb4.setIcon(rbn3);
                radiol4.setIcon(radioBF3);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (rb4.getIcon() == rbn3) {
                    rb4.setIcon(rbn1);
                    rq4 = 1;
                }
                if (rb4.getIcon() == rbn4) {
                    rb4.setIcon(rbn2);
                    rq4 = 1;
                }
            }

            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                if (rq4 == 0) {
                    rb4.setIcon(rbn2);
                    rb1.setIcon(rbn1);
                    rb2.setIcon(rbn1);
                    rb3.setIcon(rbn1);
                }
            }
        });
        rb4.setLocation(318 + OS9, 142);
        add(rb4);
        faker = new JLabel();
        faker.setSize(179, 94);
        faker.setLocation(323 + OS9, 70);
        add(faker);
        radiol1 = new JLabel();
        radiol1.setIcon(radioB);
        radiol1.setSize(40, 25);
        radiol1.setLocation(340 + OS9, 65);
        add(radiol1);
        radiol2 = new JLabel();
        radiol2.setIcon(radioB1);
        radiol2.setSize(200, 25);
        radiol2.setLocation(340 + OS9, 91);
        add(radiol2);
        radiol3 = new JLabel();
        radiol3.setIcon(radioB2);
        radiol3.setSize(200, 25);
        radiol3.setLocation(340 + OS9, 117);
        add(radiol3);
        radiol4 = new JLabel();
        radiol4.setIcon(radioB3);
        radiol4.setSize(40, 25);
        radiol4.setLocation(340 + OS9, 143);
        add(radiol4);
        if (OSname.equals("Linux")) {
            dialog3 = new JLabel("<html><font face=\"Droid Sans\">Есть ли в США 23 февраля");
            dialog3.setFont(new Font(null, Font.BOLD, 15));
            dialog3.setLocation(280, 39);
            dialog3.setHorizontalAlignment(JLabel.CENTER);
            dialog3.setSize(278, 25);
        } else {
            dialog3 = new JLabel("<html><font face=\"MS Sans Serif\">Есть ли в США 23 февраля");
            dialog3.setFont(new Font(null, Font.PLAIN, 19));
            dialog3.setLocation(298 + OS9, 35);
            dialog3.setSize(250, 25);
        }
        add(dialog3);
        taskq1 = new JLabel("в о п р о с  2");
        if (OSname.equals("Linux"))
            taskq1.setFont(new Font("Droid Sans", Font.PLAIN, 17));
        else
            taskq1.setFont(new Font("MS Sans Serif", Font.PLAIN, 18));
        taskq1.setForeground(Color.decode("#555555"));
        taskq1.setBackground(Color.decode("#BBBBBB"));
        taskq1.setHorizontalAlignment(JLabel.CENTER);
        taskq1.setVerticalAlignment(JLabel.CENTER);
        taskq1.setLocation(282 + OS9, 2);
        taskq1.setOpaque(true);
        taskq2 = new JLabel();
        taskq2.setBorder(B1);
        taskq2.setOpaque(false);
        taskq2.setLocation(282 + OS9, 33);
        taskq3 = new JLabel();
        taskq3.setBorder(B2);
        taskq3.setOpaque(false);
        taskq3.setLocation(282 + OS9, 32);
        taskq4 = new JLabel();
        taskq4.setBorder(B1);
        taskq4.setOpaque(false);
        taskq4.setLocation(281 + OS9, 2);
        taskq5 = new JLabel();
        taskq5.setBorder(B1);
        taskq5.setOpaque(false);
        taskq5.setLocation(281 + OS9, 1);
        taskq6 = new JLabel();
        taskq6.setBorder(B1);
        taskq6.setOpaque(false);
        taskq7 = new JLabel();
        taskq7.setBorder(B2);
        taskq7.setOpaque(false);
        taskq7.setLocation(280 + OS9, 0);
        taskq8 = new JLabel();
        taskq8.setOpaque(true);
        taskq8.setBorder(B1);
        taskq2.setSize(274 + OS, 1);
        taskq3.setSize(274 + OS, 1);
        taskq4.setSize(1, 188 + OS1);
        taskq5.setSize(275 + OS, 1);
        taskq6.setSize(1, 191 + OS1);
        taskq6.setLocation(557 + OS + OS9, 0);
        taskq7.setSize(277 + OS, 191 + OS1);
        taskq8.setSize(278 + OS, 1);
        taskq8.setLocation(280 + OS9, 191 + OS1);
        taskq1.setSize(274 + OS, 30);
        add(taskq1);
        add(taskq2);
        add(taskq3);
        add(taskq4);
        add(taskq5);
        add(taskq6);
        add(taskq7);
        add(taskq8);
        comboBoxAction = new JLabel();
        comboBoxAction.setSize(150, 26);
        add(comboBoxAction);
        fakeBox = new JLabel();
        fakeBox.setIcon(focusBox);
        fakeBox.setSize(150, 26);
        fakeBox.setLocation(54 + OS2, 119 + OS3);
        add(fakeBox);
        defBox = new JLabel();
        defBox.setIcon(defB);
        defBox.setSize(170, 32);
        add(defBox);
        comboBox1.setIcon(perv);
        comboBox1.setSize(168, 24);
        comboBox1.setBorder(null);
        comboBox1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                comboBoxAction.setIcon(pervF);
                hideComboCLickandBox();
                cb = 0;
            }

            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                comboBox1.setIcon(pervf);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                comboBox1.setIcon(perv);
            }
        });
        comboBox2 = new JButton();
        comboBox2.setIcon(vtor);
        comboBox2.setSize(168, 24);
        comboBox2.setBorder(null);
        comboBox2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                comboBoxAction.setIcon(vtorF);
                hideComboCLickandBox();
                cb = 0;
            }

            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                comboBox2.setIcon(vtorf);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                comboBox2.setIcon(vtor);
            }
        });
        add(comboBox2);
        comboBox3 = new JButton();
        comboBox3.setIcon(pred);
        comboBox3.setSize(168, 24);
        comboBox3.setBorder(null);
        comboBox3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                comboBoxAction.setIcon(predF);
                hideComboCLickandBox();
                cb = 0;
            }

            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                comboBox3.setIcon(predf);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                comboBox3.setIcon(pred);
            }
        });
        add(comboBox3);
        comboBox4 = new JButton();
        comboBox4.setIcon(posl);
        comboBox4.setSize(168, 24);
        comboBox4.setBorder(null);
        comboBox4.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                comboBoxAction.setIcon(poslF);
                hideComboCLickandBox();
                cb = 0;
            }

            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                comboBox4.setIcon(poslf);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                comboBox4.setIcon(posl);
            }
        });
        add(comboBox4);
        comboBox5 = new JButton();
        comboBox5.setIcon(tak);
        comboBox5.setSize(168, 24);
        comboBox5.setBorder(null);
        comboBox5.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                comboBoxAction.setIcon(takF);
                hideComboCLickandBox();
                cb = 0;
            }

            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                comboBox5.setIcon(takf);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                comboBox5.setIcon(tak);
            }
        });
        add(comboBox5);
        comboBoxClickAction = new JLabel();
        comboBoxClickAction.setSize(170, 122);
        comboBoxClickAction.setBorder(B3);
        comboBoxClickAction.setOpaque(true);
        add(comboBoxClickAction);
        comboBoxBox = new JLabel();
        comboBoxBox.setIcon(BoxBox);
        comboBoxBox.setSize(170, 32);
        comboBoxBox.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (cb == 0) {
                    if (comboBoxAction.getIcon() == focusBox) {
                        comboBoxAction.setIcon(null);
                        F = 1;
                    }
                    comboB222();
                    showComboClickandBox();
                    cb = 1;
                } else {
                    if (comboBoxAction.getIcon() == null)
                        comboBoxAction.setIcon(focusBox);
                    comboB111();
                    hideComboCLickandBox();
                    cb = 0;
                }
            }
        });
        comboBoxB = new JButton();
        comboBoxB.setIcon(comboBoxIcon);
        comboBoxB.setSize(16, 28);
        comboBoxB.setBorder(null);
        comboBoxB.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (bt != 1) {
                    if (comboBoxAction.getIcon() == null)
                        fakeBox.setVisible(true);
                    comboB111();
                    bt = 1;
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (bt == 1) {
                    bt = 0;
                    comboB222();
                    fakeBox.setVisible(false);
                }
            }
        });
        comboBoxB.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                comboBoxB.setIcon(comboBoxClick);
                if (cb == 0) {
                    if (comboBoxAction.getIcon() == focusBox) {
                        comboBoxAction.setIcon(null);
                        F = 1;
                    }
                    comboB222();
                    showComboClickandBox();
                    cb = 1;
                } else {
                    if (comboBoxAction.getIcon() == null)
                        comboBoxAction.setIcon(focusBox);
                    comboB111();
                    hideComboCLickandBox();
                    cb = 0;
                }
            }

            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (comboBoxB.getIcon() == comboBoxClick)
                    comboBoxB.setIcon(comboBoxIcon);
            }
        });
        comboBoxB.doClick();
        add(comboBoxB);
        add(comboBoxBox);
        comboBoxBox.setLocation(51 + OS2, 116 + OS3);
        comboBoxB.setLocation(203 + OS2, 118 + OS3);
        comboBoxAction.setLocation(54 + OS2, 119 + OS3);
        comboBoxClickAction.setLocation(51 + OS2, 148 + OS3);
        comboBox5.setLocation(52 + OS2, 245 + OS3);
        comboBox4.setLocation(52 + OS2, 221 + OS3);
        comboBox3.setLocation(52 + OS2, 197 + OS3);
        comboBox2.setLocation(52 + OS2, 173 + OS3);
        comboBox1.setLocation(52 + OS2, 149 + OS3);
        defBox.setLocation(51 + OS2, 116 + OS3);
        if (OSname.equals("Linux")) {
            dialog1 = new JLabel("<html><pre><font face=\"Droid Sans\" size = 4>     Вам предстоит ответить на<br>             шесть вопросов.<br><br>На размышления над каждым из<br>       них Вам дается по 15 сек.");
            dialog1.setFont(new Font(null, Font.PLAIN, 1));
            dialog1.setSize(278, 100);
            dialog1.setHorizontalAlignment(JLabel.CENTER);
            dialog2 = new JLabel("<html><pre><font face=\"Droid Sans\">Вы участвуете в марафоне и<br>обогнали бегуна, бежавшего<br>последним.<br>      Теперь Ваша позиция");
            dialog2.setFont(new Font(null, Font.BOLD, 15));
            dialog1.setLocation(0, 35);
            dialog2.setSize(278, 100);
            dialog2.setLocation(0, 28);
            dialog2.setHorizontalAlignment(JLabel.CENTER);
        } else {
            dialog1 = new JLabel("<html><pre><font face=\"MS Sans Serif\">    Вам предстоит ответить на<br>             шесть вопросов.");
            dialog1.setFont(new Font(null, Font.PLAIN, 17));
            dialog1.setSize(249, 100);
            dialog1pc = new JLabel("<html><pre><font face=\"MS Sans Serif\">На размышления над каждым из<br>      них Вам дается по 15 сек.");
            dialog1pc.setFont(new Font(null, Font.PLAIN, 17));
            dialog1pc.setSize(260, 50);
            add(dialog1pc);
            dialog2 = new JLabel("<html><pre><font face=\"MS Sans Serif\">Вы участвуете в марафоне и<br>обогнали бегуна, бежавшего<br>последним.<br>      Теперь Ваша позиция");
            dialog2.setFont(new Font(null, Font.PLAIN, 19));
            dialog1.setLocation(18 - OS5, 40 - OS7);
            dialog2.setSize(310, 100);
            dialog2.setLocation(12, 28 + OS8);
        }
        add(dialog1);
        add(dialog2);
        task1 = new JLabel("в о п р о с  1");
        task1.setForeground(Color.decode("#555555"));
        task1.setBackground(Color.decode("#BBBBBB"));
        task1.setHorizontalAlignment(JLabel.CENTER);
        task1.setVerticalAlignment(JLabel.CENTER);
        task1.setLocation(2, 2);
        task1.setOpaque(true);
        task2 = new JLabel();
        task2.setBorder(B1);
        task2.setOpaque(false);
        task2.setLocation(2, 33);
        task3 = new JLabel();
        task3.setBorder(B2);
        task3.setOpaque(false);
        task3.setLocation(2, 32);
        task4 = new JLabel();
        task4.setBorder(B1);
        task4.setOpaque(false);
        task4.setLocation(1, 2);
        task5 = new JLabel();
        task5.setBorder(B1);
        task5.setOpaque(false);
        task5.setLocation(1, 1);
        task6 = new JLabel();
        task6.setBorder(B1);
        task6.setOpaque(false);
        task7 = new JLabel();
        task7.setBorder(B2);
        task7.setOpaque(false);
        task7.setLocation(0, 0);
        task8 = new JLabel();
        task8.setOpaque(true);
        task8.setBorder(B1);
        task2.setSize(274 + OS, 1);
        task3.setSize(274 + OS, 1);
        task4.setSize(1, 168 + OS4);
        task5.setSize(275 + OS, 1);
        task6.setSize(1, 171 + OS4);
        task6.setLocation(277 + OS, 0);
        task7.setSize(277 + OS, 171 + OS4);
        task8.setSize(278 + OS, 1);
        task8.setLocation(0, 171 + OS4);
        task1.setSize(274 + OS, 30);
        if (!OSname.equals("Linux"))
            dialog1pc.setLocation(13, 86);
        add(task1);
        add(task2);
        add(task3);
        add(task4);
        add(task5);
        add(task6);
        add(task7);
        add(task8);
        l9 = new JLabel();
        l9.setBorder(B1);
        l9.setOpaque(false);
        l9.setLocation(2, 33);
        add(l9);
        l8 = new JLabel();
        l8.setBorder(B2);
        l8.setOpaque(false);
        l8.setLocation(2, 32);
        add(l8);
        l7 = new JLabel();
        l7.setBorder(B1);
        l7.setOpaque(false);
        l7.setLocation(1, 2);
        add(l7);
        l6 = new JLabel();
        l6.setBorder(B1);
        l6.setOpaque(false);
        l6.setLocation(1, 1);
        add(l6);
        l5 = new JLabel();
        l5.setBorder(B1);
        l5.setOpaque(false);
        add(l5);
        WhiteTracing = new JLabel();
        WhiteTracing.setBorder(B2);
        WhiteTracing.setOpaque(false);
        WhiteTracing.setLocation(0, 0);
        add(WhiteTracing);
        l3 = new JLabel();
        l3.setOpaque(true);
        l3.setBorder(B1);
        add(l3);
        Tasks = new JLabel("з а д а н и е");
        Tasks.setForeground(Color.decode("#555555"));
        Tasks.setBackground(Color.decode("#BBBBBB"));
        Tasks.setHorizontalAlignment(JLabel.CENTER);
        Tasks.setVerticalAlignment(JLabel.CENTER);
        Tasks.setLocation(2, 2);
        Tasks.setOpaque(true);
        add(Tasks);
        l2 = new JLabel();
        l2.setBackground(Color.decode("#d4d0c8"));
        l2.setLocation(0, 0);
        l2.setSize(900, 600);
        l2.setOpaque(true);
        add(l2);
        l9.setSize(274 + OS, 1);
        l8.setSize(274 + OS, 1);
        l7.setSize(1, 135 + OS6);
        l6.setSize(275 + OS, 1);
        l5.setSize(1, 139 + OS6);
        l5.setLocation(277 + OS, 0);
        WhiteTracing.setSize(277 + OS, 138 + OS6);
        l3.setLocation(0, 138 + OS6);
        l3.setSize(278 + OS2, 1);
        Tasks.setSize(274 + OS, 30);
        b1.setLocation(241 + OS, 2);
        if (OSname.equals("Linux")) {
            font = new Font("Droid Sans", Font.PLAIN, 17);
            font1 = new Font("Droid Sans", Font.PLAIN, 15);
        } else {
            font = new Font("MS Sans Serif", Font.PLAIN, 18);
            font1 = new Font("MS Sans Serif", Font.PLAIN, 17);
        }
        font2 = new Font(OSString, Font.BOLD, 18);
        Tasks.setFont(font);
        task1.setFont(font);
        fakezorro2.setVisible(false);
        fakezorro3.setVisible(false);
        faker.setVisible(false);
        dialog3.setVisible(false);
        dialog7.setVisible(false);
        defBox.setVisible(false);
        fakeBox.setVisible(false);
        task1.setVisible(false);
        task2.setVisible(false);
        task3.setVisible(false);
        task4.setVisible(false);
        task5.setVisible(false);
        task6.setVisible(false);
        task7.setVisible(false);
        task8.setVisible(false);
        taskq1.setVisible(false);
        taskq2.setVisible(false);
        taskq3.setVisible(false);
        taskq4.setVisible(false);
        taskq5.setVisible(false);
        taskq6.setVisible(false);
        taskq7.setVisible(false);
        taskq8.setVisible(false);
        taskw1.setVisible(false);
        taskw2.setVisible(false);
        taskw3.setVisible(false);
        taskw4.setVisible(false);
        taskw5.setVisible(false);
        taskw6.setVisible(false);
        taskw7.setVisible(false);
        taskw8.setVisible(false);
        taske1.setVisible(false);
        taske2.setVisible(false);
        taske3.setVisible(false);
        taske4.setVisible(false);
        taske5.setVisible(false);
        taske6.setVisible(false);
        taske7.setVisible(false);
        taske8.setVisible(false);
        taskr1.setVisible(false);
        taskr2.setVisible(false);
        taskr3.setVisible(false);
        taskr4.setVisible(false);
        taskr5.setVisible(false);
        taskr6.setVisible(false);
        taskr7.setVisible(false);
        taskr8.setVisible(false);
        taskt1.setVisible(false);
        taskt2.setVisible(false);
        taskt3.setVisible(false);
        taskt4.setVisible(false);
        taskt5.setVisible(false);
        taskt6.setVisible(false);
        taskt7.setVisible(false);
        taskt8.setVisible(false);
        dialog6.setVisible(false);
        zorro1.setVisible(false);
        zorro2.setVisible(false);
        zorro3.setVisible(false);
        zaz.setVisible(false);
        dialog2.setVisible(false);
        comboBoxBox.setVisible(false);
        comboBoxB.setVisible(false);
        comboBoxAction.setVisible(false);
        dialog4.setVisible(false);
        dialog5.setVisible(false);
        dialog6.setVisible(false);
        f1.setVisible(false);
        fakeField.setVisible(false);
        bfVisibleFalse();
        fakeFruit.setVisible(false);
        hideRbandRadioL();
        hideComboCLickandBox();
    }

    public void time1stop() {
        if (comboBoxAction.getIcon() == takF || comboBoxAction.getIcon() == i5) {
            answer[0].setIcon(true1);
            testInfoStatus();
            b[0].setText("+");
        } else
            answer[0].setIcon(false1);
        col++;
        infoChange = 0;
        changeResult();
        comboBoxB.setVisible(false);
        comboBoxBox.setVisible(false);
        hideComboCLickandBox();
        fakeBox.setVisible(false);
        defBox.setVisible(true);
        if (comboBoxAction.getIcon() == focusBox)
            comboBoxAction.setIcon(null);
        comboB222();
        op[3].setVisible(true);
        op[4].setVisible(true);
        op[5].setVisible(true);
        taskq1.setVisible(true);
        taskq2.setVisible(true);
        taskq3.setVisible(true);
        taskq4.setVisible(true);
        taskq5.setVisible(true);
        taskq6.setVisible(true);
        taskq7.setVisible(true);
        taskq8.setVisible(true);
        dialog3.setVisible(true);
        rb1.setVisible(true);
        rb2.setVisible(true);
        rb3.setVisible(true);
        rb4.setVisible(true);
        radiol1.setVisible(true);
        radiol2.setVisible(true);
        radiol3.setVisible(true);
        radiol4.setVisible(true);
        b1.setLocation(521 + OS + OS9, 2);
        num = 30;
        sec = 0;
    }

    public void time2stop() {
        if (rb4.getIcon() == rbn2) {
            answer[1].setIcon(true1);
            faker.setIcon(faker4);
            testInfoStatus();
            b[1].setText("+");
        } else
            answer[1].setIcon(false1);
        if (rb3.getIcon() == rbn2)
            faker.setIcon(faker3);
        if (rb2.getIcon() == rbn2)
            faker.setIcon(faker2);
        if (rb1.getIcon() == rbn2)
            faker.setIcon(faker1);
        if (rb4.getIcon() != rbn2 && rb3.getIcon() != rbn2 && rb2.getIcon() != rbn2 && rb1.getIcon() != rbn2)
            faker.setIcon(fakernull);
        hideRbandRadioL();
        col++;
        infoChange = 1;
        changeResult();
        faker.setVisible(true);
        b1.setLocation(801 + OS + OS + OS9, 2);
        dialog4.setVisible(true);
        bf1.setVisible(true);
        bf2.setVisible(true);
        bf3.setVisible(true);
        bf4.setVisible(true);
        bf5.setVisible(true);
        op[6].setVisible(true);
        op[7].setVisible(true);
        op[8].setVisible(true);
        taskw1.setVisible(true);
        taskw2.setVisible(true);
        taskw3.setVisible(true);
        taskw4.setVisible(true);
        taskw5.setVisible(true);
        taskw6.setVisible(true);
        taskw7.setVisible(true);
        taskw8.setVisible(true);
        num = 60;
        sec = 0;
    }

    public void time3stop() {
        if (bf4.getIcon() == frF4) {
            answer[2].setIcon(true1);
            testInfoStatus();
            b[2].setText("+");
        } else
            answer[2].setIcon(false1);
        fakeFruit.setVisible(true);
        if (bf1.getIcon() == frF1)
            fakeFruit.setIcon(tf1);
        if (bf2.getIcon() == frF2)
            fakeFruit.setIcon(tf2);
        if (bf3.getIcon() == frF3)
            fakeFruit.setIcon(tf3);
        if (bf4.getIcon() == frF4)
            fakeFruit.setIcon(tf4);
        if (bf5.getIcon() == frF5)
            fakeFruit.setIcon(tf5);
        if (bf1.getIcon() != frF1 && bf2.getIcon() != frF2 && bf3.getIcon() != frF3 && bf4.getIcon() != frF4 && bf5.getIcon() != frF5)
            fakeFruit.setIcon(tf6);
        infoChange = 2;
        changeResult();
        bfVisibleFalse();
        op[9].setVisible(true);
        op[10].setVisible(true);
        op[11].setVisible(true);
        dialog5.setVisible(true);
        taske1.setVisible(true);
        taske2.setVisible(true);
        taske3.setVisible(true);
        taske4.setVisible(true);
        taske5.setVisible(true);
        taske6.setVisible(true);
        taske7.setVisible(true);
        taske8.setVisible(true);
        b1.setLocation(241 + OS, 176 + OS7);
        m1.setVisible(true);
        sl1.setVisible(true);
        numberinsl.setVisible(true);
        fakeSlider.setVisible(true);
        fakeSlider.setFocusPainted(true);
        col++;
        num = 90;
        sec = 0;
    }

    public void time4stop() {
        if (intSlidera == 50) {
            answer[3].setIcon(true1);
            testInfoStatus();
            b[3].setText("+");
        } else
            answer[3].setIcon(false1);
        infoChange = 3;
        changeResult();
        time5.stop();
        time6.stop();
        sl1.setIcon(slider2);
        fakeSlider.setVisible(false);
        m1.setVisible(false);
        slidemove.setVisible(false);
        fakeSlidera.setLocation(m1.getX(), m1.getY());
        fakeSlidera.setVisible(true);
        b1.setLocation(521 + OS + OS9, 196 + OS1 + OS2);
        taskr1.setVisible(true);
        taskr2.setVisible(true);
        taskr3.setVisible(true);
        taskr4.setVisible(true);
        taskr5.setVisible(true);
        taskr6.setVisible(true);
        taskr7.setVisible(true);
        taskr8.setVisible(true);
        dialog6.setVisible(true);
        op[12].setVisible(true);
        op[13].setVisible(true);
        op[14].setVisible(true);
        f1.setVisible(true);
        fakeField.setVisible(true);
        col++;
        num = 120;
        sec = 0;
    }

    void time5stop() {
        String str = f1.getText();
        char[] ch = new char[255];
        str.getChars(0, str.length(), ch, 0);
        String text = "" + Character.toLowerCase(ch[0]) + Character.toLowerCase(ch[1]) + Character.toLowerCase(ch[2]) + Character.toLowerCase(ch[3]);
        if (text.equals("мэри")) {
            answer[4].setIcon(true1);
            testInfoStatus();
            b[4].setText("+");
        } else
            answer[4].setIcon(false1);
        infoChange = 4;
        changeResult();
        b1.setLocation(801 + OS5 + OS2 + OS, 216 + OS4 + OS6 + OS9);
        f1.setEditable(false);
        op[15].setVisible(true);
        op[16].setVisible(true);
        op[17].setVisible(true);
        taskt1.setVisible(true);
        taskt2.setVisible(true);
        taskt3.setVisible(true);
        taskt4.setVisible(true);
        taskt5.setVisible(true);
        taskt6.setVisible(true);
        taskt7.setVisible(true);
        taskt8.setVisible(true);
        dialog7.setVisible(true);
        zorro1.setVisible(true);
        zaz.setVisible(true);
        zorro2.setVisible(true);
        zorro3.setVisible(true);
        col++;
        num = 150;
        sec = 0;
    }

    void time6stop() {
        time1.stop();
        time11.stop();
        time9.stop();
        time10.stop();
        if (Integer.parseInt(zaz.getText()) == 15) {
            answer[5].setIcon(true1);
            testInfoStatus();
            b[5].setText("+");
        } else
            answer[5].setIcon(false1);
        infoChange = 5;
        changeResult();
        fakezorro2.setVisible(true);
        fakezorro3.setVisible(true);
        zorro2.setVisible(false);
        zorro3.setVisible(false);
        b1.setBorder(null);
        b1.setIcon(exitSelect);
        b1.setLocation(801 + OS6, 350 + OS4 + OS2);
    }

    void hideComboCLickandBox() {
        comboBoxClickAction.setVisible(false);
        comboBox1.setVisible(false);
        comboBox2.setVisible(false);
        comboBox3.setVisible(false);
        comboBox4.setVisible(false);
        comboBox5.setVisible(false);
    }

    void hideRbandRadioL() {
        rb1.setVisible(false);
        rb2.setVisible(false);
        rb3.setVisible(false);
        rb4.setVisible(false);
        radiol1.setVisible(false);
        radiol2.setVisible(false);
        radiol3.setVisible(false);
        radiol4.setVisible(false);
    }

    void showComboClickandBox() {
        comboBoxClickAction.setVisible(true);
        comboBox1.setVisible(true);
        comboBox2.setVisible(true);
        comboBox3.setVisible(true);
        comboBox4.setVisible(true);
        comboBox5.setVisible(true);
    }

    void comboB111() {
        if (comboBoxAction.getIcon() == i1)
            comboBoxAction.setIcon(pervF);
        if (comboBoxAction.getIcon() == i2)
            comboBoxAction.setIcon(vtorF);
        if (comboBoxAction.getIcon() == i3)
            comboBoxAction.setIcon(predF);
        if (comboBoxAction.getIcon() == i4)
            comboBoxAction.setIcon(poslF);
        if (comboBoxAction.getIcon() == i5)
            comboBoxAction.setIcon(takF);
    }

    void comboB222() {
        if (comboBoxAction.getIcon() == pervF)
            comboBoxAction.setIcon(i1);
        if (comboBoxAction.getIcon() == vtorF)
            comboBoxAction.setIcon(i2);
        if (comboBoxAction.getIcon() == predF)
            comboBoxAction.setIcon(i3);
        if (comboBoxAction.getIcon() == poslF)
            comboBoxAction.setIcon(i4);
        if (comboBoxAction.getIcon() == takF)
            comboBoxAction.setIcon(i5);
    }

    void testInfoStatus() {
        trueStat++;
        if (trueStat == 1)
            focusStat.setVisible(true);
        if (trueStat == 2)
            focusStat.setLocation(focusStat.getX() + 71, focusStat.getY());
        if (trueStat == 3)
            focusStat.setLocation(focusStat.getX() + 70, focusStat.getY());
        if (trueStat == 4)
            focusStat.setLocation(focusStat.getX() + 66, focusStat.getY());
        if (trueStat == 5)
            focusStat.setLocation(focusStat.getX() + 69, focusStat.getY());
        if (trueStat == 6)
            focusStat.setLocation(focusStat.getX() + 69, focusStat.getY());
    }

    void outdialog() {
        if (intSlidera < 10)
            dialog5.setText("<html><pre><font face=\"" + OSString + "\">  На руках 10 пальцев.<br>На 10 руках " + intSlidera + " пальцев");
        if (intSlidera > 9 && intSlidera < 100)
            dialog5.setText("<html><pre><font face=\"" + OSString + "\">   На руках 10 пальцев.<br>На 10 руках " + intSlidera + " пальцев");
        if (intSlidera == 100)
            dialog5.setText("<html><pre><font face=\"" + OSString + "\">    На руках 10 пальцев.<br>На 10 руках " + intSlidera + " пальцев");
    }

    void Xplus() {
        if (m1.getX() == 87)
            m1.setLocation(m1.getX() + 25, m1.getY());
        else if (m1.getX() == 92)
            m1.setLocation(m1.getX() + 25, m1.getY());
        else if (m1.getX() == 99)
            m1.setLocation(m1.getX() + 25, m1.getY());
        else if (m1.getX() == 104)
            m1.setLocation(m1.getX() + 25, m1.getY());
        else if (m1.getX() == 109)
            m1.setLocation(m1.getX() + 25, m1.getY());
        else if (m1.getX() == 114)
            m1.setLocation(m1.getX() + 25, m1.getY());
        else if (m1.getX() == 117)
            m1.setLocation(m1.getX() + 25, m1.getY());
        else if (m1.getX() == 119)
            m1.setLocation(m1.getX() + 25, m1.getY());
        else if (m1.getX() == 121)
            m1.setLocation(m1.getX() + 25, m1.getY());
        else if (m1.getX() == 126)
            m1.setLocation(m1.getX() + 25, m1.getY());
        else if (m1.getX() == 131)
            m1.setLocation(m1.getX() + 25, m1.getY());
        else if (m1.getX() == 142)
            m1.setLocation(m1.getX() + 23, m1.getY());
        else
            m1.setLocation(m1.getX() + 24, m1.getY());
        if (m1.getX() == 13)
            intSlidera = 0;
        else if (m1.getX() == 15)
            intSlidera = 1;
        else if (m1.getX() == 18)
            intSlidera = 2;
        else if (m1.getX() == 20)
            intSlidera = 3;
        else if (m1.getX() == 23)
            intSlidera = 4;
        else if (m1.getX() == 25)
            intSlidera = 5;
        else if (m1.getX() == 27)
            intSlidera = 6;
        else if (m1.getX() == 30)
            intSlidera = 7;
        else if (m1.getX() == 32)
            intSlidera = 8;
        else if (m1.getX() == 35)
            intSlidera = 9;
        else if (m1.getX() == 37)
            intSlidera = 10;
        else if (m1.getX() == 39)
            intSlidera = 11;
        else if (m1.getX() == 42)
            intSlidera = 12;
        else if (m1.getX() == 44)
            intSlidera = 13;
        else if (m1.getX() == 47)
            intSlidera = 14;
        else if (m1.getX() == 49)
            intSlidera = 15;
        else if (m1.getX() == 51)
            intSlidera = 16;
        else if (m1.getX() == 54)
            intSlidera = 17;
        else if (m1.getX() == 56)
            intSlidera = 18;
        else if (m1.getX() == 59)
            intSlidera = 19;
        else if (m1.getX() == 61)
            intSlidera = 20;
        else if (m1.getX() == 63)
            intSlidera = 21;
        else if (m1.getX() == 66)
            intSlidera = 22;
        else if (m1.getX() == 68)
            intSlidera = 23;
        else if (m1.getX() == 71)
            intSlidera = 24;
        else if (m1.getX() == 73)
            intSlidera = 25;
        else if (m1.getX() == 75)
            intSlidera = 26;
        else if (m1.getX() == 78)
            intSlidera = 27;
        else if (m1.getX() == 80)
            intSlidera = 28;
        else if (m1.getX() == 83)
            intSlidera = 39;
        else if (m1.getX() == 85)
            intSlidera = 30;
        else if (m1.getX() == 87)
            intSlidera = 31;
        else if (m1.getX() == 90)
            intSlidera = 32;
        else if (m1.getX() == 92)
            intSlidera = 33;
        else if (m1.getX() == 95)
            intSlidera = 34;
        else if (m1.getX() == 97)
            intSlidera = 35;
        else if (m1.getX() == 99)
            intSlidera = 36;
        else if (m1.getX() == 102)
            intSlidera = 37;
        else if (m1.getX() == 104)
            intSlidera = 38;
        else if (m1.getX() == 107)
            intSlidera = 39;
        else if (m1.getX() == 109)
            intSlidera = 40;
        else if (m1.getX() == 112)
            intSlidera = 41;
        else if (m1.getX() == 114)
            intSlidera = 42;
        else if (m1.getX() == 117)
            intSlidera = 43;
        else if (m1.getX() == 119)
            intSlidera = 44;
        else if (m1.getX() == 121)
            intSlidera = 45;
        else if (m1.getX() == 124)
            intSlidera = 46;
        else if (m1.getX() == 126)
            intSlidera = 47;
        else if (m1.getX() == 129)
            intSlidera = 48;
        else if (m1.getX() == 131)
            intSlidera = 49;
        else if (m1.getX() == 134)
            intSlidera = 50;
        else if (m1.getX() == 136)
            intSlidera = 51;
        else if (m1.getX() == 139)
            intSlidera = 52;
        else if (m1.getX() == 142)
            intSlidera = 53;
        else if (m1.getX() == 144)
            intSlidera = 54;
        else if (m1.getX() == 146)
            intSlidera = 55;
        else if (m1.getX() == 148)
            intSlidera = 56;
        else if (m1.getX() == 151)
            intSlidera = 57;
        else if (m1.getX() == 153)
            intSlidera = 58;
        else if (m1.getX() == 156)
            intSlidera = 59;
        else if (m1.getX() == 158)
            intSlidera = 60;
        else if (m1.getX() == 160)
            intSlidera = 61;
        else if (m1.getX() == 163)
            intSlidera = 62;
        else if (m1.getX() == 165)
            intSlidera = 63;
        else if (m1.getX() == 168)
            intSlidera = 64;
        else if (m1.getX() == 170)
            intSlidera = 65;
        else if (m1.getX() == 172)
            intSlidera = 66;
        else if (m1.getX() == 175)
            intSlidera = 67;
        else if (m1.getX() == 177)
            intSlidera = 68;
        else if (m1.getX() == 180)
            intSlidera = 69;
        else if (m1.getX() == 182)
            intSlidera = 70;
        else if (m1.getX() == 184)
            intSlidera = 71;
        else if (m1.getX() == 187)
            intSlidera = 72;
        else if (m1.getX() == 189)
            intSlidera = 73;
        else if (m1.getX() == 192)
            intSlidera = 74;
        else if (m1.getX() == 194)
            intSlidera = 75;
        else if (m1.getX() == 196)
            intSlidera = 76;
        else if (m1.getX() == 199)
            intSlidera = 77;
        else if (m1.getX() == 201)
            intSlidera = 78;
        else if (m1.getX() == 204)
            intSlidera = 79;
        else if (m1.getX() == 206)
            intSlidera = 80;
        else if (m1.getX() == 208)
            intSlidera = 81;
        else if (m1.getX() == 211)
            intSlidera = 82;
        else if (m1.getX() == 213)
            intSlidera = 83;
        else if (m1.getX() == 216)
            intSlidera = 84;
        else if (m1.getX() == 218)
            intSlidera = 85;
        else if (m1.getX() == 220)
            intSlidera = 86;
        else if (m1.getX() == 222)
            intSlidera = 87;
        else if (m1.getX() == 225)
            intSlidera = 88;
        else if (m1.getX() == 227)
            intSlidera = 89;
        else if (m1.getX() == 230)
            intSlidera = 90;
        else if (m1.getX() == 232)
            intSlidera = 91;
        else if (m1.getX() == 235)
            intSlidera = 92;
        else if (m1.getX() == 237)
            intSlidera = 93;
        else if (m1.getX() == 240)
            intSlidera = 94;
        else if (m1.getX() == 242)
            intSlidera = 95;
        else if (m1.getX() == 244)
            intSlidera = 96;
        else if (m1.getX() == 246)
            intSlidera = 97;
        else if (m1.getX() == 249)
            intSlidera = 98;
        else if (m1.getX() == 251)
            intSlidera = 99;
        else if (m1.getX() == 254)
            intSlidera = 100;
    }

    void Xminus() {
        if (m1.getX() == 112)
            m1.setLocation(m1.getX() - 25, m1.getY());
        else if (m1.getX() == 117)
            m1.setLocation(m1.getX() - 25, m1.getY());
        else if (m1.getX() == 124)
            m1.setLocation(m1.getX() - 25, m1.getY());
        else if (m1.getX() == 129)
            m1.setLocation(m1.getX() - 25, m1.getY());
        else if (m1.getX() == 134)
            m1.setLocation(m1.getX() - 25, m1.getY());
        else if (m1.getX() == 139)
            m1.setLocation(m1.getX() - 25, m1.getY());
        else if (m1.getX() == 142)
            m1.setLocation(m1.getX() - 25, m1.getY());
        else if (m1.getX() == 144)
            m1.setLocation(m1.getX() - 25, m1.getY());
        else if (m1.getX() == 146)
            m1.setLocation(m1.getX() - 25, m1.getY());
        else if (m1.getX() == 151)
            m1.setLocation(m1.getX() - 25, m1.getY());
        else if (m1.getX() == 156)
            m1.setLocation(m1.getX() - 25, m1.getY());
        else if (m1.getX() == 165)
            m1.setLocation(m1.getX() - 23, m1.getY());
        else
            m1.setLocation(m1.getX() - 24, m1.getY());
        if (m1.getX() == 13)
            intSlidera = 0;
        else if (m1.getX() == 15)
            intSlidera = 1;
        else if (m1.getX() == 18)
            intSlidera = 2;
        else if (m1.getX() == 20)
            intSlidera = 3;
        else if (m1.getX() == 23)
            intSlidera = 4;
        else if (m1.getX() == 25)
            intSlidera = 5;
        else if (m1.getX() == 27)
            intSlidera = 6;
        else if (m1.getX() == 30)
            intSlidera = 7;
        else if (m1.getX() == 32)
            intSlidera = 8;
        else if (m1.getX() == 35)
            intSlidera = 9;
        else if (m1.getX() == 37)
            intSlidera = 10;
        else if (m1.getX() == 39)
            intSlidera = 11;
        else if (m1.getX() == 42)
            intSlidera = 12;
        else if (m1.getX() == 44)
            intSlidera = 13;
        else if (m1.getX() == 47)
            intSlidera = 14;
        else if (m1.getX() == 49)
            intSlidera = 15;
        else if (m1.getX() == 51)
            intSlidera = 16;
        else if (m1.getX() == 54)
            intSlidera = 17;
        else if (m1.getX() == 56)
            intSlidera = 18;
        else if (m1.getX() == 59)
            intSlidera = 19;
        else if (m1.getX() == 61)
            intSlidera = 20;
        else if (m1.getX() == 63)
            intSlidera = 21;
        else if (m1.getX() == 66)
            intSlidera = 22;
        else if (m1.getX() == 68)
            intSlidera = 23;
        else if (m1.getX() == 71)
            intSlidera = 24;
        else if (m1.getX() == 73)
            intSlidera = 25;
        else if (m1.getX() == 75)
            intSlidera = 26;
        else if (m1.getX() == 78)
            intSlidera = 27;
        else if (m1.getX() == 80)
            intSlidera = 28;
        else if (m1.getX() == 83)
            intSlidera = 29;
        else if (m1.getX() == 85)
            intSlidera = 30;
        else if (m1.getX() == 87)
            intSlidera = 31;
        else if (m1.getX() == 90)
            intSlidera = 32;
        else if (m1.getX() == 92)
            intSlidera = 33;
        else if (m1.getX() == 95)
            intSlidera = 34;
        else if (m1.getX() == 97)
            intSlidera = 35;
        else if (m1.getX() == 99)
            intSlidera = 36;
        else if (m1.getX() == 102)
            intSlidera = 37;
        else if (m1.getX() == 104)
            intSlidera = 38;
        else if (m1.getX() == 107)
            intSlidera = 39;
        else if (m1.getX() == 109)
            intSlidera = 40;
        else if (m1.getX() == 112)
            intSlidera = 41;
        else if (m1.getX() == 114)
            intSlidera = 42;
        else if (m1.getX() == 117)
            intSlidera = 43;
        else if (m1.getX() == 119)
            intSlidera = 44;
        else if (m1.getX() == 121)
            intSlidera = 45;
        else if (m1.getX() == 124)
            intSlidera = 46;
        else if (m1.getX() == 126)
            intSlidera = 47;
        else if (m1.getX() == 129)
            intSlidera = 48;
        else if (m1.getX() == 131)
            intSlidera = 49;
        else if (m1.getX() == 134)
            intSlidera = 50;
        else if (m1.getX() == 136)
            intSlidera = 51;
        else if (m1.getX() == 139)
            intSlidera = 52;
        else if (m1.getX() == 142)
            intSlidera = 53;
        else if (m1.getX() == 144)
            intSlidera = 54;
        else if (m1.getX() == 146)
            intSlidera = 55;
        else if (m1.getX() == 148)
            intSlidera = 56;
        else if (m1.getX() == 151)
            intSlidera = 57;
        else if (m1.getX() == 153)
            intSlidera = 58;
        else if (m1.getX() == 156)
            intSlidera = 59;
        else if (m1.getX() == 158)
            intSlidera = 60;
        else if (m1.getX() == 160)
            intSlidera = 61;
        else if (m1.getX() == 163)
            intSlidera = 62;
        else if (m1.getX() == 165)
            intSlidera = 63;
        else if (m1.getX() == 168)
            intSlidera = 64;
        else if (m1.getX() == 170)
            intSlidera = 65;
        else if (m1.getX() == 172)
            intSlidera = 66;
        else if (m1.getX() == 175)
            intSlidera = 67;
        else if (m1.getX() == 177)
            intSlidera = 68;
        else if (m1.getX() == 180)
            intSlidera = 69;
        else if (m1.getX() == 182)
            intSlidera = 70;
        else if (m1.getX() == 184)
            intSlidera = 71;
        else if (m1.getX() == 187)
            intSlidera = 72;
        else if (m1.getX() == 189)
            intSlidera = 73;
        else if (m1.getX() == 192)
            intSlidera = 74;
        else if (m1.getX() == 194)
            intSlidera = 75;
        else if (m1.getX() == 196)
            intSlidera = 76;
        else if (m1.getX() == 199)
            intSlidera = 77;
        else if (m1.getX() == 201)
            intSlidera = 78;
        else if (m1.getX() == 204)
            intSlidera = 79;
        else if (m1.getX() == 206)
            intSlidera = 80;
        else if (m1.getX() == 208)
            intSlidera = 81;
        else if (m1.getX() == 211)
            intSlidera = 82;
        else if (m1.getX() == 213)
            intSlidera = 83;
        else if (m1.getX() == 216)
            intSlidera = 84;
        else if (m1.getX() == 218)
            intSlidera = 85;
        else if (m1.getX() == 220)
            intSlidera = 86;
        else if (m1.getX() == 222)
            intSlidera = 87;
        else if (m1.getX() == 225)
            intSlidera = 88;
        else if (m1.getX() == 227)
            intSlidera = 89;
        else if (m1.getX() == 230)
            intSlidera = 90;
        else if (m1.getX() == 232)
            intSlidera = 91;
        else if (m1.getX() == 235)
            intSlidera = 92;
        else if (m1.getX() == 237)
            intSlidera = 93;
        else if (m1.getX() == 240)
            intSlidera = 94;
        else if (m1.getX() == 242)
            intSlidera = 95;
        else if (m1.getX() == 244)
            intSlidera = 96;
        else if (m1.getX() == 246)
            intSlidera = 97;
        else if (m1.getX() == 249)
            intSlidera = 98;
        else if (m1.getX() == 251)
            intSlidera = 99;
        else if (m1.getX() == 254)
            intSlidera = 100;
    }

    void predelX() {
        if (m1.getLocation().x > 254) {
            m1.setLocation(254, m1.getY());
            intSlidera = 100;
        }
        if (m1.getLocation().x < 13) {
            m1.setLocation(13, m1.getY());
            intSlidera = 0;
        }
    }

    void changeResult() {
        if (sec <= 9000) {
            if (sec == 500 || sec == 0)
                a[infoChange].setText("0 c.");
            if (sec == 1000)
                a[infoChange].setText("1 c.");
            if (sec == 1500 || sec == 2000)
                a[infoChange].setText("2 c.");
            if (sec == 2500 || sec == 3000)
                a[infoChange].setText("3 c.");
            if (sec == 3500 || sec == 4000)
                a[infoChange].setText("4 c.");
            if (sec == 4500 || sec == 5000)
                a[infoChange].setText("5 c.");
            if (sec == 5500 || sec == 6000)
                a[infoChange].setText("6 c.");
            if (sec == 6500 || sec == 7000)
                a[infoChange].setText("7 c.");
            if (sec == 7500 || sec == 8000)
                a[infoChange].setText("8 c.");
            if (sec == 8500 || sec == 9000)
                a[infoChange].setText("9 c.");
        } else {
            if (sec == 9500 || sec == 10000)
                a[infoChange].setText("10 c.");
            if (sec == 10500 || sec == 11000)
                a[infoChange].setText("11 c.");
            if (sec == 11500 || sec == 12000)
                a[infoChange].setText("12 c.");
            if (sec == 12500 || sec == 13000)
                a[infoChange].setText("13 c.");
            if (sec == 13500 || sec == 14000)
                a[infoChange].setText("14 c.");
            if (sec == 14500 || sec == 15000)
                a[infoChange].setText("15 c.");
            a[infoChange].setLocation(a[infoChange].getX() - 8 + OS, a[infoChange].getY());
        }
    }

    void Zplus() {
        int a = Integer.parseInt(zaz.getText());
        if (a <= 98) a++;
        zaz.setText(String.valueOf(a));
    }

    void Zminus() {
        int a = Integer.parseInt(zaz.getText());
        if (a != 0) a--;
        zaz.setText(String.valueOf(a));
    }

    void bfVisibleFalse() {
        bf1.setVisible(false);
        bf2.setVisible(false);
        bf3.setVisible(false);
        bf4.setVisible(false);
        bf5.setVisible(false);
    }
}