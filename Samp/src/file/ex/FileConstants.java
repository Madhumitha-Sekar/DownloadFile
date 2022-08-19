package file.ex;

public enum FileConstants {
	LOCAL_FILE_PATH("C:\\Software\\Test.txt");
	private String value;

	public String getValue() {
		return value;
	}

	FileConstants(String value) {
		this.value = value;
	}

}
