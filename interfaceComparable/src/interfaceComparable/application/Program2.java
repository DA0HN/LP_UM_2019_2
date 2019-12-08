package interfaceComparable.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interfaceComparable.model.entities.Employee;

public class Program2 {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		String path = "E:\\JavaWorkspace\\interfaceComparable\\archive.csv";
		
		try (BufferedReader br = new BufferedReader( new FileReader(path) ) ){
			String employeeCSV = br.readLine();	// le uma linha do arquivo .csv	
			
			while( employeeCSV != null ) {
				// separa a String lida para cada virgula encontrada
				String[] fields = employeeCSV.split(",");
				list.add(new Employee(
							fields[0],
							Double.parseDouble(fields[1]) 
						));
				employeeCSV = br.readLine();
			}
			
			Collections.sort(list);
			
			for(Employee e : list) {
				System.out.println(e);
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage() );
		}
	}

}
