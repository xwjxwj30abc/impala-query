package zx.soft.impala.query.core;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import org.datanucleus.store.rdbms.datasource.dbcp.BasicDataSource;

import zx.soft.utils.config.ConfigUtil;

public class ImpalaConnection {

	private static DataSource dataSource;

	public ImpalaConnection() {

	}

	public static Connection getConnection() {
		Connection con = null;
		if (dataSource == null) {
			initDataSource();
		}
		try {
			con = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void initDataSource() {

		Properties props = ConfigUtil.getProps("hive-connection.properties");
		BasicDataSource ds = new BasicDataSource();
		ds.setUrl(props.getProperty("connection.url"));
		ds.setDriverClassName(props.getProperty("jdbc.driver.class.name"));
		ds.setMaxActive(Integer.parseInt(props.getProperty("dbcp.maxActive")));
		ds.setMinIdle(Integer.parseInt(props.getProperty("dbcp.minIdle")));
		ds.setMaxIdle(Integer.parseInt(props.getProperty("dbcp.maxIdle")));
		ds.setMaxWait(Integer.parseInt(props.getProperty("dbcp.maxWait")));
		ds.setRemoveAbandoned(true);
		ds.setRemoveAbandonedTimeout(2000);
		dataSource = ds;
	}

	public static void main(String[] args) throws SQLException {
		String sqlStatement = "DESCRIBE jdadt.accesslist";
		try (Connection conn = ImpalaConnection.getConnection();
				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery(sqlStatement);) {
			if (resultSet != null) {
				while (resultSet.next()) {
					System.out.println(resultSet.getString(1));
				}

			}
		}
	}
}