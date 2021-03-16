package Comparable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Live-
 */
    public class Student implements Comparable<Student> {

        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public int compareTo(Student s) {
            if (this.id < s.id) {
                return -1;
            } else if (this.id == s.id) {
                return 0;
            } else {
                return 1;
            }
        }

        @Override
        public String toString() {
            return this.id + " " + this.name;
        }
    }

