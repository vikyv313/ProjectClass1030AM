package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {
	public static void generateJvmReports(String jsonFile) {
		//Report-Loc
		File reportLoc = new File("C:\\Users\\DELL\\eclipse-workspace\\Greens\\FrameWork11AM\\target");
		//Configurations
		Configuration con = new Configuration(reportLoc, "FaceBook");
		con.addClassifications("Platform", "Windows 10");
		con.addClassifications("Sprint", "27");
		con.addClassifications("Author", "Greens");
		
		List<String> l = new ArrayList<String>();
		l.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(l, con);
		builder.generateReports();
	}
}
