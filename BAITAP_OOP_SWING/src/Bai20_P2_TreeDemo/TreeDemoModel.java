package Bai20_P2_TreeDemo;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.*;

public class TreeDemoModel implements TreeModel{

	public DefaultTreeModel getTree() {
		return tree;
	}

	public void setTree(DefaultTreeModel tree) {
		this.tree = tree;
	}

	public DefaultMutableTreeNode getRootNode() {
		return rootNode;
	}

	public void setRootNode(DefaultMutableTreeNode rootNode) {
		this.rootNode = rootNode;
	}

	DefaultTreeModel tree;
	DefaultMutableTreeNode rootNode;
	
	public TreeDemoModel (){
		rootNode = buildTree("Car&Motor");
		tree = new DefaultTreeModel(rootNode);
	}
	
	@Override
	public Object getRoot() {
		// TODO Auto-generated method stub
		return this.rootNode;
	}

	private DefaultMutableTreeNode buildTree (String rootName) {
		DefaultMutableTreeNode root = new DefaultMutableTreeNode(rootName);
		// Xay dung cac nut con cho nut root
		DefaultMutableTreeNode car = new DefaultMutableTreeNode("Car");
		DefaultMutableTreeNode motor = new DefaultMutableTreeNode("Motor");
		//Du^a vao` nu't root
		root.add(car);
		root.add(motor);
		//
		// Xay dung nut con cho car
		DefaultMutableTreeNode honda = new DefaultMutableTreeNode("Honda");
		DefaultMutableTreeNode toyota = new DefaultMutableTreeNode("Toyota");
		DefaultMutableTreeNode mazda = new DefaultMutableTreeNode("Mazda");
		//
		car.add(honda);
		car.add(toyota);
		car.add(mazda);
		//
		// Xay dung nut con cho motor
		DefaultMutableTreeNode suzuki = new DefaultMutableTreeNode("Suzuki");
		DefaultMutableTreeNode yamaha = new DefaultMutableTreeNode("Yamaha");
		//
		motor.add(suzuki);
		motor.add(yamaha);
		
		return root;
		
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
