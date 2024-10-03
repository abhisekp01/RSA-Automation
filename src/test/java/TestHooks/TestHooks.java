package TestHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TestHooks {

    private ByteArrayOutputStream consoleOutput;
    private PrintStream captureStream;

    @Before
    public void beforeScenario(Scenario scenario) {
        // Capture console output
        consoleOutput = new ByteArrayOutputStream();
        captureStream = new PrintStream(consoleOutput);
        System.setOut(captureStream);

        // Print scenario name to console
        System.out.println(scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario) {
        // Reset console output to default
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));

        // Write captured output to Excel
        ExcelReportGenerator.writeToExcel(scenario.getName(), consoleOutput.toString(), scenario.isFailed());
    }
}
