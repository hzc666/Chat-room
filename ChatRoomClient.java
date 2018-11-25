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
private JFrame jf;//窗体
private JTextArea jta;//聊天内容显示的文本域
private JTextField jtf;//自己输入内容的文本框
private JButton jb;//发送按钮
private JLabel label;//用户标签
private String name;//用户名
	public ChatRoomClient() {
	jf = new JFrame("聊天室客户端v1.0");
	
	String ip = JOptionPane.showInputDialog(jf,"请输入服务器地址:");
	int port = Integer.parseInt(JOptionPane.showInputDialog(jf,"请输入端口号:"));
	
	jta = new JTextArea(20,40);
	jta.setFont(new Font("行楷",Font.BOLD,24));//设置聊天内容文字的字体大小
	jta.setEditable(false);
	jtf = new JTextField(28);
	jb = new JButton("发送");//设置GUI发送按钮
	name = JOptionPane.showInputDialog(jf,"请输入您的名字:");//加入一个输入框
	label = new JLabel(name + ":");
	init();
}
	//创建一个init方法对整个窗体布局进行设计
	private void init() {
		JScrollPane jsp = new JScrollPane(jta);
		jf.add(jsp,BorderLayout.CENTER);
		
		JPanel panel = new JPanel();//创建一个JPanel面板
		panel.add(label);
		panel.add(jtf);
		panel.add(jb);
		
		jf.add(panel, BorderLayout.SOUTH);
	}

	}


