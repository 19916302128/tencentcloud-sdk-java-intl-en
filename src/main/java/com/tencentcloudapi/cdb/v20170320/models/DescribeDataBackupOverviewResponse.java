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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataBackupOverviewResponse extends AbstractModel {

    /**
    * Total capacity of data backups in bytes in the current region (including automatic backups and manual backups).
    */
    @SerializedName("DataBackupVolume")
    @Expose
    private Long DataBackupVolume;

    /**
    * Total number of data backups in the current region.
    */
    @SerializedName("DataBackupCount")
    @Expose
    private Long DataBackupCount;

    /**
    * Total capacity of automatic backups in the current region.
    */
    @SerializedName("AutoBackupVolume")
    @Expose
    private Long AutoBackupVolume;

    /**
    * Total number of automatic backups in the current region.
    */
    @SerializedName("AutoBackupCount")
    @Expose
    private Long AutoBackupCount;

    /**
    * Total capacity of manual backups in the current region.
    */
    @SerializedName("ManualBackupVolume")
    @Expose
    private Long ManualBackupVolume;

    /**
    * Total number of manual backups in the current region.
    */
    @SerializedName("ManualBackupCount")
    @Expose
    private Long ManualBackupCount;

    /**
    * Total capacity of remote backups
    */
    @SerializedName("RemoteBackupVolume")
    @Expose
    private Long RemoteBackupVolume;

    /**
    * Total number of remote backups
    */
    @SerializedName("RemoteBackupCount")
    @Expose
    private Long RemoteBackupCount;

    /**
    * Total capacity of archive backups in the current region
    */
    @SerializedName("DataBackupArchiveVolume")
    @Expose
    private Long DataBackupArchiveVolume;

    /**
    * Total number of archive backups in the current region
    */
    @SerializedName("DataBackupArchiveCount")
    @Expose
    private Long DataBackupArchiveCount;

    /**
    * Total backup capacity of standard storage in current region
    */
    @SerializedName("DataBackupStandbyVolume")
    @Expose
    private Long DataBackupStandbyVolume;

    /**
    * Total number of standard storage backups in current region
    */
    @SerializedName("DataBackupStandbyCount")
    @Expose
    private Long DataBackupStandbyCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total capacity of data backups in bytes in the current region (including automatic backups and manual backups). 
     * @return DataBackupVolume Total capacity of data backups in bytes in the current region (including automatic backups and manual backups).
     */
    public Long getDataBackupVolume() {
        return this.DataBackupVolume;
    }

    /**
     * Set Total capacity of data backups in bytes in the current region (including automatic backups and manual backups).
     * @param DataBackupVolume Total capacity of data backups in bytes in the current region (including automatic backups and manual backups).
     */
    public void setDataBackupVolume(Long DataBackupVolume) {
        this.DataBackupVolume = DataBackupVolume;
    }

    /**
     * Get Total number of data backups in the current region. 
     * @return DataBackupCount Total number of data backups in the current region.
     */
    public Long getDataBackupCount() {
        return this.DataBackupCount;
    }

    /**
     * Set Total number of data backups in the current region.
     * @param DataBackupCount Total number of data backups in the current region.
     */
    public void setDataBackupCount(Long DataBackupCount) {
        this.DataBackupCount = DataBackupCount;
    }

    /**
     * Get Total capacity of automatic backups in the current region. 
     * @return AutoBackupVolume Total capacity of automatic backups in the current region.
     */
    public Long getAutoBackupVolume() {
        return this.AutoBackupVolume;
    }

    /**
     * Set Total capacity of automatic backups in the current region.
     * @param AutoBackupVolume Total capacity of automatic backups in the current region.
     */
    public void setAutoBackupVolume(Long AutoBackupVolume) {
        this.AutoBackupVolume = AutoBackupVolume;
    }

    /**
     * Get Total number of automatic backups in the current region. 
     * @return AutoBackupCount Total number of automatic backups in the current region.
     */
    public Long getAutoBackupCount() {
        return this.AutoBackupCount;
    }

    /**
     * Set Total number of automatic backups in the current region.
     * @param AutoBackupCount Total number of automatic backups in the current region.
     */
    public void setAutoBackupCount(Long AutoBackupCount) {
        this.AutoBackupCount = AutoBackupCount;
    }

    /**
     * Get Total capacity of manual backups in the current region. 
     * @return ManualBackupVolume Total capacity of manual backups in the current region.
     */
    public Long getManualBackupVolume() {
        return this.ManualBackupVolume;
    }

    /**
     * Set Total capacity of manual backups in the current region.
     * @param ManualBackupVolume Total capacity of manual backups in the current region.
     */
    public void setManualBackupVolume(Long ManualBackupVolume) {
        this.ManualBackupVolume = ManualBackupVolume;
    }

    /**
     * Get Total number of manual backups in the current region. 
     * @return ManualBackupCount Total number of manual backups in the current region.
     */
    public Long getManualBackupCount() {
        return this.ManualBackupCount;
    }

    /**
     * Set Total number of manual backups in the current region.
     * @param ManualBackupCount Total number of manual backups in the current region.
     */
    public void setManualBackupCount(Long ManualBackupCount) {
        this.ManualBackupCount = ManualBackupCount;
    }

    /**
     * Get Total capacity of remote backups 
     * @return RemoteBackupVolume Total capacity of remote backups
     */
    public Long getRemoteBackupVolume() {
        return this.RemoteBackupVolume;
    }

    /**
     * Set Total capacity of remote backups
     * @param RemoteBackupVolume Total capacity of remote backups
     */
    public void setRemoteBackupVolume(Long RemoteBackupVolume) {
        this.RemoteBackupVolume = RemoteBackupVolume;
    }

    /**
     * Get Total number of remote backups 
     * @return RemoteBackupCount Total number of remote backups
     */
    public Long getRemoteBackupCount() {
        return this.RemoteBackupCount;
    }

    /**
     * Set Total number of remote backups
     * @param RemoteBackupCount Total number of remote backups
     */
    public void setRemoteBackupCount(Long RemoteBackupCount) {
        this.RemoteBackupCount = RemoteBackupCount;
    }

    /**
     * Get Total capacity of archive backups in the current region 
     * @return DataBackupArchiveVolume Total capacity of archive backups in the current region
     */
    public Long getDataBackupArchiveVolume() {
        return this.DataBackupArchiveVolume;
    }

    /**
     * Set Total capacity of archive backups in the current region
     * @param DataBackupArchiveVolume Total capacity of archive backups in the current region
     */
    public void setDataBackupArchiveVolume(Long DataBackupArchiveVolume) {
        this.DataBackupArchiveVolume = DataBackupArchiveVolume;
    }

    /**
     * Get Total number of archive backups in the current region 
     * @return DataBackupArchiveCount Total number of archive backups in the current region
     */
    public Long getDataBackupArchiveCount() {
        return this.DataBackupArchiveCount;
    }

    /**
     * Set Total number of archive backups in the current region
     * @param DataBackupArchiveCount Total number of archive backups in the current region
     */
    public void setDataBackupArchiveCount(Long DataBackupArchiveCount) {
        this.DataBackupArchiveCount = DataBackupArchiveCount;
    }

    /**
     * Get Total backup capacity of standard storage in current region 
     * @return DataBackupStandbyVolume Total backup capacity of standard storage in current region
     */
    public Long getDataBackupStandbyVolume() {
        return this.DataBackupStandbyVolume;
    }

    /**
     * Set Total backup capacity of standard storage in current region
     * @param DataBackupStandbyVolume Total backup capacity of standard storage in current region
     */
    public void setDataBackupStandbyVolume(Long DataBackupStandbyVolume) {
        this.DataBackupStandbyVolume = DataBackupStandbyVolume;
    }

    /**
     * Get Total number of standard storage backups in current region 
     * @return DataBackupStandbyCount Total number of standard storage backups in current region
     */
    public Long getDataBackupStandbyCount() {
        return this.DataBackupStandbyCount;
    }

    /**
     * Set Total number of standard storage backups in current region
     * @param DataBackupStandbyCount Total number of standard storage backups in current region
     */
    public void setDataBackupStandbyCount(Long DataBackupStandbyCount) {
        this.DataBackupStandbyCount = DataBackupStandbyCount;
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

    public DescribeDataBackupOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataBackupOverviewResponse(DescribeDataBackupOverviewResponse source) {
        if (source.DataBackupVolume != null) {
            this.DataBackupVolume = new Long(source.DataBackupVolume);
        }
        if (source.DataBackupCount != null) {
            this.DataBackupCount = new Long(source.DataBackupCount);
        }
        if (source.AutoBackupVolume != null) {
            this.AutoBackupVolume = new Long(source.AutoBackupVolume);
        }
        if (source.AutoBackupCount != null) {
            this.AutoBackupCount = new Long(source.AutoBackupCount);
        }
        if (source.ManualBackupVolume != null) {
            this.ManualBackupVolume = new Long(source.ManualBackupVolume);
        }
        if (source.ManualBackupCount != null) {
            this.ManualBackupCount = new Long(source.ManualBackupCount);
        }
        if (source.RemoteBackupVolume != null) {
            this.RemoteBackupVolume = new Long(source.RemoteBackupVolume);
        }
        if (source.RemoteBackupCount != null) {
            this.RemoteBackupCount = new Long(source.RemoteBackupCount);
        }
        if (source.DataBackupArchiveVolume != null) {
            this.DataBackupArchiveVolume = new Long(source.DataBackupArchiveVolume);
        }
        if (source.DataBackupArchiveCount != null) {
            this.DataBackupArchiveCount = new Long(source.DataBackupArchiveCount);
        }
        if (source.DataBackupStandbyVolume != null) {
            this.DataBackupStandbyVolume = new Long(source.DataBackupStandbyVolume);
        }
        if (source.DataBackupStandbyCount != null) {
            this.DataBackupStandbyCount = new Long(source.DataBackupStandbyCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataBackupVolume", this.DataBackupVolume);
        this.setParamSimple(map, prefix + "DataBackupCount", this.DataBackupCount);
        this.setParamSimple(map, prefix + "AutoBackupVolume", this.AutoBackupVolume);
        this.setParamSimple(map, prefix + "AutoBackupCount", this.AutoBackupCount);
        this.setParamSimple(map, prefix + "ManualBackupVolume", this.ManualBackupVolume);
        this.setParamSimple(map, prefix + "ManualBackupCount", this.ManualBackupCount);
        this.setParamSimple(map, prefix + "RemoteBackupVolume", this.RemoteBackupVolume);
        this.setParamSimple(map, prefix + "RemoteBackupCount", this.RemoteBackupCount);
        this.setParamSimple(map, prefix + "DataBackupArchiveVolume", this.DataBackupArchiveVolume);
        this.setParamSimple(map, prefix + "DataBackupArchiveCount", this.DataBackupArchiveCount);
        this.setParamSimple(map, prefix + "DataBackupStandbyVolume", this.DataBackupStandbyVolume);
        this.setParamSimple(map, prefix + "DataBackupStandbyCount", this.DataBackupStandbyCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

