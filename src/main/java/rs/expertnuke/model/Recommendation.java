package rs.expertnuke.model;

import rs.expertnuke.model.enums.RecommendationType;

public class Recommendation {
	private RecommendationType code;
	private String explanation;

	public Recommendation(RecommendationType code, String explanation) {
		this.code = code;
		this.explanation = explanation;
	}

	public RecommendationType getCode() {
		return code;
	}

	public String getExplanation() {
		return explanation;
	}

}
