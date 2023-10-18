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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupOverviewResponse extends AbstractModel {

    /**
    * Total free space size in bytes
    */
    @SerializedName("TotalFreeSize")
    @Expose
    private Long TotalFreeSize;

    /**
    * Used free space size in bytes
    */
    @SerializedName("UsedFreeSize")
    @Expose
    private Long UsedFreeSize;

    /**
    * Used paid space size in bytes
    */
    @SerializedName("UsedBillingSize")
    @Expose
    private Long UsedBillingSize;

    /**
    * Number of log backups
    */
    @SerializedName("LogBackupCount")
    @Expose
    private Long LogBackupCount;

    /**
    * Log backup size in bytes
    */
    @SerializedName("LogBackupSize")
    @Expose
    private Long LogBackupSize;

    /**
    * Number of manually created full backups
    */
    @SerializedName("ManualBaseBackupCount")
    @Expose
    private Long ManualBaseBackupCount;

    /**
    * Size of manually created full backups in bytes
    */
    @SerializedName("ManualBaseBackupSize")
    @Expose
    private Long ManualBaseBackupSize;

    /**
    * Number of automatically created full backups
    */
    @SerializedName("AutoBaseBackupCount")
    @Expose
    private Long AutoBaseBackupCount;

    /**
    * Size of automatically created full backups in bytes
    */
    @SerializedName("AutoBaseBackupSize")
    @Expose
    private Long AutoBaseBackupSize;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total free space size in bytes 
     * @return TotalFreeSize Total free space size in bytes
     */
    public Long getTotalFreeSize() {
        return this.TotalFreeSize;
    }

    /**
     * Set Total free space size in bytes
     * @param TotalFreeSize Total free space size in bytes
     */
    public void setTotalFreeSize(Long TotalFreeSize) {
        this.TotalFreeSize = TotalFreeSize;
    }

    /**
     * Get Used free space size in bytes 
     * @return UsedFreeSize Used free space size in bytes
     */
    public Long getUsedFreeSize() {
        return this.UsedFreeSize;
    }

    /**
     * Set Used free space size in bytes
     * @param UsedFreeSize Used free space size in bytes
     */
    public void setUsedFreeSize(Long UsedFreeSize) {
        this.UsedFreeSize = UsedFreeSize;
    }

    /**
     * Get Used paid space size in bytes 
     * @return UsedBillingSize Used paid space size in bytes
     */
    public Long getUsedBillingSize() {
        return this.UsedBillingSize;
    }

    /**
     * Set Used paid space size in bytes
     * @param UsedBillingSize Used paid space size in bytes
     */
    public void setUsedBillingSize(Long UsedBillingSize) {
        this.UsedBillingSize = UsedBillingSize;
    }

    /**
     * Get Number of log backups 
     * @return LogBackupCount Number of log backups
     */
    public Long getLogBackupCount() {
        return this.LogBackupCount;
    }

    /**
     * Set Number of log backups
     * @param LogBackupCount Number of log backups
     */
    public void setLogBackupCount(Long LogBackupCount) {
        this.LogBackupCount = LogBackupCount;
    }

    /**
     * Get Log backup size in bytes 
     * @return LogBackupSize Log backup size in bytes
     */
    public Long getLogBackupSize() {
        return this.LogBackupSize;
    }

    /**
     * Set Log backup size in bytes
     * @param LogBackupSize Log backup size in bytes
     */
    public void setLogBackupSize(Long LogBackupSize) {
        this.LogBackupSize = LogBackupSize;
    }

    /**
     * Get Number of manually created full backups 
     * @return ManualBaseBackupCount Number of manually created full backups
     */
    public Long getManualBaseBackupCount() {
        return this.ManualBaseBackupCount;
    }

    /**
     * Set Number of manually created full backups
     * @param ManualBaseBackupCount Number of manually created full backups
     */
    public void setManualBaseBackupCount(Long ManualBaseBackupCount) {
        this.ManualBaseBackupCount = ManualBaseBackupCount;
    }

    /**
     * Get Size of manually created full backups in bytes 
     * @return ManualBaseBackupSize Size of manually created full backups in bytes
     */
    public Long getManualBaseBackupSize() {
        return this.ManualBaseBackupSize;
    }

    /**
     * Set Size of manually created full backups in bytes
     * @param ManualBaseBackupSize Size of manually created full backups in bytes
     */
    public void setManualBaseBackupSize(Long ManualBaseBackupSize) {
        this.ManualBaseBackupSize = ManualBaseBackupSize;
    }

    /**
     * Get Number of automatically created full backups 
     * @return AutoBaseBackupCount Number of automatically created full backups
     */
    public Long getAutoBaseBackupCount() {
        return this.AutoBaseBackupCount;
    }

    /**
     * Set Number of automatically created full backups
     * @param AutoBaseBackupCount Number of automatically created full backups
     */
    public void setAutoBaseBackupCount(Long AutoBaseBackupCount) {
        this.AutoBaseBackupCount = AutoBaseBackupCount;
    }

    /**
     * Get Size of automatically created full backups in bytes 
     * @return AutoBaseBackupSize Size of automatically created full backups in bytes
     */
    public Long getAutoBaseBackupSize() {
        return this.AutoBaseBackupSize;
    }

    /**
     * Set Size of automatically created full backups in bytes
     * @param AutoBaseBackupSize Size of automatically created full backups in bytes
     */
    public void setAutoBaseBackupSize(Long AutoBaseBackupSize) {
        this.AutoBaseBackupSize = AutoBaseBackupSize;
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

    public DescribeBackupOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupOverviewResponse(DescribeBackupOverviewResponse source) {
        if (source.TotalFreeSize != null) {
            this.TotalFreeSize = new Long(source.TotalFreeSize);
        }
        if (source.UsedFreeSize != null) {
            this.UsedFreeSize = new Long(source.UsedFreeSize);
        }
        if (source.UsedBillingSize != null) {
            this.UsedBillingSize = new Long(source.UsedBillingSize);
        }
        if (source.LogBackupCount != null) {
            this.LogBackupCount = new Long(source.LogBackupCount);
        }
        if (source.LogBackupSize != null) {
            this.LogBackupSize = new Long(source.LogBackupSize);
        }
        if (source.ManualBaseBackupCount != null) {
            this.ManualBaseBackupCount = new Long(source.ManualBaseBackupCount);
        }
        if (source.ManualBaseBackupSize != null) {
            this.ManualBaseBackupSize = new Long(source.ManualBaseBackupSize);
        }
        if (source.AutoBaseBackupCount != null) {
            this.AutoBaseBackupCount = new Long(source.AutoBaseBackupCount);
        }
        if (source.AutoBaseBackupSize != null) {
            this.AutoBaseBackupSize = new Long(source.AutoBaseBackupSize);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalFreeSize", this.TotalFreeSize);
        this.setParamSimple(map, prefix + "UsedFreeSize", this.UsedFreeSize);
        this.setParamSimple(map, prefix + "UsedBillingSize", this.UsedBillingSize);
        this.setParamSimple(map, prefix + "LogBackupCount", this.LogBackupCount);
        this.setParamSimple(map, prefix + "LogBackupSize", this.LogBackupSize);
        this.setParamSimple(map, prefix + "ManualBaseBackupCount", this.ManualBaseBackupCount);
        this.setParamSimple(map, prefix + "ManualBaseBackupSize", this.ManualBaseBackupSize);
        this.setParamSimple(map, prefix + "AutoBaseBackupCount", this.AutoBaseBackupCount);
        this.setParamSimple(map, prefix + "AutoBaseBackupSize", this.AutoBaseBackupSize);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

