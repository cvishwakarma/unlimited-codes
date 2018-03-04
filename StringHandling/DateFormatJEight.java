/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author Vishwa
 */
public class DateFormatJEight {
    public static void main(String[] args) {
        DateTimeFormatter format = null;
        LocalDateTime before7Days = null;
        LocalDateTime now = null;
        format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss  ?");
        now = LocalDateTime.now();
        before7Days = now.minusDays(7);
        System.out.println(String.format("Now: %s\nBefore7Days: %s",now.format(format),before7Days.format(format)));
    }
 
}
