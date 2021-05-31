package com.example.demo.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PrzywitanieUsciskTest {

	 private Przywitanie przywitanie;
	
	 private PrzywitanieImpl przywitanieimpl;
	 
	   @BeforeClass
	   public static void metodaBeforeClasa() {
		   System.out.println("Metoda Before Class");
		 
	   }
	   
	   @Before
	   public void setup() {
		   System.out.println("Setup");
		   przywitanie = new PrzywitanieImpl();
		   przywitanieimpl = new PrzywitanieImpl();
	   }
	   @Test
	   public void funkcjaCzyUscisnijPowinnaZwracacPrawidlowyWynik() {
		   System.out.println("funkcja Uscisnij");
		   Boolean wynik = przywitanieimpl.czyUsciskDloni(true);
		   assertNotNull(wynik);
		   assertEquals(true, wynik);
		   assertTrue(wynik);
	   }
	   
	   @Test
	   public void funkcjaCzyUsciskDloniJestFalse() {
		   System.out.println("funkcja Uscisnij falszywie");  
		   Boolean wynik = przywitanieimpl.czyUsciskDloni(false);
		   assertFalse(wynik);
		   assertNotSame(true, wynik);
	   }
	   
	   @Test
	   public void funkcjaCzyUsciskDloniJestNullem() {
		   System.out.println("funkcja Uscisnij jest nullem");  
		   Boolean wynik = przywitanieimpl.czyUsciskDloni(null);
		   assertNull(wynik);
	   }
	   @Test
	   public void funkcjaCzyUsciskDloniJestTakiSam() {
		   System.out.println("funkcja Uscisnij jest taki sam");  
		   Boolean wynik = przywitanieimpl.czyUsciskDloni(true);
		   assertSame(true, wynik);
	   }
	   @Test(expected = IllegalArgumentException.class)
	   public void funkcjaUsciskPowinnaRzucicWyjatekJezeliUsciskToNull() {
	   System.out.println("IllegalArgumentException JezeliUsciskToNull");
	  
	   przywitanieimpl.czyUsciskDloni(null);
	   }
	   @Test(expected = IllegalAccessException.class)
	   public void funkcjaUsciskPowinnaRzucicWyjatekJezeliUsciskTofalse() {
		   System.out.println("funkcjaUsciskPowinnaRzucicWyjatekJezeliUsciskTofalse");
		   przywitanieimpl.czyUsciskDloni(false);
	   }
	   @Test(expected = IllegalStateException.class)
	   public void funkcjaUsciskPowinnaRzucicWyjatekStateException() {
		   System.out.println("Wyjatek StateException");
		   przywitanieimpl.czyUsciskDloni(true);   
	   }
	   
	   @Test(expected = NullPointerException.class)
	   public void funkcjaUsciskPowinnaRzucacWyjatekNullPointerEx() {
		   System.out.println("Wyjatek NullPointerException");
		   przywitanieimpl.czyUsciskDloni(null);   
	   }
	   
	   @After
	   public void teardown() {
		   System.out.println("Czyszcze");
		   przywitanieimpl = null;
	   } 
	   @AfterClass
	   public static void afterClass() {
		    System.out.println("After Class");
		  }
}
