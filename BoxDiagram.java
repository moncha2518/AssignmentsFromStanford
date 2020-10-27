import java.awt.event.*;
import acm.program.*;
import acm.graphics.*;
import javax.swing.*;
import java.util.*;



public class BoxDiagram extends GraphicsProgram {

	private JTextField nameTextField;
	private JTextField programTextField;
	private JButton addButtonName;
	private JButton removeButtonName;
	private JButton clearButtonName;
	private HashMap<String,GObject> contents;
	private GPoint last;
	private GObject currentObject;

	private static final double BOX_WIDTH=120;
	private static final double BOX_HEIGHT=50;

	public void run() {
		contents=new HashMap<String,GObject>();
		createBoxes();
		addActionListeners();
		addMouseListeners();
	}

	private void createBoxes() {
		nameTextField=new JTextField(30);
		nameTextField.addActionListener(this);		
		addButtonName=new JButton("Add");
		removeButtonName=new JButton("Remove");
		clearButtonName=new JButton("Clear");
	/*	
		add(new JLabel("Name"),SOUTH);
		
		add(nameTextField, SOUTH);
		add(addButtonName,SOUTH);
		add(removeButtonName,SOUTH);
		add(clearButtonName,SOUTH);
		*/
		add(new JLabel("Name"),NORTH);
		//add(new JLable())
		
		add(nameTextField, NORTH);
		add(addButtonName,NORTH);
		add(removeButtonName,NORTH);
		add(clearButtonName,NORTH);
		
	}
	public void actionPerformed(ActionEvent e) {
		Object sourcePosition=e.getSource();
		if (sourcePosition==addButtonName) {
			addBox(nameTextField.getText());
		} else if (sourcePosition==nameTextField) {
			addBox(nameTextField.getText());
		} else if (sourcePosition==removeButtonName) {
			removeBox(nameTextField.getText());
		} else if (sourcePosition==clearButtonName) {
			removeContents();
		}
	}
	private void removeBox(String name) {
		GObject objects=contents.get(name);
		if (objects !=null) {
			remove(objects);
		}
	}
	//Use Iterator
	private void removeContents() {
		Iterator<String> iterator=contents.keySet().iterator();
		while (iterator.hasNext()) {
			removeBox(iterator.next());
		}
		contents.clear();
		
	}
	private void addBox(String name) {
		GRect frame=new GRect(100,30);
		GLabel label=new GLabel(name);
		GCompound box=new GCompound();
		
		box.add(frame, -BOX_WIDTH/2, -BOX_HEIGHT/2);;  //object,x,y
		box.add(label, -label.getWidth()/2, -label.getAscent()/2);;
		add(box,getWidth()/2,getHeight()/2);
		contents.put(name, box);
		
	}
	public void mouseClicked(MouseEvent e) {
		if(currentObject!=null) currentObject.sendToFront();
	}
	public void mousePressed(MouseEvent e) {
		//last=new GPoint(e.getPoint());
		
		currentObject=getElementAt(last);
	}
	public void mouseDragged(MouseEvent e) {
		if (currentObject !=null) {
			currentObject.move(e.getX()-last.getX(),e.getY()-last.getY());			
			last = new GPoint(e.getPoint());
		}
	}
	
}
