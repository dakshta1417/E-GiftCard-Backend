package com.egiftcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.egiftcard.entity.GiftRedeemDetails;

@Repository
public interface NotificationServiceRedeemRepository extends JpaRepository<GiftRedeemDetails, Integer> {

}
