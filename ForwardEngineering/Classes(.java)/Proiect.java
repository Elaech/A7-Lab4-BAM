package com.jetbrains;

import java.util.List;

public class Proiect extends Postare {
	private Integer _coordonator;
	private String _cerinte;
	private List<String> _tehnologii;
	private List<Integer> _participanti;
	private String _tip;

	public Integer getCoordonator() {
		return this._coordonator;
	}

	public void setCoordonator(Object aInteger_integer) {
		throw new UnsupportedOperationException();
	}

	public void setCerinta(Object aString_string) {
		throw new UnsupportedOperationException();
	}

	public String getCerinta() {
		throw new UnsupportedOperationException();
	}

	public List<String> getTehnologii() {
		return this._tehnologii;
	}

	public void addTehnologie(Object aString_string) {
		throw new UnsupportedOperationException();
	}

	public List<Integer> getParticipanti() {
		return this._participanti;
	}

	public void addParticipant(Object aInteger_integer) {
		throw new UnsupportedOperationException();
	}

	public boolean stergeParticipant(Object aInteger_integer) {
		throw new UnsupportedOperationException();
	}

	public void setTip(Object aString_string) {
		throw new UnsupportedOperationException();
	}

	public String getTip() {
		return this._tip;
	}
}