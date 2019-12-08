package crud.database;

import java.io.IOException;

public class DatabaseFactory {

	private static Database database = null;
	
	public static Database createConection(Boolean reset) throws IOException {
	
		if( database == null ) {
			return new Database(reset);
		}
		return database;
	}
	public static Database createConection(Boolean reset, String path) throws IOException {
		
		if( database == null ) {
			return new Database(reset, path);
		}
		return database;
	}
	
}
