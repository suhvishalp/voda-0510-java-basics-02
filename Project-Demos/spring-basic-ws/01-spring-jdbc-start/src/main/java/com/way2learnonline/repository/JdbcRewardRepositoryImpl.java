package com.way2learnonline.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.way2learnonline.model.Reward;


public class JdbcRewardRepositoryImpl implements RewardRepository {
	
	private DataSource dataSource;
	
	
	public JdbcRewardRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}

	public JdbcRewardRepositoryImpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	public void addReward(Reward reward) throws SQLException {
		String query="insert into Reward(rewardAmount,accountNumber) values(?,?)";
		Connection connection=dataSource.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setInt(1, reward.getRewardAmount());
		preparedStatement.setLong(2, reward.getAccountNumber());
		
		preparedStatement.executeUpdate();

	}

	public int getTotalRewardAmount(Long accountNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Reward> getAllRewardsForAccount(Long accountNUmber) {
		// TODO Auto-generated method stub
		return null;
	}

}
