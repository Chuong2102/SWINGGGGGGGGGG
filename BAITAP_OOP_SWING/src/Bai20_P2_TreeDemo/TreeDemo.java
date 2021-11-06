package Bai20_P2_TreeDemo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Bai20_P3_JTreeAndTreeModel.FileAndDirectoryOperations;
import Bai20_P3_JTreeAndTreeModel.FileTreeModel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.JTextArea;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.event.TreeSelectionEvent;

public class TreeDemo extends JFrame {

	private JPanel contentPane;
	FileTreeModel treeModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TreeDemo frame = new TreeDemo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TreeDemo() {
		
		//TreeDemoModel treeModel = new TreeDemoModel();
		treeModel = new FileTreeModel("E:\\Games");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
		);
		

		JTextArea textArea = new JTextArea();
		splitPane.setRightComponent(textArea);
		
		JTree tree = new JTree();
		tree.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent e) {
				DefaultMutableTreeNode node = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
				if(node == null)
					return;
				File nodeInfo = (File) node.getUserObject();
				FileAndDirectoryOperations fo = new FileAndDirectoryOperations();
				File[] list = fo.getDirectoryContent(nodeInfo.getPath());
				textArea.setText(fo.displayContent(list));
				
			}
		});
		splitPane.setLeftComponent(tree);
		
		tree.setModel(treeModel);
		
		contentPane.setLayout(gl_contentPane);
	}
}
