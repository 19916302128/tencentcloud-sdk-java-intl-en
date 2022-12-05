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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigureSyncJobRequest extends AbstractModel{

    /**
    * Sync task instance ID in the format of `sync-werwfs23`, which is used to identify a sync task.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Source database access type. Valid values: `cdb` (database); `cvm` (self-build on CVM); `vpc` (VPC); `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `intranet` (intranet); `noProxy`. Note that the valid values are subject to the current link.
    */
    @SerializedName("SrcAccessType")
    @Expose
    private String SrcAccessType;

    /**
    * Source database information
    */
    @SerializedName("SrcInfo")
    @Expose
    private Endpoint SrcInfo;

    /**
    * Target database access type. Valid values: `cdb` (database); `cvm` (self-build on CVM); `vpc` (VPC); `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `intranet` (intranet); `noProxy`. Note that the valid values are subject to the current link.
    */
    @SerializedName("DstAccessType")
    @Expose
    private String DstAccessType;

    /**
    * Target database information
    */
    @SerializedName("DstInfo")
    @Expose
    private Endpoint DstInfo;

    /**
    * Sync task options
    */
    @SerializedName("Options")
    @Expose
    private Options Options;

    /**
    * Information of synced database/table objects
    */
    @SerializedName("Objects")
    @Expose
    private Objects Objects;

    /**
    * Sync task name
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Running mode. Valid values: `Immediate`, `Timed`. Default value: `Immediate`.
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * Expected start time in the format of "2006-01-02 15:04:05", which is required if `RunMode` is `Timed`.
    */
    @SerializedName("ExpectRunTime")
    @Expose
    private String ExpectRunTime;

    /**
     * Get Sync task instance ID in the format of `sync-werwfs23`, which is used to identify a sync task. 
     * @return JobId Sync task instance ID in the format of `sync-werwfs23`, which is used to identify a sync task.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Sync task instance ID in the format of `sync-werwfs23`, which is used to identify a sync task.
     * @param JobId Sync task instance ID in the format of `sync-werwfs23`, which is used to identify a sync task.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Source database access type. Valid values: `cdb` (database); `cvm` (self-build on CVM); `vpc` (VPC); `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `intranet` (intranet); `noProxy`. Note that the valid values are subject to the current link. 
     * @return SrcAccessType Source database access type. Valid values: `cdb` (database); `cvm` (self-build on CVM); `vpc` (VPC); `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `intranet` (intranet); `noProxy`. Note that the valid values are subject to the current link.
     */
    public String getSrcAccessType() {
        return this.SrcAccessType;
    }

    /**
     * Set Source database access type. Valid values: `cdb` (database); `cvm` (self-build on CVM); `vpc` (VPC); `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `intranet` (intranet); `noProxy`. Note that the valid values are subject to the current link.
     * @param SrcAccessType Source database access type. Valid values: `cdb` (database); `cvm` (self-build on CVM); `vpc` (VPC); `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `intranet` (intranet); `noProxy`. Note that the valid values are subject to the current link.
     */
    public void setSrcAccessType(String SrcAccessType) {
        this.SrcAccessType = SrcAccessType;
    }

    /**
     * Get Source database information 
     * @return SrcInfo Source database information
     */
    public Endpoint getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set Source database information
     * @param SrcInfo Source database information
     */
    public void setSrcInfo(Endpoint SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get Target database access type. Valid values: `cdb` (database); `cvm` (self-build on CVM); `vpc` (VPC); `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `intranet` (intranet); `noProxy`. Note that the valid values are subject to the current link. 
     * @return DstAccessType Target database access type. Valid values: `cdb` (database); `cvm` (self-build on CVM); `vpc` (VPC); `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `intranet` (intranet); `noProxy`. Note that the valid values are subject to the current link.
     */
    public String getDstAccessType() {
        return this.DstAccessType;
    }

    /**
     * Set Target database access type. Valid values: `cdb` (database); `cvm` (self-build on CVM); `vpc` (VPC); `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `intranet` (intranet); `noProxy`. Note that the valid values are subject to the current link.
     * @param DstAccessType Target database access type. Valid values: `cdb` (database); `cvm` (self-build on CVM); `vpc` (VPC); `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `intranet` (intranet); `noProxy`. Note that the valid values are subject to the current link.
     */
    public void setDstAccessType(String DstAccessType) {
        this.DstAccessType = DstAccessType;
    }

    /**
     * Get Target database information 
     * @return DstInfo Target database information
     */
    public Endpoint getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set Target database information
     * @param DstInfo Target database information
     */
    public void setDstInfo(Endpoint DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get Sync task options 
     * @return Options Sync task options
     */
    public Options getOptions() {
        return this.Options;
    }

    /**
     * Set Sync task options
     * @param Options Sync task options
     */
    public void setOptions(Options Options) {
        this.Options = Options;
    }

    /**
     * Get Information of synced database/table objects 
     * @return Objects Information of synced database/table objects
     */
    public Objects getObjects() {
        return this.Objects;
    }

    /**
     * Set Information of synced database/table objects
     * @param Objects Information of synced database/table objects
     */
    public void setObjects(Objects Objects) {
        this.Objects = Objects;
    }

    /**
     * Get Sync task name 
     * @return JobName Sync task name
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Sync task name
     * @param JobName Sync task name
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Running mode. Valid values: `Immediate`, `Timed`. Default value: `Immediate`. 
     * @return RunMode Running mode. Valid values: `Immediate`, `Timed`. Default value: `Immediate`.
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set Running mode. Valid values: `Immediate`, `Timed`. Default value: `Immediate`.
     * @param RunMode Running mode. Valid values: `Immediate`, `Timed`. Default value: `Immediate`.
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get Expected start time in the format of "2006-01-02 15:04:05", which is required if `RunMode` is `Timed`. 
     * @return ExpectRunTime Expected start time in the format of "2006-01-02 15:04:05", which is required if `RunMode` is `Timed`.
     */
    public String getExpectRunTime() {
        return this.ExpectRunTime;
    }

    /**
     * Set Expected start time in the format of "2006-01-02 15:04:05", which is required if `RunMode` is `Timed`.
     * @param ExpectRunTime Expected start time in the format of "2006-01-02 15:04:05", which is required if `RunMode` is `Timed`.
     */
    public void setExpectRunTime(String ExpectRunTime) {
        this.ExpectRunTime = ExpectRunTime;
    }

    public ConfigureSyncJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigureSyncJobRequest(ConfigureSyncJobRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.SrcAccessType != null) {
            this.SrcAccessType = new String(source.SrcAccessType);
        }
        if (source.SrcInfo != null) {
            this.SrcInfo = new Endpoint(source.SrcInfo);
        }
        if (source.DstAccessType != null) {
            this.DstAccessType = new String(source.DstAccessType);
        }
        if (source.DstInfo != null) {
            this.DstInfo = new Endpoint(source.DstInfo);
        }
        if (source.Options != null) {
            this.Options = new Options(source.Options);
        }
        if (source.Objects != null) {
            this.Objects = new Objects(source.Objects);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.RunMode != null) {
            this.RunMode = new String(source.RunMode);
        }
        if (source.ExpectRunTime != null) {
            this.ExpectRunTime = new String(source.ExpectRunTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "SrcAccessType", this.SrcAccessType);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamSimple(map, prefix + "DstAccessType", this.DstAccessType);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamObj(map, prefix + "Options.", this.Options);
        this.setParamObj(map, prefix + "Objects.", this.Objects);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "ExpectRunTime", this.ExpectRunTime);

    }
}
