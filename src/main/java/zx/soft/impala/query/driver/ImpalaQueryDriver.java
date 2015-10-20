package zx.soft.impala.query.driver;

import zx.soft.impala.query.server.QueryServer;
import zx.soft.utils.driver.ProgramDriver;

public class ImpalaQueryDriver {

	public static void main(String[] args) {

		int exitCode = -1;
		ProgramDriver pgd = new ProgramDriver();
		try {
			pgd.addClass("queryApiServer", QueryServer.class, "搜索查询接口");
			pgd.driver(args);
			exitCode = 0;
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}

		System.exit(exitCode);

	}

}
