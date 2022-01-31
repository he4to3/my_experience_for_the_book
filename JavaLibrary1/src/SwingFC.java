import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class SwingFC implements ActionListener {
    
    JTextField jtfFirst;
    JTextField jtfSecond;
    
    JButton jbtnComp;
    
    JLabel jlabFirst, jlabSecond;
    
    JLabel jlabResult;
    SwingFC() {
        // Создать новый контейнер(окно)
        JFrame jfrm = new JFrame("Сравнить файлы");
        // Задать объект для менеджера компоновки
        jfrm.setLayout(new FlowLayout());
        
        // Задать исходный размер
        jfrm.setSize(200, 190);
        
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Создать поля для ввода имен файлов
        jtfFirst = new JTextField(14);
        jtfSecond = new JTextField(14);
        
        //Задать команды действия для текстовых полей
        jtfFirst.setActionCommand("ФайлА");
        jtfSecond.setActionCommand("ФайлБ");
        
        //Создать кнопку сравнения
        JButton jbtnComp = new JButton("Сравнить");
        
        // Добавить слушателей события для кнопки
        jbtnComp.addActionListener(this);
        
        // Создать метки
        jlabFirst = new JLabel("Первый файл: ");
        jlabSecond = new JLabel("Второй файл: ");
        jlabResult = new JLabel("");
        
        //Добавить компоненты на панель содержимого
        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jbtnComp);
        jfrm.add(jlabResult);
        
        jfrm.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        int i=0, j=0;
        if(jtfFirst.getText().equals("")) {
            jlabResult.setText("Отсутствует имя первого файла.");
            return;
        }
        if(jtfSecond.getText().equals("")) {
            jlabResult.setText("Отсутствует имя второго файла.");
            return;
        }
        try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());
                FileInputStream f2 = new FileInputStream(jtfSecond.getText()))
        {
         do {
             i = f1.read();
             j = f2.read();
             if(i !=j) break;
         } while (i != -1 && j!=-1);
         
         if(i != j)
             jlabResult.setText("Файлы отличаются.");
         else 
             jlabResult.setText("Файлы одинаковы.");
        } catch (IOException exc) {
            jlabResult.setText("Ошибка файла");
        }
    }
    public static void main (String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            new SwingFC();
        }
    }
    );
}
}