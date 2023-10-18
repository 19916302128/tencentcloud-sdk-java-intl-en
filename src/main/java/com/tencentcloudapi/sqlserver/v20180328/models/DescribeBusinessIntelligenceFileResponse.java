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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBusinessIntelligenceFileResponse extends AbstractModel {

    /**
    * Total number of file deployment tasks
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * File deployment task set
    */
    @SerializedName("BackupMigrationSet")
    @Expose
    private BusinessIntelligenceFile [] BackupMigrationSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of file deployment tasks 
     * @return TotalCount Total number of file deployment tasks
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of file deployment tasks
     * @param TotalCount Total number of file deployment tasks
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get File deployment task set 
     * @return BackupMigrationSet File deployment task set
     */
    public BusinessIntelligenceFile [] getBackupMigrationSet() {
        return this.BackupMigrationSet;
    }

    /**
     * Set File deployment task set
     * @param BackupMigrationSet File deployment task set
     */
    public void setBackupMigrationSet(BusinessIntelligenceFile [] BackupMigrationSet) {
        this.BackupMigrationSet = BackupMigrationSet;
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

    public DescribeBusinessIntelligenceFileResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBusinessIntelligenceFileResponse(DescribeBusinessIntelligenceFileResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.BackupMigrationSet != null) {
            this.BackupMigrationSet = new BusinessIntelligenceFile[source.BackupMigrationSet.length];
            for (int i = 0; i < source.BackupMigrationSet.length; i++) {
                this.BackupMigrationSet[i] = new BusinessIntelligenceFile(source.BackupMigrationSet[i]);
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
        this.setParamArrayObj(map, prefix + "BackupMigrationSet.", this.BackupMigrationSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

