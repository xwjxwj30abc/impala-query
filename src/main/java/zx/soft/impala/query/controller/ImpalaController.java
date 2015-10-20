package zx.soft.impala.query.controller;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import zx.soft.impala.query.domain.AccessList;
import zx.soft.impala.query.domain.AlertList;
import zx.soft.impala.query.domain.ClientList;
import zx.soft.impala.query.domain.QueryParameters;
import zx.soft.impala.query.domain.Weibo;
import zx.soft.impala.query.service.ImpalaService;

@Controller
@RequestMapping("/impala")
public class ImpalaController {

	@Inject
	private ImpalaService impalaService;

	@RequestMapping(value = "/access", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<AccessList> getAccessResult(@RequestBody List<QueryParameters> queryParams)
			throws SQLException {
		return impalaService.queryAccessList("jdadt.accesslist", queryParams);
	}

	@RequestMapping(value = "/alert", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<AlertList> getAlertResult(@RequestBody List<QueryParameters> queryParams)
			throws SQLException {
		return impalaService.queryAlertList("jdadt.alertlist", queryParams);
	}

	@RequestMapping(value = "/client", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<ClientList> getClientResult(@RequestBody List<QueryParameters> queryParams)
			throws SQLException {
		return impalaService.queryClientList("jdadt.clientlist", queryParams);
	}

	@RequestMapping(value = "/weibo", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<Weibo> getWeibo(@RequestBody List<QueryParameters> queryParams) throws SQLException {
		return impalaService.queryWeibo("default.weibo_sina", queryParams);
	}

	@RequestMapping(value = "/alert", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<AlertList> getAlert(@RequestParam("field") String field, @RequestParam("value") long value) {

		String sqlStatement = "SELECT * FROM jdadt.alertlist" + " WHERE " + field + " = " + value;
		return impalaService.getAlertListQueryResult(sqlStatement);
	}

	@RequestMapping(value = "/access", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<AccessList> getAccess(@RequestParam("field") String field,
			@RequestParam("value") long value) {

		String sqlStatement = "SELECT * FROM jdadt.alertlist" + " WHERE " + field + " = " + value;
		return impalaService.getAccessListQueryResult(sqlStatement);
	}

	@RequestMapping(value = "/client", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<ClientList> getClient(@RequestParam("field") String field,
			@RequestParam("value") long value) {

		String sqlStatement = "SELECT * FROM jdadt.alertlist" + " WHERE " + field + " = " + value;
		return impalaService.getClientListQueryResult(sqlStatement);
	}

	@RequestMapping(value = "/weibo", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<Weibo> getWeibo(@RequestParam("field") String field, @RequestParam("value") long value) {

		String sqlStatement = "SELECT * FROM default.weibo_sina" + " WHERE " + field + " = " + value;
		return impalaService.getWeibo(sqlStatement);
	}
}
