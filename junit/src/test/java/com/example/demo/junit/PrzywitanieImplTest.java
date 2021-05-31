package com.example.demo.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class PrzywitanieImplTest 
{
   private Przywitanie przywitanie;
	
   @BeforeClass
   public static void dowolnaMetoda() {
	   System.out.println("Metoda Before Class");
	 
   }
   
   @Before
   public void setup() {
	   System.out.println("Setup");
	   przywitanie = new PrzywitanieImpl();
   }
   
   @Test
   public void funkcjaWitajPowinnaZwracacPrawidlowyWynik() {
	   System.out.println("funkcjaWitajPowinnaZwracacPrawidlowyWynik");
	   String wynik = przywitanie.witaj("Junit");
	   assertNotNull(wynik);
	   assertEquals("WitajJunit", wynik);
   }
   @Test(expected = IllegalArgumentException.class)
   public void funkcjaWitajPowinnaRzucicWyjatekJezeliImieToNull() {
   System.out.println("funkcjaWitajPowinnaRzucicWyjatekJezeliImieToNull");
   przywitanie.witaj(null);
   }
   
   @Ignore
   @Test
   public void ignorowanyTest() {
	   System.out.println("Junit Ignore message ");	
	   String wynik = przywitanie.witaj("Ignore Test");
	   assertEquals("WitajIgnore Test", wynik);
   }
   
   @After
   public void teardown() {
	   System.out.println("Czyszcze");
	   przywitanie = null;
   } 
   @AfterClass
   public static void afterClass() {
	    System.out.println("After Class");
	  }
}
