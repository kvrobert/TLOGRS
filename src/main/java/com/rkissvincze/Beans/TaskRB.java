/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rkissvincze.Beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 *
 * @author rkissvincze
 */
@Getter
@Setter
@NoArgsConstructor
public class TaskRB {
    
    int year;
    int month;
    int day;
    String taskId;   
    String comment;
    String startTime;
    String endTime;
    
}
