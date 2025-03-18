/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestapp;

/**
 *
 * @author adamk
 */
public class Patient implements PatientInfo, Comparable<Patient>{

    private String Name;
    private String Priority;
    private int age;
    private boolean fromHospital;
    private String gpDetails;

    public Patient(String name, int age, String priority, boolean fromHospital, String gpDetails) {
        this.Name = name;
        this.age = age;
        this.Priority = priority;
        this.fromHospital = fromHospital;
        this.gpDetails = gpDetails;
    }

    public String getName() { return Name; }
    public int getAge() { return age; }
    public String getPriority() { return Priority; }
    public boolean isFromHospital() { return fromHospital; }
    public String getGpDetails() { return gpDetails; }

    @Override
    public int compareTo(Patient other) {
        int thisPriority = switch (this.Priority) {
            case "urgent" -> 3;
            case "medium" -> 2;
            default -> 1;
        };
        int otherPriority = switch (other.Priority) {
            case "urgent" -> 3;
            case "medium" -> 2;
            default -> 1;
        };

        if (thisPriority != otherPriority) return Integer.compare(otherPriority, thisPriority);
        if (this.fromHospital != other.fromHospital) return this.fromHospital ? -1 : 1;
        return Integer.compare(other.age, this.age);
    }}