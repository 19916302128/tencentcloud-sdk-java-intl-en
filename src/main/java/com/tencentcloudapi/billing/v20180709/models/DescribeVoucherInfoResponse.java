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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVoucherInfoResponse extends AbstractModel{

    /**
    * The total number of vouchers.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The total voucher balance. The value of this parameter is the total balance (USD, rounded to 8 decimal places) multiplied by 100,000,000.
    */
    @SerializedName("TotalBalance")
    @Expose
    private Long TotalBalance;

    /**
    * The voucher information.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("VoucherInfos")
    @Expose
    private VoucherInfos [] VoucherInfos;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The total number of vouchers. 
     * @return TotalCount The total number of vouchers.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The total number of vouchers.
     * @param TotalCount The total number of vouchers.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get The total voucher balance. The value of this parameter is the total balance (USD, rounded to 8 decimal places) multiplied by 100,000,000. 
     * @return TotalBalance The total voucher balance. The value of this parameter is the total balance (USD, rounded to 8 decimal places) multiplied by 100,000,000.
     */
    public Long getTotalBalance() {
        return this.TotalBalance;
    }

    /**
     * Set The total voucher balance. The value of this parameter is the total balance (USD, rounded to 8 decimal places) multiplied by 100,000,000.
     * @param TotalBalance The total voucher balance. The value of this parameter is the total balance (USD, rounded to 8 decimal places) multiplied by 100,000,000.
     */
    public void setTotalBalance(Long TotalBalance) {
        this.TotalBalance = TotalBalance;
    }

    /**
     * Get The voucher information.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return VoucherInfos The voucher information.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public VoucherInfos [] getVoucherInfos() {
        return this.VoucherInfos;
    }

    /**
     * Set The voucher information.
Note: This field may return `null`, indicating that no valid value was found.
     * @param VoucherInfos The voucher information.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setVoucherInfos(VoucherInfos [] VoucherInfos) {
        this.VoucherInfos = VoucherInfos;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeVoucherInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVoucherInfoResponse(DescribeVoucherInfoResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalBalance != null) {
            this.TotalBalance = new Long(source.TotalBalance);
        }
        if (source.VoucherInfos != null) {
            this.VoucherInfos = new VoucherInfos[source.VoucherInfos.length];
            for (int i = 0; i < source.VoucherInfos.length; i++) {
                this.VoucherInfos[i] = new VoucherInfos(source.VoucherInfos[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalBalance", this.TotalBalance);
        this.setParamArrayObj(map, prefix + "VoucherInfos.", this.VoucherInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
