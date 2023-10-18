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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVirusScanSettingResponse extends AbstractModel {

    /**
    * Whether to enable scheduled scan
    */
    @SerializedName("EnableScan")
    @Expose
    private Boolean EnableScan;

    /**
    * Check cycle in days
    */
    @SerializedName("Cycle")
    @Expose
    private Long Cycle;

    /**
    * Scan start time
    */
    @SerializedName("BeginScanAt")
    @Expose
    private String BeginScanAt;

    /**
    * Scan all paths
    */
    @SerializedName("ScanPathAll")
    @Expose
    private Boolean ScanPathAll;

    /**
    * Valid when `ScanPathAll` is `true`. Valid values of `ScanPathAll`: `0` (scan the following paths); `1` (scan all paths except the following).
    */
    @SerializedName("ScanPathType")
    @Expose
    private Long ScanPathType;

    /**
    * Timeout period in hours
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Scanning scope. Valid values: `0` (container); `1` (server).
    */
    @SerializedName("ScanRangeType")
    @Expose
    private Long ScanRangeType;

    /**
    * Valid values: `true` (all); `false` (specified).
    */
    @SerializedName("ScanRangeAll")
    @Expose
    private Boolean ScanRangeAll;

    /**
    * ID of the specified container or server to be scanned, which is based on `ScanRangeType`.
    */
    @SerializedName("ScanIds")
    @Expose
    private String [] ScanIds;

    /**
    * Specified path to be excluded or scanned
    */
    @SerializedName("ScanPath")
    @Expose
    private String [] ScanPath;

    /**
    * Timeout settings of quick check
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClickTimeout")
    @Expose
    private Long ClickTimeout;

    /**
    * Path scanning mode: 
`SCAN_PATH_ALL`: Scan all paths
`SCAN_PATH_DEFAULT`: Scan the default path
`SCAN_PATH_USER_DEFINE`: Scan the custom path

    */
    @SerializedName("ScanPathMode")
    @Expose
    private String ScanPathMode;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether to enable scheduled scan 
     * @return EnableScan Whether to enable scheduled scan
     */
    public Boolean getEnableScan() {
        return this.EnableScan;
    }

    /**
     * Set Whether to enable scheduled scan
     * @param EnableScan Whether to enable scheduled scan
     */
    public void setEnableScan(Boolean EnableScan) {
        this.EnableScan = EnableScan;
    }

    /**
     * Get Check cycle in days 
     * @return Cycle Check cycle in days
     */
    public Long getCycle() {
        return this.Cycle;
    }

    /**
     * Set Check cycle in days
     * @param Cycle Check cycle in days
     */
    public void setCycle(Long Cycle) {
        this.Cycle = Cycle;
    }

    /**
     * Get Scan start time 
     * @return BeginScanAt Scan start time
     */
    public String getBeginScanAt() {
        return this.BeginScanAt;
    }

    /**
     * Set Scan start time
     * @param BeginScanAt Scan start time
     */
    public void setBeginScanAt(String BeginScanAt) {
        this.BeginScanAt = BeginScanAt;
    }

    /**
     * Get Scan all paths 
     * @return ScanPathAll Scan all paths
     */
    public Boolean getScanPathAll() {
        return this.ScanPathAll;
    }

    /**
     * Set Scan all paths
     * @param ScanPathAll Scan all paths
     */
    public void setScanPathAll(Boolean ScanPathAll) {
        this.ScanPathAll = ScanPathAll;
    }

    /**
     * Get Valid when `ScanPathAll` is `true`. Valid values of `ScanPathAll`: `0` (scan the following paths); `1` (scan all paths except the following). 
     * @return ScanPathType Valid when `ScanPathAll` is `true`. Valid values of `ScanPathAll`: `0` (scan the following paths); `1` (scan all paths except the following).
     */
    public Long getScanPathType() {
        return this.ScanPathType;
    }

    /**
     * Set Valid when `ScanPathAll` is `true`. Valid values of `ScanPathAll`: `0` (scan the following paths); `1` (scan all paths except the following).
     * @param ScanPathType Valid when `ScanPathAll` is `true`. Valid values of `ScanPathAll`: `0` (scan the following paths); `1` (scan all paths except the following).
     */
    public void setScanPathType(Long ScanPathType) {
        this.ScanPathType = ScanPathType;
    }

    /**
     * Get Timeout period in hours 
     * @return Timeout Timeout period in hours
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Timeout period in hours
     * @param Timeout Timeout period in hours
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Scanning scope. Valid values: `0` (container); `1` (server). 
     * @return ScanRangeType Scanning scope. Valid values: `0` (container); `1` (server).
     */
    public Long getScanRangeType() {
        return this.ScanRangeType;
    }

    /**
     * Set Scanning scope. Valid values: `0` (container); `1` (server).
     * @param ScanRangeType Scanning scope. Valid values: `0` (container); `1` (server).
     */
    public void setScanRangeType(Long ScanRangeType) {
        this.ScanRangeType = ScanRangeType;
    }

    /**
     * Get Valid values: `true` (all); `false` (specified). 
     * @return ScanRangeAll Valid values: `true` (all); `false` (specified).
     */
    public Boolean getScanRangeAll() {
        return this.ScanRangeAll;
    }

    /**
     * Set Valid values: `true` (all); `false` (specified).
     * @param ScanRangeAll Valid values: `true` (all); `false` (specified).
     */
    public void setScanRangeAll(Boolean ScanRangeAll) {
        this.ScanRangeAll = ScanRangeAll;
    }

    /**
     * Get ID of the specified container or server to be scanned, which is based on `ScanRangeType`. 
     * @return ScanIds ID of the specified container or server to be scanned, which is based on `ScanRangeType`.
     */
    public String [] getScanIds() {
        return this.ScanIds;
    }

    /**
     * Set ID of the specified container or server to be scanned, which is based on `ScanRangeType`.
     * @param ScanIds ID of the specified container or server to be scanned, which is based on `ScanRangeType`.
     */
    public void setScanIds(String [] ScanIds) {
        this.ScanIds = ScanIds;
    }

    /**
     * Get Specified path to be excluded or scanned 
     * @return ScanPath Specified path to be excluded or scanned
     */
    public String [] getScanPath() {
        return this.ScanPath;
    }

    /**
     * Set Specified path to be excluded or scanned
     * @param ScanPath Specified path to be excluded or scanned
     */
    public void setScanPath(String [] ScanPath) {
        this.ScanPath = ScanPath;
    }

    /**
     * Get Timeout settings of quick check
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClickTimeout Timeout settings of quick check
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getClickTimeout() {
        return this.ClickTimeout;
    }

    /**
     * Set Timeout settings of quick check
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClickTimeout Timeout settings of quick check
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClickTimeout(Long ClickTimeout) {
        this.ClickTimeout = ClickTimeout;
    }

    /**
     * Get Path scanning mode: 
`SCAN_PATH_ALL`: Scan all paths
`SCAN_PATH_DEFAULT`: Scan the default path
`SCAN_PATH_USER_DEFINE`: Scan the custom path
 
     * @return ScanPathMode Path scanning mode: 
`SCAN_PATH_ALL`: Scan all paths
`SCAN_PATH_DEFAULT`: Scan the default path
`SCAN_PATH_USER_DEFINE`: Scan the custom path

     */
    public String getScanPathMode() {
        return this.ScanPathMode;
    }

    /**
     * Set Path scanning mode: 
`SCAN_PATH_ALL`: Scan all paths
`SCAN_PATH_DEFAULT`: Scan the default path
`SCAN_PATH_USER_DEFINE`: Scan the custom path

     * @param ScanPathMode Path scanning mode: 
`SCAN_PATH_ALL`: Scan all paths
`SCAN_PATH_DEFAULT`: Scan the default path
`SCAN_PATH_USER_DEFINE`: Scan the custom path

     */
    public void setScanPathMode(String ScanPathMode) {
        this.ScanPathMode = ScanPathMode;
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

    public DescribeVirusScanSettingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirusScanSettingResponse(DescribeVirusScanSettingResponse source) {
        if (source.EnableScan != null) {
            this.EnableScan = new Boolean(source.EnableScan);
        }
        if (source.Cycle != null) {
            this.Cycle = new Long(source.Cycle);
        }
        if (source.BeginScanAt != null) {
            this.BeginScanAt = new String(source.BeginScanAt);
        }
        if (source.ScanPathAll != null) {
            this.ScanPathAll = new Boolean(source.ScanPathAll);
        }
        if (source.ScanPathType != null) {
            this.ScanPathType = new Long(source.ScanPathType);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.ScanRangeType != null) {
            this.ScanRangeType = new Long(source.ScanRangeType);
        }
        if (source.ScanRangeAll != null) {
            this.ScanRangeAll = new Boolean(source.ScanRangeAll);
        }
        if (source.ScanIds != null) {
            this.ScanIds = new String[source.ScanIds.length];
            for (int i = 0; i < source.ScanIds.length; i++) {
                this.ScanIds[i] = new String(source.ScanIds[i]);
            }
        }
        if (source.ScanPath != null) {
            this.ScanPath = new String[source.ScanPath.length];
            for (int i = 0; i < source.ScanPath.length; i++) {
                this.ScanPath[i] = new String(source.ScanPath[i]);
            }
        }
        if (source.ClickTimeout != null) {
            this.ClickTimeout = new Long(source.ClickTimeout);
        }
        if (source.ScanPathMode != null) {
            this.ScanPathMode = new String(source.ScanPathMode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableScan", this.EnableScan);
        this.setParamSimple(map, prefix + "Cycle", this.Cycle);
        this.setParamSimple(map, prefix + "BeginScanAt", this.BeginScanAt);
        this.setParamSimple(map, prefix + "ScanPathAll", this.ScanPathAll);
        this.setParamSimple(map, prefix + "ScanPathType", this.ScanPathType);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "ScanRangeType", this.ScanRangeType);
        this.setParamSimple(map, prefix + "ScanRangeAll", this.ScanRangeAll);
        this.setParamArraySimple(map, prefix + "ScanIds.", this.ScanIds);
        this.setParamArraySimple(map, prefix + "ScanPath.", this.ScanPath);
        this.setParamSimple(map, prefix + "ClickTimeout", this.ClickTimeout);
        this.setParamSimple(map, prefix + "ScanPathMode", this.ScanPathMode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

