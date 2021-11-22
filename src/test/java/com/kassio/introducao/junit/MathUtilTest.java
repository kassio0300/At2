/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kassio.introducao.junit;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kassi
 */
public class MathUtilTest {
    
    @Test
    void testMdcAParP1() {
        final int a =6;
        final int b =3;
        final int esperado = 3;
        final int obtido = MathUtil.mdc(a,b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcAImparP1(){
        final int a = 9;
        final int b = 3;
        final int esperado = 3;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
        
    }
}