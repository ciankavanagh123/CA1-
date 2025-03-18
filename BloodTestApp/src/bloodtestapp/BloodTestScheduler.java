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
    private LinkedList<String> noShowList;

    public BloodTestScheduler() {
        queue = new PriorityQueue<>();
        noShowList = new LinkedList<>();
    }

    public void requestTest(String name, int age, String priority, boolean fromHospital, String gpDetails) {
        Patient newPatient = new Patient(name, age, priority, fromHospital, gpDetails);
        queue.add(newPatient);
    }

    public void markNoShow(String name) {
        if (noShowList.size() >= 5) {
            noShowList.removeFirst();
        }
        noShowList.add(name);
    }

    public Patient getNextPatient() {
        return queue.poll();
    }

    public PriorityQueue<Patient> getQueue() {
        return new PriorityQueue<>(queue);
    }
    
}
