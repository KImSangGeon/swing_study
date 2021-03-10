package swing_study_component_table;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public abstract class  AbstractCustomTablePanel<T> extends JPanel {
	private JTable table;

	public AbstractCustomTablePanel() {

		initialize();
	}
	private void initialize() {
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(getModel());
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
	}
	public DefaultTableModel getModel() {
		CustomTableModel model = new CustomTableModel(getData(),getColumnNames());
		return model;
	}
	public Object[][] getData() {
		return new Object[][] {	{null, null, null},	};
	}
	
	public abstract String[] getColumnNames(); 
	
	public  void setList(List<T> list) {
		Object[][] data = new Object[list.size()][];
	for(int i = 0; i < data.length; i++) {
		data[i] = toArray(list.get(i));
	}
	CustomTableModel model = new CustomTableModel(data, getColumnNames());
	table.setModel(model);
	
	setAlignAndWidth();
	
	}	
	
	
	protected abstract void setAlignAndWidth();
	
	public void setTableCellWidth(int...width) {
		TableColumnModel tcm = table.getColumnModel();
		
		for(int i=0; i<width.length; i++) {
			tcm.getColumn(i).setPreferredWidth(width[i]);
		}
		
	}
	public void setTableCellAlign(int align, int...idx) {
		TableColumnModel tcm = table.getColumnModel();
		
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(align);
		
		for(int i=0; i<idx.length; i++) {
			tcm.getColumn(idx[i]).setCellRenderer(dtcr);
		}
		
	}
	
	protected abstract  Object[] toArray(T t);
	
	private class CustomTableModel extends DefaultTableModel{

		public CustomTableModel(Object[][] data, Object[] columnNames) {
			super(data, columnNames);
		}		
		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		
		}

	}
}



