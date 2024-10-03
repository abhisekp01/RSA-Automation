package TestHooks;
import org.apache.poi.ss.usermodel.*;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	import java.io.FileOutputStream;
	import java.io.IOException;

public class ExcelReportGenerator {
	
	    private static final String[] COLUMNS = {"Scenario Name", "Console Output", "Status"};
	    private static Workbook workbook = new XSSFWorkbook();
	    private static Sheet sheet = workbook.createSheet("BDD Test Results");
	    private static int rowNum = 1; // Starting from row 1, row 0 will be header

	    static {
	        // Initialize Excel sheet with headers
	        Row headerRow = sheet.createRow(0);
	        for (int i = 0; i < COLUMNS.length; i++) {
	            Cell cell = headerRow.createCell(i);
	            cell.setCellValue(COLUMNS[i]);
	        }
	    }

	    public static void writeToExcel(String scenarioName, String consoleOutput, boolean isFailed) {
	        Row row = sheet.createRow(rowNum++);
	        row.createCell(0).setCellValue(scenarioName);
	        row.createCell(1).setCellValue(consoleOutput);
	        row.createCell(2).setCellValue(isFailed ? "Failed" : "Passed");

	        // Auto-size columns
	        for (int i = 0; i < COLUMNS.length; i++) {
	            sheet.autoSizeColumn(i);
	        }

	        // Write the output to an Excel file
	        try (FileOutputStream fileOut = new FileOutputStream("bdd_test_report.xlsx")) {
	            workbook.write(fileOut);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

