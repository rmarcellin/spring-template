package core;

import java.io.Serializable;

public class Adresse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private int numeroVoie;
	private String voie;
	private String complement;
	private int codePostale;
	private String localite;
	private String cedex;
	
	public Adresse() {}

	public Adresse(int numeroVoie, String voie, String complement,
			int codePostale, String localite, String cedex) {
		super();
		this.numeroVoie = numeroVoie;
		this.voie = voie;
		this.complement = complement;
		this.codePostale = codePostale;
		this.localite = localite;
		this.cedex = cedex;
	}
	
	

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	public int getNumeroVoie() {
		return numeroVoie;
	}

	public String getVoie() {
		return voie;
	}

	public String getComplement() {
		return complement;
	}

	public int getCodePostale() {
		return codePostale;
	}

	public String getLocalite() {
		return localite;
	}

	public String getCedex() {
		return cedex;
	}

	public void setNumeroVoie(int numeroVoie) {
		this.numeroVoie = numeroVoie;
	}

	public void setVoie(String voie) {
		this.voie = voie;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}

	public void setLocalite(String localite) {
		this.localite = localite;
	}

	public void setCedex(String cedex) {
		this.cedex = cedex;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("numeroVoie: ");
		builder.append(numeroVoie);
		builder.append(", voie: ");
		builder.append(voie);
		builder.append(", complement: ");
		builder.append(complement);
		builder.append(", codePostale: ");
		builder.append(codePostale);
		builder.append(", localite: ");
		builder.append(localite);
		builder.append(", cedex: ");
		builder.append(cedex);
		return builder.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cedex == null) ? 0 : cedex.hashCode());
		result = prime * result + codePostale;
		result = prime * result
				+ ((complement == null) ? 0 : complement.hashCode());
		result = prime * result
				+ ((localite == null) ? 0 : localite.hashCode());
		result = prime * result + numeroVoie;
		result = prime * result + ((voie == null) ? 0 : voie.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Adresse))
			return false;
		Adresse other = (Adresse) obj;
		if (cedex == null) {
			if (other.cedex != null)
				return false;
		} else if (!cedex.equals(other.cedex))
			return false;
		if (codePostale != other.codePostale)
			return false;
		if (complement == null) {
			if (other.complement != null)
				return false;
		} else if (!complement.equals(other.complement))
			return false;
		if (localite == null) {
			if (other.localite != null)
				return false;
		} else if (!localite.equals(other.localite))
			return false;
		if (numeroVoie != other.numeroVoie)
			return false;
		if (voie == null) {
			if (other.voie != null)
				return false;
		} else if (!voie.equals(other.voie))
			return false;
		return true;
	}

}
