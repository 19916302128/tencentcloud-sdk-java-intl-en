/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillDetailForOrganizationRequest extends AbstractModel {

    /**
    * Pagination offset. If `Offset` is `0`, it indicates the first page. When `Limit` is `100`, if `Offset` is `100`, it indicates the second page; if `Offset` is `200`, it indicates the third page, and so on.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of entries returned at a time. The maximum value is `100`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Cycle type, which can be `byUsedTime` (by billing cycle) or `byPayTime` (by deduction time). This value must be the same as the billing period type in Billing Center for that particular month. You can check your billing cycle at the top of the [Bill Overview](https://console.cloud.tencent.com/expense/bill/overview) page.
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
    * Bill month in the format of "yyyy-mm". You only have to enter either `Month` or `BeginTime` and `EndTime`. When you enter values for `BeginTime` and `EndTime`, `Month` becomes invalid. This value must be no earlier than the month when Bill 2.0 is activated; last 18 months data is available.
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * Start time of the cycle in the format of "yyyy-mm-dd hh:ii:ss". You only have to enter either `Month` or `BeginTime` and `EndTime`. When you enter values for `BeginTime` and `EndTime`, `Month` becomes invalid. `BeginTime` and `EndTime` must be passed together, and their values must be of the same month. Query period must start and end on the same month, andthe query result returned will be of the entire month. This value must be no earlier than the month when Bill 2.0 is activated; last 18 months data is available.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * End time of the cycle in the format of "yyyy-mm-dd hh:ii:ss". You only have to enter either `Month` or `BeginTime` and `EndTime`. When you enter values for `BeginTime` and `EndTime`, `Month` becomes invalid. `BeginTime` and `EndTime` must be passed together, and their values must be of the same month. Query period must start and end on the same month, andthe query result returned will be of the entire month. This value must be no earlier than the month when Bill 2.0 is activated; last 18 months data is available.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Indicates whether the total number of records is required, used for pagination.
Valid values: `1` (required), `0` (not required).
    */
    @SerializedName("NeedRecordNum")
    @Expose
    private Long NeedRecordNum;

    /**
    * Billing mode, which can be `prePay` (monthly subscription) or `postPay` (pay-as-you-go).
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * ID of the instance to be queried.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Transaction type. This parameter needs to be input using the `ActionTypeName` value. Valid values:
Monthly subscription purchase
Monthly subscription renewal
Monthly subscription upgrade/downgrade
Monthly subscription refund 
Pay-as-you-go deduction 
Offline project deduction 
Offline product deduction 
Adjustment deduction 
Adjustment compensation 
Hourly pay-as-you-go 
Daily pay-as-you-go 
Monthly pay-as-you-go 
Hourly spot instance 
Offline project adjustment compensation 
Offline product adjustment compensation 
Offer deduction 
Offer compensation 
Pay-as-you-go resource migration in 
Pay-as-you-go resource migration out 
Monthly subscription resource migration in 
Monthly subscription resource migration out 
Prepaid 
Hourly 
RI refund 
Pay-as-you-go reversal 
Monthly subscription to pay-as-you-go 
Minimum spend deduction 
Hourly savings plan fee
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * Project ID: The ID of the project to which the resource belongs.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Product code.
Note: To query the product codes used in the current month, call <a href="https://intl.cloud.tencent.com/document/product/555/35761?from_cn_redirect=1">DescribeBillSummaryByProduct</a>.
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * Context information returned by the last response. You can view multiple pages when querying for data after May 2023 to speed up the query. We recommend you use this query method if your data volume is above 100 thousand entries, which can improve query speed by 2-10 times.
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
     * Get Pagination offset. If `Offset` is `0`, it indicates the first page. When `Limit` is `100`, if `Offset` is `100`, it indicates the second page; if `Offset` is `200`, it indicates the third page, and so on. 
     * @return Offset Pagination offset. If `Offset` is `0`, it indicates the first page. When `Limit` is `100`, if `Offset` is `100`, it indicates the second page; if `Offset` is `200`, it indicates the third page, and so on.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. If `Offset` is `0`, it indicates the first page. When `Limit` is `100`, if `Offset` is `100`, it indicates the second page; if `Offset` is `200`, it indicates the third page, and so on.
     * @param Offset Pagination offset. If `Offset` is `0`, it indicates the first page. When `Limit` is `100`, if `Offset` is `100`, it indicates the second page; if `Offset` is `200`, it indicates the third page, and so on.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of entries returned at a time. The maximum value is `100`. 
     * @return Limit The number of entries returned at a time. The maximum value is `100`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of entries returned at a time. The maximum value is `100`.
     * @param Limit The number of entries returned at a time. The maximum value is `100`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Cycle type, which can be `byUsedTime` (by billing cycle) or `byPayTime` (by deduction time). This value must be the same as the billing period type in Billing Center for that particular month. You can check your billing cycle at the top of the [Bill Overview](https://console.cloud.tencent.com/expense/bill/overview) page. 
     * @return PeriodType Cycle type, which can be `byUsedTime` (by billing cycle) or `byPayTime` (by deduction time). This value must be the same as the billing period type in Billing Center for that particular month. You can check your billing cycle at the top of the [Bill Overview](https://console.cloud.tencent.com/expense/bill/overview) page.
     */
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set Cycle type, which can be `byUsedTime` (by billing cycle) or `byPayTime` (by deduction time). This value must be the same as the billing period type in Billing Center for that particular month. You can check your billing cycle at the top of the [Bill Overview](https://console.cloud.tencent.com/expense/bill/overview) page.
     * @param PeriodType Cycle type, which can be `byUsedTime` (by billing cycle) or `byPayTime` (by deduction time). This value must be the same as the billing period type in Billing Center for that particular month. You can check your billing cycle at the top of the [Bill Overview](https://console.cloud.tencent.com/expense/bill/overview) page.
     */
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    /**
     * Get Bill month in the format of "yyyy-mm". You only have to enter either `Month` or `BeginTime` and `EndTime`. When you enter values for `BeginTime` and `EndTime`, `Month` becomes invalid. This value must be no earlier than the month when Bill 2.0 is activated; last 18 months data is available. 
     * @return Month Bill month in the format of "yyyy-mm". You only have to enter either `Month` or `BeginTime` and `EndTime`. When you enter values for `BeginTime` and `EndTime`, `Month` becomes invalid. This value must be no earlier than the month when Bill 2.0 is activated; last 18 months data is available.
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set Bill month in the format of "yyyy-mm". You only have to enter either `Month` or `BeginTime` and `EndTime`. When you enter values for `BeginTime` and `EndTime`, `Month` becomes invalid. This value must be no earlier than the month when Bill 2.0 is activated; last 18 months data is available.
     * @param Month Bill month in the format of "yyyy-mm". You only have to enter either `Month` or `BeginTime` and `EndTime`. When you enter values for `BeginTime` and `EndTime`, `Month` becomes invalid. This value must be no earlier than the month when Bill 2.0 is activated; last 18 months data is available.
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get Start time of the cycle in the format of "yyyy-mm-dd hh:ii:ss". You only have to enter either `Month` or `BeginTime` and `EndTime`. When you enter values for `BeginTime` and `EndTime`, `Month` becomes invalid. `BeginTime` and `EndTime` must be passed together, and their values must be of the same month. Query period must start and end on the same month, andthe query result returned will be of the entire month. This value must be no earlier than the month when Bill 2.0 is activated; last 18 months data is available. 
     * @return BeginTime Start time of the cycle in the format of "yyyy-mm-dd hh:ii:ss". You only have to enter either `Month` or `BeginTime` and `EndTime`. When you enter values for `BeginTime` and `EndTime`, `Month` becomes invalid. `BeginTime` and `EndTime` must be passed together, and their values must be of the same month. Query period must start and end on the same month, andthe query result returned will be of the entire month. This value must be no earlier than the month when Bill 2.0 is activated; last 18 months data is available.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time of the cycle in the format of "yyyy-mm-dd hh:ii:ss". You only have to enter either `Month` or `BeginTime` and `EndTime`. When you enter values for `BeginTime` and `EndTime`, `Month` becomes invalid. `BeginTime` and `EndTime` must be passed together, and their values must be of the same month. Query period must start and end on the same month, andthe query result returned will be of the entire month. This value must be no earlier than the month when Bill 2.0 is activated; last 18 months data is available.
     * @param BeginTime Start time of the cycle in the format of "yyyy-mm-dd hh:ii:ss". You only have to enter either `Month` or `BeginTime` and `EndTime`. When you enter values for `BeginTime` and `EndTime`, `Month` becomes invalid. `BeginTime` and `EndTime` must be passed together, and their values must be of the same month. Query period must start and end on the same month, andthe query result returned will be of the entire month. This value must be no earlier than the month when Bill 2.0 is activated; last 18 months data is available.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get End time of the cycle in the format of "yyyy-mm-dd hh:ii:ss". You only have to enter either `Month` or `BeginTime` and `EndTime`. When you enter values for `BeginTime` and `EndTime`, `Month` becomes invalid. `BeginTime` and `EndTime` must be passed together, and their values must be of the same month. Query period must start and end on the same month, andthe query result returned will be of the entire month. This value must be no earlier than the month when Bill 2.0 is activated; last 18 months data is available. 
     * @return EndTime End time of the cycle in the format of "yyyy-mm-dd hh:ii:ss". You only have to enter either `Month` or `BeginTime` and `EndTime`. When you enter values for `BeginTime` and `EndTime`, `Month` becomes invalid. `BeginTime` and `EndTime` must be passed together, and their values must be of the same month. Query period must start and end on the same month, andthe query result returned will be of the entire month. This value must be no earlier than the month when Bill 2.0 is activated; last 18 months data is available.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the cycle in the format of "yyyy-mm-dd hh:ii:ss". You only have to enter either `Month` or `BeginTime` and `EndTime`. When you enter values for `BeginTime` and `EndTime`, `Month` becomes invalid. `BeginTime` and `EndTime` must be passed together, and their values must be of the same month. Query period must start and end on the same month, andthe query result returned will be of the entire month. This value must be no earlier than the month when Bill 2.0 is activated; last 18 months data is available.
     * @param EndTime End time of the cycle in the format of "yyyy-mm-dd hh:ii:ss". You only have to enter either `Month` or `BeginTime` and `EndTime`. When you enter values for `BeginTime` and `EndTime`, `Month` becomes invalid. `BeginTime` and `EndTime` must be passed together, and their values must be of the same month. Query period must start and end on the same month, andthe query result returned will be of the entire month. This value must be no earlier than the month when Bill 2.0 is activated; last 18 months data is available.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Indicates whether the total number of records is required, used for pagination.
Valid values: `1` (required), `0` (not required). 
     * @return NeedRecordNum Indicates whether the total number of records is required, used for pagination.
Valid values: `1` (required), `0` (not required).
     */
    public Long getNeedRecordNum() {
        return this.NeedRecordNum;
    }

    /**
     * Set Indicates whether the total number of records is required, used for pagination.
Valid values: `1` (required), `0` (not required).
     * @param NeedRecordNum Indicates whether the total number of records is required, used for pagination.
Valid values: `1` (required), `0` (not required).
     */
    public void setNeedRecordNum(Long NeedRecordNum) {
        this.NeedRecordNum = NeedRecordNum;
    }

    /**
     * Get Billing mode, which can be `prePay` (monthly subscription) or `postPay` (pay-as-you-go). 
     * @return PayMode Billing mode, which can be `prePay` (monthly subscription) or `postPay` (pay-as-you-go).
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode, which can be `prePay` (monthly subscription) or `postPay` (pay-as-you-go).
     * @param PayMode Billing mode, which can be `prePay` (monthly subscription) or `postPay` (pay-as-you-go).
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get ID of the instance to be queried. 
     * @return ResourceId ID of the instance to be queried.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set ID of the instance to be queried.
     * @param ResourceId ID of the instance to be queried.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Transaction type. This parameter needs to be input using the `ActionTypeName` value. Valid values:
Monthly subscription purchase
Monthly subscription renewal
Monthly subscription upgrade/downgrade
Monthly subscription refund 
Pay-as-you-go deduction 
Offline project deduction 
Offline product deduction 
Adjustment deduction 
Adjustment compensation 
Hourly pay-as-you-go 
Daily pay-as-you-go 
Monthly pay-as-you-go 
Hourly spot instance 
Offline project adjustment compensation 
Offline product adjustment compensation 
Offer deduction 
Offer compensation 
Pay-as-you-go resource migration in 
Pay-as-you-go resource migration out 
Monthly subscription resource migration in 
Monthly subscription resource migration out 
Prepaid 
Hourly 
RI refund 
Pay-as-you-go reversal 
Monthly subscription to pay-as-you-go 
Minimum spend deduction 
Hourly savings plan fee 
     * @return ActionType Transaction type. This parameter needs to be input using the `ActionTypeName` value. Valid values:
Monthly subscription purchase
Monthly subscription renewal
Monthly subscription upgrade/downgrade
Monthly subscription refund 
Pay-as-you-go deduction 
Offline project deduction 
Offline product deduction 
Adjustment deduction 
Adjustment compensation 
Hourly pay-as-you-go 
Daily pay-as-you-go 
Monthly pay-as-you-go 
Hourly spot instance 
Offline project adjustment compensation 
Offline product adjustment compensation 
Offer deduction 
Offer compensation 
Pay-as-you-go resource migration in 
Pay-as-you-go resource migration out 
Monthly subscription resource migration in 
Monthly subscription resource migration out 
Prepaid 
Hourly 
RI refund 
Pay-as-you-go reversal 
Monthly subscription to pay-as-you-go 
Minimum spend deduction 
Hourly savings plan fee
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set Transaction type. This parameter needs to be input using the `ActionTypeName` value. Valid values:
Monthly subscription purchase
Monthly subscription renewal
Monthly subscription upgrade/downgrade
Monthly subscription refund 
Pay-as-you-go deduction 
Offline project deduction 
Offline product deduction 
Adjustment deduction 
Adjustment compensation 
Hourly pay-as-you-go 
Daily pay-as-you-go 
Monthly pay-as-you-go 
Hourly spot instance 
Offline project adjustment compensation 
Offline product adjustment compensation 
Offer deduction 
Offer compensation 
Pay-as-you-go resource migration in 
Pay-as-you-go resource migration out 
Monthly subscription resource migration in 
Monthly subscription resource migration out 
Prepaid 
Hourly 
RI refund 
Pay-as-you-go reversal 
Monthly subscription to pay-as-you-go 
Minimum spend deduction 
Hourly savings plan fee
     * @param ActionType Transaction type. This parameter needs to be input using the `ActionTypeName` value. Valid values:
Monthly subscription purchase
Monthly subscription renewal
Monthly subscription upgrade/downgrade
Monthly subscription refund 
Pay-as-you-go deduction 
Offline project deduction 
Offline product deduction 
Adjustment deduction 
Adjustment compensation 
Hourly pay-as-you-go 
Daily pay-as-you-go 
Monthly pay-as-you-go 
Hourly spot instance 
Offline project adjustment compensation 
Offline product adjustment compensation 
Offer deduction 
Offer compensation 
Pay-as-you-go resource migration in 
Pay-as-you-go resource migration out 
Monthly subscription resource migration in 
Monthly subscription resource migration out 
Prepaid 
Hourly 
RI refund 
Pay-as-you-go reversal 
Monthly subscription to pay-as-you-go 
Minimum spend deduction 
Hourly savings plan fee
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Project ID: The ID of the project to which the resource belongs. 
     * @return ProjectId Project ID: The ID of the project to which the resource belongs.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID: The ID of the project to which the resource belongs.
     * @param ProjectId Project ID: The ID of the project to which the resource belongs.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Product code.
Note: To query the product codes used in the current month, call <a href="https://intl.cloud.tencent.com/document/product/555/35761?from_cn_redirect=1">DescribeBillSummaryByProduct</a>. 
     * @return BusinessCode Product code.
Note: To query the product codes used in the current month, call <a href="https://intl.cloud.tencent.com/document/product/555/35761?from_cn_redirect=1">DescribeBillSummaryByProduct</a>.
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set Product code.
Note: To query the product codes used in the current month, call <a href="https://intl.cloud.tencent.com/document/product/555/35761?from_cn_redirect=1">DescribeBillSummaryByProduct</a>.
     * @param BusinessCode Product code.
Note: To query the product codes used in the current month, call <a href="https://intl.cloud.tencent.com/document/product/555/35761?from_cn_redirect=1">DescribeBillSummaryByProduct</a>.
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get Context information returned by the last response. You can view multiple pages when querying for data after May 2023 to speed up the query. We recommend you use this query method if your data volume is above 100 thousand entries, which can improve query speed by 2-10 times. 
     * @return Context Context information returned by the last response. You can view multiple pages when querying for data after May 2023 to speed up the query. We recommend you use this query method if your data volume is above 100 thousand entries, which can improve query speed by 2-10 times.
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set Context information returned by the last response. You can view multiple pages when querying for data after May 2023 to speed up the query. We recommend you use this query method if your data volume is above 100 thousand entries, which can improve query speed by 2-10 times.
     * @param Context Context information returned by the last response. You can view multiple pages when querying for data after May 2023 to speed up the query. We recommend you use this query method if your data volume is above 100 thousand entries, which can improve query speed by 2-10 times.
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    public DescribeBillDetailForOrganizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillDetailForOrganizationRequest(DescribeBillDetailForOrganizationRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.PeriodType != null) {
            this.PeriodType = new String(source.PeriodType);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.NeedRecordNum != null) {
            this.NeedRecordNum = new Long(source.NeedRecordNum);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "NeedRecordNum", this.NeedRecordNum);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "Context", this.Context);

    }
}

