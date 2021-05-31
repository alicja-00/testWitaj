package com.example.demo.junit;

public class PrzywitanieImpl implements Przywitanie{
	
	Boolean uscisk;
	
	public Boolean czyUsciskDloni(Boolean uscisk) {
		return uscisk;
	}
	
	@Override
	public String witaj (String imie) {
		if (imie == null || imie.length() == 0) {
			throw new IllegalArgumentException();
		}
		return "Witaj" + imie;
	}
	
}
