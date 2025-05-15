package Utils;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class SimpleCSVHelper {
    private List<String[]> data = new ArrayList<>();
    private String filePath;

    // Constructor - Reads CSV file
    public SimpleCSVHelper(String filePath) throws IOException {
        this.filePath = filePath;
        readCSV();
    }

    // Read CSV File
    private void readCSV() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line.split(",")); // Split by comma
            }
        }
    }
    
// // Update CSV Value with Index Validation
//    public void updateValue(int row, int col, String newValue) {
////        if (row >= data.size()) {
////            System.err.println("Error: Row index " + row + " is out of bounds.");
////           // return;
////        }
//        
//        String[] rowData = data.get(row);
//        
////        if (col >= rowData.length) {
////            System.err.println("Error: Column index " + col + " is out of bounds for row " + row);
////        //    return;
////        }
//        
//        // Update the value safely
//        rowData[col] = newValue;
//    }


    // Update CSV Value
    public void updateValue(int row, int col, String newValue) {
        if (row < data.size() && col < data.get(row).length) {
            data.get(row)[col] = newValue;
        }
    }

    // Save Updated CSV
    public void saveCSV(String savePath) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(savePath))) {
            for (String[] row : data) {
                bw.write(String.join(",", row));
                bw.newLine();
            }
        }
    }

    // Print CSV (For Debugging)
    public void printCSV() {
        for (String[] row : data) {
            System.out.println(Arrays.toString(row));
        }
    }
}
