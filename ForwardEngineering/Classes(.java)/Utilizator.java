package com.jetbrains;

import java.util.List;

public class Utilizator {
	private String _nR_MATRICOL;
	private String _nUME;
	private String _pRENUME;
	private String _pAROLA;
	private String _eMAIL;
	private Integer _iD;
	private List<Mesaj> _lISTA_MESAJE;
	private List<Postare> _lISTA_POSTARI;
	private boolean _lOGGED;

	public String getNR_MATRICOL() {
		return this._nR_MATRICOL;
	}

	public void setNR_MATRICOL(Object aString_NR_MATRICOL) {
		throw new UnsupportedOperationException();
	}

	public String getNUME() {
		return this._nUME;
	}

	public void setNUME(Object aString_NUME) {
		throw new UnsupportedOperationException();
	}

	public String getPRENUME() {
		return this._pRENUME;
	}

	public void setPRENUME(Object aString_PRENUME) {
		throw new UnsupportedOperationException();
	}

	public String getPAROLA() {
		return this._pAROLA;
	}

	public void setPAROLA(Object aString_PAROLA) {
		throw new UnsupportedOperationException();
	}

	public String getEMAIL() {
		return this._eMAIL;
	}

	public void setEMAIL(Object aString_EMAIL) {
		throw new UnsupportedOperationException();
	}

	public boolean logare() {
		throw new UnsupportedOperationException();
	}

	public boolean delogare() {
		throw new UnsupportedOperationException();
	}

	public boolean creareCont() {
		throw new UnsupportedOperationException();
	}

	public Mesaj afisareDetaliiMesaj(Object aInteger_id) {
		throw new UnsupportedOperationException();
	}

	public boolean schimbareDateCont(Object aUtilizator_utilizator) {
		throw new UnsupportedOperationException();
	}

	public boolean getLOGGED() {
		return this._lOGGED;
	}

	public void setLOGGED(Object aLOGGED) {
		throw new UnsupportedOperationException();
	}

	public void adaugareMesaj(Object aMesaj_mesaj) {
		throw new UnsupportedOperationException();
	}

	public boolean stergereMesaj(Object aInteger_id) {
		throw new UnsupportedOperationException();
	}

	public List<Mesaj> getLISTA_MESAJE() {
		return this._lISTA_MESAJE;
	}

	public List<Postare> getLISTA_POSTARI() {
		return this._lISTA_POSTARI;
	}

	public boolean adaugarePostare(Object aPostare_postare) {
		throw new UnsupportedOperationException();
	}

	public boolean stergerePostare(Object aInteger_id) {
		throw new UnsupportedOperationException();
	}

	public Integer getID() {
		return this._iD;
	}
}