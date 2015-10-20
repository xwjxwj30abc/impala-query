package zx.soft.impala.query.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import zx.soft.impala.query.core.ImpalaConnection;
import zx.soft.impala.query.domain.AccessList;
import zx.soft.impala.query.domain.AlertList;
import zx.soft.impala.query.domain.ClientList;
import zx.soft.impala.query.domain.QueryParameters;
import zx.soft.impala.query.domain.Weibo;

@Service
public class ImpalaService {

	private static Logger logger = LoggerFactory.getLogger(ImpalaService.class);
	private static Map<Integer, String> operation = new HashMap<>();
	static {
		operation.put(-1, "<");
		operation.put(0, "=");
		operation.put(1, ">");
		operation.put(2, " BETWEEN ");
	}

	public List<AccessList> queryAccessList(String tableName, List<QueryParameters> queryParams) {
		return getAccessListQueryResult(getSqlStatement(tableName, queryParams));
	}

	public List<AlertList> queryAlertList(String tableName, List<QueryParameters> queryParams) {
		return getAlertListQueryResult(getSqlStatement(tableName, queryParams));
	}

	public List<ClientList> queryClientList(String tableName, List<QueryParameters> queryParams) {
		return getClientListQueryResult(getSqlStatement(tableName, queryParams));
	}

	public List<Weibo> queryWeibo(String tableName, List<QueryParameters> queryParams) {
		return getWeibo(getSqlStatement(tableName, queryParams));
	}

	public List<AccessList> getAccessListQueryResult(String sqlStatement) {
		try (Connection conn = ImpalaConnection.getConnection();
				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery(sqlStatement);) {
			List<AccessList> temp = new ArrayList<>();
			if (resultSet != null) {
				try {
					while (resultSet.next()) {
						AccessList result = new AccessList();
						result.setId(resultSet.getLong(1));
						result.setService_code(resultSet.getLong(2));
						result.setNet_ending_ip(resultSet.getLong(3));
						result.setNet_ending_name(resultSet.getString(4));
						result.setTime(resultSet.getLong(5));
						result.setNet_ending_mac(resultSet.getLong(6));
						result.setDestination_ip(resultSet.getLong(7));
						result.setPort(resultSet.getInt(8));
						result.setService_type(resultSet.getInt(9));
						result.setKeyword1(resultSet.getString(10));
						result.setKeyword2(resultSet.getString(11));
						result.setKeyword3(resultSet.getString(12));
						result.setMac(resultSet.getLong(13));
						result.setSource_port(resultSet.getInt(14));
						result.setNet_ending_ipv6(resultSet.getString(15));
						result.setDestination_ipv6(resultSet.getString(16));
						result.setKeyword11(resultSet.getInt(17));
						result.setKeyword12(resultSet.getInt(18));
						result.setKeyword13(resultSet.getInt(19));
						result.setKeyword14(resultSet.getInt(20));
						result.setKeyword15(resultSet.getLong(21));
						result.setKeyword21(resultSet.getString(22));
						result.setKeyword22(resultSet.getString(23));
						result.setKeyword23(resultSet.getString(24));
						result.setKeyword24(resultSet.getString(25));
						result.setKeyword25(resultSet.getString(26));
						//result.setPid(resultSet.getLong(27));
						temp.add(result);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return temp;
		} catch (SQLException e) {
			throw new RuntimeException();
		} catch (Exception e1) {
			throw new RuntimeException();
		}
	}

	public List<AlertList> getAlertListQueryResult(String sqlStatement) {
		try (Connection conn = ImpalaConnection.getConnection();
				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery(sqlStatement);) {
			List<AlertList> temp = new ArrayList<>();
			if (resultSet != null) {
				try {
					while (resultSet.next()) {
						AlertList result = new AlertList();
						result.setId(resultSet.getLong(1));
						result.setService_code(resultSet.getLong(2));
						result.setRule_id(resultSet.getString(3));
						result.setDestination_ip(resultSet.getLong(4));
						result.setNet_ending_ip(resultSet.getLong(5));
						result.setNet_ending_mac(resultSet.getLong(6));
						result.setDestination_ipv6(resultSet.getString(7));
						result.setNet_ending_ipv6(resultSet.getString(8));
						result.setMatching_time(resultSet.getLong(9));
						result.setService_type(resultSet.getInt(10));
						result.setKeyword1(resultSet.getString(11));
						result.setKeyword2(resultSet.getString(12));
						result.setKeyword3(resultSet.getInt(13));
						result.setUser_name(resultSet.getString(14));
						result.setCertificate_type(resultSet.getString(15));
						result.setCertificate_code(resultSet.getString(16));
						result.setOrg_name(resultSet.getString(17));
						result.setCountry(resultSet.getString(18));
						result.setPid(resultSet.getLong(19));
						temp.add(result);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return temp;
		} catch (SQLException e) {
			throw new RuntimeException();
		} catch (Exception e1) {
			throw new RuntimeException();
		}
	}

	public List<ClientList> getClientListQueryResult(String sqlStatement) {
		try (Connection conn = ImpalaConnection.getConnection();
				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery(sqlStatement);) {
			List<ClientList> temp = new ArrayList<>();
			if (resultSet != null) {
				try {
					while (resultSet.next()) {
						ClientList result = new ClientList();
						result.setId(resultSet.getLong(1));
						result.setService_code(resultSet.getLong(1));
						result.setUser_name(resultSet.getString(1));
						result.setCertificate_type(resultSet.getString(1));
						result.setCertificate_code(resultSet.getString(1));
						result.setOnline_time(resultSet.getLong(1));
						result.setOffline_time(resultSet.getLong(1));
						result.setNet_ending_name(resultSet.getString(1));
						result.setNet_ending_ip(resultSet.getLong(1));
						result.setNet_ending_mac(resultSet.getLong(1));
						result.setOrg_name(resultSet.getString(1));
						result.setContry(resultSet.getString(1));
						result.setNote(resultSet.getString(1));
						result.setNet_ending_ipv6(resultSet.getString(1));
						result.setUser_name_pinyin(resultSet.getString(1));
						result.setSex(resultSet.getInt(1));
						result.setDescription(resultSet.getString(1));
						result.setPid(resultSet.getLong(1));
						temp.add(result);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return temp;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException();
		} catch (Exception e1) {
			throw new RuntimeException();
		}
	}

	private String getSqlStatement(String tableName, List<QueryParameters> queryParams) {
		String sqlStatement = null;
		StringBuilder condition = new StringBuilder();
		if (queryParams.size() > 0) {

			if (queryParams.get(0).getOperator() == 2) {
				condition.append(queryParams.get(0).getField()).append(operation.get(queryParams.get(0).getOperator()))
						.append(queryParams.get(0).getValue().split(",")[0]).append(" AND ")
						.append(queryParams.get(0).getValue().split(",")[1]);
			} else {
				condition.append(queryParams.get(0).getField()).append(operation.get(queryParams.get(0).getOperator()))
						.append(queryParams.get(0).getValue());
			}

			for (int j = 1; j < queryParams.size(); j++) {
				if (queryParams.get(j).getOperator() == 2) {
					condition.append(queryParams.get(j).getField()).append(queryParams.get(j).getOperator())
							.append(queryParams.get(j).getValue().split(",")[0]).append(" AND ")
							.append(queryParams.get(j).getValue().split(",")[1]);
				} else {
					condition.append(" AND ").append(queryParams.get(j).getField())
							.append(operation.get(queryParams.get(j).getOperator()))
							.append(queryParams.get(j).getValue());
				}
			}
		}
		sqlStatement = "SELECT * FROM " + tableName + " WHERE " + condition + " LIMIT 100";
		logger.info(sqlStatement);
		return sqlStatement;
	}

	public List<Weibo> getWeibo(String sqlStatement) {

		try (Connection conn = ImpalaConnection.getConnection();
				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery(sqlStatement);) {
			List<Weibo> temp = new ArrayList<>();
			if (resultSet != null) {

				while (resultSet.next()) {
					Weibo result = new Weibo();
					result.setWid(resultSet.getLong(2));
					result.setUsername(resultSet.getLong(3));
					result.setRepostscount(resultSet.getInt(4));
					result.setCommentscount(resultSet.getInt(5));
					result.setText(resultSet.getString(6));
					result.setCreateat(resultSet.getInt(7));
					result.setOwid(resultSet.getLong(8));
					result.setOusername(resultSet.getInt(9));
					result.setFavorited(resultSet.getBoolean(10));
					result.setOriginalpic(resultSet.getString(14));
					result.setSource(resultSet.getString(15));
					result.setVisible(resultSet.getString(16));
					result.setLasttime(resultSet.getInt(17));
					temp.add(result);
				}
			}
			return temp;
		} catch (SQLException e) {
			throw new RuntimeException();
		} catch (Exception e1) {
			throw new RuntimeException();
		}
	}

	public static void main(String[] args) throws SQLException {

		int i = 0;
		String sqlStatement = "select * from sina_weibo_10million where key between \'363026907893\' and \'363026907894\'";
		try (Connection conn = ImpalaConnection.getConnection();
				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery(sqlStatement);) {
			while (resultSet.next()) {
				i++;
				System.out.println(resultSet.getString(1));

			}
			System.out.println(i);
		}

		//		ImpalaService service = new ImpalaService();
		//		List<QueryParameters> queryParams = new ArrayList<>();
		//		QueryParameters param = new QueryParameters();
		//		param.setField("commentscount");
		//		param.setOperator(1);
		//		param.setValue("200");
		//		queryParams.add(param);
		//		QueryParameters param2 = new QueryParameters();
		//		param2.setField("repostscount");
		//		param2.setOperator(1);
		//		param2.setValue("0");
		//		queryParams.add(param2);
		//		System.out.println(JsonUtils.toJsonWithoutPretty(queryParams));
	}
}
