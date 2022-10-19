package com.egiftcard.entity;

import java.util.Date;

import javax.persistence.CascadeType;
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
@Table(name = "gift_received_details")
public class GiftReceivedDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gift_received_id")
	private int giftReceivedId;
	@JsonFormat(pattern = "dd-MM-yyyy")
	@Temporal(value=TemporalType.DATE)
	@Column(name="gift_received_date")
	private Date giftReceivedDate;
	
	@ManyToOne//(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	private User user;
	@ManyToOne//(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_gift_id")
	private UserGiftDetails userGiftDetails;
	public int getGiftReceivedId() {
		return giftReceivedId;
	}
	public void setGiftReceivedId(int giftReceivedId) {
		this.giftReceivedId = giftReceivedId;
	}
	public Date getGiftReceivedDate() {
		return giftReceivedDate;
	}
	public void setGiftReceivedDate(Date giftReceivedDate) {
		this.giftReceivedDate = giftReceivedDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserGiftDetails getUserGiftDetails() {
		return userGiftDetails;
	}
	public void setUserGiftDetails(UserGiftDetails userGiftDetails) {
		this.userGiftDetails = userGiftDetails;
	}
	
	
	@Override
	public String toString() {
		return "GiftReceivedDetails [giftReceivedId=" + giftReceivedId + ", giftReceivedDate=" + giftReceivedDate
				+ ", user=" + user + ", userGiftDetails=" + userGiftDetails + "]";
	}
	
	
}


