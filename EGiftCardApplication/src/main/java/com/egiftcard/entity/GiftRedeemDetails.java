package com.egiftcard.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="gift_redeem_details")
public class GiftRedeemDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gift_redeem_id")
	private int giftRedeemId;
	@Column(name="gift_redeem_status")
	private boolean redeemStatus;
	@JsonFormat(pattern = "dd-MM-yyyy")
	@Temporal(value=TemporalType.DATE)
	@Column(name = "gift_redeem_date")
	private Date giftRedeemDate;
	@Column(name = "gift_redeem_amount")
	private float giftRedeemAmount;
	private float balance;
	
	
	@ManyToOne//(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_gift_id")
	private UserGiftDetails userGiftDetails;

	public int getGiftRedeemId() {
		return giftRedeemId;
	}

	public void setGiftRedeemId(int giftRedeemId) {
		this.giftRedeemId = giftRedeemId;
	}

	public boolean isRedeemStatus() {
		return redeemStatus;
	}

	public void setRedeemStatus(boolean redeemStatus) {
		this.redeemStatus = redeemStatus;
	}

	public Date getGiftRedeemDate() {
		return giftRedeemDate;
	}

	public void setGiftRedeemDate(Date giftRedeemDate) {
		this.giftRedeemDate = giftRedeemDate;
	}

	public float getGiftRedeemAmount() {
		return giftRedeemAmount;
	}

	public void setGiftRedeemAmount(float giftRedeemAmount) {
		this.giftRedeemAmount = giftRedeemAmount;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public UserGiftDetails getUserGiftDetails() {
		return userGiftDetails;
	}

	public void setUserGiftDetails(UserGiftDetails userGiftDetails) {
		this.userGiftDetails = userGiftDetails;
	}

	@Override
	public String toString() {
		return "GiftRedeemDetails [giftRedeemId=" + giftRedeemId + ", redeemStatus=" + redeemStatus
				+ ", giftRedeemDate=" + giftRedeemDate + ", giftRedeemAmount=" + giftRedeemAmount + ", balance="
				+ balance + ", userGiftDetails=" + userGiftDetails + "]";
	}

	
	
	

	
}
