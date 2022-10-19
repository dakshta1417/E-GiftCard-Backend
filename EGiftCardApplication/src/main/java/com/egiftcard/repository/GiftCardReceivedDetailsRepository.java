package com.egiftcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.egiftcard.entity.GiftReceivedDetails;

@Repository
public interface GiftCardReceivedDetailsRepository extends JpaRepository<GiftReceivedDetails, Integer>{

}
