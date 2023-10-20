package com.way2learnonline.repository;

import java.sql.SQLException;
import java.util.List;

import com.way2learnonline.model.Reward;



public class StubRewardRepository implements RewardRepository {

	public void addReward(Reward reward) throws SQLException {
		// TODO Auto-generated method stub

	}

	public int getTotalRewardAmount(Long accountNumber) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Reward> getAllRewardsForAccount(Long accountNUmber)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
