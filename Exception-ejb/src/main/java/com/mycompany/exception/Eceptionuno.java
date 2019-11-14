/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exception;

import javax.ejb.ApplicationException;

/**
 *
 * @author astrid
 */
@ApplicationException(rollback = true)
public class Eceptionuno extends Exception  {
     public Eceptionuno  (String str) {
        
        super (str);
    }
}
