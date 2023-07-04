/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package classes;
/**
 *
 * @author aj bab
 */

/**
 * IMPORT CLASSES
 * This section contains the external classes to used to Create, Read, Update and Delete Student Records
 */
import java.io.FileWriter;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static java.util.Date.parse;
import static java.util.logging.Level.parse;
import javax.swing.table.DefaultTableModel;

public class Employee {
    /**
     * ATTRIBUTES
 This section contains the declaration of the attributes associated to 
 the Employee class
     */
    private String empId;
    private String empLName;
    private String empFName;
    private Date empBirthdate;
    private String empAddress;
    private String empPnumber;
    private String empSSSNo;
    private String empPhealthNo;
    private String empTINNo;
    private String empPagIbigNo;
    private String empStatus;
    private String empPosition;
    private String empISupervisor;
    private double empBasicSalary;
    private double empRiceSubsidy;
    private double empPhoneAllowance;
    private double empClothingAllowance;
    private double empGrossSalary;
    private double empHourlyRate;
    
    
    
  
    
 
    /**
     * CONSTRUCTOR METHODS
     */
    public Employee() {}
    public Employee(String empId, String empLName, String empFName, Date empBirthdate, String empAddress, String empPnumber, String empSSNo, String empPhealthNo, String empTINNo, String empPagIbigNo, String empStatus, String empPosition, String empISupervisor, double empBasicSalary, double empRiceSubsidy, double empPhoneAllowance, double empClothingAllowance, double empGrossSalary, double empHourlyRate){
        
        this.empId = empId;
        this.empLName = empLName;
        this.empFName = empFName;
        this.empBirthdate = empBirthdate;
        this.empAddress = empAddress;
        this.empPnumber = empPnumber;
        this.empSSSNo = empSSNo;
        this.empPhealthNo = empPhealthNo;
        this.empTINNo = empTINNo;
        this.empPagIbigNo = empPagIbigNo;
        this.empStatus = empStatus;
        this.empPosition = empPosition;
        this.empISupervisor = empISupervisor;
        this.empBasicSalary = empBasicSalary;
        this.empRiceSubsidy = empRiceSubsidy;
        this.empPhoneAllowance = empPhoneAllowance;
        this.empClothingAllowance = empClothingAllowance;
        this.empGrossSalary = empGrossSalary;
        this.empHourlyRate = empHourlyRate;
        
       
    }
    
    /**
     * GETTER AND SETTER METHODS
     * This section contains the declaration for the methods to be used for
     * accessing (get) and assigning (set) values to the attributes
     */
    //GETTER METHODS
    public String getEmpId(){
        return empId;
    }
    
    public String getEmpLName(){
        return empLName;
    }
    
     public String getEmpFName() {
        return empFName;
    }
     
       public Date getEmpBirthdate() {
        return empBirthdate;
    }  
       
    public String getEmpAddress() {
        return empAddress;
    }
    
    public String getEmpPnumber() {
        return empPnumber;
    }

    public String getEmpSSSNo() {
        return empSSSNo;
    }

    public String getEmpPhealthNo() {
        return empPhealthNo;
    }

    public String getEmpTINNo() {
        return empTINNo;
    }

    public String getEmpPagIbigNo() {
        return empPagIbigNo;
    }

    public String getEmpStatus() {
        return empStatus;
    }

    public String getEmpPosition() {
        return empPosition;
    }

    public String getEmpISupervisor() {
        return empISupervisor;
    }

    public double getEmpBasicSalary() {
        return empBasicSalary;
    }

    public double getEmpRiceSubsidy() {
        return empRiceSubsidy;
    }

    public double getEmpPhoneAllowance() {
        return empPhoneAllowance;
    }

    public double getEmpClothingAllowance() {
        return empClothingAllowance;
    }

    public double getEmpGrossSalary() {
        return empGrossSalary;
    }

    public double getEmpHourlyRate() {
        return empHourlyRate;
    }
    
  
    //SETTER METHODS
    public void setEmpId(String empId){
        this.empId = empId;
    }
    
    public void setEmpLName(String empLName) {
        this.empLName = empLName;
    }
    
    public void setEmpFName(String empFName){
        this.empFName = empFName;
        
    }
    
      public void setEmpBirthdate(Date empBirthdate) {
        this.empBirthdate = empBirthdate;
    }
    
    public void setEmpAddress(String empAddress) {
        this.empAddress =empAddress;
    }
    
    public void setEmpPnumber(String empPnumber) {
        this.empPnumber = empPnumber;
    }

    public void setEmpSSSNo(String empSSSNo) {
        this.empSSSNo = empSSSNo;
    }

    public void setEmpPhealthNo(String empPhealthNo) {
        this.empPhealthNo = empPhealthNo;
    }

    public void setEmpTINNo(String empTINNo) {
        this.empTINNo = empTINNo;
    }

    public void setEmpPagIbigNo(String empPagIbigNo) {
        this.empPagIbigNo = empPagIbigNo;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
    }

    public void setEmpPosition(String empPosition) {
        this.empPosition = empPosition;
    }

    public void setEmpISupervisor(String empISupervisor) {
        this.empISupervisor = empISupervisor;
    }

    public void setEmpBasicSalary(double empBasicSalary) {
        this.empBasicSalary = empBasicSalary;
    }

    public void setEmpRiceSubsidy(double empRiceSubsidy) {
        this.empRiceSubsidy = empRiceSubsidy;
    }

    public void setEmpPhoneAllowance(double empPhoneAllowance) {
        this.empPhoneAllowance = empPhoneAllowance;
    }

    public void setEmpClothingAllowance(double empClothingAllowance) {
        this.empClothingAllowance = empClothingAllowance;
    }

    public void setEmpGrossSalary(double empGrossSalary) {
        this.empGrossSalary = empGrossSalary;
    }

    public void setEmpHourlyRate(double empHourlyRate) {
        this.empHourlyRate = empHourlyRate;
    }
   
    
    /**
     * METHODS
 This section contains the declaration of the methods or actions performed by
 the class Employee
     */
    
    
    public void CreateEmployeeFile(String CSVFilename) throws IOException {
        try (CSVWriter writer = new CSVWriter(new FileWriter(CSVFilename, true))) {
            String[] headers = new String[19];
            headers[0] = "Employee ID";
            headers[1] = "Employee Last Name";
            headers[2] = "Employee First Name";
            headers[3] = "Employee Birth Date";
            headers[4] = "Employee Address";
            headers[5] = "Employee Phone Number";
            headers[6] = "Employee SSS Number";
            headers[7] = "Employee Philhealth Number ";
            headers[8] = "Employee TIN Number";
            headers[9] = "Employee PagIbig Number ";
            headers[10] = "Employee Status ";
            headers[11] = "Employee Position";
            headers[12] = "Employee Immediate SuperVisor";
            headers[13] = "Employee Basic Salary ";
            headers[14] = "Employee Rice Subsidy";
            headers[15] = "Employee Phone Allowance";
            headers[16] = "Employee Clothing Allowance";
            headers[17] = "Employee Gross Salary";
            headers[18] = "Employee Hourly Rate";
            writer.writeNext(headers);
        }
    }
    
    public void AddEmployee(String CSVFilename) throws IOException {
        try(CSVWriter writer = new CSVWriter(new FileWriter(CSVFilename, true))) {
          

            String[] employeeRecord = new String[19];
            employeeRecord[0] = empId;
            employeeRecord[1]= empLName;
            employeeRecord[2] = empFName;
            employeeRecord[3] = new SimpleDateFormat("MMMM dd, yyyy").format(empBirthdate);
            employeeRecord[4] =empAddress;
            employeeRecord[5] = empPnumber;
            employeeRecord[6] = empSSSNo;
            employeeRecord[7]= empPhealthNo;
            employeeRecord[8] = empTINNo;
            employeeRecord[9] = empPagIbigNo;  
            employeeRecord[10] = empStatus;
            employeeRecord[11] = empPosition;
            employeeRecord[12]= empISupervisor;
            employeeRecord[13] = Double.toString(empBasicSalary);
            employeeRecord[14] = Double.toString(empRiceSubsidy);
            employeeRecord[15] = Double.toString(empPhoneAllowance);
            employeeRecord[16] = Double.toString(empClothingAllowance);
            employeeRecord[17] = Double.toString(empGrossSalary);
            employeeRecord[18] = Double.toString(empHourlyRate);
     
            writer.writeNext(employeeRecord);
        }
    }
    
    public DefaultTableModel FetchEmployees(String CSVFilename) throws IOException, CsvValidationException {
        DefaultTableModel employees;
        try(CSVReader reader = new CSVReader(new FileReader(CSVFilename))){
            String[] header = reader.readNext();
            String[] tableHeaders = new String[]{header[0], header[1], header[2], header[6], header[7], header[8], header[9]};
            employees = new DefaultTableModel(tableHeaders,0);
            String[] line;
            String[] tableRecords = new String [7];
            while((line = reader.readNext()) != null){
            tableRecords[0] = line[0];
            tableRecords[1] = line[1];
            tableRecords[2] = line[2];
            tableRecords[3] = line[6];
            tableRecords[4] = line[7];
            tableRecords[5] = line[8];
            tableRecords[6] = line[9];
            
            employees.addRow(tableRecords);
            
            }
        }
        return employees;
    }
    
    
    
    
    public void UpdateEmployee(String CSVFilename) throws FileNotFoundException, IOException, CsvValidationException{
        String tempFilename = CSVFilename.replace(".csv", ".tmp");
        CSVReader reader = new CSVReader(new FileReader(CSVFilename));
        String[] line;
        try(CSVWriter writer = new CSVWriter(new FileWriter(tempFilename, true))){
            while((line = reader.readNext()) != null){
                if(line[0].equals(empId)){
                    line[0]= empId;
                    line[1]= empLName;
                    line[2]= empFName;
                    line[3]= new SimpleDateFormat("MMMM dd, yyyy").format(empBirthdate);
                    line[4]= empAddress;    
                    line[5]= empPnumber;
                    line[6]= empSSSNo;
                    line[7]= empTINNo;
                    line[8]= empPhealthNo;
                    line[9]= empPagIbigNo;        
                    line[10]=empStatus;       
                    line[11]=empPosition;    
                    line[12]=empISupervisor;
                    line[13]=Double.toString(empBasicSalary);    
                    line[14]=Double.toString(empRiceSubsidy);    
                    line[15]=Double.toString(empPhoneAllowance);     
                    line[16]=Double.toString(empClothingAllowance);
                    line[17]= Double.toString(empGrossSalary);
                    line[18]= Double.toString(empHourlyRate);
                }
                     writer.writeNext(line);
            }
            reader.close();
        } finally {
            
            File originalFile = new File(CSVFilename);
File tempFile = new File(tempFilename);

if (originalFile.exists()) {
    boolean deleted = originalFile.delete();
    if (!deleted) {
        System.out.println("Failed to delete the original file.");
        // Handle the failure appropriately
    }
} else {
    System.out.println("Original file does not exist.");
    // Handle the missing file appropriately
}

boolean renamed = tempFile.renameTo(originalFile);
if (!renamed) {
    System.out.println("Failed to rename the temporary file.");
    // Handle the failure appropriately
}
            //new File(CSVFilename).delete();
            //new File(tempFilename).renameTo(new File(CSVFilename));
        }
    }
    
    public void DeleteEmployee(String CSVFilename) throws FileNotFoundException, IOException, CsvValidationException {
        String tempFilename = CSVFilename.replace(".csv", ".tmp");
        CSVReader reader = new CSVReader(new FileReader(CSVFilename));
        String[] line;
        try(CSVWriter writer = new CSVWriter(new FileWriter(tempFilename, true))){
            while((line = reader.readNext()) != null){
                if(!line[0].equals(empId)){ //12346
                    writer.writeNext(line);
                }
            }
            reader.close();
        } finally {
            new File(CSVFilename).delete();
            new File(tempFilename).renameTo(new File(CSVFilename));
        }
    }
    
    public Employee GetEmployeeRecords(String CSVFilename) throws FileNotFoundException, IOException, CsvValidationException, ParseException{
        String fileName = "Employee.csv";
        CSVReader reader = new CSVReader(new FileReader(fileName));
        String[] header = reader.readNext();
        String[] employee;
        while((employee = reader.readNext()) != null){
            if(employee[0].equals(CSVFilename)){
                
                
                     // Assuming employee[3] contains the date string in "MMMM dd, yyyy" format
                   empBirthdate = new SimpleDateFormat("MMMM dd, yyyy").parse(employee[3]);
                  // String dateString = employee[3];
                    //Date empBirthdate = null;

                   /** try {
                    empBirthdate = dateFormat.parse(dateString);
                    } catch (ParseException e) {
                     e.printStackTrace(); // handle the parse exception as needed
                     // Optionally, provide a default value or error handling logic
                    }     **/
                
                    empId= employee[0];
                    empLName = employee[1];
                    empFName = employee[2];
                    empAddress= employee[4];    
                   empPnumber = employee[5];
                     empSSSNo = employee[6];
                     empTINNo = employee[7];
                    empPhealthNo = employee[8];
                    empPagIbigNo = employee[9];        
                    empStatus= employee[10];      
                    empPosition = employee[11];    
                    empISupervisor = employee[12];
                    empBasicSalary = Double.parseDouble(employee[13]);    
                    empRiceSubsidy =Double.parseDouble(employee[14]);    
                   empPhoneAllowance =Double.parseDouble(employee[15]);     
                    empClothingAllowance=Double.parseDouble(employee[16]);
                   empGrossSalary = Double.parseDouble(employee[17] );
                    empHourlyRate = Double.parseDouble(employee[18]);
               
            }
        }
        return this;
    }
    
    
    
    public void Deductions(String CSVFilename) throws FileNotFoundException, IOException, CsvValidationException, ParseException {
        CSVReader reader = new CSVReader(new FileReader(CSVFilename));
        Attendance attendance = new Attendance();
       
        String[] line;
   
        while((line = reader.readNext()) != null){
                
               if(line[0].equals(empId)){
                    line[0]= empId;
                    line[1]= empLName;
                    line[2]= empFName;
                    line[3]= empBirthdate.toString();
                    line[4]= empAddress;    
                    line[5]= empPnumber;
                    line[6]= empSSSNo;
                    line[7]= empTINNo;
                    line[8]= empPhealthNo;
                    line[9]= empPagIbigNo;        
                    line[10]=empStatus;       
                    line[11]=empPosition;    
                    line[12]=empISupervisor;
                    line[13]=Double.toString(empBasicSalary);    
                    line[14]=Double.toString(empRiceSubsidy);    
                    line[15]=Double.toString(empPhoneAllowance);     
                    line[16]=Double.toString(empClothingAllowance);
                    line[17]= Double.toString(empGrossSalary);
                    line[18]= Double.toString(empHourlyRate);
                }  
            
          }
            //Decalaration of Variables 
            double sss;
            double philhealth = 0;
            double pagIbig = 0;
            double basicpay;
            double grossPay;
            double netpaybeforetax;
            double tax;
            double netpay;
            
            double allowance;
            double govdeduction;
            
            
            
            
            
            sss = empBasicSalary;
            if (empBasicSalary <= 3250) {
                sss = 135.00;
            }
            if (empBasicSalary > 3250 && empBasicSalary <= 3750) {
                sss = 157.50;
            }
            if (empBasicSalary > 3750 && empBasicSalary <= 4250) {
                sss = 180.00;
            }
            if (empBasicSalary > 4250 && empBasicSalary <= 4750) {
                sss = 202.50;
            }
            if (empBasicSalary > 4750 && empBasicSalary <= 5250) {
                sss = 225.00;
            }
            if (empBasicSalary > 5250 && empBasicSalary <= 5750) {
                sss = 247.50;
            }
            if (empBasicSalary > 5750 && empBasicSalary <= 6250) {
                sss = 270.00;
            }
            if (empBasicSalary > 6250 && empBasicSalary <= 6750) {
                sss = 292.50;
            }
            if (empBasicSalary > 6250 && empBasicSalary <= 6750) {
                sss = 292.50;
            }
            if (empBasicSalary > 6750 && empBasicSalary <= 7250) {
                sss = 360.00;
            }
            if (empBasicSalary > 7250 && empBasicSalary <= 7750) {
                sss = 382.50;
            }
            if (empBasicSalary > 7750 && empBasicSalary <= 8250) {
                sss = 405.00;
            }
            if (empBasicSalary > 8250 && empBasicSalary <= 8750) {
                sss = 427.50;
            }
            if (empBasicSalary > 8750 && empBasicSalary <= 9250) {
                sss = 450.00;
            }
            if (empBasicSalary > 9250 && empBasicSalary <= 9750) {
                sss = 472.50;
            }
            if (empBasicSalary > 9750 && empBasicSalary <= 10250) {
                sss = 495.00;
            }
            if (empBasicSalary > 10250 && empBasicSalary <= 10750) {
                sss = 517.50;
            }
            if (empBasicSalary > 10750 && empBasicSalary <= 11250) {
                sss = 540.00;
            }
            if (empBasicSalary > 11250 && empBasicSalary <= 11750) {
                sss = 562.50;
            }
            if (empBasicSalary > 11750 && empBasicSalary <= 12250) {
                sss = 585.00;
            }
            if (empBasicSalary > 12250 && empBasicSalary <= 12750) {
                sss = 607.50;
            }
            if (empBasicSalary > 12750 && empBasicSalary <= 13250) {
                sss = 630.00;
            }
            if (empBasicSalary > 13250 && empBasicSalary <= 13750) {
                sss = 652.50;
            }
            if (empBasicSalary > 13750 && empBasicSalary <= 14250) {
                sss = 697.50;
            }
            if (empBasicSalary > 14250 && empBasicSalary <= 14750) {
                sss = 720.00;
            }
            if (empBasicSalary > 14750 && empBasicSalary <= 15250) {
                sss = 742.50;
            }
            if (empBasicSalary > 15250 && empBasicSalary <= 15750) {
                sss = 765.00;
            }
            if (empBasicSalary > 15750 && empBasicSalary <= 16250) {
                sss = 787.50;
            }
            if (empBasicSalary > 16250 && empBasicSalary <= 16750) {
                sss = 810.00;
            }
            if (empBasicSalary > 16750 && empBasicSalary <= 17250) {
                sss = 832.50;
            }
            if (empBasicSalary > 17250 && empBasicSalary <= 17750) {
                sss = 855.00;
            }
            if (empBasicSalary > 17750 && empBasicSalary <= 18250) {
                sss = 877.50;
            }
            if (empBasicSalary > 18250 && empBasicSalary <= 18750) {
                sss = 900.00;
            }
            if (empBasicSalary > 18750 && empBasicSalary <= 19250) {
                sss = 922.50;
            }
            if (empBasicSalary > 19250 && empBasicSalary <= 19750) {
                sss = 945.50;
            }
            if (empBasicSalary > 19750 && empBasicSalary <= 20250) {
                sss = 990.00;
            }
            if (empBasicSalary > 20250 && empBasicSalary <= 20750) {
                sss = 1012.50;
            }
            if (empBasicSalary > 20750 && empBasicSalary <= 21250) {
                sss = 1035.00;
            }
            if (empBasicSalary > 21250 && empBasicSalary <= 21750) {
                sss = 1057.50;
            }
            if (empBasicSalary > 21750 && empBasicSalary <= 22250) {
                sss = 1080.00;
            }
            if (empBasicSalary > 22250 && empBasicSalary <= 22750) {
                sss = 1012.50;
            }
            if (empBasicSalary > 22750 && empBasicSalary <= 23250) {
                sss = 1035.00;
            }
            if (empBasicSalary > 23250 && empBasicSalary <= 23750) {
                sss = 1057.50;
            }
            if (empBasicSalary > 23750 && empBasicSalary <= 24250) {
                sss = 1080.00;
            }
            if (empBasicSalary > 24250 && empBasicSalary <= 24750) {
                sss = 1102.50;
            }
            if (empBasicSalary > 24750) {
                sss = 1125.00;
            }
            
            govdeduction = philhealth + pagIbig + sss;
            philhealth = empBasicSalary * 0.03 / 2;
            pagIbig = empBasicSalary < 1500 ? empBasicSalary * 0.1 : 100;
            allowance = empClothingAllowance + empRiceSubsidy + empPhoneAllowance;
            basicpay = attendance.ComputeStudyHours()*empHourlyRate;
            grossPay = basicpay + allowance;
            netpaybeforetax = grossPay - govdeduction;
            
             tax = empBasicSalary - (pagIbig + philhealth);
            if (empBasicSalary > 20832 && empBasicSalary <= 33333) {
                tax = (empBasicSalary - 20833) * 0.20;
            } else if (empBasicSalary > 33333 && empBasicSalary <= 66667) {
                tax = 2500 + ((empBasicSalary - 33333) * 0.25);
            } else if (empBasicSalary > 66667 && empBasicSalary <= 166667) {
                tax = 10833 + ((empBasicSalary - 66667) * 0.30);
            } else if (empBasicSalary > 166667 && empBasicSalary <= 666667) {
                tax = 166667 + ((empBasicSalary - 40833.33) * 0.32);
            } else if (empBasicSalary > 666667) {
                tax = 200833.33 + ((empBasicSalary - 666667) * 0.35);
            }
            
            
            netpay = netpaybeforetax-tax;
            
      }
}