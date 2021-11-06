package Bai20_P3_JTreeAndTreeModel;

import javax.swing.tree.*;

import java.io.File;

import javax.swing.event.TreeModelListener;

public class FileTreeModel implements TreeModel{
	DefaultTreeModel tree;
	DefaultMutableTreeNode rootNode;
	
	public FileTreeModel(String rootDir) {
		//Khoi tao nut goc
		rootNode = new DefaultMutableTreeNode(new File(rootDir));
		//
		// Khoi tao cay
		buiDirectoryTree(rootNode, rootDir);
		tree = new DefaultTreeModel(rootNode);
		
	}
	
	public void buiDirectoryTree(DefaultMutableTreeNode node, String rootDir) {
		File curDir = new File(rootDir);
		
		if(!curDir.isDirectory()) {
			return;
		}
		File[] list = curDir.listFiles();
		//
		for(int i = 0; i < list.length; i++) {
			DefaultMutableTreeNode child = new DefaultMutableTreeNode(list[i]);
			node.add(child);
			buiDirectoryTree(child, rootDir + File.separator + list[i].getName());
		}
	}
	
	
	@Override
	public Object getRoot() {
		// TODO Auto-generated method stub
		return this.rootNode;
	}
	@Override
	public Object getChild(Object parent, int index) {
		// TODO Auto-generated method stub
		return tree.getChild(parent, index);
	}
	@Override
	public int getChildCount(Object parent) {
		// TODO Auto-generated method stub
		return tree.getChildCount(parent);
	}
	@Override
	public boolean isLeaf(Object node) {
		// TODO Auto-generated method stub
		return tree.isLeaf(node);
	}
	@Override
	public void valueForPathChanged(TreePath path, Object newValue) {
		// TODO Auto-generated method stub
		tree.valueForPathChanged(path, newValue);
	}
	@Override
	public int getIndexOfChild(Object parent, Object child) {
		// TODO Auto-generated method stub
		return tree.getIndexOfChild(parent, child);
	}
	@Override
	public void addTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub
		tree.addTreeModelListener(l);
	}
	@Override
	public void removeTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub
		tree.removeTreeModelListener(l);
	}
	
	
}	
