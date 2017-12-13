package com.example.farhat.absence;

/**
 * Created by Farhat on 12/12/2017.
 */

public class Config {

 public static String url = "http://10.0.2.2" ;
   // public static String url = "http://192.168.43.49" ;
    public static String project = "/absence";
    public static String connect = url+project+"/connect.php" ;
    public static String getAllStudent = url+project+"/findall.php" ;
    public static String updatePresence = url+project+"/updateAbsence.php";

}
