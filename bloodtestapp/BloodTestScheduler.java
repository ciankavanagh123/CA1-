/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestapp;

import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 *
 * @author adamk
 */
public class BloodTestScheduler {
    private PriorityQueue<Patient> queue;
    //// LinkedList to keep track of the last 5 no-show patients
    private LinkedList<String> noShowList;
// Constructor initializes the patient queue and no-show list
    public BloodTestScheduler() {
        queue = new PriorityQueue<>();
        noShowList = new LinkedList<>();
    }
//adds a new patient to the list and gathers all there info
    public void requestTest(String name, int age, String priority, boolean fromHospital, String gpDetails) {
        Patient newPatient = new Patient(name, age, priority, fromHospital, gpDetails);
        queue.add(newPatient);
    }
//Marks a patient as a no-show.
     //Maintains a record of the last 5 no-show patients.
     // Name of the patient who didn't show up
    public void markNoShow(String name) {
        if (noShowList.size() >= 5) {
            noShowList.removeFirst();
        }
        noShowList.add(name);
    }
 //gets and removes the next patient from the queue.
     //return The next patient to be tested or null if the queue is empty
    public Patient getNextPatient() {
        return queue.poll();
    }
 // Returns a copy of the current patient queue.
      //@return A priority queue containing the current patients waiting for tests
    public PriorityQueue<Patient> getQueue() {
        return new PriorityQueue<>(queue);
    }
    
}
