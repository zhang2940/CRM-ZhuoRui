/**
 * 
 */
package com.crm.pojo;

/**
 * @author admin
 * @createTime 2020年12月6日下午8:25:49
 * @updateTime 2020年12月6日下午8:25:49 
 * @version 1.0.0
 */
public class Plan {
	private Integer planId;
	private Integer sellId;
	private String planDate;
	private String planProject;
	private String palnImplementationEffect;
	public Plan(Integer planId, Integer sellId, String planDate, String planProject, String palnImplementationEffect) {
		super();
		this.planId = planId;
		this.sellId = sellId;
		this.planDate = planDate;
		this.planProject = planProject;
		this.palnImplementationEffect = palnImplementationEffect;
	}
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public Integer getSellId() {
		return sellId;
	}
	public void setSellId(Integer sellId) {
		this.sellId = sellId;
	}
	public String getPlanDate() {
		return planDate;
	}
	public void setPlanDate(String planDate) {
		this.planDate = planDate;
	}
	public String getPlanProject() {
		return planProject;
	}
	public void setPlanProject(String planProject) {
		this.planProject = planProject;
	}
	public String getPalnImplementationEffect() {
		return palnImplementationEffect;
	}
	public void setPalnImplementationEffect(String palnImplementationEffect) {
		this.palnImplementationEffect = palnImplementationEffect;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((palnImplementationEffect == null) ? 0 : palnImplementationEffect.hashCode());
		result = prime * result + ((planDate == null) ? 0 : planDate.hashCode());
		result = prime * result + ((planId == null) ? 0 : planId.hashCode());
		result = prime * result + ((planProject == null) ? 0 : planProject.hashCode());
		result = prime * result + ((sellId == null) ? 0 : sellId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plan other = (Plan) obj;
		if (palnImplementationEffect == null) {
			if (other.palnImplementationEffect != null)
				return false;
		} else if (!palnImplementationEffect.equals(other.palnImplementationEffect))
			return false;
		if (planDate == null) {
			if (other.planDate != null)
				return false;
		} else if (!planDate.equals(other.planDate))
			return false;
		if (planId == null) {
			if (other.planId != null)
				return false;
		} else if (!planId.equals(other.planId))
			return false;
		if (planProject == null) {
			if (other.planProject != null)
				return false;
		} else if (!planProject.equals(other.planProject))
			return false;
		if (sellId == null) {
			if (other.sellId != null)
				return false;
		} else if (!sellId.equals(other.sellId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Plan [planId=" + planId + ", sellId=" + sellId + ", planDate=" + planDate + ", planProject="
				+ planProject + ", palnImplementationEffect=" + palnImplementationEffect + "]";
	}
	

}
