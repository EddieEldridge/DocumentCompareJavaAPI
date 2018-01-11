package ie.gmit.sw;

public class Shingle {
	
	// Create a fileID variable so we can differentiate between our files
	private int fileID;
	
	public Shingle(int fileID)
	{
		super();
		this.fileID = fileID;
	}
	
	// Getters and setters for our FileID
		public int getFileID() {
			return fileID;
		}
		
		public void setFileID(int fileID) {
		this.fileID = fileID;
	}

}
