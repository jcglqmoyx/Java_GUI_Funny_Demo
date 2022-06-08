import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Test extends JFrame {
    Icon img = new ImageIcon("src/images/1.png");
    Icon emoji1 = new ImageIcon("src/images/2.png");
    Icon emoji2 = new ImageIcon("src/images/3.png");
    Icon emoji3 = new ImageIcon("src/images/4.png");

    public Test() {
        super("来自对面的小哥哥");
        setLayout(new FlowLayout());

        JLabel textLabel1 = new JLabel("小姐姐我观察你很久了");
        textLabel1.setFont(new Font("宋体", Font.BOLD, 23));
        add(textLabel1);

        JLabel textLabel2 = new JLabel("做我女朋友好不好?");
        textLabel2.setFont(new Font("楷体", Font.BOLD, 40));
        add(textLabel2);

        JLabel imageLabel = new JLabel(img);
        imageLabel.setLocation(123, 124);
        add(imageLabel);

        JButton yes = new JButton("好");
        add(yes);
        JButton no = new JButton("不好");
        add(no);

        ButtonHandler1 handler1 = new ButtonHandler1();
        yes.addActionListener(handler1);
        ButtonHandler2 handler2 = new ButtonHandler2();
        no.addActionListener(handler2);
    }

    private class ButtonHandler1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(Test.this, "目标拿下哈哈");

        }
    }

    private class ButtonHandler2 implements ActionListener {
        private int flag = 0;

        @Override
        public void actionPerformed(ActionEvent event) {
            flag++;
            if (flag == 1) {
                JOptionPane.showMessageDialog(Test.this, "房产证上写你名", "做我女朋友好不好",
                        JOptionPane.INFORMATION_MESSAGE, emoji1);
                flag++;
            }
            if (flag == 3) {
                JOptionPane.showMessageDialog(Test.this, "保大", "做我女朋友好不好",
                        JOptionPane.INFORMATION_MESSAGE, emoji2);
                flag++;
            }
            if (flag == 5) {
                JOptionPane.showMessageDialog(Test.this, "我妈会游泳", "做我女朋友好不好",
                        JOptionPane.INFORMATION_MESSAGE, emoji3);
                flag = 0;
            }
        }

    }
}

public class TestDemo {
    public static void main(String[] args) {
        Test buttonFrame = new Test();
        buttonFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        buttonFrame.setResizable(false);
        buttonFrame.setFocusable(false);
        buttonFrame.setAlwaysOnTop(true);
        buttonFrame.setSize(600, 400);
        buttonFrame.setVisible(true);
        buttonFrame.setLocationRelativeTo(null);
    }
}