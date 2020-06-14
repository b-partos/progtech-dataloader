/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progtech.dataloader.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author partosb
 */
@Getter
@Setter
@ToString
public class Question {

    private String number;
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String answers;

}
