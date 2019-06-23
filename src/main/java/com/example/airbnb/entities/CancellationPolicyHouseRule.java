package com.example.airbnb.entities;

/**
 * CancellationPolicyHouseRule
 */
public class CancellationPolicyHouseRule {
	String cancellationPolicyType;
	String fullRefundRequirement;

	public CancellationPolicyHouseRule(String cancellationPolicyType, String fullRefundRequirement) {
		this.cancellationPolicyType = cancellationPolicyType;
		this.fullRefundRequirement = fullRefundRequirement;
	}

	public String getCancellationPolicyType() {
		return this.cancellationPolicyType;
	}

	public void setCancellationPolicyType(String cancellationPolicyType) {
		this.cancellationPolicyType = cancellationPolicyType;
	}

	public String getFullRefundRequirement() {
		return this.fullRefundRequirement;
	}

	public void setFullRefundRequirement(String fullRefundRequirement) {
		this.fullRefundRequirement = fullRefundRequirement;
	}
	
}