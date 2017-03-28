
import javax.swing.*;


import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.DateTimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;
import com.github.lgooddatepicker.components.TimePickerSettings.TimeArea;
import com.github.lgooddatepicker.zinternaltools.InternalUtilities;

import java.awt.*;
import java.awt.event.*;
import java.time.DayOfWeek;
import java.time.LocalTime;




public class EnterTask implements ActionListener, ItemListener{
	static JFrame mainFrame;
	
	
	static JPanel mainPanel, headerPanel, namePanel, timePanel, durationPanel, lowerPanel, tagPanel;
	static JLabel headerLabel, tasklabel, taglabel, timelabel, datelabel, durationlabel;
	static JMenuBar menubar;
	static JMenu journal, report, newtask;
	static JButton saveButton, anotherbutton, deadlinebutton, projectbutton;
	static JTextField tasktext, durationtext, timetext;
	static JComboBox projectbox;
	static String projects[] = {"", "Swahili", "Connect", "Mary", "Laptop"};
	
	public static void main (String[]args){
		   new EnterTask();
		   //set size of components to fit the frame
		   mainFrame.pack();
		   
	   }
	
   public EnterTask()
   {
	   //JFrame set up
      mainFrame = new JFrame("Task Time");
      mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mainFrame.setSize(500, 400);
      mainFrame.setVisible(true);
      
      //main JPanel: holds all other JPanels
      mainPanel = new JPanel();
      mainPanel.setLayout(new GridLayout(4, 1));
      
      //Menu items
      journal = new JMenu("Developer's Journal");
      //journal.addActionListener(this);
      report = new JMenu("My Completion Progress");
      //report.addActionListener(this);
      newtask = new JMenu("New task");
      //newtask.addActionListener(this);
 
      menubar = new JMenuBar();
      menubar.add(newtask);
      menubar.add(journal);
      menubar.add(report);
      
  
      //headerPanel: for the header
      headerPanel = new JPanel();
      headerLabel = new JLabel("Today's Actions");

      namePanel = new JPanel();
      namePanel.setLayout(new GridLayout(3, 1));
      tasklabel = new JLabel("Task Name");
      tasktext = new JTextField();
      
      tagPanel = new JPanel();
      tagPanel.setLayout(new FlowLayout());
      taglabel = new JLabel("Tag a project");
      projectbox = new JComboBox(projects);
      //projectbox.addItemListener(this);
      
      projectbutton = new JButton("Start new Project");
      //projectbutton.addActionListener(this);
      
      //timePanel holds durationPanel: enter time and date for project
      timePanel = new JPanel();
      timePanel.setLayout(new FlowLayout(2));
      
      //setting up DateTime
      
      datelabel = new JLabel("Start Date and Time");
      //DatePicker
      DatePickerSettings datesettings = new DatePickerSettings();
      datesettings.setFirstDayOfWeek(DayOfWeek.MONDAY);
      
      //TimePicker
      TimePickerSettings timesettings = new TimePickerSettings();
      timesettings.setColor(TimeArea.TimePickerTextValidTime, Color.ORANGE);
      timesettings.initialTime = LocalTime.now();
      DateTimePicker dateTimePicker1 = new DateTimePicker(datesettings, timesettings); 
      
  
      //Duration Panel
      durationPanel = new JPanel(new FlowLayout(2));
      durationlabel = new JLabel("Duration of task");
      //TODO: set textfield size 
      durationtext = new JTextField(15);
      durationtext.setEditable(false);
      deadlinebutton = new JButton("Edit Deadline");
      
      lowerPanel = new JPanel();
      lowerPanel.setLayout(new FlowLayout());
      saveButton = new JButton("Save Task");
      anotherbutton = new JButton("Another Task");  
      
      headerPanel.add(headerLabel);
      namePanel.add(tasklabel);
      namePanel.add(tasktext);
      tagPanel.add(taglabel);
      tagPanel.add(projectbox);
      tagPanel.add(projectbutton);
      namePanel.add(tagPanel);
      timePanel.add(datelabel);
      timePanel.add(dateTimePicker1);     
      durationPanel.add(durationlabel);
      durationPanel.add(durationtext);
      durationPanel.add(deadlinebutton);
      timePanel.add(durationPanel);
      lowerPanel.add(saveButton);
      lowerPanel.add(anotherbutton);
      
      //add panels to mainPanel
      mainPanel.add(headerPanel);
      mainPanel.add(namePanel);
      mainPanel.add(timePanel);
      mainPanel.add(lowerPanel);
      
      //add mainPanel to frame
      mainFrame.add(mainPanel);
      mainFrame.setJMenuBar(menubar);
   }
   
   static void displayDaT(){
	   
   }
   
/* (non-Javadoc)
 * @see java.awt.event.ItemListener#itemStateChanged(java.awt.event.ItemEvent)
 */
@Override
public void itemStateChanged(ItemEvent arg0) {
	// TODO Auto-generated method stub
	
}
/* (non-Javadoc)
 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
 */
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
}