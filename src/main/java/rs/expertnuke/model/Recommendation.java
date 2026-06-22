package rs.expertnuke.model;

import java.util.Objects;

import rs.expertnuke.model.enums.RecommendationType;

public class Recommendation {
	private RecommendationType code;
	private String explanation;

	public Recommendation(RecommendationType code, String explanation) {
		this.code = code;
		this.explanation = explanation;
	}
	
	public Recommendation(RecommendationType code) {
		this.code = code;
	}

	public RecommendationType getCode() {
		return code;
	}

	public String getExplanation() {
		return explanation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recommendation other = (Recommendation) obj;
		return code == other.code;
	}

}
