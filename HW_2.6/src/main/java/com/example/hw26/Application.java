package com.example.hw26;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);
    }

    private static void task1(List<Integer> nums) {
        System.out.println("Task 1");
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
        System.out.println();
    }

    private static void task2(List<Integer> nums) {
        System.out.println(" Task 2");
        Set<Integer> set = new TreeSet<>(nums);
        for (Integer num : set) {
            if (num%2==0){
                System.out.println(num);
            }
        }
        System.out.println();
    }

}
