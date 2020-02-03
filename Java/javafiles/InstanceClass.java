package com.example.javafiles;


public class InstanceClass {

    //Static Variables and methods Demo

        private static int numInstances = 10;

        protected static int getCount() {
            return numInstances;
        }

        private static void addInstance() {
            numInstances++;
        }

        InstanceClass() {
            addInstance();
        }

        public static void main(String[] arguments) {
            System.out.println("Starting with " + getCount() + " instances");

            for (int i = 0; numInstances < 500; ++i) {
                new InstanceClass();
            }
            System.out.println("Created " + getCount() + " instances");
        }
    }

