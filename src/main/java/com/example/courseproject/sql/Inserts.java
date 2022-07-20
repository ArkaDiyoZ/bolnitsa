package com.example.courseproject.sql;

import com.example.courseproject.another.MessageBox;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Inserts {

    private static final String url = "jdbc:postgresql://localhost:5432/hospitaldb";
    private static final String user = "********";
    private static final String password = "*********";

    public static void newDoctorInsert(String doctorName, String doctorSureName,
                                       Integer DepartmentId, String doctorPost, Double doctorSalary, Integer doctorAge) {

        String doctorname = doctorName;
        String doctorsurename = doctorSureName;
        Integer doctordepart = DepartmentId;
        String doctorpost = doctorPost;
        Double doctorsalary = doctorSalary;
        Integer doctorage = doctorAge;

        String query = "INSERT INTO doctors(doctor_name,doctor_surename, doctor_department_id,doctor_post_name," +
                        " doctor_post_salary,doctor_birth_age) VALUES(?,?,?,?,?,?)";


        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, doctorname);
            pst.setString(2, doctorsurename);
            pst.setInt(3, doctordepart);
            pst.setString(4, doctorPost);
            pst.setDouble(5, doctorSalary);
            pst.setInt(6, doctorage);
            pst.executeUpdate();
            MessageBox.messageBoxInfo("Доктор успешно добавлен в базу данных клиники !");
            System.out.println("Doctor sucessfuly created.");

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(Inserts.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
            System.out.println("Error doctor created.");
        }
    }

    public static void newPatientInsert(String patientName, String patientSureName, Integer patientDiagnosId,
                                        Integer patientDepartmentId, Integer patientAge){

        String patientname = patientName;
        String patientsurename = patientSureName;
        Integer patientdiagnosid = patientDiagnosId;
        Integer patientdepartid = patientDepartmentId;
        Integer patientage = patientAge;

        String query = "INSERT INTO patients(patient_name,patient_surname,patient_diagnos_id,patient_department_id," +
                "patient_birth_age) VALUES(?,?,?,?,?)";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, patientname);
            pst.setString(2, patientsurename);
            pst.setInt(3, patientdiagnosid);
            pst.setInt(4, patientdepartid);
            pst.setInt(5, patientage);
            pst.executeUpdate();
            System.out.println("Patient sucessfuly created.");

            MessageBox.messageBoxInfo("Пациент успешно добавлен в базу !");

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(Inserts.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
            System.out.println("Error patinet created.");
            MessageBox.messageBoxError("Ошибка добавления пациента !");
        }
    }

    public static void newDepartmentInsert(String departmentName){

        String departmentname = departmentName;

        System.out.println(departmentname);

        String query = "INSERT INTO departments(department_name) VALUES(?)";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement(query)){
                 pst.setString(1, departmentname);
                 pst.executeUpdate();
                 System.out.println("Department sucsessfuly created.");
                 MessageBox.messageBoxInfo("Отделение успешно добавлено в базу !");

        } catch (SQLException ex){
            Logger lgr = Logger.getLogger(Inserts.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
            System.out.println("Error department created.");
            MessageBox.messageBoxError("Ошибка добавления отделения !");

        }

    }


}
