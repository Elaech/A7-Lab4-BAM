package com.jetbrains;

import java.util.List;

public class Profesor extends Utilizator {
	private List<Integer> _proiecte;
	private List<Aplicare> _aplicari;

	public void addProiect(Object aProiect_proiect) {
		throw new UnsupportedOperationException();
	}

	public List<Integer> getProiecte() {
		return this._proiecte;
	}

	public boolean deleteProiect(Object aInteger_integer) {
		throw new UnsupportedOperationException();
	}

	public boolean acceptAplicatie(Object aInteger) {
		throw new UnsupportedOperationException();
	}

	public List<Aplicare> getAplicari() {
		return this._aplicari;
	}

	public boolean removeAplicare(Object aInteger) {
		throw new UnsupportedOperationException();
	}

	public boolean editProiect(Object aInteger) {
		throw new UnsupportedOperationException();
	}

	public boolean upgradeToTutore() {
		throw new UnsupportedOperationException();
	}
}