package com.example.demo0720.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 项目基础数据 @author： zp @date： 2022-07-14 @version： V1.0
 */
@Data
@TableName("project_base")
public class ProjectBase implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 项目信息主键 */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/** 项目sn */
	private String projectSn;

	/** 项目质量监督编号 */
	private String projectQualitySn;

	/** 安全生产许可证号 */
	private String safetyProductSn;

	/** 项目名称 */
	private String projectName;

	/** 项目地址 */
	private String projectAddress;

	/** 项目经度 */
	private String projectLongitude;

	/** 项目纬度 */
	private String projectLatitude;

	/** 项目建筑面积 */
	private String projectArea;

	/** 项目投资金额 */
	private String projectPrice;

	/** 是否绿建：1.是，2.否 */
	private Integer greenBuild;

	/** 消防审核状态：1.未审核，2.已审核 */
	private Integer fireApprovalStatus;

	/** 消防审核状态名称 */
	private String fireApprovalStatusName;

	/** 是否为人防工程：1.是，2.否 */
	private String personPrevent;

	/** 建设单位id */
	private Integer buildUnitId;

	/** 建设单位名称 */
	private String buildUnitName;

	/** 监理单位id */
	private Integer supervisionUnitId;

	/** 监理单位名称 */
	private String supervisionUnitName;

	/** 施工单位id */
	private Integer constructionUnitId;

	/** 施工单位名称 */
	private String constructionUnitName;

	/** 勘察单位id */
	private Integer prospectingUnitId;

	/** 勘察单位名称 */
	private String prospectingUnitName;

	/** 设计单位id */
	private Integer designUnitId;

	/** 设计单位名称 */
	private String designUnitName;

	/** 是否是重点项目：1.是，2.否 */
	private Integer keyProject;

	/** 项目建设状态 1、未开工 2、建设中 3、停工 4、竣工 */
	private Integer buildStatus;

	/** 项目分类:1.一般工程,2.基坑工程，3.模板工程，4.起重吊篮，5.暗挖工程，6.幕墙工程，7.脚手架工程，8.钢结构工程，9.人工挖孔桩工程 */
	private Integer projectType;

	/** 项目投资类型：1.政府投资，2.社会投资，3.个人投资 */
	private Integer investmentType;

	/** 项目开工时间 */
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date projectStartDate;

	/** 项目竣工时间 */
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date projectEndDate;

	/** 申报时间 */
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date applyDate;

	/** 项目联络员id */
	private Integer projectLiaisonId;

	/** 项目联络员名称 */
	private String projectLiaisonName;

	/**
	 * 审核节点： 1.审核中， 2.安质站预审通过， 3.安质站预审驳回 4.施工单位审核通过， 5.施工单位审核驳回， 6.监理单位审核通过
	 * 7.监理单位审核驳回 8.建设单位审核通过 9.建设单位审核驳回 10.办结 11.安质站终审驳回
	 */
	private Integer approvalStatus  ;

	/** 项目审核状态名称 */
	private String approvalStatusName;

	/** 审核时间 */
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date approvalDate;

	/** 报建类型：1.消防审查，2.人防审查，3.安全报建，4.质量报建 */
	private Integer projectEstablishType;

	/** 报建时间 */
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date establishDate;

	/** 是否备案：1.消防备案，2.人防备案，3.安全备案，4.质量备案 */
	private Integer projectRecord;

	/** 备案时间 */
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date recordDate;

	/** 其他文件url */
	private String otherFileUrl;

	/** 备用字段1 */
	private String extend1;

	/** 备用字段2 */
	private String extend2;

	/** 备用字段3 */
	private String extend3;

	/** 编辑时间 */
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date editDate;

	/** 创建时间 */
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createDate;
}
