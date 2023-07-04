/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Default
 */
public class Attendance {
    
    private String empNo;
    private String empLastName;
    private String empFirstName;
    private Date date;
    private Date timeIn;
    private Date timeOut;
    private int _month;
    private double totalHours;
    
    
    
    public void SetStudentNo(String EmployeeNo) {
        empNo = EmployeeNo;
    }
    
    public void  month(int Month) {
        _month = Month;
    }
    
     public double ComputeStudyHours() throws IOException, FileNotFoundException, CsvValidationException, ParseException {
        String filename = "StudentStudyHours.csv";
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        Calendar calendar = Calendar.getInstance();
        
        CSVReader reader = new CSVReader(new FileReader(filename));
        String[] header = reader.readNext();
        String[] studyHours;
        while((studyHours = reader.readNext()) != null) {
            Date date = dateFormat.parse(studyHours[1]); //01/23/2023
            calendar.setTime(date);
            int month = calendar.get(Calendar.MONTH);
            if(studyHours[0].equals(empNo) && _month == month) {
                timeIn = timeFormat.parse(studyHours[2]);
                timeOut = timeFormat.parse(studyHours[3]);
                totalHours += (timeOut.getTime() - timeIn.getTime()) / (60 * 60 * 1000);
            }
        }
        return totalHours;
    }
    
}
