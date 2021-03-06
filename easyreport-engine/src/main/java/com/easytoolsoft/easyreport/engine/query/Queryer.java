package com.easytoolsoft.easyreport.engine.query;

import java.util.List;
import java.util.Map;

import com.easytoolsoft.easyreport.engine.data.ReportMetaDataColumn;
import com.easytoolsoft.easyreport.engine.data.ReportQueryParamItem;
import com.easytoolsoft.easyreport.engine.data.ReportResult;

/**
 * 报表查询器接口
 *
 * @author tomdeng
 */
public interface Queryer {
	public static final String ROWNUM_ALIAS = "ROW_NUM";

	/**
	 * 从sql语句中解析出报表元数据列集合
	 *
	 * @param sqlText
	 *            sql语句
	 * @return List[ReportMetaDataColumn]
	 */
	List<ReportMetaDataColumn> parseMetaDataColumns(String sqlText);

	/**
	 * 从sql语句中解析出报表查询参数(如下拉列表参数）的列表项集合
	 *
	 * @param sqlText
	 *            sql语句
	 * @return List[ReportQueryParamItem]
	 */
	List<ReportQueryParamItem> parseQueryParamItems(String sqlText);

	/**
	 * 获取报表原始数据行集合
	 *
	 * @return List[ReportMetaDataRow]
	 */
	ReportResult getMetaDataResult();

	/**
	 * 获取报表原始数据列集合
	 *
	 * @return List[ReportMetaDataColumn]
	 */
	List<ReportMetaDataColumn> getMetaDataColumns();

	/**
	 * 返回查询统计主体的原生结果行集
	 * 
	 * @author koqiui
	 * @date 2019年11月10日 下午6:48:51
	 * 
	 * @return
	 */
	public List<Map<String, Object>> getResultSetRows();

	/**
	 * 返回查询统计主体的原生结果（total, rows）
	 * 
	 * @author koqiui
	 * @date 2019年11月10日 下午6:48:51
	 * 
	 * @return
	 */
	public Map<String, Object> getResultSetMap();

	/**
	 * 返回同源指定的sql语句的原生结果行集
	 * 
	 * @author koqiui
	 * @date 2019年11月10日 下午10:18:48
	 * 
	 * @param sqlText
	 *            指定的sql语句
	 * @return
	 */
	public List<Map<String, Object>> getResultMapRows(String sqlText);
}
