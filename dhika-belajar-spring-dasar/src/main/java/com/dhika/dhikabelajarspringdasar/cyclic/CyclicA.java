/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhika.dhikabelajarspringdasar.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author Acer
 */
@Data
@AllArgsConstructor
public class CyclicA {
    
    private CyclicB cyclicB;
}
