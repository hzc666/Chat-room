import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatRoomClient {
private JFrame jf;//����
private JTextArea jta;//����������ʾ���ı���
private JTextField jtf;//�Լ��������ݵ��ı���
private JButton jb;//���Ͱ�ť
private JLabel label;//�û���ǩ
private String name;//�û���
	public ChatRoomClient() {
	jf = new JFrame("�����ҿͻ���v1.0");
	
	String ip = JOptionPane.showInputDialog(jf,"�������������ַ:");
	int port = Integer.parseInt(JOptionPane.showInputDialog(jf,"������˿ں�:"));
	
	jta = new JTextArea(20,40);
	jta.setFont(new Font("�п�",Font.BOLD,24));//���������������ֵ������С
	jta.setEditable(false);
	jtf = new JTextField(28);
	jb = new JButton("����");//����GUI���Ͱ�ť
	name = JOptionPane.showInputDialog(jf,"��������������:");//����һ�������
	label = new JLabel(name + ":");
	init();
}
	//����һ��init�������������岼�ֽ������
	private void init() {
		JScrollPane jsp = new JScrollPane(jta);
		jf.add(jsp,BorderLayout.CENTER);
		
		JPanel panel = new JPanel();//����һ��JPanel���
		panel.add(label);
		panel.add(jtf);
		panel.add(jb);
		
		jf.add(panel, BorderLayout.SOUTH);
	}

	}


