package Tables;

public class ItemList {
	private 	int ID;
	private 	String description;
	private 	String iClass;
	private 	int iOrder;
	private 	int dropdownListID;
	
	public ItemList() {
		
	}
	
	public ItemList(int ID, String description) {
		this.ID = ID;
		this.description = description;
	}

	public String[] getColumnNames() {
		String[] arrays = {"ID", "Description", "Class", "Order"} ;
		return arrays;
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getiClass() {
		return iClass;
	}
	public void setiClass(String iClass) {
		this.iClass = iClass;
	}
	public int getiOrder() {
		return iOrder;
	}
	public void setiOrder(int iOrder) {
		this.iOrder = iOrder;
	}

	
	public int getDropdownListID() {
		return dropdownListID;
	}
	public void setDropdownListID(int dropdownListID) {
		this.dropdownListID = dropdownListID;
	}
	@Override
	public String toString() {
		return "ID=" + ID + ", description='" + description  + "', iOrder=" + iOrder
				+ ", dropdownListID='" + dropdownListID + "' LastModified = NOW() ";
	}

}
